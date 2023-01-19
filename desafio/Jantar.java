package classes.desafio;

public class Jantar {
    public static void main(String[] args) {
        
        Comida c1 = new Comida("Batata", 0.5);
        Pessoa p1 = new Pessoa("Jose", 70.5);

        
       
        System.out.println(p1.apresentar()  );
        p1.comer(c1);
        System.out.println( p1.apresentar());

        if(p1.peso <=  70){
            System.out.println("A pessoa está entre 50 e 70 kgs");

        } else if(p1.peso >= 70){
            System.out.println("A pessoa está acima de 70 kgs");
        }
    }

    
}
