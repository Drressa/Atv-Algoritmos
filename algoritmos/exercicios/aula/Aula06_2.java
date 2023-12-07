
import javax.swing.JOptionPane;
public class Aula06_2 {
    public static void main(String[] args) {

        int num1;
        String sNum1;

        sNum1 = JOptionPane.showInputDialog(null,"Entre com um número:");
        num1 = Integer.parseInt(sNum1);

        if(num1 >= 0)
        {
            if(num1 % 2 == 0)
            {
                JOptionPane.showMessageDialog(null,"Número positivo e par");
            } else
              {
                  if(num1 == 13)
                  {
                      JOptionPane.showMessageDialog(null,"Raiz de todos os males");
                  } else {
                      JOptionPane.showMessageDialog(null, "Número positivo e ímpar");
                    }
              }
        } else {
            if (num1 % 2 == 0)
            {
                JOptionPane.showMessageDialog(null,"Número negativo e par");
            } else {
                JOptionPane.showMessageDialog(null,"Némero negativo e ímpar");
            }
        }
    }
}
