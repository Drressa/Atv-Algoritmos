import javax.swing.JOptionPane;

public class EXER03TS {
  
	public static void main(String[] args){

        // Ler um número inteiro e exibir a mensagem " O NÚMERO É MÚLTIPLO DE 7" ou "O NÚMERO NÃO É MÚLTIPLO DE 7";
       
        int num;
        String sNum;

        sNum = JOptionPane.showInputDialog(null,"DESCUBRA SE É MÚLTIPLO DE 7:");
        num = Integer.parseInt(sNum);

        if(num % 7 == 0)
        {
            JOptionPane.showMessageDialog(null," O NÚMERO "+num+" É MÚLTIPLO DE 7.");
        } else{
            JOptionPane.showMessageDialog(null,"O NÚMERO "+num+" NÃO É MÚLTIPLO DE 7.");
        }


    }
}
