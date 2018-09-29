/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Maxtor IV
 */
public class os {
    private int Os_id;
    private int Fun_id;
    private int Nat_id;
    private int Orc_id;

    public os() {
    }

    public os(int Fun_id, int Nat_id, int Orc_id) {
        this.Fun_id = Fun_id;
        this.Nat_id = Nat_id;
        this.Orc_id = Orc_id;
    }
    
    public int getOs_id() {
        return Os_id;
    }

    public void setOs_id(int Os_id) {
        this.Os_id = Os_id;
    }

    public int getFun_id() {
        return Fun_id;
    }

    public void setFun_id(int Fun_id) {
        this.Fun_id = Fun_id;
    }

    public int getNat_id() {
        return Nat_id;
    }

    public void setNat_id(int Nat_id) {
        this.Nat_id = Nat_id;
    }

    public int getOrc_id() {
        return Orc_id;
    }

    public void setOrc_id(int Orc_id) {
        this.Orc_id = Orc_id;
    }
    
      
}
