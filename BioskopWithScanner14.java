import java.util.Scanner;

public class BioskopWithScanner14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        String nama, next;
        int menu, baris, kolom;
        boolean status = true;

        while (status) {
            System.out.print("\nMenu 1: Input Data Penonton\nMenu 2: Tampilkan Daftar Penonton\nMenu 3: Exit\nPilih Menu ke: ");
            menu = input.nextInt();
            input.nextLine();
            if (menu == 1) {
                while (true) {
                    System.out.print("\nMasukkan nama: ");
                    nama = input.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris: ");
                        baris = input.nextInt();
                        
                        System.out.print("Masukkan kolom: ");
                        kolom = input.nextInt();
                        input.nextLine();
                        
                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Nomor baris atau kolom tidak tersedia !");
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi pada baris " + baris + ", kolom " + kolom + " sudah terisi oleh penonton lain. Silakan pilih kursi lain.");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            break;
                        }
                    }

                    System.out.print("Lanjutkan ? (y/n): ");
                    next = input.nextLine();
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } 
            else if (menu == 2) {
                System.out.println("DAFTAR PENONTON");
                
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(penonton[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }
            } 
            else if (menu == 3) {
                System.out.println("Program Berhenti");
                status = false;
            } 
            else {
                System.out.println("Input ulang!");
            }
        }
        
        input.close();
    }
}
