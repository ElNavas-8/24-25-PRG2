package entregas.navasNicolas.reto004;

public class Fraccion {
    private int numerador;
    private int denominador;
    private int entero;

    public Fraccion(int numerador, int denominador) {
        assert denominador != 0 : "El Denominador no puede ser Cero";
        if (denominador < 0) {
            numerador = -numerador;
            denominador = -denominador;
        }

        this.numerador = numerador;
        this.denominador = denominador;

        int mcd = mcd(Math.abs(numerador), denominador);
        this.numerador = numerador / mcd;
        this.denominador = denominador / mcd;
    }

    private int mcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public Fraccion(int numerador) {
        this(0, 1);
    }

    public Fraccion() {
        this(0);
    }

    public Fraccion sumar(Fraccion fraccion) {
        if (this.denominador == fraccion.denominador) {
            int numerador = this.numerador + fraccion.numerador;
            return new Fraccion(numerador, fraccion.denominador);
        } else {
            int numerador = (this.numerador * fraccion.denominador) + (fraccion.numerador * this.denominador);
            int denominador = this.denominador * fraccion.denominador;
            return new Fraccion(numerador, denominador);
        }

    }

    public Fraccion oponer() {
        return new Fraccion(-this.numerador, this.denominador);
    };

    public Fraccion restar(Fraccion fraccion) {
        return sumar(fraccion.oponer());
    }

    public Fraccion multiplicar(Fraccion fraccion) {
        int numerador = (this.numerador * fraccion.numerador);
        int denominador = (this.denominador * fraccion.denominador);
        return new Fraccion(numerador, denominador);
    };

    public Fraccion dividir(Fraccion fraccion){
        int numerador = (this.numerador * fraccion.denominador);
        int denominador = (this.denominador * fraccion.numerador);
        return new Fraccion(numerador, denominador);
    };

    public String toString() {
        return numerador + "/" + denominador;
    }

    public Fraccion sumar(int entero) {
        return this.sumar(new Fraccion(entero));
    }

    public Fraccion restar(int entero) {
        return this.restar(new Fraccion(entero));
    }

    public Fraccion multiplicar(int entero) {
        return this.multiplicar(new Fraccion(entero));
    }

    public Fraccion dividir(int entero){
        return this.dividir(new Fraccion(entero));
    };

    public int numerador() {
        return numerador;
    };

    public int denominador() {
        return denominador;
    };

}