public class CarroElectrico extends Vehiculo implements VehiculoElectrico{
    public CarroElectrico(String marca, String modelo, String combustible) {
        super(marca, modelo, combustible);
    }

    public void encender() {
        System.out.println(marca + " " + modelo + " esta encendido.");
    }

    @Override
    public void apagar() {
        System.out.println(marca + " " + modelo + " está apagado.");
    }

    public void cargarBateria(){
        System.out.println(marca + " " + modelo + " bateria cargada.");
    }
    public void nivelBateria(){
        System.out.println(marca + " " + modelo + " bateria: " + combustible);
    }

}
