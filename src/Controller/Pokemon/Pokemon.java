package Controller.Pokemon;
import java.util.Arrays;
import Controller.Categoria.*;
import Controller.Classe.*;
import javax.swing.Icon;

public  class Pokemon {
	private int id;
	private String nome;
	private float peso;
	private float altura;
	private Tipo tipo1 = new Tipo("Desconhecido");
        private Tipo tipo2= new Tipo("Desconhecido");
	private Categoria categoria;
        private Icon foto;
        private String desc;
	public Pokemon(int id, String nome, float peso, float altura, Tipo tipo2, Tipo tipo1,Categoria categoria,Icon foto,String desc) {
		this.id = id;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.tipo1 = tipo1;
                this.tipo2 = tipo2;
		this.categoria = categoria;
                this.foto = foto;
                this.desc = desc;
	}
	public Pokemon(int id, String nome, float peso, float altura,Categoria categoria) {
		this.id = id;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.categoria = categoria;
                
	}
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public Tipo getTipo1() {
		return tipo1;
	}
	public void setTipo1(Tipo tipo1) {
		this.tipo1 = tipo1;
	}
        public Tipo getTipo2() {
		return tipo2;
	}
	public void setTipo2(Tipo tipo2) {
		this.tipo2 = tipo2;
	}
	public String toString() {
		return "Pokemon [id=" + id + ", nome=" + nome + ", peso=" + peso+ ", altura=" + altura + ", tipo=1"+ tipo1+", tipo=2"+tipo2+" , categoria="+ categoria +",Foto "+foto+"]";
	}
        public Icon getFoto()
        {
            return this.foto;
        }
	public void setFoto(Icon foto)
        {
            this.foto = foto;
        }
        public String getDesc()
        {
            return this.desc;
        }
        public void setDesc(String Desc)
        {
            this.desc = Desc;
        }
	
}

