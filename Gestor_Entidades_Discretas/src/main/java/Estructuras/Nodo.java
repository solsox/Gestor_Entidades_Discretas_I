package Estructuras;

public class Nodo<T> {
    public T dato;
    public Nodo<T> sig;

    public Nodo(T contenido) {
        this.dato = contenido;
        this.sig = null;
    }
}