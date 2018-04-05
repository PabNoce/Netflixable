/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploclasesobxetos;

import java.io.Serializable;

/**
 *
 * @author pnocedalopez
 */
public class Cpu implements Serializable {

   int precio, precio2;

    public Cpu(int precio, int precio2) {
        this.precio = precio;
        this.precio2 = precio2;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio2() {
        return precio2;
    }

    public void setPrecio2(int precio2) {
        this.precio2 = precio2;
    }

    @Override
    public String toString() {
        return "Cpu{" + "precio=" + precio + ", precio2=" + precio2 + '}';
    }
   
    
}
