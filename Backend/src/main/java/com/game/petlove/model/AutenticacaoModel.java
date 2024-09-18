package com.game.petlove.model;

public class AutenticacaoModel {
    private int id_Usuario;
    private String userName;
    private String password;

    public AutenticacaoModel() {

    }

    public int getId_usuario() {
        return id_Usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_Usuario = id_usuario;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
