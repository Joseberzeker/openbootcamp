public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int resultadoSuma = suma(1, 2, 3);
        Coche miCoche = new Coche();
        miCoche.AgregarPuertas();
        System.out.println("El resultado de la suma es :" + resultadoSuma);
        System.out.println("El número de puertas que tiene el coche es: " + miCoche.numPuertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    public int numPuertas = 0;

    Coche() {
    }

    public void AgregarPuertas() {
        ++this.numPuertas;
    }
}