import entidades.*;

import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);

        System.out.println("Elegir el código de la figura cuyo área desea calcular: ");
        System.out.println("1. Círculo\n2. Rectángulo \n3. Cuadrado\n4.Triángulo");
        int opcion = lectura.nextInt();
        FiguraGeometrica figura = null;
        switch(opcion){
            case 1:
                System.out.println("Ingrese el radio del círculo: ");
                figura = new Circulo(lectura.nextDouble());
                break;
            case 2:
                System.out.println("Ingrese la base y la altura del rectángulo: ");
                figura= new Rectangulo(lectura.nextDouble(), lectura.nextDouble());
                break;
            case 3:
                System.out.println("Ingrese el valor de los lados del cuadrado: ");
                figura = new Cuadrado(lectura.nextDouble());
                break;
            case 4:
                System.out.println("Ingrese la base y altura del triángulo: ");
                figura = new Triangulo(lectura.nextDouble(), lectura.nextDouble());
                break;
            default:
                System.out.println("Elección no valida");
        }
        if(figura !=null){
            double area = figura.calcularArea();
            System.out.print("Área de la figura seleccionada: "+ area);
        }
    }
}