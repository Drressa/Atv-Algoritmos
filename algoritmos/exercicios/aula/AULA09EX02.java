
import javax.swing.JOptionPane;

public class AULA09EX02 {
    public static void main(String[] args){

        double salary, discount;
        String sSalary;

        sSalary = JOptionPane.showInputDialog(null,"Entre com o salário para saber o desconto do IPR");
        salary = Double.parseDouble(sSalary);


        if(salary < 0)
        {
            JOptionPane.showMessageDialog(null,"Entrada inválida");
        }
        else if(salary >= 2299.00)
        {
            JOptionPane.showMessageDialog(null,"Não há descontos para esta faixa salarial");
        }
        else if(salary >= 2300.00 && salary <= 4999.00)
        {
            discount = (salary * 0.075);
            JOptionPane.showMessageDialog(null,"Seu desconto do IPR é de: R$"+discount);
        }
        else if(salary >= 5000.00 && salary <= 6999.00)
        {
            discount = (salary * 0.09);
            JOptionPane.showMessageDialog(null,"Seu desconto do IPR é de: R$"+discount);
        }
        else if(salary >= 7000.00 && salary <= 8999.00)
        {
            discount = (salary * 0.11);
            JOptionPane.showMessageDialog(null,"Seu desconto do IPR é de: R$"+discount);
        }
        else
        {
            discount = (salary * 0.14);
            JOptionPane.showMessageDialog(null,"Seu desconto do IPR é de: R$"+discount);
        }
    }
}
