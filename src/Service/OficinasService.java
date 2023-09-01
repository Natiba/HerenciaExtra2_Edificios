
package Service;

import Entity.Oficinas;

public class OficinasService extends Oficinas {

    public OficinasService(Integer numeroDeOficinas, Integer cantidadDePersonasPorOficina, Integer numeroDePisos) {
        super(numeroDeOficinas, cantidadDePersonasPorOficina, numeroDePisos);
    }
    
    
    
    public void cantPersonas() {
   
        System.out.println("En un piso entrarían " + cantidadDePersonasPorOficina + " personas");
        
        int totalDePersonas = cantidadDePersonasPorOficina * numeroDeOficinas;
        System.out.println("Entran " + totalDePersonas + " personas en el Edificio");
        
    }
    
}

//De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
//usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
//(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
//cuantas personas entrarían en un piso y cuantas en todo el edificio.

//    protected Integer numeroDeOficinas;
//    protected Integer cantidadDePersonasPorOficina;
//    protected Integer numeroDePisos;