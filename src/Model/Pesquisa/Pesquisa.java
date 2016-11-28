/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Pesquisa;

import Controller.Pokemon.Pokemon;
import java.util.ArrayList;
import static Model.Load.pokedex;
/**
 *
 * @author lu_u_
 */
public class Pesquisa {
    public static ArrayList<Pokemon> re = new ArrayList<Pokemon>();
    public String[] pesquisaNome(String nome)
    {
        re.clear();
        pokedex.stream().filter((pokemon) -> (pokemon.getNome().contains(nome))).forEachOrdered((pokemon) -> {
            re.add(pokemon);
        });
        String[] ret = new String[re.size()];
        for(int i = 0 ; i < re.size() ; i++)
        {
            ret[i] = re.get(i).getNome();
        }
        return ret;
    }
    public String[] pesquisaClasse(String tipo1,String tipo2)
    {
        re.clear();
        pokedex.stream().filter((pokemon) -> (pokemon.getTipo2().getTipo().equals(tipo2) || pokemon.getTipo1().getTipo().equals(tipo1) )).forEachOrdered((pokemon) -> {
         
            re.add(pokemon);
        });
        String[] ret = new String[re.size()];
        for(int i = 0 ; i < re.size() ; i++)
        {
            ret[i] = re.get(i).getNome();
               System.out.println(ret[i]);
        }
        return ret;
    }
    public String[] pesquisaEspecie(String especie)
    {
        re.clear();
        pokedex.stream().filter((pokemon) -> (pokemon.getCategoria().getCategoria().equals(especie))).forEachOrdered((pokemon) -> {
            re.add(pokemon);
        });
        String[] ret = new String[re.size()];
        for(int i = 0 ; i < re.size() ; i++)
        {
            ret[i] = re.get(i).getNome();
        }
        return ret;
    }
}
