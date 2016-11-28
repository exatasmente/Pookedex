package Controller.Classe;

public class Grama extends Tipo {

	public Grama(String tipo) {
		super(tipo);
		this.habitat = "Grama";
	}
        @Override
	public String toString() {
		return ""+getTipo() +"";
	}
public String getTipo() {
		return tipo;
	}
}
