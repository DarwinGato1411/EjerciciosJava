/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.modelos;

/**
 *
 * @author Darwin
 */
public class DetalleFactura {

    private Integer canitidad;
    private Integer valorunitario;
    private String descripcion;

    private Factura factura;

    public Integer getCanitidad() {
        return canitidad;
    }

    public void setCanitidad(Integer canitidad) {
        this.canitidad = canitidad;
    }

    public Integer getValorunitario() {
        return valorunitario;
    }

    public void setValorunitario(Integer valorunitario) {
        this.valorunitario = valorunitario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

}
