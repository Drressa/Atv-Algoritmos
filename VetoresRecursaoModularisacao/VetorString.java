import javax.swing.JOptionPane;

public class VetorStringS {

    public static void main(String[] args) {
        
        String nome[] = new String[5];
        String pesquisa="Aluno não encontrado.";
        
        
        for(int i=0; i<nome.length;i++)
        {
            nome[i] = JOptionPane.showInputDialog("Nome ");
        }
        
        for( int i=0;i<nome.length;i++)
        {
            if(nome[i].equals("bob"))
            {
                pesquisa = nome[i];
            }
        }
        
        
        JOptionPane.showMessageDialog(null, pesquisa);
    }
    
}