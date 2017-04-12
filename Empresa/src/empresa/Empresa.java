/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.Scanner;

/**
 *
 * @author tatan
 */
public class Empresa {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int resp = 1;
      int rr;
      String nombre;
      Scanner leer = new Scanner(System.in);
      Factura miFactura = new Factura();
      Bodega miBodega = new Bodega();
      do{
        System.out.println("desea agregar productos");
        System.out.println("1.-Si");
        System.out.println("2.-No");
        resp = leer.nextInt();
        
        Producto miProducto = new Producto();
          System.out.println("ingrese codigo");
          rr= leer.nextInt();
          leer.nextLine();
          miProducto.setCodigo(rr);
          System.out.println("ingrese nombre");
          nombre = leer.nextLine();
          
          miProducto.setNombre(nombre);
          System.out.println(miProducto.getCodigo());
          System.out.println(miProducto.getNombre());
          miFactura.insertador(miProducto);
      }while (resp == 1);
        
        miBodega.recibirFactura(miFactura);
      
      
    }
    
}
