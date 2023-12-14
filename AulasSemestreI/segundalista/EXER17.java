import javax.swing.JOptionPane;

public class EXER17 {

    public static void main(String[] args) {

        /*17. Alguns países medem temperaturas em graus Celcius, e outros em gruas Fahrenheit.
            Faça um algoritmo para ler uma temperatura Celsius e imprimí-la em Fahrenheit (pesquise
            como fazer este tipo de conversão).*/

        //Declarar variáveis
        double grausCelcius, grausFah;
        String stGrausCelcius;


        //receber valor do usuário em String
        stGrausCelcius = JOptionPane.showInputDialog(null,"Valor que deseja converter " +
                "para Fharenheit:");
        //converter valor em String para Int
        grausCelcius = Double.parseDouble(stGrausCelcius);

        //icializar variáveis e executar a operação requerida.
        grausFah = ((grausCelcius * 1.8) + 32);

        //retornar para o usuário a conversão realizada
        JOptionPane.showMessageDialog(null,grausCelcius+"º celsius em Farenheit é: "+grausFah+"º");


    }
}
