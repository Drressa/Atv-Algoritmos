
import javax.swing.JOptionPane;
public class EXER09TS {
    public static void main(String[] args) {

	/* 10. Leu o ano de nascimento de uma pessoa escrever um mensagem que diga se
	ela poderá ou não votar em uma eleição para prefeito (não é necessário
	considerar o mês em que ela nasceu). Considere o ano atual como 2004. */

        int anoNascimento, anoAtual, podeVoltar;
        String sAnoNascimento;

        sAnoNascimento = JOptionPane.showInputDialog(null,"Informe seu ano de nascimento");
        anoNascimento = Integer.parseInt(sAnoNascimento);

        anoAtual = 2004;
        podeVoltar = anoAtual - anoNascimento;

        if(podeVoltar >= 16)
        {
            JOptionPane.showMessageDialog(null,"Sim, pode votar!");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Nâo pode votar!");
        }
    }
}
