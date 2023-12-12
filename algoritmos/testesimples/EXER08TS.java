import  javax.swing.JOptionPane;

public class EXER08TS {

    public static void main(String[] args) {

        int numX, numY;
        String sNumX, sNumY;

        sNumX = JOptionPane.showInputDialog(null,"Entre com um valor X");
        sNumY = JOptionPane.showInputDialog(null,"Entre com um valor Y");

        numX = Integer.parseInt(sNumX);
        numY = Integer.parseInt(sNumY);

        if(numX % numY == 0)
        {
            JOptionPane.showMessageDialog(null,"É DIVISÍVEL");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"NÃO É DIVISÍVEL");
        }

    }
}
