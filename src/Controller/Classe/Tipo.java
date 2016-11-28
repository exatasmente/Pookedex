package Controller.Classe;

public class Tipo {
	protected String tipo;
        protected String habitat = "Desconhecido";
		
	public Tipo(String tipo) {
			this.tipo = tipo;
	}

        public void setHabitat(String habitat)
        {
            this.habitat = habitat;
        }
        public String getHabitat()
        {
            return this.habitat;
                    
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
