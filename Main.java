package com.company;
public class Main {
    public static void main(String[] args) {
        long[] a = {18, 16, 14, 12, 10, 8, 6, 4};
        double[] x = new double[13];
        double[][] b = new double[8][13];
        for (int i = 0; i < 13; i++) {
            x[i] = (float) (Math.random() * 27.0 - 15.0);

        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 13; j++) {
                if ((a[i] == 4) || (a[i] == 10) || (a[i] == 12) || (a[i] == 14)) {
                    b[i][j] = Math.log(Math.sqrt(Math.pow((Math.abs(x[j]) / 2.0), 2)));
                } else if (a[i] == 8) {
                    b[i][j] = Math.pow(1/3 * (Math.pow(x[j], 3) + 1/4), 2);
                } else {
                    b[i][j] = Math.sin(Math.sin(Math.cos(Math.pow((x[j] - 1/3), x[j]))));
                }
                System.out.printf("%8.3f ", b[i][j]);
            }
System.out.println();
        }


    }
}