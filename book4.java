import java.util.Scanner;

public class book4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("초 단위 정수를 입력하세요: ");
        int seconds = scanner.nextInt();

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        System.out.println(seconds + "초는 " + hours + "시간 " + minutes + "분 " + remainingSeconds + "초입니다.");

        scanner.close();
    }
}