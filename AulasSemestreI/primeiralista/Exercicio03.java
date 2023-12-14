import javax.swing.JOptionPane;

public class Exercicio03 {

    public static void main(String[] args) {
        //Crie um algorítmo que calcule um acréscimo do salário família sobre um salário mínimo que equivale a 5%

        double salario, acrescimo, salarioReajustado;
        String stSalario;

        stSalario = JOptionPane.showInputDialog(null,"Insira o salário:");
        salario = Double.parseDouble(stSalario);

        //acrescimo de 5%
        acrescimo = 1.05;
        salarioReajustado = salario * acrescimo;

        JOptionPane.showMessageDialog(null,"Salário com acréscimo: "+salarioReajustado);
    }
}
