
import javax.swing.JOptionPane;
public class repeticaoCaso {
    public static void main(String[] args) {

        int opcao;
        String sOpcao;

        sOpcao = JOptionPane.showInputDialog(null,"Digite uma opção (1,2,3)");
        opcao = Integer.parseInt(sOpcao);

        /* switch(opcao)
        {
            case 1:
                JOptionPane.showMessageDialog(null,"Bom dia!");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Boa tarde!");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Boa noite!");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Inválido");
                break;

         */

         /*   switch (opcao) {
            case 1 -> JOptionPane.showMessageDialog(null, "Bom dia!");
            case 2 -> JOptionPane.showMessageDialog(null, "Boa tarde!");
            case 3 -> JOptionPane.showMessageDialog(null, "Boa noite!");
            default -> JOptionPane.showMessageDialog(null, "Inválido");

          */

            if(opcao == 1)
            {
                JOptionPane.showMessageDialog(null,"Bom dia!");
            }
            else if(opcao == 2)
            {
                JOptionPane.showMessageDialog(null,"Boa tarde!");
            }
            else if(opcao == 3)
            {
                JOptionPane.showMessageDialog(null,"Boa noite!");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Inválido");
            }
    }
}
