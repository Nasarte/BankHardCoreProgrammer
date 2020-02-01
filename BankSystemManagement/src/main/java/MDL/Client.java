/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MDL;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Polid
 */
public class Client extends Member {
    private final int ID=1;
    private int id;
    private double salary;
    private String maritalStatus;
    private Date birthDate;
    private int code;
    private Adress adress;
    private List<Account> accounts;
    private ClientManager clientManager;

    public Client(double salary, String maritalStatus, Date birthDate, int code, Adress adress, ClientManager clientManager) {
       this.id=this.id+ID;
        this.salary = salary;
        this.maritalStatus = maritalStatus;
        this.birthDate = birthDate;
        this.code = code;
        this.adress = adress;
        this.clientManager = clientManager;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public ClientManager getClientManager() {
        return clientManager;
    }

    public void setClientManager(ClientManager clientManager) {
        this.clientManager = clientManager;
    }

    @Override
    public String toString() {
        return "Client{" + "salary=" + salary + ", maritalStatus=" + maritalStatus + ", birthDate=" + birthDate + ", adress=" + adress + ", accounts=" + accounts + ", clientManager=" + clientManager + '}';
    }
    
    
}
