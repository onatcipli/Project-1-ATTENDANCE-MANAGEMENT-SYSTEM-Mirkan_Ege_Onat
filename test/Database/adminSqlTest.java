package Database;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class adminSqlTest {
    adminSql obje = new adminSql();

    @Before
    public void beforeTest() {
        obje.isConnected();
    }


    @Test(expected = Exception.class, timeout = 1)
    public void insertStudent() throws Exception {
        String[] x = new String[10];
        obje.insertStudent(x);
        assertNull(obje);

    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void insertTeacher() {
        String[] x = new String[5];
        obje.insertTeacher(x);
        assertNull(obje);
    }

}