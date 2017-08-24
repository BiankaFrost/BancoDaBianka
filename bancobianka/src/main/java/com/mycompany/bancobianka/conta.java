/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancobianka;

/**
 *
 * @author aluno
 */
public class conta {

    protected float limiteextra;
    protected float saldoinvestimento;

    /**
     * @return the depositor
     */
    public float getDepositor() {
        return depositor;
    }

    /**
     * @param depositor the depositor to set
     */
    public void setDepositor(float depositor) {
        this.depositor = depositor;
    }

    /**
     * @return the sacar
     */
    public float getSacar() {
        return sacar;
    }

    /**
     * @param sacar the sacar to set
     */
    public void setSacar(float sacar) {
        this.sacar = sacar;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the agencia
     */
    public int getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the saldo
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the limite
     */
    public int getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(int limite) {
        this.limite = limite;
    }
    private int numero;
    private int agencia;
    private int saldo;
    private int limite;
    private float depositor;
    private float sacar;

    /**
     * @return the limiteextra
     */
    public float getLimiteextra() {
        return limiteextra;
    }

    /**
     * @return the saldoinvestimento
     */
    public float setSaldoinvestimento() {
        return (float) saldoinvestimento;
    }

    /**
     * @param limiteextra the limiteextra to set
     */
    public void setLimiteextra(float limiteextra) {
        this.limiteextra = limiteextra;
    }

    /**
     * @param limiteextra the limiteextra to set
     */
    public void setLimiteextra(int limiteextra) {
        this.setLimiteextra(limiteextra);
    }

    /**
     * @param saldoinvestimento the saldoinvestimento to set
     */
    public void setSaldoinvestimento(float saldoinvestimento) {
        this.saldoinvestimento = saldoinvestimento;
    }

    /**
     * @param saldoinvestimento the saldoinvestimento to set
     */
    public void getSaldoinvestimento(float saldoinvestimento) {
        this.getSaldoinvestimento(saldoinvestimento);
    }


    
}
