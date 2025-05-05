package ejercicios;

import java.util.Calendar;
import java.util.Date;

public class Estudiante {
    /*Dentro de la clase Estudiante, definimos sus ATRIBUTOS:*/
    public String codigo;
    public String nombre;
    public int cedulaIdentidad;
    public int anioDeNacimiento;

    /*Luego definimos un CONSTRUCTOR. su nombre debe coincidir con el de la clase. Puede tener parámetros
    * de entrada pero no tiene tipo de retorno(ni void). Debe ser de acceso público*/
    public Estudiante() {
        this.codigo = "";
        this.nombre = "";
        this.cedulaIdentidad = 0;
        this.anioDeNacimiento = 0;
    }
    /*Aquí otro ejemplo de constructor, éste en vez de tener valores predeterminados, permite
    * asignar valores a cada parámetro.
    * Se puede tener mas de un constructor, siempre y cuando los parámetros de entrada sean distintos.*/
    public Estudiante(String codigo, String nombre, int cedulaIdentidad, int anioDeNacimiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cedulaIdentidad = cedulaIdentidad;
        this.anioDeNacimiento = anioDeNacimiento;
    }

    /*Finalmente, debemos crear los MÉTODOS, son los que definen cómo se comporta, en este caso queremos crear
    * una función que calcule la edad de un estudiante: */
    public int calcularEdad(int anioActual){
        return anioActual - anioDeNacimiento;
        /*Aquí lo que hacemos es: dado el año actual pasado por parámetro, restarle el año de nacimiento
        * del estudiante, y eso nos dará la edad.*/
    }
    /*EJEMPLO OVERLOADING - SOBRECARGA DE MÉTODOS*/
    /*Java soporta el overloading de métodos, es decir, puedo tener varios métodos de igual nombre,
    * pero con distintos parámetros.*/

    public int calcularEdad(){
        //Se utiliza calendar para trabajar con fechas
        Calendar cal = Calendar.getInstance();
        //Obtengo el año actual a través de Calendar
        int anioActual = cal.get(Calendar.YEAR);
        return anioActual - this.anioDeNacimiento;
    }

    public int calcularEdad (Date date){
        Calendar cal = Calendar.getInstance();
        //Setea en calendar que la fecha es la pasada por parámetro.
        cal.setTime(date);
        //En anio queda almacenado el año de la fecha pasada por parámetro (date)
        int anio = cal.get(Calendar.YEAR);
        return anio - this.anioDeNacimiento;
    }

    //GETTER
    public String obtenerCodigo(){
        return this.codigo;
        /*Aqui lo que hacemos es un método para OBTENER el valor de un atributo, en este caso el atributo
        * "codigo". Como este metodo es publico podemos llamarlo desde otras clases*/
    }
    //SETTER
    /*Aqui lo que hacemos es un método para ASIGNAR el valor de un atributo en caso de que no podamos hacer
    *referencia al mismo por estar en "private*/
    public void asignarCodigo(String codigo){
        this.codigo = codigo;
    }
}
//Si implementara todos los GETTERS Y SETTERS en la clase Estudiante quedaría así:
/*public String getCodigo(){
return codigo;
}
public void setCodigo(String codigo){
this.codigo = codigo;
}
public String getNombre(){
return nombre;
}
pubic void setNombre(String nombre){
this nombre = nombre;
}
public int getCedulaIdentidad(){
return cedulaIdentidad;
}
public void setCedulaIdentidad(int cedulaIdentidad){
this.cedulaIdentidad = cedulaIdentidad;
}
public int getAnioDeNacimiento(){
return anioDeNacimiento;
}
public void setAnioDeNacimiento(){
this.anioDenacimiento = anioDeNacimiento;
}*/