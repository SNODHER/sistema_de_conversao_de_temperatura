import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o graus C°");
        double Tc = leitura.nextDouble();
        System.out.println("Digite o F°");
        double Tf = leitura.nextDouble();
        System.out.println("Digite K°");
        double Tk = leitura.nextDouble();

        double resultadoTc = Tc * 1.8 + 32;  // Tc for Tf
        double resultadoTc2 = Tc + 273; // Tc for Tk
        double resultadoTf = (Tf - 32) / 1.8; // Tf for Tc
        double resultadoTf2 = (Tf - 32) * 5 / 9 + 273; // Tf for Tk
        double resultadoTk = Tk - 273; // Tk for Tc
        double resultadoTk2 = (Tk - 373) * 1.8 + 32; //

        imprimirResultado(" Celsius para Fahrenheit", Tc, resultadoTc);
        imprimirResultado(" Celsius para Kelvin", Tc, resultadoTc2);
        imprimirResultado(" Fahrenheit para Celsius", Tf, resultadoTf);
        imprimirResultado(" Fahrenheit para Kelvin", Tf, resultadoTf2);
        imprimirResultado(" Kelvin para Celsius", Tk, resultadoTk);
        imprimirResultado(" Kelvin para Fahrenheit", Tk, resultadoTk2);
    }

    public static void imprimirResultado(String AddString, double valorOriginal, double resultado) {
        if (resultado % 1 == 0) {
            System.out.println("A conversão de " + valorOriginal + AddString + " é: " + (int) resultado + ".");
        } else {
            System.out.println("A conversão de " + valorOriginal + AddString + " é: " + (float) resultado + ".");
        }
    }
}