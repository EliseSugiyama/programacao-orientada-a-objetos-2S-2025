package Atividade01;

public class Programa {
    private Integer memoriaRAMAlocada;
    private Integer SSDOcupado;
    private Integer nucleos;
    private Integer quantidadeOperacoes;

public Programa(Integer memoriaRAMAlocada, Integer SSDOcupado, Integer nucleos, Integer quantidadeOperacoes){
    this.memoriaRAMAlocada = memoriaRAMAlocada; 
    this.SSDOcupado = SSDOcupado;
    this.nucleos = nucleos;
    this.quantidadeOperacoes = quantidadeOperacoes; 
}

public void tempoExecucao(Integer nucleos, Integer quantidadeOperacoes, Integer Nucleos, Float operacoesPorSegundo){ 
    Integer tempo = quantidadeOperacoes / (int) (operacoesPorSegundo * Nucleos); 
}

public void executarPrograma(Integer memoriaRAMAlocada, Integer SSDOcupado, Integer nucleos, Integer quantidadeOperacoes,
Integer memoriaRAM, Integer SSD, Integer Nucleos, Float operacoesPorSegundo){
    if(SSDOcupado > SSD){
        System.out.println("Erro na instalação do programa! ");
    }
    if(memoriaRAMAlocada > memoriaRAM){
        System.out.println("Erro na execução do programa! "); 
    } else {
        System.out.println("Programa executado com sucesso! ");
        System.out.println("Tempo de execução: " + Tempo);
    }
       
}
}
