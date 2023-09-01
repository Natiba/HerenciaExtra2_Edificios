
package Entity;

public class Oficinas extends Edificio {
    
    protected Integer numeroDeOficinas;
    protected Integer cantidadDePersonasPorOficina;
    protected Integer numeroDePisos;

    public Oficinas(Integer numeroDeOficinas, Integer cantidadDePersonasPorOficina, Integer numeroDePisos) {
        this.numeroDeOficinas = numeroDeOficinas;
        this.cantidadDePersonasPorOficina = cantidadDePersonasPorOficina;
        this.numeroDePisos = numeroDePisos;
    }
    
    

    @Override
    public void calcularSuperficie(Integer ancho, Integer largo) {
       System.out.println("La superficie es de: " + (ancho * largo));
    }

    @Override
    public void calcularVolumen(Integer ancho, Integer alto, Integer largo) {
        System.out.println("El volúmen es de: " + (ancho * alto * largo));
    }
    
    
    
}

//• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
//por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
//los atributos del padre.