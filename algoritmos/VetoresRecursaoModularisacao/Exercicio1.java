import javax.swing.*;

public class Exercicio1 {
    public static int potencia(int x, int n){
        if (n == 0 ){

            return 1;
        } else
            return x * potencia(x, n-1);
    }
    public static void main(String [] args){
      // Outro metodo de exucutar => System.out.println(potencia(2, 4));

        //Executar o metodo soma
        String sn1, sn2; int n3,n4;

        //Pedir que o usuário informe o valor
        sn1 = JOptionPane.showInputDialog("Primeiro número");
        sn2 = JOptionPane.showInputDialog("Segundo número");
        n3 = Integer.parseInt(sn1); n4 = Integer.parseInt(sn2);

        JOptionPane.showMessageDialog(null, potencia (n3,n4));
    }
}
