/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MDL;

/**
 *
 * @author Polid
 */
public class Account {
    private final static int ID=1;
    private int id;
    private String type;
    private double soldeInitial;
    private Client owner;
    private double solde;
    private ClientManager accManager;

    public Account(String type, double soldeInitial, Client owner, ClientManager accManager) {
      this.id=this.id + ID;
        this.type = type;
        this.soldeInitial = soldeInitial;
        this.owner = owner;
        this.solde = this.solde+soldeInitial;
        this.accManager = accManager;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSoldeInitial() {
        return soldeInitial;
    }

    public void setSoldeInitial(double SoldeInitial) {
        this.soldeInitial = soldeInitial;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = this.solde+solde;
    }

    public ClientManager getAccManager() {
        return accManager;
    }

    public void setAccManager(ClientManager accManager) {
        this.accManager = accManager;
    }

    @Override
    public String toString() {
        return "Account{" + "type=" + type + ", soldeInitial=" + soldeInitial + ", owner=" + owner + ", solde=" + solde + ", accManager=" + accManager + '}';
    }
    
    
}
