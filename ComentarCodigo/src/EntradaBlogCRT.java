/**
	 * Clase para manejar las entradas de un blog.
	 * 
	 * La clase se cre� el 01/01/2020 por Celia Ruiz Tom�s
	 * Esta es la versi�n 2.3
	 */
public class EntradaBlogCRT {
	
		/**
		 * separador es el car�cter que separa ENTRADA DE el
		 * nombre del autor
		 */
		public static char separador=':';
		private int id;
		private String texto;
		private String autor;
		
		public EntradaBlogCRT (int i, String string, String string2) {
			/**
			 * Ap�ndice de constructor generado autom�ticamente
			 */
		
		}
		/**
		 * Constructor de la clase recibe el n�mero de entrada, el nombre del autor de
		 * la entrada y el texto que contiene la entrada. Si el n�mero de entrada es
		 * negativo, lanza una excepci�n.
		 * 
		 * @param id numero de entrada
		 * @param autor nombre del autor
		 * @param texto texto que contiene la entrada
		 * @throws IllegalArgumentException si la entrada es negativa lanza una excepci�n.
		 */
	    public void EntradaBlogCRT (int id,String autor,String texto)throws IllegalArgumentException{
			if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
			this.id=id;
			this.autor=autor;
			this.texto=texto;
		}
		@Override
		public String toString(){
			String cad="";
			cad+="\nENTRADA DE"+separador+autor;
			cad+="\n "+texto;
			return cad;
		}
		
		/**
		 * 
		 * @return Devuelve el n�mero de la entrada
		 */
		public int getId(){
			return this.id;
		}
		
		/**
		 * 
		 * @return Devuelve el texto completo de la entrada
		 */
		public String getTexto(){
			return this.texto;
		}
		
		/**
		 * 
		 * @return Devuelve el nombre del autor de la entrada en may�sculas
		 */
		public String getAutor(){
			return this.autor.toUpperCase();
		}
		
		/**
		 * 
		 * @return Devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
		 */
		public String devuelveAutor(){
			return this.autor;
		}
		
		/**
		 * 
		 * @param args No tiene porqu� tener argumentos.
		 */
		public static void main(String[] args) {
			EntradaBlogCRT e1= new EntradaBlogCRT (-3,"ana","�ltimas noticias, est� disponible BixBy 2.0");
			System.out.println(e1);
		}
	}

