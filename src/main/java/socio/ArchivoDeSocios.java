/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author flor
 */
public class ArchivoDeSocios {


public ArrayList leerArchivo(ArrayList<TSocio> listaSocios) {
    try{
        FileReader fr = new FileReader("Socios.txt");
        BufferedReader br = new BufferedReader(fr);
        String d;
        while((d=br.readLine()) !=null){
            StringTokenizer dato = new StringTokenizer(d, "|");
            TSocio s = new TSocio( dato.nextToken(), dato.nextToken(), 
                    dato.nextToken(), dato.nextToken());
            listaSocios.add(s);
        }
  }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
return listaSocios;
}
}



