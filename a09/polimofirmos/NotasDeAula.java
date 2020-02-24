                                       Polimorfismos
=>Se existe mais de uma forma de se chamar um mesmo metodo, tem-se um polimorfismo

*-Ad hoc por sobrecarga-*
  => Metódos iguais mas com parametros diferentes (igual a Sobrecarga de metódo)
  public class NewClass {
    int numMatricula;
    int CPF;
    
    public void aluno(int nMatr) {
    numMatricula = nMatr;
    }
    
    public void aluno(int nMatr, int CPF){
      numMatricula = nMatr;
      this.CPF = CPF;
    }
  }
  
*-Ad hoc por coerção-*
  => Alterar o tipo de dado de uma varivavel por cashing, ou seja, alterar o tipo da 
     variavel numa instrução a força (tem isso (coersao) no livro Java para Iniciantes 
     Cap1) ou seja por coerção
     package projetojava;
     public class NewClass {
      public static void main(String args[ ]){
        ExemploCoercao obj = new ExemploCoercao();
        float x=5.0f;
        double y=2;
        int z = (int)y;
        int w = (int)x;
        System.out.println("w = "+w);
        System.out.println("z = "+z);
        obj.divideValores(w,z);
      }
     }
___________________________________________________________________________________________
      package projetojava;
      public class ExemploCoercao {
        public void divideValores(int a,int b){
          System.out.println(a+" / "+b+" = "+(a/b));
        }
      }
      
*-Universal por inclusão sem redefinição de metódos-*
  => Quando se usa o metodo de uma superclasse sem alterar o metodo em si e os seus
     parametros

*-Universal por inclusão com redefinição de metódos-*
  => Quando se usa o metodo de uma superclasse alterando o metodo em si e os seus
     parametros (utilizando super)
 Super = metodos da superClasse e da subClasse com o mesmo nome utiliza-se o super para
         chamar o metodo da superClasse
         
               
      
      
      
      
      
      
      
      
      
      
      
      
      
      
