package regularpoo;

public class triangulo extends figurageo {
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;
            
    public triangulo() {
     // Invoca al constructor sin parámetros
       punto1 = new Punto();
      punto2 = new Punto();
      //estamos declarando arriba, 
        punto3 = new Punto();
        /*  punto2 = new Punto();
        punto3 = new Punto(); */
    }

    public triangulo(Punto p1, Punto p2, Punto p3) {
        super(); // Invoca al constructor sin parámetros de la superclase
        this.punto1 = p1;
        this.punto2 = p2;
        /*con la palabra reservada this , recien puedes cambiar el valor de
         * p1 en todo el objeto,
         */
        this.punto3 = p3;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto1(Punto p1) {
        punto1 = p1;
    }

    public void setPunto2(Punto p2) {
        punto2 = p2;
    }

    public void setPunto3(Punto p3) {
        punto3 = p3;
    }

   
public double calcularArea() {
    double a = punto1.calcularDistancia(punto2);
    double b = punto2.calcularDistancia(punto3);
    double c = punto3.calcularDistancia(punto1);
    
    // Redondear los valores de a, b y c
    a = Math.round(a * 100.0) / 100.0;
    b = Math.round(b * 100.0) / 100.0;
    c = Math.round(c * 100.0) / 100.0;
//usamos esto pq como es regular, debemos poner round para poder calcularlo
//para poder llegar a un true , 
    double s = (a + b + c) / 2.0;
    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
}

    @Override
    public boolean seraRegular() {
        // Implementar la lógica para verificar si el triángulo es regular
        return false;
    }

    @Override
    public String toString() {
        return "Triángulo: " + getNombre() + " tiene 3 Puntos: " +
               getPunto1().toString() + "," + getPunto2().toString() +
               "," + getPunto3().toString();
    }
}
 
/*     int punto3;
    String punto2;
    String punto1;
int x;

@Override
    public double calcularArea() {
        // Implementar el cálculo del área del triángulo
        return 0.0;
    }


public void setPunto1(int punto3) {
    this.punto3 = punto3;
}

public void setPunto2(String punto2) {
    this.punto2 = punto2;
}

public void setPunto3(String punto1) {
    this.punto1 = punto1;
}


public int getPunto3() {
    return punto3;
}

public String getPunto2() {
    return punto2;
}

public String getPunto1() {
    return punto1;
}


    // Método toString() para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Figura con [numero de puntos=" + getPunto3() + "]";
    }









class triangulo extends figurageo {
private Punto punto1;
private Punto punto2;
 private Punto punto3;

  public triangulo(Punto p1, Punto p2, Punto p3) {
    punto1 = p1;
    punto2 = p2;
    punto3 = p3;
  }
  @Override
double calcularArea() {
    //
    return 0;
}

boolean seraRegular(){
    return false;
}

}







*/



