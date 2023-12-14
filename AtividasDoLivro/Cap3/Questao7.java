import javax.swing.JOptionPane;
public class Questao7 {
    public static void main(String[] args) {
        /*7)Entrar com o dia e o mês de uma data e informar quantos dias se  passaram desde o inicio do ano.
        Esqueça a questão dos anos bissextos e considere sempre que um mês possui 30 dias.*/

            int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia:"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês:"));

            int diasPassados = calcularDiasPassados(dia, mes);

            JOptionPane.showMessageDialog(null, "Desde o início do ano passaram-se " + diasPassados + " dias.");


        private static int calcularDiasPassados(int dia, int mes) {
            return (mes - 1) * 30 + dia; // Considerando que cada mês possui 30 dias
        }
    }
}

