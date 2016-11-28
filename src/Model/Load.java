package Model;
import Controller.Categoria.Categoria;
import Controller.Classe.Aco;
import Controller.Classe.Agua;
import Controller.Classe.Dragao;
import Controller.Classe.Eletrico;
import Controller.Classe.Fada;
import Controller.Classe.Fantasma;
import Controller.Classe.Fogo;
import Controller.Classe.Gelo;
import Controller.Classe.Grama;
import Controller.Classe.Inseto;
import Controller.Classe.Lutador;
import Controller.Classe.Normal;
import Controller.Classe.Piscquico;
import Controller.Classe.Rocha;
import Controller.Classe.Solo;
import Controller.Classe.Sombrio;
import Controller.Classe.Tipo;
import Controller.Classe.Venenoso;
import Controller.Classe.Voador;
import Controller.Pokemon.Pokemon;
import Controller.Pokemon.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
public class Load {
public static ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
public static ArrayList<Tipo> tipos = new ArrayList<>();
public static ArrayList<Categoria> especies = new ArrayList<>() ;
public static String[]  te;
public static String[]  tp;
    public ArrayList<Pokemon> getPoke()
    {
        return this.pokedex;
    }
       public boolean csv()
    {
        String arq = "src/Model/tipos_nome.csv";
        String linha = "";
        String separador = ",";
        int l=0;

        
        try (BufferedReader br = new BufferedReader(new FileReader(arq))) {

            while ((linha = br.readLine()) != null) {

                // use comma as separator
                if(l>=1)
                {
                    String[] pokemonS = linha.split(separador);

                    switch(Integer.parseInt(pokemonS[0]))
                    {
                        case 1:
                            tipos.add(new Normal(pokemonS[1]));
                            break;
                        case 2:
                            tipos.add(new Lutador(pokemonS[1]));
                            break;
                        case 3:
                            tipos.add(new Voador(pokemonS[1]));
                            break;
                        case 4:
                            tipos.add(new Venenoso(pokemonS[1]));
                            break;
                        case 5:
                            tipos.add(new Solo(pokemonS[1]));
                            break;
                        case 6:
                            tipos.add(new Rocha(pokemonS[1]));
                            break;
                        case 7:
                            tipos.add(new Inseto(pokemonS[1]));
                            break;
                        case 8:
                           tipos.add(new Fantasma(pokemonS[1]));
                           break;
                        case 9:
                           tipos.add(new Aco(pokemonS[1]));
                           break;
                        case 10:
                            tipos.add(new Fogo(pokemonS[1]));
                            break;
                        case 11:
                            tipos.add(new Agua(pokemonS[1]));
                            break;
                        case 12:
                            tipos.add(new Grama(pokemonS[1]));
                            break;
                        case 13:
                            tipos.add(new Eletrico(pokemonS[1]));
                            break;
                        case 14:
                            tipos.add(new Piscquico(pokemonS[1]));
                            break;
                        case 15:
                            tipos.add(new Gelo(pokemonS[1]));
                            break;
                        case 16:
                            tipos.add(new Dragao(pokemonS[1]));
                            break;
                        case 17:
                            tipos.add(new Sombrio(pokemonS[1]));
                            break;
                        case 18:
                            tipos.add(new Fada(pokemonS[1]));
                            break;
                        default:
                            tipos.add(new Tipo(pokemonS[1]));
                    }
                }
                l++;
            }
            int t=0;
            tp = new String[tipos.size()];
            for(Tipo tipo : tipos)
            {
                System.out.println(tipo.getTipo());
                tp[t] = tipo.getTipo();
                t++;
                
            
            }
            
        }catch (IOException e) 
        {
            e.printStackTrace();
        }
    
        
        
        
         arq = "src/Model/especies.csv";
         linha = "";
         l=0;
         
        
        try (BufferedReader br = new BufferedReader(new FileReader(arq))) {

            while ((linha = br.readLine()) != null) {

                // use comma as separator
                if(l>=1)
                {
                    String[] pokemonS = linha.split(separador);
                    especies.add(new Categoria(pokemonS[1],Integer.parseInt(pokemonS[0])));
                            
                }
                l++;
            }
             int e=0;
             
            this.te = new String[especies.size()];
            for(Categoria especie : especies)
            {
                int c=0;
               
                for(int i =0;i<te.length;i++)
                {
                    if(te[i] != null)
                    {
                        if (te[i].equals(especie.getCategoria()))
                        {   
                            c++;
                        }
                    }
                }
                if(c==0)
                {
                    te[e] = especie.getCategoria();
                     System.out.println(especie.getCategoria());
                    e++;
                }
            }
            int cont=0;
            for(int i =0;i<te.length;i++)
            {
                if(te[i] != null)
                    cont++;
                  
            }
            String[] aux = new String[cont];
            for(int i =0 ; i < aux.length;i++)
            {
                aux[i]= te[i];
            }
            te = aux;
            
                
                
                
            
            
        }catch (IOException e) 
        {
            e.printStackTrace();
        }
        
        arq = "src/Model/pokemon.csv";
         linha = "";
         l=0;
         
        
        try (BufferedReader br = new BufferedReader(new FileReader(arq))) {

            while ((linha = br.readLine()) != null) {

                // use comma as separator
                if(l>=1)
                {
                    Categoria cat = new Categoria("Desconhecido",000);
                    String[] pokemonS = linha.split(separador);
                    for(Categoria esp : especies)
                    {
                        if(esp.getCat() == Integer.parseInt(pokemonS[2]))
                            cat = esp;
                    }
                    pokedex.add(new Pokemon(Integer.parseInt(pokemonS[0]),pokemonS[1],Float.parseFloat(pokemonS[3]),Float.parseFloat(pokemonS[4]),cat));
                   
                }
                l++;
            }
            int i=1;
        for(Pokemon poke : pokedex)
         {
             String local = "src/Model/Imagens/";
             Icon foto = new ImageIcon(local+i+".png");
             System.out.println(local+i+".png");
             if(poke.getId() == i)
                poke.setFoto(foto);
             i++;
         }
        }catch (IOException e) 
        {
            e.printStackTrace();
        }


        
        
         
         
       for(Pokemon pok : pokedex)
            setTipos(pok);
              
        
        
     return true;
    }
       public void setTipos(Pokemon pok)
       {
            int l=0,cont =0;
            String arq = "src/Model/pokemons_tipos.csv";   
               String linha="";
            String separador = ",";
           try (BufferedReader br = new BufferedReader(new FileReader(arq))) 
           {

                while ((linha = br.readLine()) != null)
                {
                    String[] pokemonS = linha.split(separador);
                    if(l>=1)
                    {
                        if(pok.getId() == Integer.parseInt(pokemonS[0]))
                        {
                            if(cont==1){
                                pok.setTipo2(tipos.get(Integer.parseInt(pokemonS[1])-1));
                                System.out.println("caso1 "+pok);
                            }
                            else
                            {
                                pok.setTipo1(tipos.get(Integer.parseInt(pokemonS[1])-1));
                                cont++;
                                System.out.println("caso2 "+pok);
                            }
                        }
                    }         
                    l++;
                }
           }
           catch (IOException e) 
           {
             e.printStackTrace();
           }
         
         
       }
        
}    
