package classes.desafio;

public class Pessoa {
    

    String nome;
    double peso;


    Pessoa (String nome, double peso){
        this.nome = nome;
        this.peso = peso;

    }

    void comer(Comida comida){
        this.peso += comida.pesoDaComida;
    }

   String apresentar(){
    return "A pessoa chama-se " + nome + " pesa " + peso + "Kgs";
   }

   
}
