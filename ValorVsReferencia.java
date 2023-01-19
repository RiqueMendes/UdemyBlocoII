package classes;

public class ValorVsReferencia {
    public static void main(String[] args) {
        
        double a = 2;
        double b = a; //atribuição por valor (tipo primitivo)

        a++;
        b--;

        System.out.println( a + " " +b);

        Produto p1 = new Produto();
        Produto p2 = p1;  // Atribuicao por referencia (objeto)
    }
}
