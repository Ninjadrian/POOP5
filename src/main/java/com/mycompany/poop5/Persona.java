/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop5;

/**
 *
 * @author lenovo
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Fecha fNacimiento;         //abstraccion

    public Persona() {
    }

    public Persona(String nombre, String apellido, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
    }
    
    public Persona(String nombre, String apellido, int dia, int mes, int anio){
        this.nombre = nombre;
        this.apellido = apellido;
        //Opcion1
        //Fecha fecha3 = newFecha(dia,mes,anio);
        //this.fNacimiento = fecha3;
        
        //Opción 2
        //fNacimiento = new Fecha();
        //fNacimiento.setDia(dia);
        //fNacimiento.setMes(mes);
        //fNacimiento.setAnio(anio);
        
        //Opción 3
        fNacimiento = new Fecha(dia,mes,anio);
        
    }

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

    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fNacimiento=" + fNacimiento + '}';
    }
    
    
}
