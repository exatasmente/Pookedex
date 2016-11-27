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
public class Agua extends Tipo{
    
    public Agua(String tipo) {
        super(tipo);
    }
      @Override
	public String toString() {
		return ""+getTipo() +"";
	}
}
