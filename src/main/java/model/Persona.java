/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jvela
 */
public class Persona {
    public String nombreCompleto;
    public long numeroDeCedula;
    public int edad;
    public String ciudad;

    public Persona(String nombreCompleto, long numeroCedula, int edad, String ciudad) {
        this.nombreCompleto = nombreCompleto;
        this.numeroDeCedula = numeroCedula;
        this.edad = edad;
        this.ciudad = ciudad;
    }
    
}
