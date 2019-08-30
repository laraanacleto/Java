
package app;



public class Shampoo extends ProdutoAcabado {
     
    private String tipo;
    private int estoquePantene;
    private int estoqueDove;
    
    //CRIANDO UM CONSTRUTOR
    public Shampoo(String nome) {
        super.setNome(nome);
        this.estoquePantene = 0;
        this.estoqueDove = 0;
    }
    public void menu(int valor,String embalagem, String marca){
        super.setValor(valor);
        super.setEmbalagem(embalagem);
        this.marca(marca);
    }
    public void status(){
      //  super.getValor(valor);
       // super.getEmbalagem(embalagem);
    }
    
    
    
    public void marca(String t) {
        if (t == "dove"){
            this.setTipo("Dove - Reconstrucao");
        } else if (t == "pantene"){
            this.setTipo("Pantene - Hidratacao");
        } else {
            this.setTipo("Nao trabalhamos com outras marcas");
        }
    }
    
    
    public int getEstoquePantene() {
        return this.estoquePantene;
    }
    public int getEstoqueDove(){
        return this.estoqueDove;
    }
     public void setEstoquePantene(int estoquePantene) {
        if (this.estoquePantene == 0) {
        this.estoquePantene = estoquePantene;
        }
        else {
            System.out.println("Ja possui essa quantidade em estoque " + this.getNome());
        }
     }
      public void setEstoqueDove(int estoqueDove) {
        if (this.estoqueDove == 0) {
        this.estoqueDove = estoqueDove;
        }
        else {
            System.out.println("Já possui essa quantidade em estoque " + this.getNome());
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
      
      
}