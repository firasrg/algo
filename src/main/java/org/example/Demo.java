package org.example;

public class Demo {


    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2 ,3},
            {4, 5 ,6},
            {7, 8 ,9},
        };

        int rowLength = matrix.length;
        int colLength = matrix[0].length;


        for(int i=0; i < rowLength; i++){

            int y = 0;

            while (i > -1 && y < colLength) {
                System.out.print(matrix[y][i]);
                i++;
                y++;
            }
        }

        for(int j =0; j <colLength;j++){
            int x = rowLength - 1;
            while (x>-1 &&j < matrix.length){
                System.out.print(matrix[j][x]);
                j++;
                x--;
            }
        }

    }
}
