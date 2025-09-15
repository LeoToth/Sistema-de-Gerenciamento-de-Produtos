package loja;
public class Produto {
    //atributos
    private String nome;
    private int codigo;
    private char categoria;
    private double custo;
    private double venda;
    private int qtdEstq;

    //construtor
    public Produto(String nome, int codigo, char categoria, double custo, double venda, int qtdEstq){
        this.nome = nome;
        this.codigo = codigo;
        this.categoria = categoria;
        this.custo = custo;
        this.venda = venda;
        this.qtdEstq = qtdEstq;
    }
    
    //get
    public String getNome(){
        return nome;
    }
    public int getCodigo(){
        return codigo;
    }
    public char getCategoria(){
        return categoria;
    }
    public double getCusto(){
        return custo;
    }
    public double getVenda(){
        return venda;
    }
    public int getQtdEstq(){
        return qtdEstq;
    }
    
    //set
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setCategoria(char categoria){
        this.categoria = categoria;
    }
    public void setCusto(double custo){
        this.custo = custo;
    }
    public void setVenda(double venda){
        this.venda = venda;
    }
    public void setQtdEstq(int qtdEstq){
        this.qtdEstq = qtdEstq;
    }
    
    
    
    
    //metodos
    public void imprimirProduto(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Codigo: " + codigo);
        System.out.println("Custo do Produto: R$ " + custo);
        System.out.println("Venda do Produto: R$ " + venda);
        System.out.println("Estoque: " + qtdEstq + " Unidades");
    }
    
    public String imprimirCategoria(){
        if((categoria == 'E') || (categoria == 'e')){
            return "Eletronico";
        }else if((categoria == 'V') || (categoria == 'v')){
            return "Vestuario";
        }else if((categoria == 'A') || (categoria == 'a')){
            return "Alimento";
        }else{
            return "Outros";
            }
    }
    
    public double calculaLucro(){
        double callucro;
        callucro = venda - custo;
        return callucro;
    }
    
    public double lucrototal(){
        return calculaLucro() * qtdEstq;
    }
    
    public String situacaoEstq(){
        if(qtdEstq < 10){
            return "Critico";
        }else if(qtdEstq >= 10 && qtdEstq <= 30){
            return "Baixo";
        }else{
            return "Adequado";
        }
    }
    
    
}
