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
public class Medico {
    private int identificacion;
    private String nombre;
    private String apellidos;
    private String especialidad;

    public Medico(int identificacion, String nombre, String apellidos, String especialidad) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public void verMedico(){
        JOptionPane.showMessageDialog(null , "La idenficaicon del medico: "+identificacion+"\nEl nombre del medico: "+nombre+""
                + "\nEl apellido del medico: "+apellidos+"\nLa especialidad del medico: "+especialidad);
    }

    void verPaciente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
