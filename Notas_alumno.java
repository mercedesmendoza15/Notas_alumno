/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Mercedes Mendoza
 */
public class Notas_alumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Alumno> listAlumnos = new ArrayList();
        
        int id;
        String nombre;
        double parcialUno;
        double parcialDos;
        double zona;
        double examenFinal;
        double total;
        char ingresaRegistro = 'n';
        
        do{
        
            System.out.println("ingresar los siguientes registros:");
            System.out.print("Id:");
            id = sc.nextInt();
            System.out.print("nombre:");
            nombre = sc.next();
            System.out.print("parcial uno:");
            parcialUno = sc.nextDouble();
            System.out.print("parcial dos:");
            parcialDos = sc.nextDouble();
            System.out.print("zona:");
            zona = sc.nextDouble();
            System.out.print("examen final:");
            examenFinal = sc.nextDouble();
            
            listAlumnos.add(new Alumno(id,
                    nombre,
                    parcialUno,
                    parcialDos,
                    zona,
                    examenFinal));
        
            System.out.println("desa ingresar un nuevo registro? s/n");
            ingresaRegistro = sc.next().charAt(0);
        }while(ingresaRegistro == 's');
        
        System.out.println("Id\tNombre\tParcial1\tParcial2\tZona\tFinal\tTotal");
        listAlumnos.forEach((alumno) -> {
            System.out.println(alumno.getId() +
                    "\t" + alumno.getNombre() + 
                    "\t" + alumno.getParcialUno() +
                    "\t\t" + alumno.getParcialDos() +
                    "\t\t" + alumno.getZona() + 
                    "\t" + alumno.getExamenFinal() +
                    "\t" + alumno.getTotal());
        });
      
    }
    
}
    
    

