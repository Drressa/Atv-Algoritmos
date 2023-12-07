

import javax.swing.JOptionPane;

public class Vetor2211 {

    public static void main(String[] args) {
        
        double notas[] = new double[5];
        double media=0.0,soma=0.0;
        
        for(int i=0;i<= notas.length;i++)
        {
            notas[i]= Double.parseDouble(JOptionPane.showInputDialog("Nota "));
            soma = soma + notas[i];
         }
        
        media = soma/5;
        
        JOptionPane.showMessageDialog(null," Média = "+ media);
        
    }
    
}

