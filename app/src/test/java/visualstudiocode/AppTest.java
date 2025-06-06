package visualstudiocode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloWorldClassTest {
    @Test void appHasAGreeting() {
        HelloWorldClass classUnderTest = new HelloWorldClass(); // Creating an object of HelloWorldClass
        assertNotNull(classUnderTest.getGreeting());
    }
}
