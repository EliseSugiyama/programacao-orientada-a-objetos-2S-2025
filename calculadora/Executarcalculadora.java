package calculadora;


public class Executarcalculadora {

    public static void main (String[] args){
        Calculadora calc1 = new Calculadora();
        Calculadora calc2 = new Calculadora();

        calc1.numeroA = 2.0;
        calc1.numeroB = 3.0;

        calc2.numeroA = 4.0;
        calc2.numeroB = 5.0; 
        
        calc1.somar();
        calc2.somar();
        calc1.subtrai();
        calc2.subtrai();
        calc1.multiplicar();
        calc2.multiplicar();
        calc1.divisao();
        calc2.divisao();

    }
}