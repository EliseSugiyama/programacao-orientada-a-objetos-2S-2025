package Atividade01;

public class SistemaOperacional {
    private Computador computador;

    public SistemaOperacional(Computador computador){
        this.computador = computador;
    }

    public Computador getComputador(){
        return computador;
    }

    public void setComputador(Computador computador){
        this.computador = computador;
    }

    public boolean executarPrograma(Programa p){
        if (p.getSSDOcupado() > computador.getSSD()){
            System.out.println("Erro na instalação do programa!\n");
            return false;
        } 
        
        if (p.getmemoriaRAMAlocada() > computador.getmemoriaRAM()){
            System.out.println("Erro na execução do programa!\n");
            return false;
        }

        float tempoExecucao = (float) p.getquantidadeOperacoes()/(computador.getoperacoesPorSegundo()*computador.getNucleos());
        System.out.println("Programa executado com sucesso!");
        System.out.printf("Tempo de execução: %.2f segundos\n\n", tempoExecucao);
        
        return true; 
    }
}
