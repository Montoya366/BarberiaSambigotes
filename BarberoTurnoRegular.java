public class BarberoTurnoRegular extends Barbero {

    public BarberoTurnoRegular(String nombreBarbero) {
        super(nombreBarbero, "Regular");
        setSalario(800); //constructor de barbero
    }

    @Override //se sobreescribe
    public void calcularBono(double gananciaDia) {
        setBonoporCorte(getNumCortes() * 0.05 * gananciaDia); // Bono: 5% por cada corte realizado
    }

    @Override //se sobreescribe
    public void mostrarInformacion() {
        System.out.println("");
        System.out.println("Nombre: " + nombreBarbero);
        System.out.println("Turno: "+turno);
        System.out.println("Salario: C$" + getSalario());
        System.out.println("Bono por corte: C$" + getBonoporCorte());
        System.out.println("===============================");
    }

    @Override 
    public String toString() {
        return String.format("%s,%s,%.2f,%d,%.2f", this.nombreBarbero, this.turno, this.getSalario(), this.getNumCortes(), this.getBonoporCorte());
    }



    public static Barbero fromString(String linea) { //se encarga de la conversion de los datos
        String[] partes = linea.split(",");
        try {
            String nombre = partes[0].trim();
            String tipoBarbero = partes[1].trim();  // El tipo de barbero está en la segunda posición
            double salario = Double.parseDouble(partes[2].trim());
            int numCortes = Integer.parseInt(partes[3].trim());
            double bonoPorCorte = Double.parseDouble(partes[4].trim());
    
            if (!tipoBarbero.equalsIgnoreCase("Regular")) {
                throw new IllegalArgumentException("Tipo de barbero incorrecto para la clase BarberoTurnoRegular: " + tipoBarbero);
            }
    
            BarberoTurnoRegular barbero = new BarberoTurnoRegular(nombre);
            barbero.setSalario(salario);
            barbero.setNumCortes(numCortes);
            barbero.setBonoporCorte(bonoPorCorte);
    
            return barbero;
        } catch (Exception e) {
            throw new IllegalArgumentException("Error al parsear un número de la cadena de entrada: " + linea, e);
        }
    }
    
    

    
    

    
}
