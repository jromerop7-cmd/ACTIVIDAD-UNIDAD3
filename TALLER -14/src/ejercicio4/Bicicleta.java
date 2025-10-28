package ejercicio4;

public class Bicicleta extends Vehiculo{

    private String Marca;
    public Bicicleta(String Marca){
        this.Marca = Marca;
    }

    @Override
    public void mover(){
        System.out.println("La bicicleta va a 20km/h " + "- " + Marca);
    }

}
