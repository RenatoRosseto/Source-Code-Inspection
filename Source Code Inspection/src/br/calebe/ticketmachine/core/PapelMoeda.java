package br.calebe.ticketmachine.core;

public class PapelMoeda {

    protected int valor;
    protected int quantidade;
    protected int troco;

    public PapelMoeda(int valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public int getValor() {
        return this.valor;
    }

    public int getQuantidade() {
        return this.quantidade;
    }
}
