package Array;

public class CellWithOddValues {

    public static int oddCells(int m,int n,int[][] indices){
int [][] ans=new int[m][n];
for (int i=0;i<indices.length;i++){
    for(int j=0;j<n;j++){
        ans[indices[i][0]][j]++;
    }
    for(int j=0;j<m;j++){
        ans[j][indices[i][1]]++;
    }
}
int count=0;
for(int i=0;i<m;i++){
    for(int j=0;i<n;i++) {
        if(ans[i][j]%2 !=0){
count++;  }
    }
}
return count;
    }
    public static void main(String[] args) {
        oddCells(2, 3, [[0, 1],[1, 1]]);
    }
}
