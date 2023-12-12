import  javax.swing.JOptionPane;

public class Exercicio01C {

    public static void main(String[] args) {
        // Área do trapézio de lado maior 5 e lado menor 3

        int lMaior, lMenor, altura, area;
        String saltura;
        lMaior = 5;
        lMenor = 3;
        saltura = JOptionPane.showInputDialog(null,"Insira a altura: ");
        altura = Integer.parseInt(saltura);

        area = ((lMaior+lMenor)*altura)/2;
        JOptionPane.showMessageDialog(null,"A área do trapézio é: "+area);

    }
}

