package org.example.modelos.hijos;

import org.example.modelos.Guerrero;

public class Sayayin extends Guerrero {

    private String fase;

    public Sayayin() {
    }

    @Override
    public void saludar() {
        System.out.println("HOla insecto soy "+getNombre());

    }

    public Sayayin(String nombre, Integer poderPelea, Integer poderDefensa, Integer vida, String fase) {
        super(nombre, poderPelea, poderDefensa, vida);
        this.fase = fase;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }
}
