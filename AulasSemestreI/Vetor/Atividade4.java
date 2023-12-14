public class Atividade4 {
    public static void main(java.lang.String[] args) {

        // Declara a matriz
        java.lang.Integer[][] matriz = new java.lang.Integer[4][5];

        // Lê os valores da matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                java.lang.String valor = javax.swing.JOptionPane.showInputDialog("Digite o valor da matriz na posição [" + i + "][" + j + "]: ");
                matriz[i][j] = java.lang.Integer.parseInt(valor);
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
        javax.swing.JOptionPane.showMessageDialog(null, "A soma dos elementos positivos da matriz é: " + soma);
    }

}
