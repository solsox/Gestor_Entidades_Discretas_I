package gestor;

import Estructuras.ListaEnlazada;

public class Gestor<T> {

    private ListaEnlazada<T> lista;

    public Gestor() {
        this.lista = new ListaEnlazada<>();
    }

    public void agregar(T elemento) {
        lista.agregar(elemento);
    }

    public T obtener(int indice) {
        return lista.obtener(indice);
    }

    public T buscar(T elemento) {
        return lista.buscar(elemento);
    }

    public T eliminar(T elemento) {
        return lista.eliminar(elemento);
    }
}