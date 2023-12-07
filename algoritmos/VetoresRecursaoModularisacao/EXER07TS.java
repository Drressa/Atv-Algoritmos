package freire.israel.algoritmos.testesimples;
import javax.swing.JOptionPane;
public class EXER07TS {
    public static void main(String[] args) {

        String vogal;
        vogal = JOptionPane.showInputDialog(null, "Descubra se é vogal:\nObs: entre com caractere maiúsculo.");

        switch (vogal) {
            case "A" -> JOptionPane.showMessageDialog(null, "É VOGAL");
            case "E" -> JOptionPane.showMessageDialog(null, "É VOGAL");
            case "I" -> JOptionPane.showMessageDialog(null, "É VOGAL");
            case "O" -> JOptionPane.showMessageDialog(null, "É VOGAL");
            case "U" -> JOptionPane.showMessageDialog(null, "É VOGAL");
            default -> JOptionPane.showMessageDialog(null, "NÃO É VOGAL");
        }
    }
}
