//Criar um algoritmo para multiplicar dois números interios usando a recursividade

import javax.swing.*;

public class Recurcao{
    public static int multR (int m, int n){
        if( n > 0) {
            return m + multR(m, n - 1);

        } else
            return 0;
    }
    public static void main(String [] args){
        //Executar o metodo soma
        String sn1, sn2; int n3,n4;

        //Pedir que o usuário informe o valor
        sn1 = JOptionPane.showInputDialog("Primeiro número");
        sn2 = JOptionPane.showInputDialog("Segundo número");
        n3 = Integer.parseInt(sn1); n4 = Integer.parseInt(sn2);

        JOptionPane.showMessageDialog(null, multR (n3,n4));

    }
}
