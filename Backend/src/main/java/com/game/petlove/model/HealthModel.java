package com.game.petlove.model;

public class HealthModel {
    private int id;
    private int life;

    public HealthModel(int id, int life) {
        this.id = id;
        this.life = life;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
}
