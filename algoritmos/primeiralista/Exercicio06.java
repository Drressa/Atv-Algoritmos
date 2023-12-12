import javax.swing.JOptionPane;
import java.lang.Math;

public class Exercicio06 {

    public static void main(String[] args) {
        /* 6. Crie um algoritmo que calcule as raízes quadradas de uma equação
            do segundo grau.*/

        double a, b, c, delta, x1, x2;
        String stA, stB, stC;

        stA = JOptionPane.showInputDialog(null,"Entre com 'A'");
        stB = JOptionPane.showInputDialog(null,"Entre com 'B'");
        stC = JOptionPane.showInputDialog(null,"Entre com 'C'");

        a = Double.parseDouble(stA);
        b = Double.parseDouble(stB);
        c = Double.parseDouble(stC);
        delta = Math.pow(b,2)-4*(a)*(c);
        x1 = ((-(b)+Math.sqrt(delta))/2*a);
        x2 = ((-(b)-Math.sqrt(delta))/2*a);

        JOptionPane.showMessageDialog(null,"As raízes da esquação são:"+"\nX1: "+x1 + "\nX2: "+x2);
    }
}
