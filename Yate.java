

/**
 * Clase para definir los datos básicos de un barco deportivo de tipo Yate
 *franciscoJavier
 */
class Yate extends EmbarcacionAMotor {
    private int numCamarotes;

    /**
     * constructor con parámetros para inicializar los atributos.
     * @param matricula; matricula del barco.
     * @param eslora; longitud del barco.
     * @param anio; año de fabicación del barco.
     * @param persona; objeto Persona.
     * @param potencia; nº de caballos que tiene el motor.
     * @param numCamarotes; nº de camarotes que tiene el yate.
     */
    public Yate(String matricula, double eslora, int anio, Persona persona, int potencia, int numCamarotes) {
        super(matricula, eslora, anio, persona, potencia);
        this.numCamarotes = numCamarotes;
    }
    
    /**
     * Devuelve un valor imprescindible para el cálculo total del alquiler de un tipo de barco.
     * @return numCamarotes + getPotencia(); suma necesaria  para operar en el precio del alquiler.
     */
    @Override
    public int getCoeficienteBernua() {
       return numCamarotes + getPotencia();
    }
    
     /**
     * Retorna los datos básicos de la clase, nombre del propietario del barco, matrícula del barco,
     * metros de eslora del barco, año de fabricación. la potencia del motor expresada en caballos
     * y el número de camarotes.
     */
    @Override
    public String toString() {
        String datos = super.toString();
        datos += "Yate con " +numCamarotes+ " camarotes.\n";
        return datos;
    }
      
}


