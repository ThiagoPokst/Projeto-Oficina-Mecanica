/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Leandro
 */
public class Produto {
    
    private int Pro_id;
    private Categoria categoria;
    private String Pro_descricao;
    private int Pro_qtd;
    private double Pro_valor;

    public Produto() {
    }

    public Produto(Categoria categoria, String descricao, int qtd, double valor) {
        this.categoria = categoria;
        this.Pro_descricao = descricao;
        this.Pro_qtd = qtd;
        this.Pro_valor = valor;
    }
    
    public int getPro_id() {
        return Pro_id;
    }

    public void setPro_id(int Pro_id) {
        this.Pro_id = Pro_id;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getPro_descricao() {
        return Pro_descricao;
    }

    public void setPro_descricao(String Pro_descricao) {
        this.Pro_descricao = Pro_descricao;
    }

    public int getPro_qtd() {
        return Pro_qtd;
    }

    public void setPro_qtd(int Pro_qtd) {
        this.Pro_qtd = Pro_qtd;
    }

    public double getPro_valor() {
        return Pro_valor;
    }

    public void setPro_valor(double Pro_valor) {
        this.Pro_valor = Pro_valor;
    }
    
    
    
}
