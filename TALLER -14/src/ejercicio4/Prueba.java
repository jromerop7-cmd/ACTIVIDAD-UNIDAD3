package ejercicio4;

public class Prueba {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo Coche = new Coche("mazda");
        Vehiculo bicicleta = new Bicicleta("bmx");
        vehiculo.mover();
        Coche.mover();
        bicicleta.mover();

    }
}
