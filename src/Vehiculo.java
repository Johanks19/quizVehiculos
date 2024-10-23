abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String combustible;

    public Vehiculo(String marca, String modelo, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", combustible='" + combustible + '\'' +
                '}';
    }

    public abstract void encender();
    public abstract void apagar();

    public void abastecerCombustible(){
        System.out.println("vehiculo con el combustible lleno");
    }
    public void mostrarInfo(){

        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Combustible: " + combustible);

    }






}
