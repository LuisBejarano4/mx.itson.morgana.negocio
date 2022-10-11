/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.morgana.negocio;

import java.util.ArrayList;
import java.util.List;

public class MxItsonMorganaNegocio {

    public static void main(String[] args) {
        
        List<String> pasosCompra;
        pasosCompra = new ArrayList<>();
        
        pasosCompra.add("----PASOS----");
        pasosCompra.add("1.- Ingresar a la pagina y registrarse en caso de no tener cuenta.");
        pasosCompra.add("2.- Seleccionar el articulo que desee adquirir.");
        pasosCompra.add("----METODO DE PAGO----");
        pasosCompra.add("1.- Seleccione el numero de articulos que desea comprar y su direccion");
        pasosCompra.add("2.- agregue al carrito y seleccione el metodo de pago. ");
        pasosCompra.add("----CONFIRMACION DE COMPRA Y ENVIO----");
        pasosCompra.add("1.- Confirme su pago y espere a que su producto sea enviado a su domicilio.");

        

        for(String n: pasosCompra) 
            System.out.println(n);
    }
}
                
                        
        
      
    
    

