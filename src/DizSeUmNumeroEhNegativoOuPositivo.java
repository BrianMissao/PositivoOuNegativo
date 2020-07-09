import java.util.Scanner;

public class DizSeUmNumeroEhNegativoOuPositivo {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Positivo ou negativo? Digite um número e eu direi.");
        int numero = scanner.nextInt();
        String diagnostico = numero >= 0? "Número positivo.": "Número negativo.";
        System.out.println(diagnostico);
    }
}
