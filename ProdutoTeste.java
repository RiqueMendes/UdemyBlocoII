package classes;


public class ProdutoTeste {
    public static void main(String[] args) {
        
        
        
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4532.85;
       

       

        Produto p2 = new Produto();
        p2.nome = "Caneta";
        p2.preco = 2.85;
      
        Produto.desconto = 0.5;


        Produto p3 = new Produto("Caderno", 48.50);


        System.out.println(p1.nome);

        double precoFinal1 =  p1.precoComDesconto(0.5);
        System.out.println(precoFinal1);



        System.out.println(p2.desconto);


      
    }
}
