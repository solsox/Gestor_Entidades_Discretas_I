package Estructuras;

public class ListaEnlazada<T> {

    private Nodo<T> cabeza;

    public void agregar(T d) {
        Nodo<T> nuevo = new Nodo<>(d);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo<T> aux = cabeza;
            while (aux.sig != null) aux = aux.sig;
            aux.sig = nuevo;
        }
    }

    public T obtener(int i) {
        Nodo<T> aux = cabeza;
        int cont = 0;
        while (aux != null) {
            if (cont == i) return aux.dato;
            aux = aux.sig;
            cont++;
        }
        return null;
    }

    public T buscar(T d) {
        Nodo<T> aux = cabeza;
        while (aux != null) {
            if (aux.dato.equals(d)) return aux.dato;
            aux = aux.sig;
        }
        return null;
    }

    public T eliminar(T d) {
        if (cabeza == null) return null;

        if (cabeza.dato.equals(d)) {
            T borrado = cabeza.dato;
            cabeza = cabeza.sig;
            return borrado;
        }

        Nodo<T> aux = cabeza;
        while (aux.sig != null) {
            if (aux.sig.dato.equals(d)) {
                T borrado = aux.sig.dato;
                aux.sig = aux.sig.sig;
                return borrado;
            }
            aux = aux.sig;
        }
        return null;
    }
}