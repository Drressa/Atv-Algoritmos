
import javax.swing.JOptionPane;
public class Questao9 {
    public static void main(String[] args) {
       

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));

        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Você é maior de idade.");
        } else {
            int anosRestantes = 18 - idade;
            JOptionPane.showMessageDialog(null, "Você é menor de idade. Ainda faltam " + anosRestantes + " anos para ser maior.");
        }
    }
}
