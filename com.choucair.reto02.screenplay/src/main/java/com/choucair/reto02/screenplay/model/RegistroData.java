package com.choucair.reto02.screenplay.model;

public class RegistroData {
    private String nombreCompleto;
    private String apellidos;
    private String telefono;
    private String tipoDocumento;
    private String idDoctor;
    private String idPaciente;
    private String diaCita;
    private String observaciones;

    public String getNombreCompleto() { return nombreCompleto;    }

    public String getApellidos() { return apellidos;  }

    public String getTelefono() {  return telefono; }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getIdDoctor() {
        return idDoctor;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public String getDiaCita() {
        return diaCita;
    }

    public String getObservaciones() {
        return observaciones;
    }
}
