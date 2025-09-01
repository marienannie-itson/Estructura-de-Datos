package cilindro;

public class Cilindro {
     private double radio;
     private double altura;
     
     public Cilindro(double radio, double altura) {
         this.radio = radio;
         this.altura = altura;
     }
     
     public double area() {
        return (Math.PI * radio * radio * 2) + (Math.PI * 2 * radio * altura);
     }
     
     public double volumen (){
         return Math.PI * radio * radio * altura;
     }
}