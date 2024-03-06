import java.util.Scanner;

public class AT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double n1 = 0;
        double n2 = 0;
        double media = 0;
        
        System.out.println("Digite a primeira nota:");
        n1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        n2 = scanner.nextDouble();

        media = (n1 + n2) /2;

        System.out.println("A media das duas notas e " + media);

        scanner.close();
    }
}
