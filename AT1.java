import java.util.Scanner;

public class AT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int total = 0;
        
        System.out.println("Digite o primeiro valor:");
        v1 = scanner.nextInt();

        System.out.println("Digite o segundo valor:");
        v2 = scanner.nextInt();

        System.out.println("Digite o terceiro valor:");
        v3 = scanner.nextInt();

        total = v1 + v2 + v3;

        System.out.println("A soma dos valores e: " + total);

        scanner.close();
    }
}
