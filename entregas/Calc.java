package entregas;

class Calc {
    private double[] numbers;
    private int actualPosition;
    private boolean error;
    private String errorMensaje; 

    public static void main(String[] args) {
        
        Calc calculator = new Calc();

        calculator.inputNumber(45);
        calculator.sum();
        System.out.println(calculator.show());

    }  

    public Calc() {
        numbers = new double[10];
        actualPosition = 0;
        error = false;
        errorMensaje = "";
    };
    
    public void inputNumber(double value){
        numbers[actualPosition] = value;
        actualPosition++;
    }

    public String show (){
        if (error){
            return errorMensaje;
        } else{
        return "" + numbers[actualPosition-1];}
    }

    public String showAll (){
        if (error){
            return errorMensaje;
        } else{
            String result = "";
            for(int i=0; i<actualPosition; i++){
                result = result + numbers[i] + "\n";
            }
            return result;
        }
    }

    public void clean (){
        numbers = new double[numbers.length];
        actualPosition = 0;
        error = !error;
        errorMensaje = "";
    }

    public void sum(){
        if (actualPosition >= 2){
            double result = numbers[actualPosition-1] + numbers[actualPosition-2];
            numbers[actualPosition-2] = result;
            actualPosition = actualPosition-1;
        }
        else{
            error = true;
            errorMensaje = "Missing Operators";
        }
    };

    public void minus(){
        if (actualPosition >= 2){
            double result = numbers[actualPosition-2] - numbers[actualPosition-1];
            numbers[actualPosition-2] = result;
            actualPosition = actualPosition-1;
        }
        else{
            error = true;
            errorMensaje = "Missing Operators";
        }
    };

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