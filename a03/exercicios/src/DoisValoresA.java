import java.util.Scanner;

public class DoisValoresA{
    public void valores(){
        int x, y;
        Scanner aux = new Scanner (System.in);
        System.out.println("Digite dois numeros inteiros e distintos:");
        x = aux.nextInt();
        y = aux.nextInt();
        if (x > y){
            System.out.println(x+ " maior que " +y);
        }
        else {
            System.out.println(y+ " maior que " +x);
        }
    }
}
