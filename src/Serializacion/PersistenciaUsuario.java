
package Serializacion;
import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PersistenciaUsuario {
    
    //parametros o argumentos, el metodo guardar que va a guardar?? cliente
    public static void guardar(Usuario u) /*lanza excepciones*/ throws Exception {
        

        // PASO 1     ↓↓↓
        
        
        //aqui va logica muy loca pero a la vez hermosa
        //Generar el archivo.. ↓↓↓↓ archivo de tipo file, la ruta y el nombre del archivo
        File file = new File("D:\\archivando.axel");
        
        
        //PASO 2     ↓↓↓↓
        FileOutputStream fos = new FileOutputStream(file/*file con minusculas , la segunda palabra de la linea de arriba*/);
                //fos
        ObjectOutputStream oos = new ObjectOutputStream (fos);
        oos.writeObject(u); //este metodo guarda el objeto..... writeobjet
        oos.close();
        //lo de arriba guarda el objeto en un archivo
        
    }
    
    public static Usuario Leer (String nombre) throws Exception{
         //aqui va logica muy loca pero a la vez hermosa
        
        File file = new File("D:\\archivando.axel");
        FileInputStream fis=new FileInputStream (file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Usuario u=new Usuario();
        u= (Usuario) ois.readObject();
        return u;
    }

    Object leer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
