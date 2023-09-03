package laboratorioPoo1;

public class Circulo extends FiguraGeometrica implements Shape {

private double radio;
private Punto centro;

void Circulo(String name, double radio, Punto centro){
// Llamada al constructor de la superclase FiguraGeometrica con el nombre
//super();
    this.centro = centro;
    this.radio = radio;
}

public void setCentro(Punto centro) {
    this.centro = centro;
}
public void setRadio(double radio) {
    this.radio = radio;
}

public Punto getCentro() {
    return centro;
}
public double getRadio() {
    return radio;
}
//todo es public en overrideeeeee
@Override
public double calcularaArea(){
return Math.PI*radio*radio;
}

@Override
public boolean esRegular(){
    return true;
}

@override
public String toString(){
    return "Círculo: " + getNombre() + ", Centro: " + centro.toString() + ", Radio: " + radio;
}

@Override
public double obtenerPerimetro(){
    double perimetroCirculo= radio*2*Math.PI;
    return perimetroCirculo;
}

}

