
/**
 * @Author Luis Javier Curbeira
 *
 * Define un Puerto con una cantidad de amarres y las 
 * posibles interacciones con dichos amarres
 */

public class Puerto {

    private Alquiler [] amarres;
    // Numero de posiciones libres para los barcos
    private static final int CANTIDAD_AMARRES = 4;
    
    /**
     * Se crea un puerto un una cantidad de amarres
     */
    public Puerto() {
        amarres = new Alquiler[CANTIDAD_AMARRES];
    }

    /**
     * Ocupa un amarre para un barco y una cantidad de dias.
     * @param diasOcupacion Dias de duracion del alquiler
     * @param barco Barco que ocupa el amarre
     * @return Precio del alquiler o -1 si no quedan amarres disponibles
     */
    public float alquilarAmarre(int diasOcupacion, Barco barco) {
        float precioAlquiler = -1;
        if (hayAmarresLibres()) {
            int posicionLibre = posicionPrimerAmarreLibre();
            Alquiler nuevoAlquiler = new Alquiler(diasOcupacion, barco, posicionLibre);
            amarres[posicionLibre] = nuevoAlquiler;
            precioAlquiler = nuevoAlquiler.getPrecioAlquiler();
        }
        return precioAlquiler;
    }

    /**
     * Finaliza un alquiler liberando el amarre que se le pase por parametro
     * @param posicionAmarre Amarre a liberar
     * @return Precio del alquiler o -1 si no se liberera el amarre
     */
    public float liquidarAlquilerAmarre(int posicionAmarre) {
        float precioAlquiler = -1;
        if (!(posicionAmarre < 0 || posicionAmarre >= amarres.length) && amarres[posicionAmarre] != null) {
            precioAlquiler = amarres[posicionAmarre].getPrecioAlquiler();
            amarres[posicionAmarre] = null;
        } 
        return precioAlquiler;
    }

    /**
     * Muestra la informacion del estado de los amarres
     * @return Retorna si el amarre esta ocupado o no, en el primer caso toda la informacion asociada
     */
    public void verEstadoAmarres() 
    {
        for(int index = 0; index < amarres.length; index++){
            if(amarres[index] == null){
                System.out.println("El amarre " + index + " está libre en este momento.");            
            }
            else{
                System.out.println("El amarre " + index + " no está libre en este momento.");
                System.out.println(amarres[index].toString());
            }
        }
    }
    
     /**
     * Obtiene la posicion de un amarre disponible para su alquiler
     * @return Retorna la posicion libre o -1 si no hay.
     */
    private int posicionPrimerAmarreLibre() {
        int primeraPoisicionLibre = -1;
        boolean buscando = true;
        int posicionAmarre = 0 ;
        while(posicionAmarre < amarres.length  && buscando){
            if (amarres[posicionAmarre] == null) {
                primeraPoisicionLibre = posicionAmarre;
                buscando = false;
            }
            posicionAmarre++;
        }
        return primeraPoisicionLibre;
    }

      /**
     * Determina si existe algun amarre libre
     * @return True si hay posiciones libres, False en caso contraio
     */
    private boolean hayAmarresLibres() {
        boolean hayAmarresLibres = false;
        int posicionAmarre = 0 ;
        while(posicionAmarre < amarres.length  && !hayAmarresLibres){
            if (amarres[posicionAmarre] == null) {
                hayAmarresLibres = true;
            }
            posicionAmarre++;
        }
        return hayAmarresLibres;
    }

}
