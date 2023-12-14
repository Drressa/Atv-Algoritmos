import javax.swing.JOptionPane;

public class AULA09EX01 {
    
    public static void main(String[] args) {

        int mes;
        String sMes;

        sMes = JOptionPane.showInputDialog(null,"Digite o núemro do mês desejado");
        mes = Integer.parseInt(sMes);

        switch(mes)
        {
            case 1 -> JOptionPane.showMessageDialog(null,"Janeiro");
            case 2 -> JOptionPane.showMessageDialog(null,"Fevereiro");
            case 3 -> JOptionPane.showMessageDialog(null,"Março");
            case 4 -> JOptionPane.showMessageDialog(null,"Abril");
            case 5 -> JOptionPane.showMessageDialog(null,"Maio");
            case 6 -> JOptionPane.showMessageDialog(null,"Junho");
            case 7 -> JOptionPane.showMessageDialog(null,"Julho");
            case 8 -> JOptionPane.showMessageDialog(null,"Agosto");
            case 9 -> JOptionPane.showMessageDialog(null,"Setembro");
            case 10 -> JOptionPane.showMessageDialog(null,"Outubro");
            case 11 -> JOptionPane.showMessageDialog(null,"Novembro");
            case 12 -> JOptionPane.showMessageDialog(null,"Dezembro");
            default -> JOptionPane.showMessageDialog(null,"Intrada inválida");
        }
    }
}
