import javax.swing.JOptionPane;
public class Questao1 {

    public static void main(String[] args) {
       
            
            double saldoInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial:"));

            double debitos = Double.parseDouble(JOptionPane.showInputDialog("Digite o total de débitos:"));

            
            double creditos = Double.parseDouble(JOptionPane.showInputDialog("Digite o total de créditos:"));

           
            double saldoFinal = saldoInicial - debitos + creditos;

            
            if (saldoFinal > 0) {
                JOptionPane.showMessageDialog(null, "Saldo positivo em reais" + saldoFinal);
            } else if (saldoFinal < 0) {
                JOptionPane.showMessageDialog(null, "Saldo negativo em reais" + saldoFinal);
            } else {
                JOptionPane.showMessageDialog(null, "Saldo zero.");
            }
    }
}
