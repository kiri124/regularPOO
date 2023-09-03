package laboratorioPoo1;

public class Rectangulo extends Cuadrilatero implements Shape {

    public Rectangulo(String name, Punto vert1, Punto vert2, Punto vert3, Punto vert4) {
        super(name, vert1, vert2, vert3, vert4);
        
        // Verificar si el rectángulo es regular, de lo contrario, mostrar un mensaje
        if (!checkRectangulo(vert1, vert2, vert3, vert4)) {
            System.out.println("Advertencia: El rectángulo no es regular.");
        }
    }

    private boolean checkRectangulo(Punto v1, Punto v2, Punto v3, Punto v4) {
        Punto auxVert = v1.calcularPuntoMasCercano(new Punto[] { v2, v3, v4 });
        
        if (auxVert.equals(v2)) {
            return v1.getDistancia(v3) == v2.getDistancia(v4)
                && v1.getDistancia(v4) == v2.getDistancia(v3)
                && escalarProducto(v1, auxVert, v1.calcularPuntoMasCercano(new Punto[] { v3, v4 }));
        } else if (auxVert.equals(v3)) {
            return v1.getDistancia(v2) == v3.getDistancia(v4)
                && v1.getDistancia(v4) == v3.getDistancia(v2)
                && escalarProducto(v1, auxVert, v1.calcularPuntoMasCercano(new Punto[] { v2, v4 }));
        } else if (auxVert.equals(v4)) {
            return v1.getDistancia(v2) == v4.getDistancia(v3)
                && v1.getDistancia(v3) == v4.getDistancia(v2)
                && escalarProducto(v1, auxVert, v1.calcularPuntoMasCercano(new Punto[] { v2, v3 }));
        } else {
            return false;
        }
    }

    private boolean escalarProducto(Punto p1, Punto p2, Punto p3) {
        return (p3.getCoordenadaY() - p1.getCoordenadaY()) * (p2.getCoordenadaY() - p1.getCoordenadaY())
             + (p3.getCoordenadaX() - p1.getCoordenadaX()) * (p2.getCoordenadaX() - p1.getCoordenadaX()) == 0;
    }




    @Override
    public double obtenerPerimetro() {
        // Calcular el perímetro sumando las longitudes de los lados
        double perimetro = getVertice1().getDistancia(getVertice2())
                + getVertice2().getDistancia(getVertice3())
                + getVertice3().getDistancia(getVertice4())
                + getVertice4().getDistancia(getVertice1());

        return perimetro;
    }


    
   /*  @Override
double obtenerPerimetro(){
    double perimetro=
    return perimetro;
}*/


}

/* public abstract class rectangulo extends Cuadrilatero {
    private String nombre;
private Punto vertice1;
private Punto vertice2;
private Punto vertice3;
private Punto vertice4;

void rectangulo(String nombre, Punto vertice1, Punto vertice2, Punto vertice3, Punto vertice4){
    this.vertice1=vertice1;
this.vertice2=vertice2;
this.vertice3=vertice3;
this.vertice4=vertice4;
this.nombre=nombre;

}






*/



/*   // Verificar si el rectángulo es regular, de lo contrario, mostrar un mensaje
        if (!esRegular()) {
            System.out.println("Advertencia: El rectángulo no es regular.");
        }
    }

    @Override
    public boolean esRegular() {
        // Verificar si las longitudes de los lados opuestos son iguales
        double lado1 = getVertice1().calcularDistancia(getVertice2());
        double lado2 = getVertice2().calcularDistancia(getVertice3());
        double lado3 = getVertice3().calcularDistancia(getVertice4());
        double lado4 = getVertice4().calcularDistancia(getVertice1());

        return (lado1 == lado3) && (lado2 == lado4);
    }

    @Override
    public double calcularArea() {
        // Calcular la base y la altura del rectángulo
        double base = getVertice1().calcularDistancia(getVertice2());
        double altura = getVertice2().calcularDistancia(getVertice3());

        // Calcular el área del rectángulo
        return base * altura;
    }

    @Override
    public String toString() {
        return "Rectángulo: " + getNombre() + " con vértices en " +
               getVertice1().toString() + ", " + getVertice2().toString() +
               ", " + getVertice3().toString() + ", " + getVertice4().toString();
    }
     */


     /* private boolean checkRectangulo( Punto vert1, Punto vert2, Punto vert3, Punto vert4){
    Punto auxVert= v1.calcularPuntoMasCercano{v2,v3,v4}(new Punto[]{v2,v3,v4});
    if(auxVert.equals(v2)){
        return v1.getDistancia(v3)== v2.getDistancia(v4)
        && v1.getDistancia(v4)== v2.getDistancia(v3)
        && escalarProducto(v1, auxVert, v1.calcularPuntoMasCercano(new Punto[]{v3,v4}));
    } else if (auxVert.equals(v3)){
        return v1.getDistancia(v2)== v3.getDistancia(v4)
        && v1.getDistancia(v4)== v3.getDistancia(v2)
        && escalarProducto(v1, auxVert, v1.calcularPuntoMasCercano(new Punto[]v2,v4));
      }  else if (auxVert.equals(v4)){
        return v1.getDistancia(v2)== v4.getDistancia(v3)
        && v1.getDistancia(v3)== v4.getDistancia(v2)
        && escalarProducto(v1, auxVert, v1.calcularPuntoMasCercano(new Punto[]v2,v3));
      } else {
        return false;
      
    }
    }
    private boolean escalarProducto(Punto p1, Punto p2, Punto p3){
        return (p3.getCoordenaY()-p1.getCoordenaY())*(p2.getCoordenaY()-p1.getCoordenaY())+(p3.getCoordenaX()-p1.getCoordenaX())*(p2.getCoordenaX()-p1.getCoordenaX())== 0;
    }

} */