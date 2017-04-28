
/**
 * Clase para definir los datos básicos de un barco con motor.
 * @autor franciscoJavier
 */
class EmbarcacionAMotor extends Barco{
    private int potencia;

    /**
     * constructor con parámetros para inicializar los atributos.
     */
    public EmbarcacionAMotor(String matricula,double eslora, int anio, Persona persona, int potencia) {
        super( matricula, eslora, anio, persona);
        this.potencia = potencia;
    }

    /**
     * Potecia del motor de un barco.
     * @return potencia; número de caballos del motor.
     */
    public int getPotencia() {
        return potencia;
    }
    
    /**
     * Devuelve un valor imprescindible para el cálculo total del alquiler de un tipo de barco.
     * @return potencia; el nº de caballos para operar en el precio del alquiler.
     */
    @Override
    public int getCoeficienteBernua() {
       return  potencia;
    }
    
    /**
     * Retorna los datos básicos de la clase, nombre del propietario del barco, matrícula del barco,
     * metros de eslora del barco, año de fabricación y la potencia del motor expresada en caballos.
     */
    @Override
    public String toString() {
        String datos = super.toString();
        datos += "Embarcación a motor con " +potencia+ " caballos.\n";
        return datos;
    }
    
}




// 
// /**
//  * franciscoJavier
//  */
// class EmbarcacionAMotor extends Barco{
// 
//     private int potencia;
// 
//     public EmbarcacionAMotor(String matricula,double eslora, int anio, Persona persona, int potencia) {
//         super( matricula, eslora, anio, persona);
//         this.potencia = potencia;
//     }
// 
//     public int getPotencia() {
//         return potencia;
//     }
//     
//     @Override
//     public int getCoeficienteBernua() {
//        return  potencia;
//     }
//     
//     @Override
//     public String toString() {
//         String datos = super.toString();
//         datos += "Embarcación a motor con " +potencia+ " caballos.\n";
//         return datos;
//     }
//     
// }
