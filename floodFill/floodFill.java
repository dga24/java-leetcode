package floodFill;

import java.util.Arrays;

public class floodFill {

    

    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        
        for (int[] row : image) {
            System.out.println(Arrays.toString(row));
        }
        floodFill(image,1,1,2);

        for (int[] row : image) {
            System.out.println(Arrays.toString(row));
        }
    }


    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color){
            return image;
        }
        fillImage(image, sr, sc, image[sr][sc], color);
        return image;
    }

    private static void fillImage(int[][] image, int i, int j, int oldColor, int newColor) {
        if ( i<0 || i>=image.length || j<0 || j>= image[0].length || image[i][j] != oldColor){
            return;
        }
        image[i][j] = newColor;
        fillImage(image, i+1, j, oldColor, newColor);
        fillImage(image, i, j+1, oldColor, newColor);
        fillImage(image, i-1, j, oldColor, newColor);
        fillImage(image, i, j-1, oldColor, newColor);
    }
}
   
