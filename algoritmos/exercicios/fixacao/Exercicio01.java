
import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args) {

        // 1. Ler um número real e escrever seu cubo.

        double n1, resultado;
        String sn1;

        sn1 = JOptionPane.showInputDialog(null,"Insira o valor desejado");
        n1 = Double.parseDouble(sn1);
        resultado = n1*n1*n1;

        JOptionPane.showMessageDialog(null,"O cubo de "+n1+" é igual a: "+resultado);


    }
}
