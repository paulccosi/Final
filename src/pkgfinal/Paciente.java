/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import javax.swing.JOptionPane;

/**
 *
 * @author Wx8-PC
 */
public class Paciente {
     private int idenficicacion;
    private String nombre;
    private String apellidos;
    private int edad;
    private String genero;

    public Paciente(int idenficicacion, String nombre, String apellidos, int edad, String genero) {
        this.idenficicacion = idenficicacion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.genero = genero;
    }

    public int getIdenficicacion() {
        return idenficicacion;
    }

    public void setIdenficicacion(int idenficicacion) {
        this.idenficicacion = idenficicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public void verPaciente(){
        JOptionPane.showMessageDialog(null, "La identicacion del paciente: "+idenficicacion+"\nEl nombre del paciente: "
                +nombre+"\nEl apellido del paciente: "+apellidos+"\nLa edad del paciente: "+edad+"\nEl genero del paciente: ");
    }

}
