import java.util.Collections;
import java.util.Set;

public class Alumno {
    private Set<Materia> materiasAprobadas;

    // Constructor para alumnos con materias aprobadas
    public Alumno(Set<Materia> materiasAprobadas) {
        this.materiasAprobadas = Set.copyOf(materiasAprobadas); // Copia inmutable
    }

    // Constructor para alumnos sin materias aprobadas
    public Alumno() {
        this.materiasAprobadas = Collections.emptySet(); // Set vacío inmutable
    }

    public boolean apruebaMateria(Materia materia){
        return materiasAprobadas.contains(materia);
    }
}
