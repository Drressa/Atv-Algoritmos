import javax.swing.JOptionPane;
public class Questao10 {
    public static void main(String[] args) {
         /*10) A eleição do síndico de um prédio teve três candidatos.
        Faça um algoritimo para ler o nome e o total de votos de cada candidato e informar qual foi o vencedo.*/

        String nomeCandidato1 = JOptionPane.showInputDialog("Digite o nome do candidato 1:");
        int votosCandidato1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de votos do candidato 1:"));

        String nomeCandidato2 = JOptionPane.showInputDialog("Digite o nome do candidato 2:");
        int votosCandidato2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de votos do candidato 2:"));

        String nomeCandidato3 = JOptionPane.showInputDialog("Digite o nome do candidato 3:");
        int votosCandidato3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de votos do candidato 3:"));

        if (votosCandidato1 > votosCandidato2 && votosCandidato1 > votosCandidato3) {
            JOptionPane.showMessageDialog(null, nomeCandidato1 + " venceu a eleição!");
        } else if (votosCandidato2 > votosCandidato1 && votosCandidato2 > votosCandidato3) {
            JOptionPane.showMessageDialog(null, nomeCandidato2 + " venceu a eleição!");
        } else if (votosCandidato3 > votosCandidato1 && votosCandidato3 > votosCandidato2) {
            JOptionPane.showMessageDialog(null, nomeCandidato3 + " venceu a eleição!");
        } else {
            JOptionPane.showMessageDialog(null, "A eleição terminou em empate.");
        }
    }
}
