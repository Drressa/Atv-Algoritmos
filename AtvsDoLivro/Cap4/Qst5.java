import javax.swing.JOptionPane;
public class Questao5 {
    public static void main(String[] args) {
        
        double distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite a distância percorrida (Km):"));
        double combustivel = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de combustível (Litros):"));

        double consumo = distancia / combustivel;

        JOptionPane.showMessageDialog(null, "O consumo é de " + consumo + " Km/l.");

        if (consumo > 15) {
            JOptionPane.showMessageDialog(null, "O veículo não é econômico.");
        } else {
            JOptionPane.showMessageDialog(null, "O veículo é econômico.");
        }
    }
}