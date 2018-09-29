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
public class categoria {
    private int Cat_id;
    private String Cat_descricao;

    public categoria() {
    }

    public categoria(String Cat_descricao) {    
        this.Cat_descricao = Cat_descricao;
    }

    public int getCat_id() {
        return Cat_id;
    }

    public void setCat_id(int Cat_id) {
        this.Cat_id = Cat_id;
    }

    public String getCat_descricao() {
        return Cat_descricao;
    }

    public void setCat_descricao(String Cat_descricao) {
        this.Cat_descricao = Cat_descricao;
    }
    
    
    
}
