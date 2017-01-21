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
public class HistorialClinico {
     private int codigo;
    private int fecha;
    private int idPaciente;
    private int idMedico;
    private String observaciones;

    public HistorialClinico(int codigo, int fecha, int idPaciente, int idMedico, String observaciones) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
        this.observaciones = observaciones;
    }
    
    public void verHistorialClinico(){
        
        JOptionPane.showMessageDialog(null, "El codigo del paciente: "+codigo+"\nLa fecha: "+fecha+"\nEl id del paciente: "+idPaciente+"\nLas observaciones: "+observaciones);
    
    }
}
