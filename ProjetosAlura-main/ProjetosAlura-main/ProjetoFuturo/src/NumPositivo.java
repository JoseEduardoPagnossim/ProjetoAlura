import java.util.Scanner;

public class NumPositivo {

    public static void main(String[] args) {

        System.out.println("Digite um úmero qualquer: ");
        Scanner leitura = new Scanner(System.in);
        int escolhaNumero = leitura.nextInt();


        if (escolhaNumero > 0) {
                System.out.println("O numero escolhido é positivo!");
        }   else if (escolhaNumero < 0) {
                System.out.println("O numero escolhido é negativo!");
        } else {
                System.out.println("O numero escolhido é NULO");
            }
            leitura.close();
        }
        
}
