/* 	    Universidad del Valle de Guatemala
 *      Algoritmos y Estructura de Datos
 *      Julio Barahona      141206
 *      Rafael de Leon      13361
 *      DIego Castaneda     15151
 *  Hoja de Trabajo 7. Binary Tree
*/

	/**
     * Clase Association
     */
public class Association<k,v> {

	/**
     * atributos para hacer la asociacion entre ingles y espanol 
     */
	private k ingles;
	private v espanol;
	
	public void setIngles(k string){
		ingles = string;
	}
	
	public void setEspanol(v cadena){	
		espanol = cadena;
	}
	
	public k getIngles(){	
		return ingles;
	}
	
	public v getEspanol(){	
		return espanol;
	}
}
