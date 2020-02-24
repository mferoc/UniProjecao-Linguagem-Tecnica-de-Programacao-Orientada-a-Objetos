import java.util.Scanner;

public class ExecB {
    public void parOuImpar(){
        int x;
        Scanner aux = new Scanner(System.in);
        System.out.println("Entre com um valor inteiro: ");
        x = aux.nextInt();
        if (x % 2 == 0){
            System.out.println("O numero " +x+ " é par");
        }
        else{
            System.out.println("O numero " +x+ " é impar");
        }
    }
}
