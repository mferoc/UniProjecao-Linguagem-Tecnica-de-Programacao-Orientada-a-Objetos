import java.util.Scanner;

public class ExecD {
    public void formarTriangulo(){
        float a, b, c;
        Scanner aux = new Scanner(System.in);
        System.out.println("Digite as medidas dos lados a,b e c de um triangulo: ");
        a = aux.nextFloat();
        b = aux.nextFloat();
        c = aux.nextFloat();
        if(a < b + c && b < a + c && c < a + b){
            System.out.println("TRIANGULO!!!!!!!");
        }
        else{
            System.out.println("NÃO É UM TRIANGULO");
        }
    }
}

/////////A < B + C
/////////B < A + C//////////CONDIÇÃO PARA A EXISTÊNCIA DE UM TRIÂNGULO
/////////C < A + B