package homework_module_5.JUnit_tasks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseTest {
    private Database database;

    @BeforeEach
    public void setUp() {
        database = new Database();
    }

    @AfterEach
    public void tearDown() {
        database = null;
    }

    @Test
    public void testConnect() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "myusername";
        String password = "mypassword";

        database.connect(url, username, password);
        assertTrue(database.getConnection().isValid(1));
    }

    @Test
    public void testDisconnect() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "myusername";
        String password = "mypassword";

        database.connect(url, username, password);
        database.disconnect();
        assertTrue(database.getConnection().isClosed());
    }
}