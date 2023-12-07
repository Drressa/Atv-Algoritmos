import javax.swing.*;

public class Aula3011 {

   //metodo estatico
    public static int soma(int n1, int n2){
        int somavalores=0;
        somavalores = n1+n2;

        //Salva o valor na memoria
        return somavalores;
    }
        //metodo main
    public static void main(String[] args) {
        //Executar o metodo soma
        String sn1, sn2;
        int n3,n4;

        //Pedir que o usuário informe o valor
        sn1 = JOptionPane.showInputDialog("Primeiro número");
        sn2 = JOptionPane.showInputDialog("Segundo número");
        n3 = Integer.parseInt(sn1);
        n4 = Integer.parseInt(sn2);

        JOptionPane.showMessageDialog(null, soma(n3,n4));
    }
}