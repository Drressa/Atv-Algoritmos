
import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {

        // 6. Ler o salário de um funcionário e imprimí-lo com acréscimo de 15%;

        double salario, acrescimo, salarioReajustado;
        String stSalario;

        stSalario = JOptionPane.showInputDialog(null,"Digite o seu salário atual:");
        salario  = Double.parseDouble(stSalario);
        acrescimo = (salario * 0.15);
        salarioReajustado=(salario+acrescimo);

        JOptionPane.showMessageDialog(null,"O seu salário reajustado é: "+salarioReajustado+" reais");

    }
}
