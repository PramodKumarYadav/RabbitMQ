import org.junit.jupiter.api.Test;

import java.io.IOException;

public class CommandLineExecutionTest {

    @Test
    public void commandLineTest() throws IOException {
        Runtime.getRuntime().exec("echo 'Hello World'");
    }
}
