public class Corte extends Cliente {
    public String nombreBarbero;
    public String fechaCorte;
    public double costoCorte; //atributos 

    public Corte(String nombre, int edad, int numCortes, String nombreBarbero, String fechaCorte, double costoCorte) { //constructor
        super(nombre, edad, numCortes);
        this.nombreBarbero = nombreBarbero;
        this.fechaCorte = fechaCorte;
        this.costoCorte = costoCorte;
    }

    public void calcularCostoCorte() { //para calcular costo de corte
        if (numCortes == 7) { //si el numero de cortes es igual a 7 entonces 
            costoCorte = 0;
            System.out.println("El total a pagar es de: " + costoCorte);
        } else if (edad > 14 && numCortes != 7) { //tambien si la edad es mayor a 14 o numcortes es diferente de 7 entonces
            costoCorte = 150;
            System.out.println("El total a pagar es de: " + costoCorte);
        } else { //tambien
            costoCorte = 140;
            System.out.println("El total a pagar es de: " + costoCorte);
        }
    }

    public void aumentarNumCortes() { //aca se aumentan los cortes
        if (numCortes < 7) {
            numCortes++;
        } else {
            numCortes = 0;
        }
    }

    public void mostrarCorte() { //aca se muestra los datos del cliente
        System.out.println("");
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Atendido por: " + nombreBarbero);
        System.out.println("Fecha: " + fechaCorte);
        System.out.println("Costo del corte: C$" + costoCorte);
        System.out.println("==================================================");
    }

    @Override //se sobreescribe
    public String toString() { //aca el dato se vuelve a cadena
        return super.toString() + "," + nombreBarbero + "," + fechaCorte + "," + costoCorte;
    }

    public static Corte fromString(String str) { // lee el formato para el archivo para guardarlo en una sola lInea
        String[] parts = str.split(",");
        try {
            String nombre = parts[0];
            int edad = Integer.parseInt(parts[1]);
            int numCortes = Integer.parseInt(parts[2]);
            String nombreBarbero = parts[3];
            String fechaCorte = parts[4];
            double costoCorte = Double.parseDouble(parts[5]);
            return new Corte(nombre, edad, numCortes, nombreBarbero, fechaCorte, costoCorte);
        } catch (Exception e) {
            throw new IllegalArgumentException("Error al parsear un número de la cadena de entrada: " + str, e);
        }
    }
}
