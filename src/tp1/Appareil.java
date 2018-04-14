/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Ouadie
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;


public class Appareil implements AbstractAppareil{
    
    private ArrayList<Appels> ListAppel;
    private ArrayList<Contacts> ListContact;
    private int cptContact=1;
    private int cptAppel=1;

    public int getCptContact() {
        return cptContact;
    }

    public void setCptContact(int cptContact) {
        this.cptContact = cptContact;
    }

    public int getCptAppel() {
        return cptAppel;
    }

    public void setCptAppel(int cptAppel) {
        this.cptAppel = cptAppel;
    }
    
    public ArrayList<Appels> getListAppel() {
        return ListAppel;
    }

    public void setListAppel(ArrayList<Appels> ListAppel) {
        this.ListAppel = ListAppel;
    }

    public ArrayList<Contacts> getListContact() {
        return ListContact;
    }

    public void setListContact(ArrayList<Contacts> ListContact) {
        this.ListContact = ListContact;
    }

  public Appareil() {
      super();
        this.ListAppel = new ArrayList();
        this.ListContact = new ArrayList();
    }
 
    public void enregister(Appels appel) {
        
        this.ListAppel.add(appel);
        
    }

    
    public void enregister(Contacts contact) {
        
        this.ListContact.add(contact);
        
    }

    public Contacts consulter_cont_par_num(String num_tel) 
    {
        for(Contacts contact : this.ListContact)
        {
        if (contact.getNum_tel().equals(num_tel)) return contact;
        }
        return null;
        
    }
     
    

    
    public ArrayList<Contacts> consulter_par_mot_cle(String mot_cle) 
    {
        ArrayList<Contacts> listResultat = new ArrayList();
       
        for(Contacts contact : this.ListContact)
        {
            if(contact.getNom().contains(mot_cle))  listResultat.add(contact);    
        }
        return listResultat;
    }

  

    
    private ArrayList<Appels> ArrayList() 
    {
    return  ListAppel;   
    }
      @Override
    public double cout_total() {
       int total=0;
       for(Appels appel : this.ListAppel) 
       {
           total=total+appel.calculer_cout();
       }
       return total;
    }

 
    public double cout_appel(Calendar dateDebut, Calendar dateFin) 
    {
    int total=0;
    for(Appels appel : this.ListAppel)
        {
            if((appel.getDate_Appel().compareTo(dateDebut)==1) && (appel.getDate_Appel().compareTo(dateFin)== -1)) 
                total=total+appel.calculer_cout();
            
        }
    return total;
    
    }

   
    public double cout_appel(Contacts contact)
    {
        int total1=0;
        
        for(Appels appel : this.ListAppel)
        {
        if(appel.getContact().getNom()==contact.getNom()) total1=total1+appel.calculer_cout();
        }
    return total1;
    }

    
    public void inrCptContact(){
    this.cptContact++;
    }
    
    
    public void inrCptAppel(){
    this.cptAppel++;
    }

    @Override
    public void enregistrer(Contacts contact) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void enregistrer(Appels d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Contacts contactOf(String num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Contacts> consulter_par_mot_cle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double cout_appel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double cout_appel(int d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}