
import javax.swing.JOptionPane;
public class EXER18 {
    public static void main(String[] args) {

        /*
            18. A empresa Hipotheticus paga R$10.00 por hora normal trabalhada, e R$15.00 por hora extra.
             Faça um algoritmo para calcular e imprimir o salário bruto e o salário líquido de um determinado
             funcionário. Considere que o salário líquido é igual ao salário bruto descontando 10% de impostos.

             Complemento: Jornada de trabalho de 40 horas semanais.
         */

        //Declarar variáveis
        double horasTrabalhadas, salarioBruto, salarioLiquido, horaExtra, valorExtra;
        String stHorasTrabalhadas;

        //armazenar valor do usuário
        stHorasTrabalhadas = JOptionPane.showInputDialog(null, "Horas trabalhadas mês:");
        //converter String em Double
        horasTrabalhadas = Double.parseDouble(stHorasTrabalhadas);

        if (horasTrabalhadas <= 120) //120 = Horas de trabalho mensal;
        {
            //Cálculo do salário bruto
            salarioBruto = 10.0 * horasTrabalhadas;
            salarioLiquido = salarioBruto * 0.90;
            //retorna para o usuário o salário líquido
            JOptionPane.showMessageDialog(null, "Salário líquido: R$" + salarioLiquido);

        } else if (horasTrabalhadas > 120) //>120 é salário com hora extra.
        {

            //calcular hora extra e o valor do período extra.
            horaExtra = horasTrabalhadas - 120;
            valorExtra = horaExtra * 15.0;

            //cálculo salário bruto
            salarioBruto = (120 * 10.0) + valorExtra;
            //cálculo salário líquido
            salarioLiquido = salarioBruto *0.90;
            //retornar para o usuário o valor do salário.
            JOptionPane.showMessageDialog(null, "Salário bruto: R$" + salarioBruto+"\n"+
                    "Valor extra: R$"+valorExtra+"\n"+"Salário líquido: R$"+salarioLiquido);

        }

    }
}