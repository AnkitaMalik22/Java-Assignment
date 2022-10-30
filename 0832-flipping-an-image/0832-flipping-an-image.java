class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
          int temp;
        
        for (int i = 0; i < image.length; i++) {
            for (int  j = 0, k = image[i].length - 1; j <= k; j++, k--) {
                temp = image[i][j] == 0  ? 1 : 0;
                image[i][j] = image[i][k] == 0 ? 1 : 0;
                image[i][k] = temp;
            }
        }
        
        return image;
    }
}