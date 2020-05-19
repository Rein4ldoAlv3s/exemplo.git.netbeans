package exemplo.git.netbeans;

public class ExemploGitNetbeans {

    public static void main(String[] args) {
        Scanne entrada = new Scanner(System.in);
        System.out.println("Exemplo de um projeto qualquer com git e netbeans");
        //alterado da web
        //segunda alteracao pelo netbeans
        System.out.println("Hello World");
        
        //numero par ou impar?
        int num=entrada.nextInt();
        if(num%2==0){
            System.out.println("Numero par");
        }
        else{
            System.out.println("Numero impar");   
        }
    }
    
}
