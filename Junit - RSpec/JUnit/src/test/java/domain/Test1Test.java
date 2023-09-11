package domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

public class Test1Test {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Se ejecutara antes de todo los metodos de clase");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Se ejecutara antes de cada metodo de clase");
    }

    @Test
    void testMethod1() {
        System.out.println("Metodo test 1");
    }

    @DisplayName("Nombre de Test2")
    @Test
    void testMethod2() {
        System.out.println("Metodo test 2");
    }

    @Test
    @Disabled("Metodo de test pendiente")
    void testMethod3() {
        System.out.println("Metodo test 1");
    }

    @AfterEach
    void afterEach() {
        System.out.println("Se ejecuta despues de cada metodo");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Se ejecutara al final, despues de todo los metodos de prueba");
    }

}
