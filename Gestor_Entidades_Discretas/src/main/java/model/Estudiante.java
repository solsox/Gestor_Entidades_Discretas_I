package model;

public class Estudiante {
    private Integer codigo;
    private String nombre;
    private String apellido;
    private String carrera;

    public Estudiante(Integer codigo, String nombre, String apellido, String carrera) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void serCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Estudiante estudiante = (Estudiante) obj;
        return codigo.equals(estudiante.codigo);
    }
}
