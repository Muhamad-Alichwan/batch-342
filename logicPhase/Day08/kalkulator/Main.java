package logicPhase.Day08.kalkulator;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // tambah tambah = new tambah();
    // kurang kurang = new kurang();
    Kali kali = new Kali();
    Bagi bagi = new Bagi();
    Scanner scanner = new Scanner(System.in);
    int input = -1;
    while (input != 0) {
      System.out.println("Operasi Matematika");
      System.out.println("1. Tambah");
      System.out.println("2. Kurang");
      System.out.println("3. Kali");
      System.out.println("4. Bagi");
      System.out.println("0. Keluar");
      System.out.print("Masukan Angka: ");

      if(input != 0 ){
        input = scanner.nextInt();
        switch (input) {
          case 1:
            System.out.print("Masukan angka ke-1: ");
            double angka1 = scanner.nextDouble();
            System.out.print("Masukan angka ke-2: ");
            double angka2 = scanner.nextDouble();
            Tambah tambah = new Tambah(angka1,angka2);
            System.out.printf("Hasil %.2f + %.2f = %.2f\n", tambah.angka1, tambah.angka2, tambah.perhitunganTambah());
            break;

          case 2:
            System.out.print("Masukan angka ke-1: ");
            double angka1Kurang = scanner.nextDouble();
            System.out.print("Masukan angka ke-2: ");
            double angka2Kurang = scanner.nextDouble();
            Kurang kurang = new Kurang(angka1Kurang,angka2Kurang);
            System.out.printf("Hasil %.2f - %.2f = %.2f\n", kurang.angka1, kurang.angka2, kurang.perhitunganKurang());
            break;

          case 3:
            System.out.print("Masukan angka ke-1: ");
            double setAngka1 = scanner.nextDouble();
            System.out.print("Masukan angka ke-2: ");
            double setAngka2 = scanner.nextDouble();
            // kali kali = new kali(setAngka1,setAngka2);
            kali.setAngka1(setAngka1);
            kali.setAngka2(setAngka2);
            System.out.printf("Hasil %.2f * %.2f = %.2f\n", kali.getAngka1(), kali.getAngka2(), kali.perhitunganKali());
            break;

          case 4:
            System.out.print("Masukan angka ke-1: ");
            double setAngka1Bagi = scanner.nextDouble();
            System.out.print("Masukan angka ke-2: ");
            double setAngka2Bagi = scanner.nextDouble();
            // bagi bagi = new bagi(setAngka1Bagi,setAngka2Bagi);
            bagi.setAngka1(setAngka1Bagi);
            bagi.setAngka2(setAngka2Bagi);
            System.out.printf("Hasil %.2f / %.2f = %.2f\n", bagi.getAngka1(), bagi.getAngka2(), bagi.perhituganBagi());
            break;
          
          case 0:
            System.out.println("Keluar Dari Program Kalkulator !!!!");
            
          default:
            break;
        }
      }
    }
    
    scanner.close();
  }
  
}
