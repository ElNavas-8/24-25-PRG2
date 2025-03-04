package entregas;

class App {
    public static void main(String[] args) {
        
        Calc calculadora = new Calc();

        calculadora.inputNumber(1);
        System.err.println(calculadora.show());
        
    }    
}
