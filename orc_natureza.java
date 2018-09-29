/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bin;

/**
 *
 * @author Thiago
 */
public class orc_natureza {
    private int Nat_id;
    private String Nat_descricao;

    public orc_natureza() {
    }

    public orc_natureza(String Nat_descricao) {
        this.Nat_descricao = Nat_descricao;
    }

    public int getNat_id() {
        return Nat_id;
    }

    public void setNat_id(int Nat_id) {
        this.Nat_id = Nat_id;
    }

    public String getNat_descricao() {
        return Nat_descricao;
    }

    public void setNat_descricao(String Nat_descricao) {
        this.Nat_descricao = Nat_descricao;
    }
    
}
