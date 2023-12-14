import javax.swing.JOptionPane;
import  java.lang.Math;

public class Exercicio04 {

    public static void main(String[] args) {
        /* Crie um algoritmo que calcule o índice de massa corpóre(IMC) de uma pessoa
            IMC = peso/altura^2. */

        double peso, altura, imc;
        String sPeso, sAltura;

        sPeso = JOptionPane.showInputDialog(null,"Insira o seu peso(Kg):");
        sAltura = JOptionPane.showInputDialog(null,"Insira a sua altura(M):");

        peso = Double.parseDouble(sPeso);
        altura = Double.parseDouble(sAltura);
        imc = peso/Math.pow(altura,2);

        JOptionPane.showMessageDialog(null,"O seu IMC é: "+imc);

    }
}
