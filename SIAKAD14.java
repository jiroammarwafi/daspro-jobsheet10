import java.util.Scanner;
public class SIAKAD14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] nilai;
        int jmlSiswa, jmlMatKul;

        System.out.print("Masukkan jumlah siswa: ");
        jmlSiswa = input.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        jmlMatKul = input.nextInt();
        nilai = new int [jmlSiswa][jmlMatKul];


        for (int i=0; i<nilai.length;i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totalPerSiswa = 0;

            for (int j=0; j<nilai[i].length; j++){
                System.out.print("Nilai Mata Kuliah " + (j+1) + ": ");
                nilai [i][j] = input.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totalPerSiswa/jmlMatKul);
        }

        for (int j=0; j<nilai[0].length; j++){
            double totalPerMatkul = 0;
            
            for (int i = 0; i<nilai.length; i++){
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j+1) + ": " + totalPerMatkul/jmlSiswa);
        }

        input.close();
    }
}
