package exemploclasesobxetos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Metodos {

    public void escribeFichero(String ficheiro) {
        //  MeuObjectOutputStream esc = null;
        ObjectOutputStream fich = null;
        try {
            fich = new ObjectOutputStream(new FileOutputStream(ficheiro));
            Cpu c = new Cpu(2000, 1000);
            Pantalla p = new Pantalla("Phillips", 15.5f);
            Rato r = new Rato(" con cable");
            Ordenador orde1 = new Ordenador(c, p, r);
            fich.writeObject(orde1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fich != null) {
                try {
                    fich.close();
                } catch (IOException ex) {
                    Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public String cadea(String s) {
        return JOptionPane.showInputDialog(s);
    }

    public int enteiro(String s) {
        return Integer.parseInt(JOptionPane.showInputDialog(s));
    }

    public void lerFicheiro(String ficheiro) {
        ObjectInputStream ler = null;
        Ordenador aux = null;
        try {
            ler = new ObjectInputStream(new FileInputStream(ficheiro));

            aux = (Ordenador) ler.readObject();
            while (aux != null) {
                System.out.println(aux.toString());
                aux = (Ordenador) ler.readObject();
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("erro 1" + ex.getMessage());

        } catch (IOException ex) {
            System.out.println("erro 2" + ex.getMessage());
        } finally {
            if (ler != null) {
                try {
                    ler.close();
                } catch (IOException ex) {
                    System.out.println("erro de peche " + ex.getMessage());
                }
            }
        }
    }

}
