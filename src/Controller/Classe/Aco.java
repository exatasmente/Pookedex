/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Classe;

/**
 *
 * @author lu_u_
 */
public class Aco extends Tipo {
    
    public Aco(String tipo) {
        super(tipo);
        this.habitat = "Caverna";
    }
      @Override
	public String toString() {
		return ""+getTipo() +"";
	}
   public String getTipo() {
		return tipo;
	}
}
