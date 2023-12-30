import java.util.Scanner;

public class NumIgualMaior {
    public static void main(String[] args) {
        
        System.out.println("Insira dois numeros inteiros positivos abaixo: ");
        Scanner leitura = new Scanner(System.in);
        int numUm = leitura.nextInt();
        int numDois = leitura.nextInt();

        if (numUm == numDois) {
            System.out.println("Os numeros indicados são iguais!");            
        } else {
            System.out.println("Os numero indicados são diferentes.");
        }

        if (numUm > numDois) {
            System.out.println("O primeiro numero digitado é maior que o segundo numero.");
        } else {
            System.out.println("O segundo numero digitado é maior que o primeiro numero.");
        }
        leitura.close();
    }
}