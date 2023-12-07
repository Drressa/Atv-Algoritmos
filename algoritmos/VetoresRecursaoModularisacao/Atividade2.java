import javax.swing.JOptionPane;

public class Atividade2 {

public static void main (String[] args){

        // Declara os vetores
        double[] gastos2020 = new double[6];
        double[] gastos2021 = new double[6];
        double[] soma = new double[6];

        // Lê os gastos de 2020
        for (int i = 0; i < gastos2020.length; i++) {
            String valor = JOptionPane.showInputDialog("Digite o gasto de energia elétrica de " + (i + 1) + "º mês de 2020: ");
            gastos2020[i] = Double.parseDouble(valor);
        }

        // Lê os gastos de 2021
        for (int i = 0; i < gastos2021.length; i++) {
            String valor = JOptionPane.showInputDialog("Digite o gasto de energia elétrica de " + (i + 1) + "º mês de 2021: ");
            gastos2021[i] = Double.parseDouble(valor);
        }

        // Calcula a soma dos gastos de cada mês
        for (int i = 0; i < soma.length; i++) {
            soma[i] = gastos2020[i] + gastos2021[i];
        }

        // Mostra os gastos totais de cada mês
        for (int i = 0; i < soma.length; i++) {
            JOptionPane.showMessageDialog(null, "Gastos do mês de " + (i + 1) + ": " + soma[i]);
        }
    }
}