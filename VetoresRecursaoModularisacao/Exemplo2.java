import javax.swing.JOptionPane;

public class Exemplo2 {

    public static void main(String[] args) {
        
        String mostra="";
        float soma=0;
        
        float[][] gastos = new float[3][4];
        
        //Inicialização de vetor sem laço
        //double[][] gastos1 = { {8.0, 7.5, 8.5, 9.0 }, {8.9, 9.0, 8.6, 8.4 }, {8.9, 9.0, 8.6, 8.4}};
         for( int i=0;i<3;i++)
         {
            mostra = mostra + "\n";
            for(int j=0;j<4;j++)
            {
             gastos[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Valor "));
             mostra = mostra + gastos[i][j]+" ";
             soma = soma+gastos[i][j];
            }
        }
        
            JOptionPane.showMessageDialog(null,"Valores "+ mostra+"\n"+
                    "Soma dos valores = "+soma);
   }
}