/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;
/*
    adolfo emanuel zepeda medina 2000135
    maria mercedes mendoza gomez 2000086 
*/
/**
 *
 * @author Mercedes Mendoza
 */
public class Alumno {
    
    int id;
    String nombre;
    double parcialUno;
    double parcialDos;
    double zona;
    double examenFinal;
    double total;
    
    Alumno(){}
    
    Alumno(int id, String nombre, double parcialUno, 
            double parcialDos, double zona, 
            double examenFinal){
    
        this.id = id;
        this.nombre = nombre;
        this.parcialUno = parcialUno;
        this.parcialDos = parcialDos;
        this.zona = zona;
        this.examenFinal = examenFinal;
        this.total = parcialUno+parcialDos+zona+examenFinal;  
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getParcialUno() {
        return parcialUno;
    }

    public void setParcialUno(double parcialUno) {
        this.parcialUno = parcialUno;
        actualizarTotal();
    }

    public double getParcialDos() {
        return parcialDos;
    }

    public void setParcialDos(double parcialDos) {
        this.parcialDos = parcialDos;
        actualizarTotal();
    }

    public double getZona() {
        return zona;
    }

    public void setZona(double zona) {
        this.zona = zona;
        actualizarTotal();
    }

    public double getExamenFinal() {
        return examenFinal;
    }

    public void setExamenFinal(double examenFinal) {
        this.examenFinal = examenFinal;
        actualizarTotal();
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public void actualizarTotal(){
        setTotal(parcialUno+parcialDos+zona+examenFinal);  
    }
    
} 

