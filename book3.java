import java.util.Scanner;

public class book3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("원기둥의 반지름을 입력하세요: ");
        double radius = scanner.nextDouble();
        
        System.out.print("원기둥의 높이를 입력하세요: ");
        double height = scanner.nextDouble();

        double volume = calculateCylinderVolume(radius, height);
        
        System.out.println("원기둥의 부피는 " + volume + "입니다.");

        scanner.close();
    }

    public static double calculateCylinderVolume(double radius, double height) {
        double volume = Math.PI * Math.pow(radius, 2) * height;
        return volume;
    }
}