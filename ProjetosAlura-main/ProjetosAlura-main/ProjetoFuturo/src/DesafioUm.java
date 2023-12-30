public class DesafioUm {
    public static void main(String[] args) {
    
    
        double nota1 = 9.5;
        double nota2 = 7.3;
        double media = (nota1 + nota2) / 2;
        int mediaInteira = (int) media;
        System.out.println(media);
        System.out.println(mediaInteira);

        String texto = "Meu nome é ";
        char a = 'J';
        System.out.println(texto + a);

        double precoProduto = 5.99;
        int quantidade = 33;
        double valorTotal = precoProduto * quantidade;
        System.out.println(String.format("R$ %.2f", valorTotal));

        double valorEmDolares = 37.50;
        double valorEmReais = valorEmDolares * 4.94;
        System.out.println(String.format("U$ %.2f equivale a R$ %.2f", valorEmDolares, valorEmReais));

        double precoOriginal = 50.00;
        double percDesconto = 10;
        double precoComDesc = precoOriginal *((100-percDesconto)/100);
        System.out.println(String.format("O preço de um produto de R$ %.2f com desconto de %.2f porcento é de R$ %.2f.", precoOriginal, percDesconto, precoComDesc));

    }
}
