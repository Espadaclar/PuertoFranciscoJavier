
/**
 * Clase para definir los datos básicos de un barco de tipo velero.
 *franciscoJavier
 */
class Velero extends Barco {
    private int numMastiles;

    /**
     * constructor con parámetros para inicializar los atributos.
     * @param matricula; matricula del barco.
     * @param eslora; longitud del barco.
     * @param anio; año de fabicación del barco.
     * @param persona; objeto Persona.
     * @param numMastiles; nº de mástiles que tiene el barco.
     */
    public Velero(String matricula,double eslora, int anio, Persona persona, int numMastiles) {
        super( matricula, eslora, anio, persona);
        this.numMastiles = numMastiles;
    }

    /**
     * Devuelve un valor imprescindible para el cálculo total del alquiler de un tipo de barco.
     * @return numMastiles; el nº de mastiles  para operar en el precio del alquiler.
     */
    @Override
    public int getCoeficienteBernua() {
        return numMastiles;
    }
    
     /**
     * Retorna los datos básicos de la clase, nombre del propietario del barco, matrícula del barco,
     * metros de eslora del barco, año de fabricación y el número de mástiles.
     */
    @Override
    public String toString() {
        String datos = super.toString();
        datos += "Velero con " +numMastiles+ " mastiles.\n";
        return datos;
    }
    
}


