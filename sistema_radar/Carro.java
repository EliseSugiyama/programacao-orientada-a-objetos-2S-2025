

public class Carro {
    public Integer ano;
    public String modelo;
    public String placa;
    public Integer velocidade;

    public void acelerar(){
        this.velocidade += 10;
    }

    public void frear(){
        if (velocidade > 0){
        this.velocidade -= 10;
        }
    }

}
