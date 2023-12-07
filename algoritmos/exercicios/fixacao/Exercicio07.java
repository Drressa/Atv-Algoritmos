
import javax.swing.JOptionPane;

public class Exercicio07 {
    public static void main(String[] args) {
        /* Ler o salário de um funcionário e imprimí-lo com um
        desconto de INSS de 14%;
         */

        double salario, desconto, salarioReajustado;
        String stSalario;

        stSalario =  JOptionPane.showInputDialog(null,"Insira o seu salário atual: ");
        salario = Double.parseDouble(stSalario);
        desconto = (salario* 0.14);
        salarioReajustado = (salario - desconto);

        JOptionPane.showMessageDialog(null,"Seu salario atual é :"+salario+"\n"+"Desconto INSS: "+desconto+"\n"+"Seu salario reajustado é : " + salarioReajustado);
    }
}
