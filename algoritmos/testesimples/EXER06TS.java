
import javax.swing.JOptionPane;
import java.io.IOException;
public class EXER06TS {
    public static void main(String[] args) throws IOException {

        String gender;

        gender = JOptionPane.showInputDialog(null,"Entre com 'M' ou 'F'");

        switch(gender)
        {
            case "m":
                JOptionPane.showMessageDialog(null,"Masculino");
                break;
            case "M":
                JOptionPane.showMessageDialog(null,"Masculino");
                break;
            case "f":
                JOptionPane.showMessageDialog(null,"Feminino");
                break;
            case "F":
                JOptionPane.showMessageDialog(null,"Feminino");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Entrada inválida");
                break;
        }
    }
}
