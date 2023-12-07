
import  javax.swing.JOptionPane;
import java.lang.Math;

public class Exercicio03 {
    public static void main(String[] args) {
        /* Ler um número inteiro e escrever o valor do seu quadrado e da
        sua raiz quadrada. Obs:utilizar a classe "math" e método "sqrt".
        ex.: math.sqrt(x); */

        int n1, quadrado;
        double numReal, raizQuadrada;
        String sn1;

        sn1=JOptionPane.showInputDialog(null,"Insira o valor:");
        n1 = Integer.parseInt(sn1);
        quadrado = (int) Math.pow(n1,2);
        numReal = (double) n1;
        raizQuadrada = (double) Math.sqrt(n1);

        JOptionPane.showMessageDialog(null,"Quadrado: "+quadrado+", "+"Raiz quadrada: "+raizQuadrada+";");
    }
}
