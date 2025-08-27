

public class Radar {
    public Integer limitevelocidade;
    public String modelo;
    public String localizacao; 
    public Integer velocidadeAvaliada;

    public void emitirNotificacao(String placa, Integer velocidadeAvaliada){
        System.out.println("Limite de velocidade: " + this.limitevelocidade);
        System.out.println("Velocidade avaliada: " + this.velocidadeAvaliada);
        System.out.println("Placa: " + placa);
    }

    public void avaliarVelocidade(Carro c){
        if (c.velocidade > this.limitevelocidade){
            emitirNotificacao(c.placa, c.velocidade);
        }
    }
}
