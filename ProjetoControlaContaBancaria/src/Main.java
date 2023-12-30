import java.util.Scanner;

import static java.lang.System.out;

//Melhorar forma como é apresentado os dados de nome numero da conta e tipo de conta do cliente.

public class Main {
    public static void main(String[] args) {

        String cliente = "Jose Eduardo Pagnossim Souza";
        String numConta = "17984-2";
        String tipoConta = "Corrente";
        double saldo = 0;
        int opcao = 0;

        Scanner leitura = new Scanner(System.in);


        out.printf("""
                **************************************************
                                
                Nome do Cliente: %s
                Numero da Conta: %s
                Tipo de Conta: %s
                Saldo Inicial: R$ %.2f
                                
                **************************************************
                %n""", cliente, numConta, tipoConta, saldo);

        String menu = """
                Menu: 
                                
                1 - Saldo na tela
                2 - Transferir Dinheiro
                3 - Receber Dinheiro
                4 - Sair
                """;

        while (opcao != 4) {
            out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                out.println("Seu saldo atual é: R$ " + saldo);

            } else if (opcao == 2) {
                out.println("Digite o valor da transferencia:");
                double valorTransferencia = leitura.nextDouble();
                if (valorTransferencia > saldo){
                    out.println("Saldo insuficiente para transação!");
                } else if(valorTransferencia <= 0) {
                    out.println("Valor invalido!");
                } else{
                    saldo -= valorTransferencia;
                    out.println("Seu saldo atual é de: R$" + saldo);
                }

            } else if (opcao == 3){
                out.println("Digite o valor que será inserido na conta");
                double valorRecebimento = leitura.nextDouble();
                if (valorRecebimento <= 0){
                    out.println("Valor invalido!");
                }else {
                    saldo += valorRecebimento;
                    out.println("Seu saldo atual é de: R$ " + saldo);
                }

            } else if (opcao == 4){
                out.println("Obrigado por usar nosso sistema de controle financeiro!!");

            } else {
                out.println("Opcao Invalida!");
            }

        }
    }
}
