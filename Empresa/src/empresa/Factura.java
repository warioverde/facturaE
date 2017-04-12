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
public class Factura {
    private int codigo;
    private String descripcion;
    Scanner leer = new Scanner(System.in);
    
    private ArrayList <Producto> productos = new ArrayList <Producto>();
    
    private Bodega bodega;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Bodega getBodega() {
        return bodega;
    }

    public void setBodega(Bodega bodega) {
        this.bodega = bodega;
    }
    

    public void insertador(Producto producto){
            this.productos.add(producto);
            producto.setFactura(this);
    }
    
    
    
    
    
    
}
