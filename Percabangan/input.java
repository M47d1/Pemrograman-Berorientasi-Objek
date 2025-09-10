package Percabangan;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grade grade = new Grade();

        System.out.print("Masukkan score Anda: ");
        int score = scanner.nextInt(); 

        char gradeResult = grade.getGrade(score); 
        System.out.println("Grade Anda: " + gradeResult);

        scanner.close();
    }
}