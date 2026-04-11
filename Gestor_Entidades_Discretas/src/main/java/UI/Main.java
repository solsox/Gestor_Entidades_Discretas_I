package UI;

import gestor.Gestor;
import model.Ciudadano;
import model.Estudiante;
import model.Producto;

public class Main {

    public static void main(String[] args) {

        System.out.println("Prueba ciudadanos");

        Gestor<Ciudadano> gestorCiudadanos = new Gestor<>();

        gestorCiudadanos.agregar(new Ciudadano("111", "Ana", "García"));
        gestorCiudadanos.agregar(new Ciudadano("222", "Carlos", "Lopez"));
        gestorCiudadanos.agregar(new Ciudadano("333", "Maria", "Martínez"));

        Ciudadano c = gestorCiudadanos.obtener(1);
        if (c != null) {
            System.out.println("En posición 1 está: " + c.getCedula());
        } else {
            System.out.println("No hay nada en esa posición");
        }

        Ciudadano busquedaC = gestorCiudadanos.buscar(new Ciudadano("222", "", ""));
        if (busquedaC != null) {
            System.out.println("Sí encontré el ciudadano 222");
        } else {
            System.out.println("No lo encontré");
        }

        gestorCiudadanos.eliminar(new Ciudadano("111", "", ""));
        Ciudadano verificarC = gestorCiudadanos.buscar(new Ciudadano("111", "", ""));
        if (verificarC == null) {
            System.out.println("El ciudadano 111 sí fue eliminado");
        }


        System.out.println("\nAhora estudiantes");

        Gestor<Estudiante> gestorEstudiantes = new Gestor<>();

        gestorEstudiantes.agregar(new Estudiante(1001, "Luis", "Perez", "Ingeniería"));
        gestorEstudiantes.agregar(new Estudiante(1002, "Sofia", "Ramirez", "Medicina"));
        gestorEstudiantes.agregar(new Estudiante(1003, "Diego", "Torres", "Derecho"));

        Estudiante e = gestorEstudiantes.obtener(0);
        if (e != null) {
            System.out.println("Primer estudiante: " + e.getCodigo());
        }

        Estudiante busquedaE = gestorEstudiantes.buscar(new Estudiante(1002, "", "", ""));
        if (busquedaE != null) {
            System.out.println("Encontrado estudiante 1002");
        }

        gestorEstudiantes.eliminar(new Estudiante(1003, "", "", ""));
        if (gestorEstudiantes.buscar(new Estudiante(1003, "", "", "")) == null) {
            System.out.println("El estudiante 1003 ya no está");
        }


        System.out.println("\nProductos");

        Gestor<Producto> gestorProductos = new Gestor<>();

        gestorProductos.agregar(new Producto("P01", "Laptop", 2500000.0));
        gestorProductos.agregar(new Producto("P02", "Mouse", 45000.0));
        gestorProductos.agregar(new Producto("P03", "Teclado", 95000.0));

        Producto p = gestorProductos.obtener(2);
        if (p != null) {
            System.out.println("Producto en posición 2: " + p.getCodigo());
        }

        if (gestorProductos.buscar(new Producto("P01", "", 0)) != null) {
            System.out.println("Producto P01 encontrado");
        }

        gestorProductos.eliminar(new Producto("P02", "", 0));
        if (gestorProductos.buscar(new Producto("P02", "", 0)) == null) {
            System.out.println("El P02 sí se elimino");
        }
    }


}
