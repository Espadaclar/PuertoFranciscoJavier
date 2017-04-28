/**
 * Clase para definir los datos básicos de un barco y de su propietario.
 * @ autor franciscoJavier
 */
public abstract class  Barco {
    private Persona persona;
    private String matricula;
    private double eslora;
    private int anio;
    
    /**
     * constructor para inicializar los atributos.
     * @param matricula; matricula del barco.
     * @param eslora; longitud del barco.
     * @param anio; año de fabicación del barco.
     * @param persona; objeto Persona.
     */
    public Barco(String matricula, double eslora, int anio, Persona persona) {
        this.persona = persona;
        this.matricula = matricula;
        this.anio = anio;
        this.eslora = eslora;
    }
    
    /**
     * devuelve la longitud del barco.
     * @return eslora; devuelve los metros de longitud que tiene el barco.
     */
    public double getEslora() {
        return eslora;
    }
    
    public abstract int getCoeficienteBernua();

     /**
     * Retorna los datos básicos de la clase, nombre del propietario del barco, matrícula del barco,
     * metros de eslora del barco, año de fabricación.
     */
    @Override
    public String toString() {
        String datos = "";
        datos += "Nombre propietario: " +persona.getName()+ "\n";
        datos += "Matrícula del barco: " +matricula+ "\n";
        datos += "Metros de eslora: " +eslora+ " m.\n";
        datos += "Año de fabricación: " +anio;
        return datos;
        
        
    }
       
}


