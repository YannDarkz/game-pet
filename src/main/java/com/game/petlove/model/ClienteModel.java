package com.game.petlove.model;

import jakarta.persistence.*;

@Entity(name = "Clientes")
@Table(name = "usuarios", schema = "petlove")
public class ClienteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "Age", nullable = false)
    private int age;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "whatsapp", nullable = true)
    private String whastapp;
    @Column(name = "addres", nullable = false)
    private String endereco;

    public ClienteModel() {

    }

    @Override
    public String toString() {
        return "ClienteModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", whastapp='" + whastapp + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWhastapp() {
        return whastapp;
    }

    public void setWhastapp(String whastapp) {
        this.whastapp = whastapp;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
