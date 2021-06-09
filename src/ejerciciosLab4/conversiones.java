package ejerciciosLab4;
import java.util.Date;
import java.util.GregorianCalendar;

public class conversiones {
	
	

	public static Date ConvertirStringEnDate(String fecha) {
		String dia=fecha.substring(0,2);
		String mes=fecha.substring(3,5);
		String anio=fecha.substring(6,fecha.length());
		
		int day =Integer.valueOf(dia);
		int month=Integer.valueOf(mes);
		int year=Integer.valueOf(anio);
		
		GregorianCalendar calendario=new GregorianCalendar();
		
		calendario.set(year, month-1, day);
		Date FechaRetorno=calendario.getTime();
		return FechaRetorno;
	}
}
