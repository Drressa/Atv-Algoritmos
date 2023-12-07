
import javax.swing.JOptionPane;
import java.lang.Math;
public class Exercicio09 {
    public static void main(String[] args) {
        /*
         Crie um algoritmo que a calcule a raiz quadrada de um número interio positivo;
         */
        int num,raizQuadrada;
        String stNum;

        stNum = JOptionPane.showInputDialog(null,"Insira o valor:");
        num = Integer.parseInt(stNum);
        raizQuadrada = (int) Math.sqrt(num);

        JOptionPane.showMessageDialog(null,"A raiz quadrada de "+num+" é "+raizQuadrada);


    }
}
