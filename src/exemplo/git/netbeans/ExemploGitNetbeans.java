package exemplo.git.netbeans;

import java.util.Scanner;

public class ExemploGitNetbeans {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Exemplo de um projeto qualquer com git e netbeans");
        //alterado da web
        //segunda alteracao pelo netbeans
        System.out.println("Hello World");
        
        //numero par ou impar:
        System.out.println("Informe um numero");
        int num=entrada.nextInt();
        if(num%3==0){
            System.out.println("Multiplo de 3");
        }
        else{
            System.out.println("Nao eh multiplo de 3");
        }
        if(num%2==0){
            System.out.println("Eh par (e multiplo de 2 tbm)");
        }
        else{
            System.out.println("Eh impar"); 
        }
        //Nice job :D
    }
    
}
