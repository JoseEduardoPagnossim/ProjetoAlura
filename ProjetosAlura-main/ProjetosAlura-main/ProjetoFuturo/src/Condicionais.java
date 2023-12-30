public class Condicionais {

    public static void main(String[] args) {
        
    int anoDeLancamento = 2021;
    boolean incluidoNoPlano = false;
    String tipoPlano = "normal";

    if (anoDeLancamento >= 2022){
        System.out.println("Lançamento que os clientes estão curtindo!");
    } else{
        System.out.println("Filme retro, vale a pena assistir!");
    }
   
    if (incluidoNoPlano == true || tipoPlano.equals("plus")){
        System.out.println("Filme liberado");
    } else{
        System.out.println("Deve pagar a locação");
    }


    }
    
}
