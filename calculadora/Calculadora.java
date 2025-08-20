package calculadora;
    
    public class Calculadora {

        public Double numeroA;
        public Double numeroB;

        public void somar(){
            Double resultadoSoma = numeroA+numeroB;
            System.out.println(numeroA + " " + "+" + " " + numeroB + " " + "=" + " " + resultadoSoma);
        }

        public void subtrai(){
            Double resultadoSub = numeroA-numeroB;
            System.out.println(numeroA + " " + "-" + " " + numeroB + " " + "=" + " " + resultadoSub);
        }

        public void multiplicar(){
            Double resultadoMul = numeroA*numeroB;
            System.out.println(numeroA + " " + "x" + " " + numeroB + " " + "=" + " " + resultadoMul);
        }

        public void divisao(){
            Double resultadoDiv = numeroA/numeroB;
            System.out.println(numeroA + " " + ":" + " " + numeroB + " " + "=" + " " + resultadoDiv);
        }
    }