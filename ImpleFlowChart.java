import java.util.Scanner; // Mengimpor kelas Scanner untuk membaca input dari pengguna

public class ImpleFlowChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk input pengguna
        int[][] dataSurvei = new int [10][6]; // Mendeklarasikan array dua dimensi untuk menyimpan nilai survei dari 10 responden dengan 6 pertanyaan masing-masing
        double[] rataResponden = new double [dataSurvei.length]; // Mendeklarasikan array untuk menyimpan rata-rata tiap responden
        double[] rataPertanyaan = new double [dataSurvei[0].length]; // Mendeklarasikan array untuk menyimpan rata-rata setiap pertanyaan
        int totalNilai=0; // Variabel untuk menyimpan total nilai dari tiap jawaban
        String[] dataResponden = new String [dataSurvei.length]; // Array untuk menyimpan nama atau data dari setiap responden
        int[][] dataPertanyaan = new int [dataSurvei.length][dataSurvei[0].length]; // Array untuk menyimpan nilai tiap pertanyaan dari setiap responden
        double rataKeseluruhan; // Variabel untuk menyimpan rata-rata keseluruhan dari semua data survei
        int keseluruhan=0,i,j,k,l; // Variabel untuk penghitungan nilai keseluruhan dan loop

        for (i=0; i<dataSurvei.length; i++){ // Looping untuk input data responden (10 kali untuk 10 responden)
            System.out.print("Input Data Responden ke-" + (i+1) + ": ");
            dataResponden[i] = input.nextLine(); // Menerima input nama atau data responden ke-i
            
            for (j=0; j<dataSurvei[0].length; j++){ // Looping untuk input setiap nilai pertanyaan (6 kali untuk 6 pertanyaan)
                System.out.print("Input nilai pertanyaan ke-" + (j+1) + ": ");
                dataPertanyaan[i][j] = input.nextInt(); // Menerima input nilai pertanyaan ke-j untuk responden ke-i
                input.nextLine(); // Mengambil karakter newline yang tersisa
                totalNilai = dataPertanyaan[i][j]; // Menyimpan nilai jawaban saat ini ke totalNilai
                dataSurvei[i][j] = totalNilai; // Memasukkan nilai ke array dataSurvei
                rataPertanyaan[j] += totalNilai; // Menambahkan nilai ke total rata-rata untuk pertanyaan tertentu
            }
            System.out.println(); // Menambahkan baris baru
            keseluruhan += totalNilai; // Menambahkan nilai total untuk seluruh responden
            rataResponden[i] = totalNilai / (double) dataSurvei[0].length; // Menghitung rata-rata untuk setiap responden berdasarkan 6 pertanyaan
        }

        for (j=0; j<dataSurvei[0].length; j++){ // Looping untuk menghitung rata-rata tiap pertanyaan
            rataPertanyaan[j] /= dataSurvei.length; // Menghitung rata-rata untuk setiap pertanyaan berdasarkan seluruh responden
        }

        for (k=0; k<dataSurvei.length; k++){ // Looping untuk mencetak rata-rata tiap responden
            System.out.println("Rata Responden ke-" + (k+1) + ": " + rataResponden[k]);
        }

        for (l=0; l<dataSurvei[0].length; l++){ // Looping untuk mencetak rata-rata tiap pertanyaan
            System.out.println("Rata Pertanyaan ke-"+ (l+1) + ": " + rataPertanyaan[l]);
        }
        
        rataKeseluruhan = keseluruhan / (double)(dataSurvei.length * dataSurvei[0].length); // Menghitung rata-rata keseluruhan dari semua nilai survei
        System.out.println("Rata Keseluruhan: " + rataKeseluruhan); // Mencetak rata-rata keseluruhan
    }
}
