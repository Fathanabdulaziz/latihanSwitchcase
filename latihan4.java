import java.util.Scanner;

public class latihan4 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("input kota tujuan yang ingin dituju = ");
        String kota = userInput.nextLine();
        System.out.print("jumlah penumpang = ");
        int jumlahPenumpang = userInput.nextInt();
        int hrg = 0;

        switch (kota) {
            case "Jakarta":
                hrg = 145000;
                break;
            case "Bogor":
                hrg = 200000;
                break;
            case "Garut":
                hrg = 75000;
                break;
            case "Purwakarta":
                hrg = 75000;
                break;

            default:
                System.out.println("Tiket pada kota tersebut tidak ada dalam data hari ini.");
                break;
        }
        int hargaTotal = (hrg * jumlahPenumpang);
        if (kota.equals("Bogor")) {
            if (hargaTotal > 250000) {
                double diskon = 0.1 * hargaTotal;
                System.out.println("Yeyy!!! Anda dapat potongan harga 10%");
                double hasilDiskon = hargaTotal - diskon;
                int hasilDiskonF = (int) hasilDiskon;
                System.out.printf("Yeyyy harga mu jadi = Rp. %d", hasilDiskonF);

            }
        
        } else {
             System.out.println("Harga total tiket yang harus dibayar = " + hargaTotal);
        userInput.close();
        }
        
    }

}
