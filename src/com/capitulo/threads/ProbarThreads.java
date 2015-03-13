/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capitulo.threads;

/**
 *
 * @author T-301
 */
public class ProbarThreads {

    /**
     * @param args the command line arguments
     */
     public static void main (String[] args){
        System.out.println ("Probar threads");
        //1.- Creado
        
        Facil t1=new Facil ();         
        Facil t11=new Facil ();         
        t1.setName("AXEL");
        //------------------
        //r es la REFERENCIA de runnable, mas nooo de regular
        Regular r1=new Regular  ();
        Thread t2=new Thread(r1);//constructor por defecto
        //______________________________________________________
        
        Thread t3= new Thread (new Runnable(){

            @Override
            public void run() {
                System.out.println("Soy un THREAD mucho mejor");
            }
            
        }
        ); 
        
        
        
        Relojito treloj=new Relojito ();
        //2.- Inicializado
        t1.start();
        t11.start();
        t2.start();
        t3.start();
        treloj.start();
//3.- Ejecucion
        //4.- Pausa (Cuando hay mas de un threads
        //5.- Muerte
    }
    
    }
    

