import javax.swing.JOptionPane;

public class EXER05TS {

    public static void main(String[] args) {
        // Ler a idade de uma pessoa e exibir uma mensagem dizendo se ela está compreendida entre 18 e 65 anos.
        
        int idade;
        String sIdade;

        sIdade = JOptionPane.showInputDialog(null, "Insira a sua idade:");
        
        idade = Integer.parseInt(sIdade);

        if (idade >= 18 && idade <= 65)
        {
            JOptionPane.showMessageDialog(null,"SUA IDADE COMPREENDE ENTRE 18 E 65 ANOS");

        } else {
            JOptionPane.showMessageDialog(null,"SUA IDADE NÃO COMPREENDE ENTRE 18 E 65 ANOS");
        }
    }
}
