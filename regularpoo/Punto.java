package regularpoo;

 class Punto {
private double coord_x;
private double coord_y;
private double x;
private double y;
private double area;
private String nombre;
public Punto(){
    //sin parametros
    x=0.0;
    y=0.0;
}

public Punto(double coord_x, double coord_y) {
    this.coord_x = coord_x;
    this.coord_y = coord_y;
}
public double getX() {
    return x;
}

public double getY() {
    return y;
}

public void setX(double coord_x) {
    x = coord_x;
}

public void setY(double coord_y) {
    y = coord_y;
} 

public double calcularDistancia(Punto otroPunto) {
    return calcularDistancia(otroPunto.getX(), otroPunto.getY());
}

public double calcularDistancia(double otroX, double otroY) {
    return Math.sqrt(Math.pow(x - otroX, 2) + Math.pow(y - otroY, 2));
}


@Override
public String toString(){
    return "FiguraGeometrica{" +
    "nombre='" + nombre + '\'' +
    ", area=" + area +
    '}';
}
 }
/*public void setCoordenada_x(int coordenada_x) {
    this.coordenada_x = coordenada_x;
}



public void setCoordenada_y(int coordenada_y) {
    this.coordenada_y = coordenada_y;
}

public int getCoordenada_x() {
    return coordenada_x;
}

public int getCoordenada_y() {
    return coordenada_y;
}

public void getDistancia(){
double distancia;
}
 */

