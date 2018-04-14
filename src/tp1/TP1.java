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
public class TP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Appareil mon_telephone = new Appareil();
        Contacts contact = new Contacts(1,"Lyes","09090909");
        Contacts contact2 = new Contacts(1,"Ouadie","0638441611");
        mon_telephone.enregistrer(contact);
        mon_telephone.enregistrer(contact2);
        Appels appel = new AppelEmis(3,contact);
        Appels appel2 = new AppelReçu(1,contact) ;
         mon_telephone.enregistrer(appel);
         mon_telephone.enregistrer(appel2);
        System.out.println(mon_telephone.contactOf("0638441611"));
        System.out.println(mon_telephone.contactOf("09090909"));
        
    }
    
}
