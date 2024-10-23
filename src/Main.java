//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("renault", "logan", "6 galones");
        carro1.mostrarInfo();
        carro1.encender();
        carro1.apagar();
        carro1.abastecerCombustible();

        System.out.println("----------------------------------------------");

        Camion camion1 = new Camion("Kenworth", "T-800", "10 galones");
        camion1.mostrarInfo();
        camion1.encender();
        camion1.apagar();
        camion1.abastecerCombustible();

        System.out.println("----------------------------------------------");

        Moto moto1 = new Moto("suzuki", "gixer", "7 galones");
        moto1.mostrarInfo();
        moto1.encender();
        moto1.apagar();
        moto1.abastecerCombustible();

        System.out.println("----------------------------------------------");

        CarroElectrico carroElectrico= new CarroElectrico("renault", "Twizy", "100% de bateria");
        carroElectrico.mostrarInfo();
        carroElectrico.encender();
        carroElectrico.apagar();
        carroElectrico.cargarBateria();
        carroElectrico.nivelBateria();

    }
}