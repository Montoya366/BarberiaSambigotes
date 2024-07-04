public class Cliente {
    public String nombre;
    public int edad;//atributos de los clientes
    public int numCortes;

    public Cliente(String nombre, int edad, int numCortes) { //constructor
        this.nombre = nombre;
        this.edad = edad;
        this.numCortes = numCortes;
    }

    public static Cliente fromString(String str) {
        String[] parts = str.split(",");
        String nombre = parts[0];// El primer elemento es el nombre
        int edad = Integer.parseInt(parts[1]);// El segundo elemento es la edad y se convierte a entero
        int numCortes = Integer.parseInt(parts[2]);
        return new Cliente(nombre, edad, numCortes);
    }

    @Override //se sobre escribe
    public String toString() { 
        return nombre + "," + edad + "," + numCortes;
    }
}
