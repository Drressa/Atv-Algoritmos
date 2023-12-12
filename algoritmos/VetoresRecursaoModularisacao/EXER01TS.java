import javax.swing.JOptionPane;

public class EXER01TS {
    
    public static void main(String[] args) {
        /* 1. Entrar com uma distância(km) e o tempo de viagem (horas) de um automóvel, e dizer se a velocidade
        média fois superior ao limite (110Km/h) ou não. */

        float distancia, tempo, vMedia;
        String sDistancia, sTempo;

        sDistancia = JOptionPane.showInputDialog(null,"Entre com a distancia em 'km':");
        sTempo = JOptionPane.showInputDialog(null,"Entre com o tempo da viagem em 'horas':");

        distancia = Float.parseFloat(sDistancia);
        tempo = Float.parseFloat(sTempo);
        vMedia = distancia/tempo;

        if(vMedia > 110.0) {
            JOptionPane.showMessageDialog(null,"A sua velocidade excedeu o limite da via:"+vMedia+"Km/h");
        } else {
            JOptionPane.showMessageDialog(null,"A sua velocidade está dentro do limite da via:"+vMedia+"Km/h");
        }


    }
}
