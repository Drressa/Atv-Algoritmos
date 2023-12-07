
import javax.swing.JOptionPane;
public class Exercicio02 {
    public static void main(String[] args) {
        //Crie um algoritmo para verficar o cálculo de INSS sobre o salário mínimmo (14%)

        double salario, desconto, salarioReajustado;
        String stSalario;

        stSalario = JOptionPane.showInputDialog(null,"Insira o salário:");
        salario = Double.parseDouble(stSalario);
        desconto = 0.86;
        salarioReajustado = salario * desconto;

        JOptionPane.showMessageDialog(null,"Salario com desconto: "+salarioReajustado);
    }
}
