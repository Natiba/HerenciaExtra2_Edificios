
package Entity;

public class Polideportivo extends Edificio {
    
    // Cuando es extension de una clase padre es PROTECTED  
    protected String nombre;
    protected String tipoDeInstalacion;

    public Polideportivo(String nombre, String tipoDeInstalacion) {
        this.nombre = nombre;
        this.tipoDeInstalacion = tipoDeInstalacion;
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

//• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
//Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.