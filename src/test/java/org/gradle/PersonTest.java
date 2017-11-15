package org.gradle;

import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void canConstructAPersonWithAName() {
        Person person = new Person("Larry", "SampleComment");
        assertEquals("Larry", person.getTestName());
        assertEquals("SampleComment", person.getTestComment());
    }
}
