public class Barberia {
    public String nombre; //definimos Atributos
    public String ubicacion;
    public String telefono;
    private double ganancia;

    public Barberia(String nombre, String ubicacion, String telefono, double ganancia) { // hacemos El constructor
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.telefono=telefono;
        this.ganancia=ganancia;
    }

    public double getGanancia(){ //obtenemos la ganancia  
        return ganancia;
    }
    public void setGanancia(double ganancia){ //establece la ganancia
        this.ganancia=ganancia;
    }

    public void MostrarInfo(){ //muestra la informacion de la barberia
        System.out.print("\nBarberia "+nombre);
        System.out.println("                                                                          Telefono: "+telefono);
        System.out.println("Direccion: "+ubicacion);
    }
    
    
}
