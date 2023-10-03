package vehiculos;
import java.util.ArrayList;

public class Pais{
    private String nombre;
    public int countVend;
    private static ArrayList<Pais>paises = new ArrayList<Pais>();

    public Pais(String nombre){
        this.nombre = nombre;
    }

    public Pais(){
    }

    public static Pais paisMasVendedor(){
        Pais p = null;        
        int best = 0;
        for(Pais pais:paises){
            if(pais.getCountVend()>best){
                best = pais.getCountVend();
                p = pais;
            }
        }
        return p;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getCountVend(){
        return countVend;
    }

    public void setCountVend(int countVend){
        this.countVend = countVend;
    }
}
