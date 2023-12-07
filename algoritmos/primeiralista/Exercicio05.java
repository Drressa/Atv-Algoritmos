
import javax.swing.JOptionPane;
public class Exercicio05 {
    public static void main(String[] args) {
        /*
            Crie um algoritmo que calcule o preço final de um produto qualquer, que seja igual
            a precoBruto + impostos + margemLucro.
         */

        double precoBruto, impostos, margemLucro, precoFinal;
        String stPrecoBruto, stImpostos, stMargemLucro;

        stPrecoBruto = JOptionPane.showInputDialog(null,"Insira o preço bruto do produto:");
        stImpostos = JOptionPane.showInputDialog(null,"Insira a percentagem de impostos: ");
        stMargemLucro = JOptionPane.showInputDialog(null,"Insira a margem de lucro desejada:");

        precoBruto = Double.parseDouble(stPrecoBruto);
        impostos = Double.parseDouble(stImpostos);
        margemLucro = Double.parseDouble(stMargemLucro);

        //operação
        margemLucro = precoBruto * margemLucro;
        impostos = precoBruto * impostos;
        precoFinal = precoBruto + impostos + margemLucro;

        JOptionPane.showMessageDialog(null,"O preço final do produto é: "+precoFinal);
    }
}


