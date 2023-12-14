import javax.swing.JOptionPane;
public class Questao2 {
    public static void main(String[] args) {
    /*2) O indice de massa corpórea (IMC) é calculado a partir da seguinte fórmula:
    IMC= peso(kg)/ altura²(m)*/

            // Solicita o peso em quilogramas
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso em quilogramas:"));

            // Solicita a altura em metros
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura em metros:"));

            // Calcula o IMC
            double imc = calcularIMC(peso, altura);

            // Exibe o resultado com base no IMC calculado
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc + "\n" + interpretarIMC(imc));
        }

        // Método para calcular o IMC
        private static double calcularIMC(double peso, double altura) {
            return peso / (altura * altura);
        }

        // Método para interpretar o IMC
        private static String interpretarIMC(double imc) {
            if (imc < 18.5) {
                return "Abaixo do peso";
            } else if (imc >= 18.5 && imc < 25) {
                return "Peso normal";
            } else if (imc >= 25 && imc < 30) {
                return "Sobrepeso";
            } else if (imc >= 30 && imc < 35) {
                return "Obesidade leve";
            } else if (imc >= 35 && imc < 40) {
                return "Obesidade moderado";
            } else {
                return "Obesidade mórbido";
            }
    }
}
