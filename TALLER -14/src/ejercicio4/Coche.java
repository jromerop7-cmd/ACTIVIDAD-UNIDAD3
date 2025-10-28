package ejercicio4;

public class Coche extends Vehiculo {
    private String modelo;
    
    public Coche(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public void mover(){
        System.out.println("El Carro va a 160km/h " + "- " + modelo);
    }
    
    
}
