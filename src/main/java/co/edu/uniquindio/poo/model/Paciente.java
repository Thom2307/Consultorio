package co.edu.uniquindio.poo.model;
package co.edu.uniquindio.poo.model;

import java.util.Date;

public final class Paciente {
    private final String historiaClinica;
    private final String nombre;
    private final int edad;
    private final String telefono;
    private final String direccion;
    private final Date fechaUltimaConsulta;
    private final int tratamientosRealizados;

    public Paciente(String historiaClinica, String nombre, int edad, String telefono, 
                   String direccion, Date fechaUltimaConsulta, int tratamientosRealizados) {
        this.historiaClinica = historiaClinica;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaUltimaConsulta = new Date(fechaUltimaConsulta.getTime());
        this.tratamientosRealizados = tratamientosRealizados;
    }

    public String getHistoriaClinica() { return historiaClinica; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getTelefono() { return telefono; }
    public String getDireccion() { return direccion; }
    public Date getFechaUltimaConsulta() { return new Date(fechaUltimaConsulta.getTime()); }
    public int getTratamientosRealizados() { return tratamientosRealizados; }
}
