import java.util.Scanner;

public class AT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int v1 = 0;
        int v2 = 0;
        int sub = 0;
        
        System.out.println("Digite o primeiro valor:");
        v1 = scanner.nextInt();

        System.out.println("Digite o segundo valor:");
        v2 = scanner.nextInt();

        sub = v1 - v2;

        System.out.println("O valor da Subtracao e: " + sub);

        scanner.close();
    }
}
