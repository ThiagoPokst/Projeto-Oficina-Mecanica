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
public class Cliente {
    private int Cli_id;
    private String Cli_nome;
    private String Cli_cpf;
    private String Cli_telefone;

    public cliente() {
    }

    public cliente(String Cli_nome, String Cli_cpf, String Cli_telefone) {
        this.Cli_nome = Cli_nome;
        this.Cli_cpf = Cli_cpf;
        this.Cli_telefone = Cli_telefone;
    }

    public int getCli_id() {
        return Cli_id;
    }

    public void setCli_id(int Cli_id) {
        this.Cli_id = Cli_id;
    }

    public String getCli_nome() {
        return Cli_nome;
    }

    public void setCli_nome(String Cli_nome) {
        this.Cli_nome = Cli_nome;
    }

    public String getCli_cpf() {
        return Cli_cpf;
    }

    public void setCli_cpf(String Cli_cpf) {
        this.Cli_cpf = Cli_cpf;
    }

    public String getCli_telefone() {
        return Cli_telefone;
    }

    public void setCli_telefone(String Cli_telefone) {
        this.Cli_telefone = Cli_telefone;
    }
    
    
    
}

