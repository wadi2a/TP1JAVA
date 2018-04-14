/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.ArrayList;

/**
 *
 * @author Ouadie
 */
public interface AbstractAppareil {
    public void enregistrer(Contacts contact);
    public void enregistrer(Appels d);
    public Contacts contactOf(String num);
    public ArrayList<Contacts>  consulter_par_mot_cle();
    public double cout_total();
    public double  cout_appel() ;
    public double cout_appel(int d);
    
}
