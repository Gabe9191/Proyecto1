package ejerciciosLab2;

public class Documento {
	
	String TipoDni;
	int Ndni;
	
	
	public Documento() {
		
	}
	
	public Documento(String TipoDni,int Ndni) {
		this.TipoDni=TipoDni;
		this.Ndni=Ndni;
	}

	public String getTipoDni() {
		return TipoDni;
	}

	public void setTipoDni(String tipoDni) {
		TipoDni = tipoDni;
	}

	public int getNdni() {
		return Ndni;
	}

	public void setNdni(int ndni) {
		Ndni = ndni;
	}

	@Override
	public String toString() {
		return "Documento TipoDni=" + TipoDni + ", Ndni=" + Ndni;
	}

	
	
	

}
