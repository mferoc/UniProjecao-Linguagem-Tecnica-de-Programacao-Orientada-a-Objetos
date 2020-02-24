import java.util.Scanner;

public class ExecE {
    public void tipoTriangulo(){
        float a, b, c;
        Scanner aux = new Scanner(System.in);
        System.out.println("Digite as medidas dos lados a,b e c de um triangulo: ");
        a = aux.nextFloat();
        b = aux.nextFloat();
        c = aux.nextFloat();
        if(a < b + c && b < a + c && c < a + b){
            System.out.println("TRIANGULO!!!!!!!");
            if(a == b && a == c && b == c){
                System.out.println("   EQUILATERO!!!!!");
            }
            else if(a != b && a != c && b != c){
                System.out.println(" ESCALENO!!!!!!!!!!");
            }
            else{
                System.out.println(" ISOSCELES!!!!!");
            }
            
        }
        else{
            System.out.println("NÃO É UM TRIANGULO");
        }
    }
}
    

