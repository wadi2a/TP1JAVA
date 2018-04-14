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
public class AppelEmis extends Appels {
    
    public AppelEmis( int duree, Contacts contact) {
        super( duree, contact);
    }
    
    

    @Override
    public int calculer_cout() {
        return getDuree()*2;
       
    }
}