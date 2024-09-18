package com.game.petlove.model;

import jakarta.persistence.*;

@Entity(name = "Autenticacao")
@Table(name = "authentication", schema = "petlove")
public class AutenticacaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Usuario;
    @Column(name = "usuario", nullable = false)
    private String userName;
    @Column(name = "password", nullable = false)
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
