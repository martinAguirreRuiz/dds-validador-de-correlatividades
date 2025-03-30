import java.util.Collections;
import java.util.Set;

public class Materia {

    private Set<Materia> materiasCorrelativas;

    // Constructor para materias con correlativas
    public Materia(Set<Materia> materiasCorrelativas) {
        this.materiasCorrelativas = Set.copyOf(materiasCorrelativas);
    }

    // Constructor para materias sin correlativas
    public Materia() {
        this.materiasCorrelativas = Collections.emptySet();
    }

    public boolean apruebaCorrelativas(Alumno alumno) {
        if (materiasCorrelativas == null || materiasCorrelativas.isEmpty()) {
            return true; // Si no hay correlativas, se consideran aprobadas.
        }

        // Verifica que el alumno haya aprobado todas las materias correlativas.
        return materiasCorrelativas
                .stream()
                .allMatch(alumno::apruebaMateria);
        //.allMatch(materiaCorrelativa -> alumno.apruebaMateria(materiaCorrelativa)); // Esta es otra opción

    }
}
