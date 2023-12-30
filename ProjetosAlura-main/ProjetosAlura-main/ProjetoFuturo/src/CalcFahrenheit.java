public class CalcFahrenheit {

    public static void main(String[] args) {
        
        double constante1 = 1.8;
        int constante2 = 32;
        int tempCelsius = 37;
        double tempFahrenheit = (tempCelsius * constante1 ) + constante2;

        System.out.println(String.format("A temperatura %d°C é  %.2f em graus Fahrenheit", tempCelsius, tempFahrenheit));

        int tempFahrenheitInteira = (int) tempFahrenheit;

        System.out.println("A temperatura em Fahrenheit inteira é " + tempFahrenheitInteira);
    }
    
}
