package org.ed05_1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GestorJuegosTest {

    // 1. Declaramos la variable para toda la clase
    private GestorJuegos gestor;

    @BeforeEach
    void setUp() {
        // 2. CORRECCIÓN: Quitamos la palabra "GestorJuegos" de aquí.
        // Así le decimos a Java: "Usa la variable gestor que definí arriba".
        gestor = new GestorJuegos();
    }

    @Test
    void Cp_1() {
        String[] codigos = {"J1", "J2"};
        int[] unidadesPorCodigo = {10};
        assertEquals(-1, gestor.registrarLoteJuegos(codigos, unidadesPorCodigo));
    }

    @Test
    void CP_2() {
        String[] codigos = {};
        int[] unidadesPorCodigo = {};
        assertEquals(-1, gestor.registrarLoteJuegos(codigos, unidadesPorCodigo));
    }

    @Test
    void Cp_4() {
        String[] codigos = {"J1"};
        int[] unidadesPorCodigo = {-5};
        assertEquals(-2, gestor.registrarLoteJuegos(codigos, unidadesPorCodigo));
    }

    @Test
    void Cp_5() {
        String[] codigos = {"J1"};
        int[] unidadesPorCodigo = {100000000};
        assertEquals(-3, gestor.registrarLoteJuegos(codigos, unidadesPorCodigo));
    }

    @Test
    void Cp_7() {
        gestor.registrarLoteJuegos(new String[]{"J1"}, new int[]{5});

        String[] codigos = {"J1"};
        int[] unidadesPorCodigo = {10};
        assertEquals(10, gestor.registrarLoteJuegos(codigos, unidadesPorCodigo));
    }

    @Test
    void Cp_8() {
        String[] codigos = {"J2"};
        int[] unidadesPorCodigo = {30};
        assertEquals(30, gestor.registrarLoteJuegos(codigos, unidadesPorCodigo));
    }
}