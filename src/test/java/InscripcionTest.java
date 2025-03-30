import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    Materia am1 = new Materia();
    Materia fisica1 = new Materia();

    Materia am2 = new Materia(Set.of(am1));
    Materia fisica2 = new Materia(Set.of(fisica1));

    Alumno martin = new Alumno();

    @Test
    @DisplayName("Inscripción exitosa porque son materias sin correlativas")
    public void InscripcionExitosa() {

        Inscripcion inscripcion = new Inscripcion(martin, Set.of(am1, fisica1));

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    @DisplayName("Inscripción fallida porque son materias con correlativas y alumno sin materias aprobadas")
    public void InscripcionFallida() {
        Inscripcion inscripcion = new Inscripcion(martin, Set.of(am2, fisica2));

        Assertions.assertFalse(inscripcion.aprobada());
    }

}