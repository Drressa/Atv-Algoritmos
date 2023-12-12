import javax.swing.JOptionPane;

public class EXER23 {

    public static void main(String[] args) {
        /* 23. Num dia de sol, você deseja medir a altura de um prédio, porém, a  trena não é suficientemente
            longa. Assumindo que seja possível medir sua sombra e a do prédio no chão, e que você lembre da sua
            altura, faça um algoritmo para ler os dados necessários e calcular a altura do prédio.*/

        //declarar variáveis
        double sombraPredio, alturaPredio, sombraHomem, alturaHomem;
        String stSombraPredio, stSombraHomem, stAlturaHomem;

        //entrada de dados
        stSombraPredio = JOptionPane.showInputDialog(null, "Informe o medida da sombra do prédio em 'M':");
        
        sombraPredio = Double.parseDouble(stSombraPredio);
        
        stSombraHomem = JOptionPane.showInputDialog(null, "Informe a sombra do homem em 'M':");
        
        sombraHomem = Double.parseDouble(stSombraHomem);
        
        stAlturaHomem = JOptionPane.showInputDialog(null, "Informe a altura do homem em 'M':");
        
        alturaHomem = Double.parseDouble(stAlturaHomem);


        //calculo altura do prédio
        alturaPredio = ((alturaHomem * sombraPredio) / sombraHomem);

        //saída de dados
        JOptionPane.showMessageDialog(null, "O prédio tem " + alturaPredio + " m de altura.");


    }
}


