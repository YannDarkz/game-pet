package com.game.petlove.model;

import jakarta.persistence.*;

@Entity(name = "Clientes")
@Table(name = "usuarios", schema = "petlove")
public class ClienteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "First_name", nullable = false)
    private String nome;
    @Column(name = "Last_name", nullable = false)
    private int Age;
    @Column(name = "First_name", nullable = false)
    private int idade;
    @Column(name = "Email", nullable = false)
    private String email;
    @Column(name = "Whatsapp", nullable = false)
    private String Whatsapp;
    @Column(name = "Addres", nullable = false)
    private String endereco;



    public ClienteModel() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWhatsapp() {
        return Whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        Whatsapp = whatsapp;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
