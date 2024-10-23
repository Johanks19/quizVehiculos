public class Carro extends Vehiculo{

    public Carro(String marca, String modelo, String combustible) {
        super(marca, modelo, combustible);
    }


    public void encender() {
        System.out.println(marca + " " + modelo + " esta encendido.");
    }

    @Override
    public void apagar() {
        System.out.println(marca + " " + modelo + " está apagado.");
    }
}
