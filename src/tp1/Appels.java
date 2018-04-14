/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Ouadie
 */
public abstract class Appels {
    private Calendar date_Appel ;
    private int duree;
    private Contacts contact;

    public Calendar getDate_Appel() {
        return date_Appel;
    }

    public void setDate_Appel(Calendar date_Appel) {
        this.date_Appel = date_Appel;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public Contacts getContact() {
        return contact;
    }

    public void setContact(Contacts contact) {
        this.contact = contact;
    }
 
    
    
    public Appels(int dure,Contacts contact){
        this.date_Appel= Calendar.getInstance();
        this.duree=dure;
        this.contact=contact;
}
      public String toString()
  {
      return "la durée de l'appel : "+ duree +" :\n "+ contact;
  }
        public abstract int calculer_cout();
}

