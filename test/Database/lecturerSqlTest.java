package Database;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class lecturerSqlTest {
    lecturerSql obje = new lecturerSql();

    @Before
    public void beforeTest() {
        obje.isConnected();
    }

    @Test(expected = Exception.class)
    public void printAllAbsWithCourseID() throws Exception {
        obje.printAllAbsWithCourseID("assaddsadsadassdaqwdsdaqwd");
    }

    @Test(expected = Exception.class)
    public void editAbsentingFalse() throws Exception {
        obje.editAbsenting("2018002", "se 320", "115");
    }

    @Test
    public void editAbsentingTrue() throws Exception {
        obje.editAbsenting("2018002", "se 320", "11");
    }

}