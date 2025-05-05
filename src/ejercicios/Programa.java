package ejercicios;
/*Para utilizar una clase en un método main de un programa, primero hay que agregar una referencia
*en el método main de la misma. Se realiza luego del package y antes de la declaracion de la clase
*         Aunque en este caso no sería necesario porque ambas clases están dentro del mismo paquete.
* Se realiza de la siguiente manera: */

import ejercicios.Estudiante;

public class Programa {
    public static void main(String[] args) {
        /*Veamos como instanciar la clase Estudiante dentro del método main: */

        Estudiante e1 = new Estudiante();
        String nombreE1 = e1.nombre;
        /*Aqui creamos una variable de tipo Estudiante, y asignamos el valor de uno de sus atributos
        * en una variable*/

        Estudiante e2 = new Estudiante("ES1", "Nico", 215463456, 1996);
        String nombreE2 = e2.nombre;
        int cedulaIdentidad = e2.cedulaIdentidad;
        /*Aqui hicimos lo mismo, solo que utilizamos el constructor con parámetros para darle un
        * valor deseado a cada uno de los atributos.*/

        /*En la variable nombreE1, se va a almacenar un string vacío (""), ya que utilizamos un contructor por defecto.
        * En la variale nombreE2, se va a almacenar "Nico", porque fué el valor que asignamos con el constructor con parámetros*/


        /*Entonces, lo que estamos haciendo es crear dos INSTANCIAS de "Estudiante" distintas, que, si bien se comportan
        * iguales, los valores que almacenan son independientes de cada una.*/

        //Ahora usaremos el MÉTODO que creamos:
        int edad = e2.calcularEdad(2025);
        System.out.println("La edad del estudiante 2 es: " + edad);

        //GETTER Y SETTER:

        /*Una buena práctica es en la parte de ATRIBUTOS de mi clase que posteriormente voy a instanciar,
        * poner los atributos como "private" y no como "public". Por temas de seguridad.*/
        /*Acá entran GET y SET: Permiten asignar valores y obtener valores de un atributo, aunque sean privados.*/

        //Creo una instanciacion u objeto del tipo Estudiante:
        Estudiante e3 = new Estudiante("COO1", "Jorge", 12542259, 1999);

        //Almacenamos el código en una variable de tipo String (mismo tipo que el método obtenerCodigo().
        String codigo = e3.obtenerCodigo();

        //Imprimimos por consola:
        System.out.println("El estudiante tiene el codigo: " + codigo);

        //Y usando SETTER cambiamos el valor del atributo codigo asi:
        e3.asignarCodigo("NUEVO CODIGO");

        //Ahora vuelvo a llamar al GETTER, para obtener el nuevo valor de codigo, porque no se actualiza solo, no alcanza con asignarle un valor para que aparezca en consola posteriormente.
        codigo = e3.obtenerCodigo();

        System.out.println("El estudiante 3 tiene el codigo: " + codigo);



    }

}
