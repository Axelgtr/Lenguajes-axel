
package Serializacion;

/**
 *
 * @author T-107
 */
public class ProyectoFinal {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario u = new Usuario();
        u.setEmail("axel@hotmail.com");
        u.setNombre("Axel");
        u.setSueldo(40000);
        
        
        PersistenciaUsuario per=new PersistenciaUsuario();
                
        try {
        per.guardar(u);
        System.out.println("Usuario guardado con exito");
    }catch (Exception ex){
            System.out.println (ex.getMessage());
            }
    
}
}
