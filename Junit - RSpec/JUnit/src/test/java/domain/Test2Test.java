
package domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test2Test {

    @Test
    void testAssertEqual() {
        assertEquals("ABC", "ABC");
        assertEquals(20, 20, "optional assertion message");
        assertEquals(2 + 2, 4);
    }

    @Test
    void testAssertFalse() {
        assertFalse("FirstName".length() == 10);
        assertFalse(10 > 20, "assertion message");
    }

    @Test
    void testAssertNull() {
        String str1 = null;
        String str2 = "abc";
        assertNull(str1);
        assertNotNull(str2);
    }

    @Test
    void testAssertAll() {
        String str1 = "abc";
        String str2 = "pqr";
        String str3 = "xyz";
//        assertAll("numbers", // Permite hacer mas de un acerto 
//                () -> assertEquals(str1, "abc"), verdadero
//                () -> assertEquals(str2, "pqr"), verdadero
//                () -> assertEquals(str3, "xyz") verdadero
//        );
        
        assertAll("numbers",
		  () -> assertEquals(str1,"abc"),//verdadero
		  () -> assertEquals(str2,"pqr1"), // falso
		  () -> assertEquals(str3,"xyz1") //falso -> lanzará error
	 );
    }

//    @Test
//    void testAssertTrue() {
//        assertTrue("FirstName".startsWith("F"));
//        assertTrue(10  {
//            throw new IllegalArgumentException("Illegal Argument Exception occured");
//        }
//        );
//	 assertEquals("Illegal Argument Exception occured", exception.getMessage());
//    }

}
