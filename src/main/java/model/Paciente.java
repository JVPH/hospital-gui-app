/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jvela
 */
public class Paciente extends Persona{
    private String eps;
    private String enfermedadDiagnosticada;
    
    public Paciente(String nombreCompleto, long numeroDeCedula, int edad, String ciudad, String eps, String enfermedadDiagnosticada) {
        super(nombreCompleto, numeroDeCedula, edad, ciudad);
        this.eps = eps;
        this.enfermedadDiagnosticada = enfermedadDiagnosticada;   
       
    }
    
    public String clasificarEdad(){
        if(this.edad>=21 & this.edad<=30){
            return "Joven Adulto";
        }else if(this.edad>30 & this.edad<=60){
            return "Adulto";
        }else if(this.edad>60){
            return "Tercera edad";
        }else{
            return "";
        }        
    }

    @Override
    public String toString() {
        return nombreCompleto+"-"+numeroDeCedula+"-"+edad+"-"+ciudad+"-"+eps+"-"+enfermedadDiagnosticada;
    }
    
    
    
}
