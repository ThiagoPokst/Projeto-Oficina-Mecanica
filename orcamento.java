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
public class orcamento {
    
    private int Orc_id;
    private int Nat_id;
    private int Fun_id;
    private int Cli_id;
    private String Orc_descricao;
    private String Orc_valor;

    public orcamento() {
    }

    public orcamento(int Nat_id, int Fun_id, int Cli_id, String Orc_descricao, String Orc_valor) {
        this.Nat_id = Nat_id;
        this.Fun_id = Fun_id;
        this.Cli_id = Cli_id;
        this.Orc_descricao = Orc_descricao;
        this.Orc_valor = Orc_valor;
    }

    public int getOrc_id() {
        return Orc_id;
    }

    public void setOrc_id(int Orc_id) {
        this.Orc_id = Orc_id;
    }

    public int getNat_id() {
        return Nat_id;
    }

    public void setNat_id(int Nat_id) {
        this.Nat_id = Nat_id;
    }

    public int getFun_id() {
        return Fun_id;
    }

    public void setFun_id(int Fun_id) {
        this.Fun_id = Fun_id;
    }

    public int getCli_id() {
        return Cli_id;
    }

    public void setCli_id(int Cli_id) {
        this.Cli_id = Cli_id;
    }

    public String getOrc_descricao() {
        return Orc_descricao;
    }

    public void setOrc_descricao(String Orc_descricao) {
        this.Orc_descricao = Orc_descricao;
    }

    public String getOrc_valor() {
        return Orc_valor;
    }

    public void setOrc_valor(String Orc_valor) {
        this.Orc_valor = Orc_valor;
    }
    
        
    
}
