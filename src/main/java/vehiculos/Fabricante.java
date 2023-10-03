package vehiculos;
import java.util.ArrayList;

public class Fabricante{
    private String nombre;
    private Pais pais;
    public int countFab;
    private static ArrayList<Fabricante>fab = new ArrayList<Fabricante>();
    
    public Fabricante(String nombre,Pais pais){
        this.nombre = nombre;
        this.pais = pais;
    }

    public Fabricante(){
    }

    public static Fabricante fabricaMayorVentas(){
        Fabricante fabrica = null;
        int best = 0;
        for(Fabricante fabri:fab){
            if(fabri.countFab>best){
                best = fabri.countFab;
                fabrica = fabri;
            }
        }
        return fabrica;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public Pais getPais(){
        return this.pais;
    }

    public void setPais(Pais pais){
        this.pais = pais;
    }   
}