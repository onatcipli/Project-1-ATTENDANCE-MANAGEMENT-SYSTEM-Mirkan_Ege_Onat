package Database;

import org.junit.Test;

import static org.junit.Assert.*;

public class layerMySqlTest {
    @Test
    public void connect() {
    }

    @Test
    public void checkAndConnect() {
    }

    @Test
    public void isValid() throws Exception {
        layerMySql obje = new layerMySql();


        assertEquals("Incorrect Password for Admin", "a", obje.isValid("admin","admin"));
        assertNotSame("Incorrect Password for admin", "x", obje.isValid("admin","admin"));


        assertEquals("Incorrect Password for Teacher", "t", obje.isValid("teacher","teacher"));
        assertNotSame("Incorrect Password for Teacher", "x", obje.isValid("teacher","teacher"));

        assertEquals("Incorrect Password for admin", "s", obje.isValid("student","student"));
        assertNotSame("Incorrect Password for Teacher", "x", obje.isValid("student","student"));

        assertNotSame("Incorrect Password for Teacher", "t", obje.isValid("asdqwdas","asdasdasd"));
        assertNotSame("Incorrect Password for Teacher", "s", obje.isValid("asdasdasd","asdasdasd"));
        assertNotSame("Incorrect Password for Teacher", "a", obje.isValid("asdasdasd","asdasdasd"));


        assertNotSame("Incorrect Password for Teacher", "t", obje.isValid("admin","admin"));
        assertNotSame("Incorrect Password for Teacher", "a", obje.isValid("teacher","teacher"));
        assertNotSame("Incorrect Password for Teacher", "s", obje.isValid("admin","admin"));



    }
}