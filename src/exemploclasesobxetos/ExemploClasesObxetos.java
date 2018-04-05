/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploclasesobxetos;

/**
 *
 * @author pnocedalopez
 */
public class ExemploClasesObxetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Metodos obxfich = new Metodos();
        obxfich.escribeFichero("ordenadores.dat");
        obxfich.lerFicheiro("ordenadores.dat");

    }

}
