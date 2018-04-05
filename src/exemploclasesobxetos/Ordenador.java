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
public class Ordenador implements Serializable{
    Cpu c;
    Pantalla p;
    Rato r;

    public Ordenador(Cpu c, Pantalla p, Rato r) {
        this.c = c;
        this.p = p;
        this.r = r;
    }

    public Cpu getC() {
        return c;
    }

    public void setC(Cpu c) {
        this.c = c;
    }

    public Pantalla getP() {
        return p;
    }

    public void setP(Pantalla p) {
        this.p = p;
    }

    public Rato getR() {
        return r;
    }

    public void setR(Rato r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "c=" + c + ", p=" + p + ", r=" + r + '}';
    }
    
    
}
