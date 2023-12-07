import javax.swing.JOptionPane;

public class Exemplo1 {

    public static void main(String[] args) {
            
        int v1[] = new int[5];
        int v2[] = new int[5];
        
        
        String mostrar="";
        
        //prencher v1
        for(int i = 0; i< v1.length;i++)
        {
            v1[i]= Integer.parseInt(JOptionPane.showInputDialog("numero"));
        }
        
        //prencher v2
        for(int i = 0; i< v1.length;i++)
        {
            v2[i]= v1[i] ;
                    
        }
        
        //mostrar v1
        for(int i=0;i<v1.length;i++)
        {
            mostrar = mostrar + v1[i]+ " ";
        }
        
        JOptionPane.showMessageDialog(null,"vetor 1 = "+ mostrar);
        
        mostrar="";
        //mostrar v2
        for(int i=0;i<v1.length;i++)
        {
            mostrar = mostrar + v2[i]+ " ";
        }
        
        JOptionPane.showMessageDialog(null,"vetor 2 = "+ mostrar);
        
    }
    
}
