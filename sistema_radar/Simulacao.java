

public class Simulacao {
    
    public static void main(String[] args){
        Carro opala = new Carro("ACLR300", 0, 76, "Comodoro");

        Radar radar = new Radar(60, "Pardal", "Pistao Sul");
        
        radar.avaliarVelocidade(opala);

        opala.acelerar(); //10
        opala.acelerar(); //20
        opala.acelerar(); //30
        opala.acelerar(); //40
        opala.acelerar(); //50
        opala.acelerar(); //60
        opala.acelerar(); //70
        
        radar.avaliarVelocidade(opala);

    }
}
