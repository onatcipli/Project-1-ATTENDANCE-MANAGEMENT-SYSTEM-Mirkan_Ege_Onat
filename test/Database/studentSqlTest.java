package Database;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class studentSqlTest {
    studentSql obje = new studentSql();

    @Test
    public void seeStatus() {
        assertNotNull("Not null", obje);
    }

    @Test
    public void checkMyFee() {
        assertNotNull("Not null", obje);
    }

    @Test
    public void checkAbsSql() {
        assertNotNull("Not null", obje);
    }
}