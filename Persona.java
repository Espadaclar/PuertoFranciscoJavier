
/**
 * Clase para definir datos básicos de una persona.
 * franciscoJavier
 */
class Persona {
    private String name;
    private String id;

    /**
     * constructor con parámetros para inicializar los atributos.
     * @param name; nombre del propietario.
     * @param id; id del propietario.
     */
    public Persona(String name, String id) {
        this.name = name;
        this.id = id;
    }

    /**
     * Devuelve el nombre de una persona.
     * @retun name; nombre del propietario de un barco.
     */
    public String getName() {
        return name;
    }

    /**
     * Devuelve el id de una persona.
     * @retun id; id del propietario de un barco.
     */
    public String getId() {
        return id;
    }

    /**
     * retorna los datos básicos de una persona; su nombre y su dni.
     */
    @Override
    public String toString() {
        String datos = "";
        datos += name +"\n";
        datos += id +"\n";
       return datos;
    }
    
}