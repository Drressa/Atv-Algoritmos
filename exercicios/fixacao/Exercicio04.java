import  javax.swing.JOptionPane;

public class Exercicio04 {

    public static void main(String[] args) {
        //Ler três números reais e exibir o tripo da sua soma;

        double n1, n2, n3, soma, triploSoma;
        String sn1, sn2, sn3;

        sn1 = JOptionPane.showInputDialog(null,"Primeiro valor:");
        sn2 = JOptionPane.showInputDialog(null,"Segundo valor:");
        sn3 = JOptionPane.showInputDialog(null,"Terceiro valor:");

        n1 = Double.parseDouble(sn1);
        n2 = Double.parseDouble(sn2);
        n3 = Double.parseDouble(sn3);
        soma = (n1+n2+n3);
        triploSoma=(soma*3);

        JOptionPane.showMessageDialog(null,"O triplo da soma de n1, n2 e n3 é: "+triploSoma);
    }
}
