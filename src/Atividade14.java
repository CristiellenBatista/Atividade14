import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double peso, excesso, multa;
        final double limitePeso = 50;
        final double valorMulta = 4;
        
        System.out.print("Digite o peso dos peixes: ");
        peso = scanner.nextDouble();
        
        if (peso > limitePeso) {
            excesso = peso - limitePeso;
            multa = excesso * valorMulta;
            System.out.printf("Peso dos peixes: %.2f kg%n", peso);
            System.out.printf("Limite de peso: %.2f kg%n", limitePeso);
            System.out.printf("Excesso de peso: %.2f kg%n", excesso);
            System.out.printf("Valor da multa: R$ %.2f%n", multa);
        } else {
            System.out.println("Não houve excesso de peso.");
        }
        
        scanner.close();
    }
}

