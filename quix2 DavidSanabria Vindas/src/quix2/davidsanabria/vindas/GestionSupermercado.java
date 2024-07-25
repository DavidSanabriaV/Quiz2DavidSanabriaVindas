package quix2.davidsanabria.vindas;

import javax.swing.JOptionPane;

public class GestionSupermercado {
    //Atributos

    public String nombreSuper;
    public int codigoSuper;
    public String nombreEmpleado;
    public int cedulaEmpleado;

//Solicitud de informacion
    public void SolicitudInformacionSuper(String nombreSuper, int codigoSuper, String nombreEmpleado, int cedulaEmpleado) {
//Solicitud del nombre del supermercado
        nombreSuper = JOptionPane.showInputDialog("Ingrese el nombre del supermercado: ");
//Solicitud del codigo del supermercado
        codigoSuper = Integer.parseInt(JOptionPane.showInputDialog("Escriba el codigo del supermercado: "));
//Solicitud del nombre del encargado
        nombreEmpleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado que realizara la carga: ");
//Solicitud de la cedula del encargado
        cedulaEmpleado = Integer.parseInt(JOptionPane.showInputDialog("Escriba el numero de cedula del empleado que realizara la carga: "));

    }

}
