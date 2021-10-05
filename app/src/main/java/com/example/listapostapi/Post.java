package com.example.listapostapi;

public class Post {
    private int userId;
    private int codPaciente;//id;
    private String nombre;//title;
    private String email;//body;
    private String domicilio;
    private String telefono;
    private boolean activo;

    /*
    *               Id = 1,
                    CodPaciente = 6548,
                    Nombre = "Juan pedro",
                    Email = "Juan@gmail.com",
                    Domicilio = "J.Pedro 7569",
                    Telefono = "0000000001",
                    Activo = true
    * */

    public Post(int userId, int codPaciente, String nombre, String email, String domicilio, String telefono, boolean activo) {
        this.userId = userId;
        this.codPaciente = codPaciente;
        this.nombre = nombre;
        this.email = email;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.activo = activo;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(int codPaciente) {
        this.codPaciente = codPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
