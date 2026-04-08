package model;

public class Ciudadano {
        private String cedula;
        private String nombre;
        private String apellido;

        public Ciudadano(String cedula, String nombre, String apellido) {
            this.cedula = cedula;
            this.nombre = nombre;
            this.apellido = apellido;
        }

        public String getCedula() {
            return cedula;
        }

        public void setCedula(String cedula){
            this.cedula = cedula;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Ciudadano ciudadano = (Ciudadano) obj;
            return cedula.equals(ciudadano.cedula);

        }
}
