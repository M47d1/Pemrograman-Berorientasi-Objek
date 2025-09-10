package week3.input;
import java.util.Scanner;
public class input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input angka pertama:");
        int a = scanner.nextInt();
        System.out.println("Angka Pertama:" + a);
        scanner.close();
    }
}