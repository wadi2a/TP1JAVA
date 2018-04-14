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
public class Contacts {
  private int id;
  private String nom;
  private String num_tel;

    Contacts(int i, String nom, String num_tel) {
        this.id=i;
        this.nom=nom;
        this.num_tel= num_tel;
           }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNum_tel() {
        return num_tel;
    }

    public void setNum_tel(String num_tel) {
        this.num_tel = num_tel;
    }
  
  public String toString()
  {
      return "Contact: id ="+this.id+" le nom:"+nom+" numero :"+ num_tel;
  }
}
