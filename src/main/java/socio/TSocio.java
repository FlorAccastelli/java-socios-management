/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author flor
 */
public class TSocio {
   
    String apeNom;
    String nroDNI;
    String telefono;
    String categoria;

    public TSocio(String apeNom, String nroDNI, String telefono, String categoria) {
        this.apeNom = apeNom;
        this.nroDNI = nroDNI;
        this.telefono = telefono;
        this.categoria = categoria;
    }
    
    public Vector toVector(){
        Vector v = new Vector();
        v.add(this.apeNom);
        v.add(this.nroDNI);
        v.add(this.telefono);
        v.add(this.categoria);
        return v;   
    }
    
    public void guardarEnArchivo (){
    try{
        FileWriter fw = new FileWriter("Socios.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        pw.print(this.getApeNom());
        pw.print(" | "+ this.getNroDNI());
        pw.print(" | "+ this.getTelefono());
        pw.println(" | "+ this.getCategoria());
        pw.close();
    } catch(Exception e){
        JOptionPane.showMessageDialog(null, e);    
    }
}

    public TSocio() {
    }

    public String getApeNom() {
        return apeNom;
    }

    public void setApeNom(String apeNom) {
        this.apeNom = apeNom;
    }

    public String getNroDNI() {
        return nroDNI;
    }

    public void setNroDNI(String nroDNI) {
        this.nroDNI = nroDNI;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}
