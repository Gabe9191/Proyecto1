package ejerciciosLab4;

public class Enums {

//	public enum TipoDoc{DNI,CEDULA,LIBRETA;}

	public enum TipoDoc{
		
		DNI("35993898","dni");
		
		private String num,tipo;
		TipoDoc(String num,String tipo) {
			this.num=num;
			this.tipo=tipo;			}
		
		private String get_tipo() {
			return tipo;
		}
		
		
		
	}
	
	
	}

