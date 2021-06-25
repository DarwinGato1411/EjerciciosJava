/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import ejercicios.entidad.Usuario;
import ejercicios.modelos.DetalleFactura;
import ejercicios.modelos.Factura;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Darwin
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Manejo de objetos");
        Usuario usuario = new Usuario();
        usuario.setId(1);
        usuario.setNombre("Darwin");
        usuario.setPassword("123456");

        System.out.println("ID" + usuario.getId());
        System.out.println("Nombre" + usuario.getNombre());
        System.out.println("COntraseña" + usuario.getPassword());
        System.out.println("USUARIO TOSTRING " + usuario.toString());

//        modelo de fcatura practica
        Factura factura = new Factura();
        factura.setSubtotal(100);
        factura.setIva(12);
        factura.setTotal(112);

        DetalleFactura detalleFactura = new DetalleFactura();
        detalleFactura.setCanitidad(1);
        detalleFactura.setDescripcion("Clavo");
        detalleFactura.setValorunitario(1);
        detalleFactura.setFactura(factura);

        DetalleFactura detalleFactura2 = new DetalleFactura();
        detalleFactura2.setCanitidad(1);
        detalleFactura2.setDescripcion("Clavo2");
        detalleFactura2.setValorunitario(1);
        detalleFactura2.setFactura(factura);

        DetalleFactura detalleFactura3 = new DetalleFactura();
        detalleFactura3.setCanitidad(1);
        detalleFactura3.setDescripcion("Clavo3");
        detalleFactura3.setValorunitario(1);
        detalleFactura3.setFactura(factura);

        System.out.println("detalle 3 " + detalleFactura3.getDescripcion());
        //        Uso de lista

        List<DetalleFactura> listaDetalles = new ArrayList<>();
        listaDetalles.add(detalleFactura);
        listaDetalles.add(detalleFactura2);
        listaDetalles.add(detalleFactura3);
        for (int i = 0; i < listaDetalles.size(); i++) {
            System.out.println("listaDetalles " + i + "  " + listaDetalles.get(i).getDescripcion() + "  " + listaDetalles.get(i).getFactura().getTotal());

        }
//        Crear 10 empresas con el nombre empresa 1, empresa 2 , empres 3 ....10 he imprimir

    }

}
