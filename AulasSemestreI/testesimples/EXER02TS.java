import javax.swing.JOptionPane;
public class EXER02TS {
    public static void main(String[] args) {

        /* 2. Ler a temperatura de uma pessoa a exibir a mensagem " ESTÁ COM FEBRE" ou
	    "SEM FEBRE", Considere o valor base como 36.5.
        */

        float tempCorp;
        String sTempCorp;

        sTempCorp = JOptionPane.showInputDialog(null, "Informe a sua temperatura em 'Cº':");
        tempCorp = Float.parseFloat(sTempCorp);

        if (tempCorp > 36.5) {
            JOptionPane.showMessageDialog(null, "ESTÁ COM FEBRE");
        } else {
            JOptionPane.showMessageDialog(null, "SEM FEBRE");
        }
    }
}
