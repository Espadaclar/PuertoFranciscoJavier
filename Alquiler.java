
/**
 * @Author Luis Javier Curbeira
 *
 * Define un Alquiler para unos dias, un barco y un hueco
 * 
 */

public class Alquiler {
	private int diasOcupacion;
	private Barco barco;
	private int posicionAmarre;
	private static int  MULTIPLICADOR_ESLORA = 10;
	private static int  MULTIPLICADOR_BERNUA = 300;
	
	
	/**
 	* Define un Alquiler para unos dias, un barco y un hueco
 	*/
	public Alquiler(int diasOcupacion, Barco barco, int posicionAmarre) {
		this.diasOcupacion = diasOcupacion;
		this.barco = barco;
		this.posicionAmarre = posicionAmarre;
	}

	/**
 	* Obtiene el precio del alquiler
	* @return precio del alquiler
 	*/
	public float getPrecioAlquiler() {
		float precioAlquiler;
		precioAlquiler = (diasOcupacion * MULTIPLICADOR_ESLORA * (float)barco.getEslora())
						+ (MULTIPLICADOR_BERNUA * barco.getCoeficienteBernua());
		return precioAlquiler;
	}
	
	/**
 	* Obitiene el amarre que ocupa un alquiler
	* @return Posicion del amarre
 	*/
	public int getNumeroAmarre(){
		return posicionAmarre;
	}
	
	public String toString() {
		String valorADevolver = "";
		valorADevolver = barco  + "Dias ocupacion: "+ diasOcupacion + "\n" + "Posicion de amarre " + posicionAmarre + "\n";
		return valorADevolver;
    }
}
