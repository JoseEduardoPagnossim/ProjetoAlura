import java.util.Random;
import java.util.Scanner;

public class AdvinhaNumero {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int numAleatorio = new Random().nextInt(100);
        int tentativas = 0;
        //System.out.println(numAleatorio); //- LINHA DE TESTE PARA VISUALIZAR NUMERO GERADO
        System.out.println("Escolha num numero de 0 a 100");

        while (tentativas < 5) {

            System.out.println("PALPITE:");
            int palpite  = leitura.nextInt();
            tentativas++;

            if(palpite == numAleatorio){
                System.out.println("Boa você acertou o numero gerado em  " + tentativas + " tentativas!!");
                break;
            } else if (palpite < numAleatorio){
                System.out.println("O numero digitado é menor que o esperado. Tente novamente um numero maior");
            } else {
                System.out.println("O numero digitado é maior que o esperado. Tente novamente um numero menor");
            }

            if (tentativas == 5){
                System.out.println("Sua tentativas acabaram, você não conseguiu. O numero gerado era " + numAleatorio + ".");


            }
        }

        leitura.close();
    }

}