import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import Database.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        adminSqlTest.class,
        layerMySqlTest.class,
        studentSqlTest.class,
        lecturerSqlTest.class
})
public class testSuite {


}