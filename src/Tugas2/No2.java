package Tugas2;
public class No2 {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        int[][] B = {
            {6, 5},
            {4, 3},
            {2, 1}
        };
        if ((A.length == B.length) && (A[0].length == B[0].length)) {
            int[][] C = new int[A.length][A[0].length];
            for(int i=0; i<A.length; i++) {
                for(int j=0; j<B[0].length; j++) {
                    C[i][j] = A[i][j] - B[i][j];
                }
            }
            for(int[] c : C) {
                for(int q : c) {
                    System.out.print(q+ " ");
                }
                System.out.println();
            }
            System.out.println(C[1][0]);
        }
        else {
            System.out.println("Ukuran matriks tidak sama");
        }
        System.out.println();
        System.out.println("R. Rekyan Maulana Setyawan");
    }
}
