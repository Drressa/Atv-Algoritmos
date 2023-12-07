
import javax.swing.JOptionPane;
public class EXER10TS {
    public static void main(String[] args) {

        double precoBlusaA, precoBlusaB;
        String sPrecoBlusaA, sPrecoBlusaB;

        sPrecoBlusaA = JOptionPane.showInputDialog(null,"Informe o valor da blusa A");
        sPrecoBlusaB = JOptionPane.showInputDialog(null,"Informe o valor da blusa B");

        precoBlusaA = Double.parseDouble(sPrecoBlusaA);
        precoBlusaB = Double.parseDouble(sPrecoBlusaB);

        if (precoBlusaA > precoBlusaB)
        {
            JOptionPane.showMessageDialog(null,"Blusa A tem maior preço.");
        }
        else if(precoBlusaB > precoBlusaA)
        {
            JOptionPane.showMessageDialog(null,"Blusa B tem maior preço");
        }
    }
}

