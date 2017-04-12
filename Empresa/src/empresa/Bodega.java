/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tatan
 */
public class Bodega {
    private Scanner leer = new Scanner(System.in);
    private ArrayList <Factura> factu;

    public Bodega() {
        this.factu=new ArrayList <Factura>();     
    }

   
    
    public void recibirFactura(Factura factura){
        
        System.out.println("desea aceptar factura");
        System.out.println("1.-Si");
        System.out.println("2.-No");
        
        int resp= leer.nextInt();
        if (resp == 1){
            factu.add(factura);
        
        }else{
            System.out.println("se rechazo factura");
        }
    }
    
    
    
}
