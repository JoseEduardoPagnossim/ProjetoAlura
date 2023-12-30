import java.util.Scanner;

public class AreaQuadCirc {
    public static void main(String[] args) {
        System.out.println("Digite 1 para calcular a área do quadrado ou digite 2 para calcular a área do circulo");

        Scanner leitura = new Scanner(System.in);
        int entrada = leitura.nextInt();


        if (entrada == 1) {
            System.out.println("Digite a lateral do quadrado para que eu calcule a área para você!");
            int lado = leitura.nextInt();
            int areaQuadrado = lado * lado;
            System.out.println("Esta é a area do quadrado de acordo com os dados informados: " + areaQuadrado);
        } else if (entrada == 2) {
            System.out.println("Digite o raio do circulo para que eu calcule a área para você!");
            int raio = leitura.nextInt();
            double pi = 3.1415;
            double areaCirculo = pi * (raio* raio);
            System.out.println(String.format("A area do circulo segundo os dados informados é %.2f", areaCirculo));
        } else {
            System.out.println("Não tenho esta opção de cálculo ainda!!!");
        }
        leitura.close();
    }
    
}
