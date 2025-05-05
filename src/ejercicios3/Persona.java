package ejercicios3;
import java.util.LinkedList;
//Veamos como implementar una relacion de ASOCIACIÓN:
public class Persona {
    public String nombre;
    public String ci;
    public boolean mayorEdad;
    /*Si queremos modelar que; una persona puede tener hasta un auto, agregamos en la clase
     * Persona, un atributo de tipo Auto, tanto en los atributos como en el constructor.*/
    public Auto auto;
    //Si queremos implementar que una persona puede tener varios autos:
    LinkedList<Auto> autos = new LinkedList<>();

    public Persona(String nombre, String ci, boolean mayorEdad, Auto auto) {
        this.nombre = nombre;
        this.ci = ci;
        this.mayorEdad = mayorEdad;
        this.auto = auto;
        this.autos = autos;
    }
    //Lo que hice fue definir una lista de autos como atributo, lo recibimos en el constructor como parámetro y se lo asignamos al atributo.
}
