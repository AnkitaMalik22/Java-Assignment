class Solution {
    public int kthSmallest(int[][] matrix, int k) {
          int lo= minElement(matrix);
    int hi =maxElement(matrix);
    
    
    while(lo<=hi)
    {
        int mid=(lo+hi)/2;
        int c1= countElement(matrix,mid);

        
        if(c1<k)lo=mid+1;
        else
        {
            int c2=countElement(matrix,mid-1);
            if(c2<k)return mid;
            
            else hi=mid-1;
        }
    }
    return 0;
    
}

int countElement(int[][]arr, int x )
{
    int cnt=0,temp=0;
    int n=arr[0].length;
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
          if(arr[i][j]<=x)++cnt;
      }
    }
    return cnt;
}


int maxElement(int[][]arr)      
{
    int n=arr[0].length-1;
    int max=arr[0][n];
    for(int i=0;i<=n;i++)
    {
        if(arr[i][n]>max)max=arr[i][n]; 
    }
    
    return max;
}


int minElement(int[][]arr)      
{
    int n=arr[0].length-1;
    int min=arr[0][0];
    for(int i=0;i<=n;i++)
    {
        if(arr[i][0]<min)min=arr[i][0]; 
    }
    
    return min;
}
    
}