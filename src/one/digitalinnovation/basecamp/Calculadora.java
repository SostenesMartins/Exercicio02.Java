package one.digitalinnovation.basecamp;

public class Calculadora {

    public static void soma(double numero1, double numero2){

        double resultado = numero1 + numero2;

        System.out.println("A Soma de " + numero1 + " mais " + numero2 + " é " + resultado);

    }

    public static void subtracao(double numero1, double numero2){

        double resultado = numero1 - numero2;

        System.out.println("A Subtração de " + numero1 + " mais " + numero2 + " é " + resultado);

    }

    public static void multiplicacao(double numero1, double numero2){

        double resultado = numero1 * numero2;

        System.out.println("A Multiplicacao de " + numero1 + " mais " + numero2 + " é " + resultado);

    }

    public static void divisao(double numero1, double numero2){

        double resultado = numero1 / numero2;

        System.out.println("A Divisao de " + numero1 + " mais " + numero2 + " é " + resultado);

    }

}
