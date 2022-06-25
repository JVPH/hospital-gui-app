/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author jvela
 */
public class Medico extends Persona{
    private ArrayList<Paciente> pacientes;
    public Medico(String nombreCompleto, long numeroDeCedula, int edad, String ciudad){
        super(nombreCompleto,numeroDeCedula,edad,ciudad);
        this.pacientes = new ArrayList<>();
    }
    
    
    public String pacientes(){
        String listadoPacientes = "";
        for(Paciente p:this.pacientes){
            listadoPacientes+=p.toString()+"\n";
        }
        return listadoPacientes;
    } 
    
    public void agregarPaciente(Paciente paciente){
        this.pacientes.add(paciente);        
    }
            
    public long getNumeroCedula() {
        return numeroDeCedula;
    }
    
    public String getNombre(){
        return nombreCompleto;
    }
    
    @Override
    public String toString() {
        return nombreCompleto+"-"+numeroDeCedula+"-"+edad+"-"+ciudad;
    }
    
}
