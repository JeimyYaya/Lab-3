package edu.eci.cvds.tdd.library.user;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testUserCreation() {
        User user = new User();
        user.setName("John Doe");
        user.setId("12345");

        assertEquals("John Doe", user.getName());
        assertEquals("12345", user.getId());
    }

    @Test
    public void testSetName() {
        User user = new User();
        user.setName("Alice");

        assertEquals("Alice", user.getName());
    }

    @Test
    public void testSetId() {
        User user = new User();
        user.setId("98765");

        assertEquals("98765", user.getId());
    }

    @Test
    public void testDefaultValues() {
        User user = new User();

        assertNull(user.getName());
        assertNull(user.getId());
    }
}
