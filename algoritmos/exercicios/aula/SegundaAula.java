
import javax.swing.JOptionPane;
public class SegundaAula {
    public static void main(String[] args) {

        /* Var
            n1, n2, resultado:inteiro;

            Inicio
            ler n1;
            ler n2;

            resultado <- n1 + n2;
            escreve"O resultado é " + resultado;
            FIM
        */

        //Criação das variáveis
        float n1, n2, resultado, soma;
        String sn1, sn2;
        //Ler e salvar as variáveis strings
        sn1=JOptionPane.showInputDialog(null,"Digite o primeiro valor");
        sn2=JOptionPane.showInputDialog(null,"Digite o segundo valor: ");
        //Transforma strigs em inteiros
        n1 = Float.parseFloat(sn1);
        n2 = Float.parseFloat(sn2);
        //soma as variáveis inteiras
        resultado= (n1/n2);
        soma =(float) n1+n2;
        //Exibe resultado
        JOptionPane.showMessageDialog(null,"O resultado é: "+resultado);

    }
}
