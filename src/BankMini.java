public class BankMini {

    public static void main(String[] args) {
        Rekening rek = new Rekening("001", "Ani", 100000);

        System.out.println("============ BANK MINI ============");
        System.out.println("Nomor   : " + rek.getNomor());
        System.out.println("Pemilik : " + rek.getPemilik());
        System.out.println("Saldo   : " + rek.getSaldo());
    }
}