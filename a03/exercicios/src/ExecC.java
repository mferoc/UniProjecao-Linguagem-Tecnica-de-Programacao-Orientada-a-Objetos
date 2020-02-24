import java.util.Scanner;

public class ExecC {
    public void media(){
        float nota1, nota2, nota3, nota4, media;
        Scanner aux = new Scanner(System.in);
        System.out.println("Por favor, digite as 4 notas de um aluno: ");
        nota1 = aux.nextFloat();
        nota2 = aux.nextFloat();
        nota3 = aux.nextFloat();
        nota4 = aux.nextFloat();
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        if (media >= 6){
            System.out.println("APROVADO!!!");
        }
        else{
            float recuperacao, pfinal;
            Scanner aux1 = new Scanner(System.in);
            System.out.println("Por favor, digite a nota da prova final: ");
            pfinal = aux.nextFloat();
            recuperacao = (media + pfinal) / 2;
            if(recuperacao >= 6){
                System.out.println("APROVADO!!!!!!!!");
            }
            else{
                System.out.println("REPROVADO!!!!!");
            }
        }
    }
}
