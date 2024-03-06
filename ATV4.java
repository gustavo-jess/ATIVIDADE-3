import java.util.Scanner;

public class AT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double n1 = 0;
        double n2 = 0;
        double n3 = 0;
        double n4 = 0;
        double media = 0;
        
        System.out.println("Digite a primeira nota:");
        n1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        n2 = scanner.nextDouble();
        
         System.out.println("Digite a terceira nota:");
        n3 = scanner.nextDouble();
        
         System.out.println("Digite a quarta nota:");
        n4 = scanner.nextDouble();

        media = (n1 + n2 + n3 + n4) /4;

        System.out.println("A media das duas notas e " + media);

        scanner.close();
    }
}
