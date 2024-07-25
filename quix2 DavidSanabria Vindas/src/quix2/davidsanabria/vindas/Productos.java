/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quix2.davidsanabria.vindas;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Productos {

    //Atributos
    public int codigoProducto;
    public String nombreProducto;
    public int cantidad;
    public double precioBase;
    public int tipo;
    public double precioBruto;
    public double ganancia;
    public int cantidadProductos;

    public Productos(int codigoProducto, String nombreProducto, int cantidad, double precioBase, int tipo, double precioBruto, double ganancia) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precioBase = precioBase;
        this.tipo = tipo;
        this.precioBruto = precioBruto;
        this.ganancia = ganancia;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    public void setPrecioBruto(double precioBruto) {
        this.precioBruto = precioBruto;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    //Solicitud de informacion
    public void SolicitudInformacionproducto(Productos arrproductos[][]) {
        //Solicitud del nombre del producto
        for (int i = 0; i < cantidadProductos; i++) {
            codigoProducto = Integer.parseInt(JOptionPane.showInputDialog("Escriba el codigo del producto: "));
            //Solicitud del codigo del producot
            nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto: ");
            //Solicitud de la cantidad
            cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto: "));
            //Solicitud de precio base
            precioBase = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio base del producto: "));
            //Solicitud de tipo de producto
            tipo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si es un alimento \nIngrese 2 si es una bebida\nIngrese 3 si es un producto de higiene\nIngrese 4 si es un producto de limpieza"));
            while (tipo < 1 || tipo > 4) {
                tipo = Integer.parseInt(JOptionPane.showInputDialog("Numero incorrecto\nIngrese 1 si es un alimento \nIngrese 2 si es una bebida\nIngrese 3 si es un producto de higiene\nIngrese 4 si es un producto de limpieza"));
            arrproductos[i] [i]= new Productos(codigoProducto, nombreProducto, cantidad, precioBase, tipo, precioBruto, ganancia);
            }
        }
    }

    //Calcular precio segun el tipo de producto que sea
    public void CalculoPrecioBruto() {
        if (tipo == 1) {
            precioBruto = precioBase * 0.20 + precioBase;
        } else if (tipo == 2) {
            precioBruto = precioBase * 0.30 + precioBase;
        } else if (tipo == 3) {
            precioBruto = precioBase * 0.25 + precioBase + 500;
        } else if (tipo == 4) {
            precioBruto = precioBase * 0.19 + precioBase * 0.04 + 1000 + precioBase;
        }
    }

    //Calculo de ganancia
    public void CalculoGanancia() {
        ganancia = ((precioBruto - precioBase) * cantidad);
    }

    //Muestra de Informacion
    public void MuestraDeInformacion() {
        JOptionPane.showMessageDialog(null, "Se agrego el producto: " + nombreProducto + "\n"
                + "El codigo del producto es: " + codigoProducto + "\n"
                + "La cantidad del producto es: " + cantidad + "\n"
                + "El producto es de tipo: " + tipo + "\n"
                + "El precio base del producto es: " + precioBase + "\n"
                + "La ganancia es de: " + ganancia);

    }

    

}
