package Tugas2;
public class No3 {
    public static void main(String[] args) {
        int[][] A = {
            {2, 4, 6},
            {3, 5, 7},
        };
        int[][] B = {
            {1, 2},
            {3, 4},
            {5, 6},
        };
        if(A[0].length == B.length) {
            int[][] C = new int[A.length][B[0].length];
            
            for(int i=0; i<A.length; i++) {
                for(int j=0; j<B[0].length; j++) {
                    for(int k=0; k<A[0].length; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            for(int[] c : C) {
                for(int q : c) {
                    System.out.print(q+" ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Ukuran kolom A tidak sama Dengan baris B");
        }
        System.out.println();
        System.out.println("R. Rekyan Maulana Setyawan");
    }
}
