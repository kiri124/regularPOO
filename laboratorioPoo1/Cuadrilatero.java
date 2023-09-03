package laboratorioPoo1;

abstract class Cuadrilatero extends FiguraGeometrica{
    

private Punto vertice1;
private Punto vertice2;
private Punto vertice3;
private Punto vertice4;

void Cuadrilatero(String nombre, Punto vertice1, Punto vertice2, Punto vertice3, Punto vertice4 ){
//super();
      
this.vertice1=vertice1;
this.vertice2=vertice2;
this.vertice3=vertice3;
this.vertice4=vertice4;
this.nombre=nombre;

}// constructor
    // Método esRegular() abstracto que debe ser implementado en las subclases

public abstract boolean esRegular();
/* { return asdasdasds , todo esto con los parentesis 
es un bodyyyyy } */

@Override
public String toString(){
return "Cuadrilatero: "+ getNombre() + "tiene vertices en " + vertice1.toString() + vertice2.toString() + vertice3.toString() + vertice4.toString();
}
}
