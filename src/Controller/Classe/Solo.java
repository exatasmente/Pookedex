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
public class Solo extends Tipo {
    
    public Solo(String tipo) {
        super(tipo);
        this.habitat = "Grama";
    }
    public String getTipo() {
		return tipo;
	}
}
