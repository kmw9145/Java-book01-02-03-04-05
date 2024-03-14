import java.util.Scanner;

public class book5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("소문자를 입력하세요: ");
        char c = scanner.next().charAt(0);

        char uppercaseC = toUpperCase(c);

        System.out.println("대문자로 변환된 문자: " + uppercaseC);

        scanner.close();
    }

    public static char toUpperCase(char c) {
        // 소문자 'a'부터 'z'까지의 아스키 코드 범위인 97~122에 해당하는지 확인하여 변환
        if (c >= 'a' && c <= 'z') {
            return (char)(c - 32);
        }
        // 그 외의 경우에는 변환 없이 그대로 반환
        return c;
    }
}