import java.util.Scanner;

public class Tabuada {
    public static void main (String[] args){
        System.out.println("Digite um numero para que eu calcule a tabuada para voce: ");
        Scanner leitura = new Scanner(System.in);
        int num = leitura.nextInt();

        System.out.println("A tabuda do " + num + " e: \n");

        for (int i = 0; i <= 10; i++) {
            int tabuada = num*i;
            System.out.println(String.format("%d x %d = %d",num, i, tabuada));
        }
        leitura.close();
    }
}
