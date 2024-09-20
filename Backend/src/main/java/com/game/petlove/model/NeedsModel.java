package com.game.petlove.model;

public class NeedsModel {
    private int id;
    private int urine;
    private int faces;

    public NeedsModel(int id, int urine, int faces) {
        this.id = id;
        this.urine = urine;
        this.faces = faces;
    }

    public int getId() {
        return id;
    }

    public int getUrine() {
        return urine;
    }

    public int getFaces() {
        return faces;
    }
}
