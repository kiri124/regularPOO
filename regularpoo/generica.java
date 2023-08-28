package regularpoo;



public class generica {
        public static void main(String[] args) {
        Punto p1 = new Punto(2, 3);
        Punto p2 = new Punto(3, 3);
        Punto p3 = new Punto(4, 6);
        
        triangulo tri = new triangulo(p1, p2, p3);
        
        double areaTriangulo =  tri.calcularArea();
           boolean booleana =  tri.seraRegular();
           
        System.out.println("\nÁrea del triángulo: " + areaTriangulo);
        
        System.out.println("es regular ? : " + booleana );
        System.out.println(tri.calcularArea());
      
        Punto pt = new Punto(8, 10);

        double distance= pt.calcularDistancia(20, 3);
       
        System.out.println("dsadsa"+distance);

         System.out.println("dsadsa"+distance);
      //  System.out.println(triangulo.class);
//System.out.println("fffffffff"+);
        
}
}
    //import javax.swing.JOptionPane;

/* public void leerNumero(){
 area =Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor"));
}




  public static void main(String[] args) {
        triangulo tri= new triangulo();
        tri.punto3=1;
    //tri es el objeto
       System.out.println("determinar si es un figura geomtrica regular o no.");
   
    }
    
*/

