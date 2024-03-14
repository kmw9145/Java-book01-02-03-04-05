import java.util.Scanner;

public class book2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int number = scanner.nextInt();

        int square = number * number;

        System.out.println(number + "의 제곱은 " + square + "입니다.");

        scanner.close();
    }
}

