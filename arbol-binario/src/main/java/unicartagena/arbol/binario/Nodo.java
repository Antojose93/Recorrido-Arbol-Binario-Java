/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unicartagena.arbol.binario;

import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

/**
 *
 * @author jose_
 */
public class Nodo {
    
    private Integer dato;
    private Nodo izquierdo;
    private Nodo derecho;
    
    
    public Nodo(Integer dato ) throws FileNotFoundException{
        this.dato = dato;
            }

    public Integer getDato() {
        return dato;
    }

    public void setDato(Integer dato) {
        this.dato = dato;
    }

    public Nodo getIzquierdo() {
        return this.izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return this.derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }
    
    public void agregar(Integer dato) throws FileNotFoundException{
        
        if (this.encuentra(dato)==null){
            if (dato < this.dato){
            
            if (izquierdo != null){
                izquierdo.agregar(dato);
            }else{
                izquierdo = new Nodo(dato);
            }
                            
        }else{
            
            if (derecho !=null){
                derecho.agregar(dato);
            }else{
                derecho = new Nodo(dato);
            }
        }
        }else{
            JOptionPane.showMessageDialog(null, "en un arbol binario no se pueden repetir valores");
            System.out.println("en un arbol binario no se pueden repetir valores");
        }
        
    }
    
    public Nodo encuentra(Integer dato){
        
        if (this.dato == dato){ 
            
            return this;
            
        }else{
            if (this.dato < dato){
                if(this.izquierdo != null){
                    return this.izquierdo.encuentra(dato);
                }else{
                    return null;
                }
            }else{
                if(this.derecho != null){
                    return this.derecho.encuentra(dato);
                }else{
                    return null;
                }
            }
        }
    }

   
  
    
    public void inorder(){
        
        if (izquierdo != null){
            izquierdo.inorder();
        }
        System.out.println(dato);
        
        if (derecho != null){
            derecho.inorder();
        }
        
    }
    
    public void preorder(){
        System.out.println(dato);
        if (izquierdo !=null){
            izquierdo.preorder();
        }
        if (derecho != null){
            derecho.preorder();
        }
    }
    
    public void posorder(){
        if(derecho!=null){
            derecho.posorder();
        }
        if(izquierdo!= null){
            izquierdo.posorder();
        }
        System.out.println(dato);
    }
    
    
    
    
    @Override
   public String toString(){
       return "NODO [ "+dato+" , "+izquierdo+" , "+derecho+" ]";
   }
    
    
}
