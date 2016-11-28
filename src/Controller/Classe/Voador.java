package Controller.Classe;

public class Voador extends Tipo {

	public Voador(String tipo) {
		super(tipo);

	}

	public String toString() {
		return ""+getTipo() +"";
	}
public String getTipo() {
		return tipo;
	}

}
