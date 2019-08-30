/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Lara
 */
public class MateriaPrimap extends Produto {
    
 private String agua;
 private String detergente;
 private String fragancia;

    
    public void setAgua(String agua){
        this.agua = agua;
    }
    public void setdetergente(String detergente){
        this.detergente = detergente;
    }
   public void setFragancia(String fragancia){
       this.fragancia = fragancia;
   }
    
    public String getAgua(){
        return this.agua;
    }
    public String getDetergente(){
        return this.detergente;
    }
    public String getFragancia(){
        return this.fragancia;
    }
   
}
