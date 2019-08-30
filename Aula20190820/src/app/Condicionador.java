
package app;


public class Condicionador extends Produto {
    
    private String tipo;
    private int estoquePantene;
    private int estoqueDove;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEstoquePantene(int estoquePantene) {
        if (this.estoquePantene == 0) {
        this.estoquePantene = estoquePantene;
        }
        else {
            System.out.println("Já possui uma quantidade no estoque" + this.getNome());
        }
    }
    
    public String getTipo() {
        return tipo;
    }

    public int getEstoquePantene() {
        return estoquePantene;
    }

    public int getEstoqueDove() {
        return estoqueDove;
    }
    
}
