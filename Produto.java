package classes;

public class Produto {
    

    String nome;
    double preco;
    static double desconto = 50;

    Produto(){
      
    }

    Produto(String nomeInicial){
      nome = nomeInicial;
    }

    
    Produto(String nomeInicial, double precoInicial,  double descontoInicial){
      nome = nomeInicial;
      preco = precoInicial;
      desconto = descontoInicial;
    }
    
    
    Produto(String nomeInicial, double precoInicial){
      nome = nomeInicial;
      preco = precoInicial;
     
    }
    

    double precoComDesconto(double descontoMaior){
        return preco * (1 - desconto + descontoMaior);
  }
}
