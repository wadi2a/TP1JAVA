/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

/**
 *
 * @author Ouadie
 */
public class AppelReçu extends Appels {

    public AppelReçu(int dure, Contacts contact) {
        super(dure, contact);
    }

    
    public int calculet_cout(){
        return 0;
    }

    @Override
    public int calculer_cout() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
