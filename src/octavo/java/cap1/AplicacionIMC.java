/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octavo.java.cap1;

public class AplicacionIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //primero creamos un objeto de tipo imc
        IMC xxx= new IMC();
        //IMC se le llama instancia, lo que esta a la derecha del = 
        //izquieda referencia
        float resultado = 
       xxx.calcular(1.68f, 86);
        System.out.println("Tu imc es: " +resultado);
                
    }
    
}
