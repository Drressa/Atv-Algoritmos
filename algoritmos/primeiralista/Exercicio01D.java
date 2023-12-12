import java.lang.Math;

public class Exercicio01D {

    public static void main(String[] args) {
        // Área de um círculo de raio 6;

        double raio, pi, area;

        raio = 6;
        pi = 3.14;
        area = pi * Math.pow(raio,2);
        System.out.println("Área do círculo: "+area);
    }
}
