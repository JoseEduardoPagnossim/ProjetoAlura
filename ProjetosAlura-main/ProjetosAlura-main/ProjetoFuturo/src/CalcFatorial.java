import java.util.Scanner;

public class CalcFatorial {
    public static void main(String[] args) {

        System.out.println("Digite um numero por favor: ");
        Scanner leitura = new Scanner(System.in);
        int num = leitura.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= num; i++) {

            fatorial *= i;

            /*if (num < 0){
                System.out.println("O numero deve ser positivo, impossivel calcular fatorial negativo!");
            } else if (num == 0 || num ==1){
                System.out.println("Fatorial de 0 ou 1 e igual a 1");
            } else{
            }*/

        }
        System.out.println(fatorial);

        leitura.close();
    }
}
