package quix2.davidsanabria.vindas;

import javax.swing.JOptionPane;

public class Quix2DavidSanabriaVindas {

    public static void main(String[] args) {
        int cantidad;
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de alimentos a agregar: "));
        Productos arrproductos[][] = new Productos[cantidad - 1][5];
//Llamado a GestionSupermercado
        GestionSupermercado gestion = new GestionSupermercado();
        gestion.SolicitudInformacionSuper("", 0, "", 0);
        //Llamado a Productos
        Productos producto = new Productos(0, "", 0, 0, 0, 0, 0);
        producto.SolicitudInformacionproducto(arrproductos);
        producto.CalculoPrecioBruto();
        producto.CalculoGanancia();
        producto.MuestraDeInformacion();

       

    }

}
