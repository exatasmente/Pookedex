/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Controller.Pokemon.Pokemon;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.Icon;
import view.*;
import ttait.blogsbot.com.*;
/**
 *
 * @author lu_u_
 */
public class LoadImages {
    
    public Icon[] loadImg(ArrayList<Pokemon> pokes)
    {
     Icon[] retorno= new Icon[pokes.size()];   
        Pokemon poke;
        int t = pokes.size();
        for(int i =0;i<t;i++)
        {
            poke = pokes.get(i);
            retorno[i]= poke.getFoto();
        }
        return retorno;
                
    }
}
