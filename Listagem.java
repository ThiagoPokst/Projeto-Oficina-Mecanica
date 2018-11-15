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
public class Listagem {
    private Orcamento orc;
    private Peca peca;
    private int Lis_qtd;
    private double Lis_valor;

    public Listagem() {
    }

    public Listagem(Orcamento orc, Peca peca, int Lis_qtd, double Lis_valor) {
        this.orc = orc;
        this.peca = peca;
        this.Lis_qtd = Lis_qtd;
        this.Lis_valor = Lis_valor;
    }

    public Orcamento getOrc() {
        return orc;
    }

    public void setOrc(Orcamento orc) {
        this.orc = orc;
    }

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

    public int getLis_qtd() {
        return Lis_qtd;
    }

    public void setLis_qtd(int Lis_qtd) {
        this.Lis_qtd = Lis_qtd;
    }

    public double getLis_valor() {
        return Lis_valor;
    }

    public void setLis_valor(double Lis_valor) {
        this.Lis_valor = Lis_valor;
    }
    
        
}
