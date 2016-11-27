package Controller.Categoria;

public class Categoria {
	private String categoria;
        private int idcat;
	
	
	public String toString() {
		return "Categoria [categoria=" + categoria + "]";
	}

	public Categoria(String categoria,int cat) {
		this.categoria = categoria;
                this.idcat = cat;
	}
        public int getCat()
        {
            return this.idcat;
        }

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	} 
}
