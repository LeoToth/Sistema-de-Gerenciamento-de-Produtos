package loja;
public class TestaProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto("Smartphone", 1001, 'E', 800.00, 1200.00, 15);
        Produto p2 = new Produto("Camiseta", 2005, 'V', 30.00, 80.00, 45);
        Produto p3 = new Produto("Arroz", 3002, 'A', 20.00, 25.00, 8);
        
        System.out.println("========Produto 1========");
        p1.imprimirProduto();
        System.out.println("Categoria: " + p1.imprimirCategoria());
        System.out.println("O lucro por unidade foi: R$ " + p1.calculaLucro());
        System.out.println("O lucro total foi: R$ " + p1.lucrototal());
        System.out.println("A situacao do estoque: " + p1.situacaoEstq());
        
        System.out.println("\n========Produto 2========");
        p2.imprimirProduto();
        System.out.println("Categoria: " + p2.imprimirCategoria());
        System.out.println("O lucro por unidade foi: R$ " + p2.calculaLucro());
        System.out.println("O lucro total foi: R$ " + p2.lucrototal());
        System.out.println("A situacao do estoque: " + p2.situacaoEstq());
        
        System.out.println("\n========Produto 3========");
        p3.imprimirProduto();
        System.out.println("Categoria: " + p3.imprimirCategoria());
        System.out.println("O lucro por unidade foi: R$ " + p3.calculaLucro());
        System.out.println("O lucro total foi: R$ " + p3.lucrototal());
        System.out.println("A situacao do estoque: " + p3.situacaoEstq());
    }
    
}
