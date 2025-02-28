package entregas;

class Calc {
    private double[] numbers;
    private int actualPosition;

    public static void main(String[] args) {
        
        Calc calculator = new Calc();

        calculator.inputNumber(1);
        calculator.inputNumber(25);
        calculator.inputNumber(45);
        System.out.println(calculator.showAll());

        calculator.clean();
        calculator.inputNumber(8);
        System.out.println(calculator.showAll());
    }  

    public Calc() {
        numbers = new double[10];
        actualPosition = 0;
    };
    
    public void inputNumber(double value){
        numbers[actualPosition] = value;
        actualPosition++;
    }

    public String show (){
        return "" + numbers[actualPosition-1];
    }

    public String showAll (){
        String result = "";
        for(int i=0; i<actualPosition; i++){
            result = result + numbers[i] + "\n";
        }
        return result;
    }

    public void clean (){
        numbers = new double[numbers.length];
        actualPosition = 0;
    }

    public void sum(){
        operationSum = actualPosition - (actualPosition-1);
        return operationSum;
    };

    // public void minus(){};
    // public void divide(){};
    // public void multiply(){};

    // public void changeOperator(){};

    // public void power(){};
    // public void toThePowerOf(){};
    // public void squareRoot(){};
    // public void logarithm(){};

    // public void sen(){};
    // public void cos(){};
    // public void tan(){};
    // public void cotan(){};
    // public void sec(){};
    // public void cosec(){};

    // public void alternateAngleMode(){};
    // public void alternateNumberFormat(){};

};