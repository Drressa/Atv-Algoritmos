
import javax.swing.JOptionPane;
public class EXER02 {
    public static void main(String[] args) {

        int a, b, c;
        String sA, sB, sC;

        sA = JOptionPane.showInputDialog(null,"Entre com o lado A:");
        sB = JOptionPane.showInputDialog(null,"Entre com o lado B:");
        sC = JOptionPane.showInputDialog(null,"Entre com o lado C:");
        a = Integer.parseInt(sA);
        b = Integer.parseInt(sB);
        c = Integer.parseInt(sC);

        if((a == b) && (b == c))
        {
            JOptionPane.showMessageDialog(null,"Equilátero");
        }
    }
}
