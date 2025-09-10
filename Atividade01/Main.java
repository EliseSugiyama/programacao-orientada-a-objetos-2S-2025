package Atividade01;

public class Main {
    public static void main(String[] args){
        Computador comp = new Computador(16, 500, 8, 2.5f);

        SistemaOperacional so = new SistemaOperacional(comp);

        Programa sucesso = new Programa(8, 100, 4, 20000);
        System.out.println("Caso 1: "); 
        so.executarPrograma(sucesso);

        Programa erro_instalacao = new Programa(4, 800, 2, 10000);
        System.out.println("Caso 2: ");
        so.executarPrograma(erro_instalacao);

        Programa erro_execucao = new Programa(32, 100, 4, 50000);
        System.out.println("Caso 3: ");
        so.executarPrograma(erro_execucao);
    }
}
