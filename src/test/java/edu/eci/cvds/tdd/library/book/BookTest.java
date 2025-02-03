package edu.eci.cvds.tdd.library.book;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    @Test
    public void testBookCreation() {
        Book book = new Book("Clean Code", "Robert C. Martin", "9780132350884");

        assertEquals("Clean Code", book.getTittle());
        assertEquals("Robert C. Martin", book.getAuthor());
        assertEquals("9780132350884", book.getIsbn());
    }

    @Test
    public void testBooksWithSameIsbnAreEqual() {
        Book book1 = new Book("Effective Java", "Joshua Bloch", "9780134685991");
        Book book2 = new Book("Another Title", "Another Author", "9780134685991");

        assertEquals(book1, book2);
    }

    @Test
    public void testBooksWithDifferentIsbnAreNotEqual() {
        Book book1 = new Book("The Pragmatic Programmer", "Andrew Hunt", "9780201616224");
        Book book2 = new Book("Code Complete", "Steve McConnell", "9780735619678");

        assertNotEquals(book1, book2);
    }

    @Test
    public void testEqualsWithNull() {
        Book book = new Book("Refactoring", "Martin Fowler", "9780201485676");

        assertNotEquals(book, null);
    }

    @Test
    public void testEqualsWithDifferentClass() {
        Book book = new Book("Design Patterns", "Erich Gamma", "9780201633610");

        assertNotEquals(book, "A string object");
    }
}
