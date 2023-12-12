import javax.swing.JOptionPane;

public class EXER04TS {
  
    public static void main(String[] args) {

        //4. Ler um número inteiro e imprimir se ele é par e divisível por 3.

        int num;
        String sNum;

        sNum = JOptionPane.showInputDialog(null,"Entre com um  valor:");
        num = Integer.parseInt(sNum);

        if(num % 2 == 0 && num % 3 ==0)
        {
            JOptionPane.showMessageDialog(null,num+" é par e divisível por 3.");
        } else if(num % 2 != 0 && num % 3 == 0)
          {
            JOptionPane.showMessageDialog(null,num+" NÃO é par e é divisível por 3.");
          } else if(num % 2 == 0 && num % 3 != 0)
            {
                JOptionPane.showMessageDialog(null,num+" é par e NÃO é divisível por 3.");
            } else
              {
                  JOptionPane.showMessageDialog(null,num+" NÃO é par e NÃO é divisível por 3.");
              }
    }
}
