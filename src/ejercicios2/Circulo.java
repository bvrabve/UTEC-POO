package ejercicios2;
//Creo una clase círculo en donde voy a encapsular el comportamiento de los círculos
public class Circulo {

    //Como atributos va a tener el radio
    private double radio;

    //Como métodos va a tener el cálculo del perímetro y área.
  /*  private double getPerimetro(){
        return 2 * radio * 3,1415;
    }
    public double getArea(){
        return (radio*radio) * 3,1415;
    }
    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }
    /*En este caso, el valor del radio depende del objeto, podemos tener círculos de diferentes radios (ES UNA VARIABLE DE INSTANCIA)
    * Pero el valor de pi (3,1415) será siempre el mismo, es común a todos los objetos(ES UNA VARIABLE DE CLASE)*/

    //LO CORRECTO EN ESTE CASO SERIA DEFINIR EL ATRIBUTO DE CLASE PI:

    private static double pi = 3.1415;

    public double getPerimetro(){
        return 2 * radio * pi;
    }
    public double getArea(){
        return (radio+radio) * pi;
    }
    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }

    //En este caso el valor de pi NO puede cambiar, ya que es una constante matemática. Por eso la declaramos como STATIC.
    //STATIC indica que es una constante cuyo valor no puede ser cambiado

}
