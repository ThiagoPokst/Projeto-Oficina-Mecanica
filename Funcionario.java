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
public class funcionario {
    private int Fun_id;
    private String Fun_nome;
    private String Fun_cargo;

    public funcionario() {
    }

    public funcionario(String Fun_nome, String Fun_cargo) {
        this.Fun_nome = Fun_nome;
        this.Fun_cargo = Fun_cargo;
    }

    public int getFun_id() {
        return Fun_id;
    }

    public void setFun_id(int Fun_id) {
        this.Fun_id = Fun_id;
    }

    public String getFun_nome() {
        return Fun_nome;
    }

    public void setFun_nome(String Fun_nome) {
        this.Fun_nome = Fun_nome;
    }

    public String getFun_cargo() {
        return Fun_cargo;
    }

    public void setFun_cargo(String Fun_cargo) {
        this.Fun_cargo = Fun_cargo;
    }
    
}
