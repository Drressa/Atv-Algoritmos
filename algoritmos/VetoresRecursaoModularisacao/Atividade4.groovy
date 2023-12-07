 import javax.swing.JOptionPane;

 public class Atividade4 {

    public static void main(String[] args) {
    
        // Declara a matriz
        int[][] matriz = new int[4][5];

        // Lê os valores da matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                String valor = JOptionPane.showInputDialog("Digite o valor da matriz na posição [" + i + "][" + j + "]: ");
                matriz[i][j] = Integer.parseInt(valor);
            }
        }
        
        // Declara a variável para armazenar a soma
        int soma = 0;
        
        // Percorre a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Se o elemento for positivo, adiciona à soma
                if (matriz[i][j] >= 0) {
                    soma += matriz[i][j];
                }
            }
        }
        
        // Mostra o resultado
        JOptionPane.showMessageDialog(null, "A soma dos elementos positivos da matriz é: " + soma);
    }
}
