import java.util.Scanner;

public class AT5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double n1 = 0;
        double n2 = 0;
        double soma = 0;
        double subtracao = 0;
        double divisao = 0;
        double multiplicacao = 0;
        
        
        System.out.println("Digite o primeiro numero:");
        n1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero:");
        n2 = scanner.nextDouble();
        
        soma = (n1 + n2);
        subtracao = (n1 - n2);
        divisao = (n1 / n2);
        multiplicacao = (n1 * n2);

        System.out.println("A soma e " + soma);
        System.out.println("A Subtracao e " + subtracao);
        System.out.println("A divisao e " + divisao);
        System.out.println("A multiplicacao e " + multiplicacao);

        scanner.close();
    }
}
