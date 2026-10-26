import java.util.Scanner;

public class BankMini {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Rekening rek = new Rekening("001", "Ani", 100000);

        // rek.saldo = 1000000;

        System.out.println("============ BANK MINI ============");

        int pilihan;
        do {
            System.out.print("Menu (1 setor, 2 tarik, 3 info, 0 keluar): ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.print("Jumlah: ");
                int jumlah = input.nextInt();
                if (rek.setor(jumlah)) {
                    System.out.println("  Berhasil");
                } else {
                    System.out.println("  Ditolak");
                }
            } else if (pilihan == 2) {
                System.out.print("Jumlah: ");
                int jumlah = input.nextInt();
                if (rek.tarik(jumlah)) {
                    System.out.println("  Berhasil");
                } else {
                    System.out.println("  Ditolak");
                }
            } else if (pilihan == 3) {
                rek.cetakInfo();
            } else if (pilihan != 0) {
                System.out.println("Menu tidak dikenal.");
            }
        } while (pilihan != 0);

        System.out.println();
        System.out.println("=========== SALDO AKHIR ===========");
        rek.cetakInfo();

        input.close();
    }
}