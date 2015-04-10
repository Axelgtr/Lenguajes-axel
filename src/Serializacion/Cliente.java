/*
axel
 *paso 1)   A LAS CLASES A SELIALIZAR IMPLEMENTAR LA INTEFAZ SERIALIZABLE
* PASO 2)   cREAR LA CLASE COMPRESORA (que guarde) Y DESCOMPORTURA (que lee) "PARA LAS CLASES DEL PASO 1 "
 */
package Serializacion;

import java.io.Serializable;

/**
 *
 * @author T-301
 */
public class Cliente implements Serializable {
    private String nombre;
    private float sueldo;
    private Direccion direccion;

    public Cliente(String nombre, float sueldo, Direccion direccion) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
