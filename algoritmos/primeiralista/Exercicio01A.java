
import javax.swing.JOptionPane;
public class Exercicio01A {
    public static void main(String[] args) {
        //Calcular a área do quadrado

        double l, area;
        String sl;

        sl = JOptionPane.showInputDialog(null,"Digite primeiro valor:");


        l = Double.parseDouble(sl);

        area = l*l;
        JOptionPane.showMessageDialog(null,"O resultado da área é: "+area);
    }
}
