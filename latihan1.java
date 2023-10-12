import java.util.Scanner;
// membuat program menginput huruf dan menjelaskan tentang huruf tersebut
public class latihan1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukan huruf A-D = ");
        char huruf = userInput.next().charAt(0);

        switch (huruf) {
            case 'A':
                System.out.println("A: Excellent");
                break;
            case 'B':
                System.out.println("B: Good");
                break;
            case 'C':
                System.out.println("C: Average");
                break;
            case 'D':
                System.out.println("D: Fail");
                break;
            default:
                System.out.println("Masukan huruf sesuai perintah!!!!!");
                break;
        }
        userInput.close();
    }
}