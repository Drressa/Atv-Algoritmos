
import  javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {

        /*2. Ler dois número interos e escrever o resto da divisão
        o primeiro pelo segundo */

        int n1, n2, resultado;
        String sn1, sn2;

        sn1 = JOptionPane.showInputDialog(null,"Insira o primeiro valor: ");
        sn2 = JOptionPane.showInputDialog(null,"Insira o segundo valor: ");

        n1 = Integer.parseInt(sn1);
        n2 = Integer.parseInt(sn2);
        resultado = (n1%n2);

        JOptionPane.showMessageDialog(null,"O resto da divisão de "+ n1 + " por "+n2+ " é: "+resultado);
    }
}
