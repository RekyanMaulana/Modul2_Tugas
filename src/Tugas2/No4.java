package Tugas2;
import java.util.Scanner;
public class No4 {
    public static void main(String[] args) {
    int i, j, a, b;
    int matriks[][] = new int[10][10];
    int transpose[][] = new int[10][10];
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Masukkan jumlah baris matriks : ");
    a = scan.nextInt();
    System.out.print("Masukkan jumlah kolom matriks : ");
    b = scan.nextInt();
    System.out.println("Masukkan elemen matriks : ");
    for(i = 0; i < a; i++) {
        for(j = 0; j < b; j++) {
            matriks[i][j] = scan.nextInt();
        }
    }
    System.out.println("Hasil matriks : ");
    for(i = 0; i < a; i++) {
        for(j = 0; j < b; j++) {
            System.out.print(matriks[i][j] + "\t");
        }
        System.out.println();
    }
    for(i = 0; i < a; i++) {
        for(j = 0; j < b; j++) {
            transpose[j][i] = matriks[i][j];
        }
    }
    System.out.println("Hasil transpose matriks : ");
    for(i = 0; i < b; i++) {
        for(j = 0; j < a; j++) {
            System.out.print(transpose[i][j] + "\t");
        }
        System.out.println();
    }
    System.out.println();
    System.out.println("R. Rekyan Maulana Setyawan");
    }
}
