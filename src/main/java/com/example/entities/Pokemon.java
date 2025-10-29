package com.example.entities;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {

    private int numero;
    private String nome;
    private List<Tipo> tipos;
    // Pode ser null
    private Pokemon evoluiPara;// Objeto Pokemon
    private int evoluiEm; // nivel em que o pokemons passa para a proxima evo.
    private boolean lendario; // Para especies raras

    public Pokemon(){
    }

    public Pokemon(int numero, String nome, List<Tipo> tipos, Pokemon evoluiPara, int evoluiEm, boolean lendario) {
        this.numero = numero;
        this.nome = nome;
        this.tipos = new ArrayList<>();
        for(Tipo t : tipos){
            this.tipos.add(t);
        }
        this.evoluiPara = new Pokemon();
        this.evoluiPara = evoluiPara;
        this.evoluiEm = evoluiEm;

        this.lendario = lendario;
    }

    public Pokemon(int numero, String nome, List<Tipo> tipos, boolean lendario) {
        this.numero = numero;
        this.nome = nome;
        this.tipos = new ArrayList<>();
        for(Tipo t : tipos){
            this.tipos.add(t);
        }
        this.lendario = lendario;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFraquezas(){
        String tipos = " ";
        for(Tipo t : this.tipos){
            tipos += t.getFraquezas();
        }
        return tipos;
    }

    public String getResistencias(){
        String tipos = " ";
        for(Tipo t : this.tipos){
            tipos += t.getResistencias();
        }
        return tipos;
    }

    public void setTipo(List<Tipo> tipos){
        this.tipos = new ArrayList<>();
        for(Tipo t : tipos){
            this.tipos.add(t);
        }
    }

    public List<Tipo> getTipos(){
        return this.tipos;
    }

    public Pokemon getEvoluiPara(){
        return this.evoluiPara;
    }

    public void setEvoluiPara(Pokemon pokemon){
        this.evoluiPara = new Pokemon();
        this.evoluiPara = pokemon;
    }

    public void setEvoluiEm(int nivel){
        this.evoluiEm = nivel;
    }

    public int getEvoluiEm(){
        return this.evoluiEm;
    }

    public void setLendario(boolean lendario){
        this.lendario = lendario;
    }

    public boolean isLendario() {
        return this.lendario;
    }

    @Override
    public String toString() {
        return this.nome + " - " + this.numero;
    }
}
