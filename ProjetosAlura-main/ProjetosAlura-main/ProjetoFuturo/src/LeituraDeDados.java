import java.util.Scanner;

public class LeituraDeDados {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        
        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();

        System.out.println("Qual ano de lançamento?");
        int anoDeLançamento = leitura.nextInt();
        
        System.out.println("Qual sua avaliação do filme?");
        double avaliacao = leitura.nextDouble();

        System.out.println("Nome: " + filme);
        System.out.println("Ano: " + anoDeLançamento);
        System.out.println("Nota: " + avaliacao);

        leitura.close();

    }
}