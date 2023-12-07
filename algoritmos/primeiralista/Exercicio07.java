
import javax.swing.JOptionPane;

public class Exercicio07 {
    public static void main(String[] args) {
        // 7. crie duas matrizes de 1/3;

        double a11, a12, a13, b21, b22, b23, c31, c32, c33;
        String stA11,stA12, stA13, stB21, stB22, stB23;

        stA11 = JOptionPane.showInputDialog(null,"Digite o valor de a11:");
        stA12 = JOptionPane.showInputDialog(null,"Digite o valor de a12:");
        stA13 = JOptionPane.showInputDialog(null,"Digite o valor de a13:");
        stB21 = JOptionPane.showInputDialog(null,"Digite o valor de b21:");
        stB22 = JOptionPane.showInputDialog(null,"Digite o valor de b22:");
        stB23 = JOptionPane.showInputDialog(null,"Digite o valor de b23:");

        a11 = Double.parseDouble(stA11);
        a12 = Double.parseDouble(stA12);
        a13 = Double.parseDouble(stA13);
        b21 = Double.parseDouble(stB21);
        b22 = Double.parseDouble(stB22);
        b23 = Double.parseDouble(stB23);

        c31 = a11 + b21;
        c32 = a12 + b22;
        c33 = a13 + b23;

        JOptionPane.showMessageDialog(null,"Resultado: "+"\nC31: "+c31+" \nC32: "+c32+" \nC33: "+c33);

    }
}

