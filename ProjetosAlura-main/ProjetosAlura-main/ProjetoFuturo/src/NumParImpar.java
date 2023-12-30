import java.util.Scanner;

public class NumParImpar {
    public static void main(String[] args) {
        System.out.println("Entre com um numero inteiro: ");
        Scanner leitura = new Scanner(System.in);
        int num = leitura.nextInt();
        int calculo = num % 2;

        if (calculo == 0){
            System.out.println("O numero escolhido e par!");
        } else{
            System.out.println("O numero escolhido e impar!");
        }

        leitura.close();
    }
}
