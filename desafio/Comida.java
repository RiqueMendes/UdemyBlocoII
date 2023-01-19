package classes.desafio;

public class Comida {
    

    String nomeDaComida;
    double pesoDaComida;


    
    public Comida(String nomeDaComida, double pesoDaComida){
        this.nomeDaComida = nomeDaComida;
        this.pesoDaComida = pesoDaComida;
    }
    
    String comer(){
        return " irá comer" + nomeDaComida + "e passar a pesar"  ;
    }
}
