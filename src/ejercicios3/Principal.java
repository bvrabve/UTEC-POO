package ejercicios3;
import java.util.LinkedList;
//EJEMPLO DONDE RELACIONAMOS UN AUTO Y UNA PERSONA:
public class Principal {
    public static void main(String[] args) {

        //Creamos una instancia de un auto:
        Auto auto1 = new Auto("Chevrolet", "Aveo G3", "AAA1158", 2014);

        //Ahora creamos instancia de persona que se relaciona con el auto1
        Persona persona1 = new Persona("Guillermo", "11589964", true, auto1);

        //Obtenemos el auto relacionado con la persona
        Auto autoDePersona1 = persona1.auto;

        //EJEMPLO DONDE TENEMOS UNA PERSONA QUE NO TIENE AUTO RELACIONADO:
        Persona persona2 = new Persona("Martín", "48752396", false, null);
        Auto autoPersona2 = persona2.auto;

        //¿Que valor tiene autoPersona2?

        if (autoPersona2 == null){
            System.out.println("Persona2 no tiene auto!");
        }else {
            System.out.println("Persona2 tiene auto" + autoPersona2);
        }

        //Para instanciar a una Persona y asignarle una lista de autos hago lo siguiente:
        Auto auto2 = new Auto("Chevrolet", "Aveo G3","AAA8168", 2014);
        Auto auto3 = new Auto("Chevrolet", "JOY Plus","SSA2258", 2021);
        Auto auto4 = new Auto("Chevrolet", "JOY","SSA2299", 2021);

        LinkedList<Auto> autosDeGuille = new LinkedList<>();
        autosDeGuille.add(auto2);
        autosDeGuille.add(auto3);
        autosDeGuille.add(auto4);

        //Ahora creamos la instancia de persona y le pasamos la lista de autos
        Persona persona3 = new Persona("Guillermo", "12354896",true, autosDeGuille);
        System.out.println(persona3);
    }
}
