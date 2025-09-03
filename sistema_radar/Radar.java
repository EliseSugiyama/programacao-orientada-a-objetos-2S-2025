

public class Radar {
    private Integer limitevelocidade;
    private String modelo;
    private String localizacao; 
    private Integer velocidadeObservada;

    public Radar(Integer limitevelocidade, String modelo, String localizacao){
        this.limitevelocidade = limitevelocidade;
        this.modelo = modelo;
        this.localizacao = localizacao;
    }

    public Radar(Integer limitevelociade){
        this.limitevelocidade = limitevelociade;
    }

    public void emitirNotificacao(String placa, Integer velocidadeObservada){
        System.out.println("Placa: " + placa);
        System.out.println("Velocidade observada: " + velocidadeObservada);
        System.out.println("Localização: " + this.localizacao);
        System.out.println("Velocidade da via: " + this.limitevelocidade);
    }

    public void avaliarVelocidade(Carro carro){
        if (carro.getVelocidade() > this.limitevelocidade){
            emitirNotificacao(carro.getPlaca(), carro.getVelocidade());
        }
    }
}
