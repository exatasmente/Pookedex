package Controller.Classe;

public class Tipo {
	protected String tipo;

		
	public Tipo(String tipo) {
			this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String toString() {
		return "Tipo [tipo=" + tipo + "]";
	}
}
