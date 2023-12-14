import javax.swing.JOptionPane;

public class Vettor11 {

    public static void main(String[] args) {
            
        int num[] = new int[5];
        int somapar=0,somaimpar=0;
        
        
        for(int i=0;i<num.length;i++)
        {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("numero "));
        }
        
        for(int i=0;i<num.length;i++)
        {
            if(num[i]%2 == 0)
            {
                somapar = somapar + num[i];
            }
            else
            {
                somaimpar = somaimpar + num[i];
            }
            
        }
        
        JOptionPane.showMessageDialog(null," soma dos pares "+somapar+"\n soma dos impares "+
                somaimpar);

    }
}