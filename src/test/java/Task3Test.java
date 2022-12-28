import org.junit.jupiter.api.Test;
import task3.Authorization;
import task3.Database;
import task3.ReportBuilder;

public class Task3Test {
    @Test
    public void test(){
        Database db = new Database();
        Authorization authorization = new Authorization();
        if (authorization.authorize(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
