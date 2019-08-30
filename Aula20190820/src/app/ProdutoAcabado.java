
package app;


public class ProdutoAcabado extends Produto {
    
    private String embalagem;
    private String adesivo;
    
    public void setEmbalagem(String embalagem){
        this.embalagem = embalagem;
    }
     public void setAdesivo(String adesivo){
        this.adesivo = adesivo;
    }
    public String getEmbalagem(){
        return this.embalagem;
    }
    public String getAdesivo(){
        return this.adesivo;
    }
   
}
