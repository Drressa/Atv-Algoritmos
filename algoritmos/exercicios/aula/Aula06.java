import javax.swing.JOptionPane;

public class Aula06 {

    public static void main(String[] args) {
        int x, a, b, c;
        double ma, mp;
        String sX, sA, sB, sC;

        sX = JOptionPane.showInputDialog(null,"Entre com valor de x");
        sA = JOptionPane.showInputDialog(null,"Entre com valor de a");
        sB = JOptionPane.showInputDialog(null,"Entre com valor de b");
        sC = JOptionPane.showInputDialog(null,"Entre com valor de c");

        x = Integer.parseInt(sX);
        a = Integer.parseInt(sA);
        b = Integer.parseInt(sB);
        c = Integer.parseInt(sC);

        if(x % 2 == 0)
        {
            ma = (double) (a+b+c)/3;
            JOptionPane.showMessageDialog(null,"Média aritmética "+ma);

            if (x > 10)
            {
                 mp = (double) ((a*2)+(b*3)+(c*4))/9;
                 JOptionPane.showMessageDialog(null,"Média ponderada "+mp);

            }
        } else {
                JOptionPane.showMessageDialog(null,"Número ímpar");
        }
    }
}
