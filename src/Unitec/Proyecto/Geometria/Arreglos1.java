
package Unitec.Proyecto.Geometria;

public class Arreglos1 {
    
    
    
    
    //metodo main
    public static void main (String args[]){
//el 3 es el numero de lugares...
        
        
        //tipos de arreglos correcto ↓↓↓    ||| crear un arreglo y llamarlo Y
        int x[]=new int[3];
        int [] y =new int[3];
        //  int z[]=(1,-200,45);
        
        
        //el elemento x del indice 2 .... vale .....
        x[0]=127;
        x[1]=200;
        x[2]=-23;
        //x[3]=127;  tiene que marcar error por que solo hay 3........0,1,2        || el 3 no existe
                //ITERAR....CICLAR O HACER EL RECORRIDO CON EL CICLO FOR ↓↓↓
                //ciclo normal
        
/*
        __________________________________________________________________________________________________________________
//definicion de excepcion:   Preveer los eroores que el usuario puede meter o equivocarse...
        o error en tiempo de ejecucion y existen dos tipos... UNCHECKED= el compilador se hace cargo de ellas Y CHECKED = no sotros nos hacemoa cargo de ellas...
        __________________________________________________________________________________________________________________ 
        Ejemplos de tipo UNCHECKED:      . ArrayIndexOutOfBoundsException
        marca error si se le pone un muero mayor al arreglo. por ej el numero 4 
         
                                                                                    for (int i =0; i<4; i++){
                                                                                    System.out.println (x[i]);
                                                                                    }
        ___________________________________________________________________________________________________________________
        Ejemplo  de tipo UNCHECKED         ArithmeticException                        int a =2;
                                                                                       int b = 0;
                                                                                        System.out.println (a/b);
        ___________________________________________________________________________________________________________________
        Ejemplo de tipo UNCHECKED          NumberformatException
        
                                    cuando se ingresa un dato diferente. ejemplo en entero, si se meten letras marca error
        
        __________________________________________________________________________________________________________________
        
  */  
        // Es lo m9ismo si se pone:   |||  for (int i =0; i<x.length; i++)
        
        //_________________________________________________________________________________________________________________
        //__________________________________________________________________________________________________________________
        try{ //try es la excepcion.... 
        for (int i =0; i<4; i++){   /*Ajusta al tamaño del arreglo el.....  """LENGTH"" || erl incremento es de 1 en 1 */
            System.out.println (x[i]);
            
        }
        //catch(Throwable e){
        //(e.getMessage()})
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Metiste un arreglo mayor a 3");
        }
        //__________________________________________________________________________________________________________________
        //__________________________________________________________________________________________________________________
    
        System.out.println ("Si ocurre una excepcion nunca me varas");
    
         //for mejorado
                //x es el arreglo y en cada vuelta se deposita en la variable algodon... ||| tiene que ser del mismo tipo del arrerglo (entero-int)
                                    
       /* for (int algo:x){
            System.out.println (algo);
                   */                    }
       // Cuadrado c=new Cuadrado(lado)

        
    }
    

