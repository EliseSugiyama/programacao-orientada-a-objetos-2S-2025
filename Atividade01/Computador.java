package Atividade01;

public class Computador {
    private Integer memoriaRAM;
    private Integer SSD;
    private Integer Nucleos;
    private Float operacoesPorSegundo; 


    public Computador(Integer memoriaRAM, Integer SSD, Integer Nucleos, Float operacoesPorSegundo){
        this.memoriaRAM = memoriaRAM;
        this.SSD = SSD;
        this.Nucleos = Nucleos; 
        this.operacoesPorSegundo = operacoesPorSegundo; 
    }

    public Integer getmemoriaRAM(){
        return memoriaRAM;
    }

    public void setmemoriaRAM(Integer memoriaRAM){
        this.memoriaRAM = memoriaRAM;
    }

    public Integer getSSD(){
        return SSD;
    }

    public void setSSD(Integer SSD){
        this.SSD = SSD;
    }

    public Integer getNucleos(){
        return Nucleos;
    }

    public void setNucleos(Integer Nucleos){
        this.Nucleos = Nucleos;
    }

    public Float getoperacoesPorSegundo(){
        return operacoesPorSegundo;
    }

    public void setoperacoesPorSegundo(Float operacoesPorSegundo){
        this.operacoesPorSegundo = operacoesPorSegundo; 
    }
}