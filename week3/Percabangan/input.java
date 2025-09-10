package week3.Percabangan;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grade gradeObj = new Grade();

        System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt();

        char grade = gradeObj.getGrade(nilai);

        System.out.println("Nilai kamu: " + nilai);
        System.out.println("Grade kamu: " + grade);

        scanner.close();
    }
}
