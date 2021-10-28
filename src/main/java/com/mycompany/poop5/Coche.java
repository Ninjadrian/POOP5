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
public class Coche {
    
    String marca;
    String modelo;
    String color;
    int anio;
    int kilometraje;
    boolean estandar;
    private Persona chofer;
    private Persona copiloto;
    private Persona pasajero1;
    private Persona pasajero2;
    
    public Coche() {
    }

    public Coche(String marca, String modelo, String color, int anio, int kilometraje, boolean estandar, Persona chofer, Persona copiloto, Persona pasajero1, Persona pasajero2) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.estandar = estandar;
        this.chofer = chofer;
        this.copiloto = copiloto;
        this.pasajero1 = pasajero1;
        this.pasajero2 = pasajero2;
    }

    
    
    public Coche(String marca, String modelo, String color, int anio, int kilometraje, boolean estandar, String nombre, String apellido, int dia, int mes, int anio,String nombre, String apellido, int dia, int mes, int anio,String nombre, String apellido, int dia, int mes, int anio,String nombre, String apellido, int dia, int mes, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.estandar = estandar;
        
        chofer = new Persona(nombre,apellido,dia,mes,anio);
        copiloto = new Persona(nombre,apellido,dia,mes,anio);
        pasajero1 = new Persona(nombre,apellido,dia,mes,anio);
        pasajero2 = new Persona(nombre,apellido,dia,mes,anio);
    }   

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public boolean isEstandar() {
        return estandar;
    }

    public void setEstandar(boolean estandar) {
        this.estandar = estandar;
    }

    public Persona getChofer() {
        return chofer;
    }

    public void setChofer(Persona chofer) {
        this.chofer = chofer;
    }

    public Persona getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(Persona copiloto) {
        this.copiloto = copiloto;
    }

    public Persona getPasajero1() {
        return pasajero1;
    }

    public void setPasajero1(Persona pasajero1) {
        this.pasajero1 = pasajero1;
    }

    public Persona getPasajero2() {
        return pasajero2;
    }

    public void setPasajero2(Persona pasajero2) {
        this.pasajero2 = pasajero2;
    }
    
    public void irAUnLugar(String lugar){
        System.out.println("Estoy llegando a "+lugar);
    }
    
    public void venderCarro(String comprador){
        System.out.println("Vendí mi coche a "+comprador);
    }
    
    public void gasolina(int porcentaje){
        System.out.println("Tengo "+porcentaje+" % de gasolina");
    }
    
    public void servicio(){
        if(kilometraje > 50000){
            System.out.println("El carro necesita servicio");
        }else{
            System.out.println("Aún falta para ir al servicio, no te preocupres");
        }
    }
    
    public void recorridoEnTiempo(float tiempoHoras){
        System.out.println("El tiempo del trayecto es "+tiempoHoras);
    }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", anio=" + anio + ", "
                + "kilometraje=" + kilometraje + ", estandar=" + estandar + ", chofer=" + chofer + ", copiloto=" + 
                copiloto + ", pasajero1=" + pasajero1 + ", pasajero2=" + pasajero2 + '}';
    }

    




    
    
    
    
}
