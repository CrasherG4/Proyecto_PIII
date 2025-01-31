package com.itsqmet.formularioHC.Entidad;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
public class Paciente {

    @NotBlank
    @Size(min = 3, max = 50)
    private String nombre;

    @NotBlank
    @Size(min = 3, max = 50)
    private String apellido;

    @NotBlank
    @Email(message = "Ingrese el correo en formato válido")
    private String email;

    @Size(min = 10, max = 10)
    @Pattern(regexp = "\\d{10}")
    private String telefono;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaNacimiento;

    @NotBlank
    private String genero;

    @Size(min = 10, max = 150)
    private String domicilio;

    @NotBlank
    @Size(min = 10, max = 200)
    private String historialM;

    @NotBlank
    @Size(min = 10, max = 200)
    private String medicamentosA;

    private boolean consumoD;

    @NotBlank
    @Size(min = 10, max = 200)
    private String motivoC;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getHistorialM() {
        return historialM;
    }

    public void setHistorialM(String historialM) {
        this.historialM = historialM;
    }

    public String getMedicamentosA() {
        return medicamentosA;
    }

    public void setMedicamentosA(String medicamentosA) {
        this.medicamentosA = medicamentosA;
    }

    public boolean isConsumoD() {
        return consumoD;
    }

    public void setConsumoD(boolean consumoD) {
        this.consumoD = consumoD;
    }

    public String getMotivoC() {
        return motivoC;
    }

    public void setMotivoC(String motivoC) {
        this.motivoC = motivoC;
    }
}
