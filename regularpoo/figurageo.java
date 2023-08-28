package regularpoo;

public abstract class figurageo {
    abstract double calcularArea();
    abstract boolean seraRegular();
    //metodos abstractos
String nombre;
double area;

public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getNombre() {
    return nombre;
}

public void setArea(double area) {
    this.area = area;
}
public double getArea() {
    return area;
}
}
