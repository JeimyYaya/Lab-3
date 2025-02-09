package edu.eci.cvds.tdd.library.book;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testBookConstructorAndGetters() {
        Book book = new Book("The Catcher in the Rye", "J.D. Salinger", "978-0-316-76948-0");

        assertEquals("The Catcher in the Rye", book.getTitle());
        assertEquals("J.D. Salinger", book.getAuthor());
        assertEquals("978-0-316-76948-0", book.getIsbn());
    }

    @Test
    void testBookEquality() {
        Book book1 = new Book("1984", "George Orwell", "123-456-789");
        Book book2 = new Book("1984", "George Orwell", "123-456-789");
        Book book3 = new Book("Animal Farm", "George Orwell", "987-654-321");

        assertEquals(book1, book2); // Deben ser iguales porque tienen el mismo ISBN
        assertNotEquals(book1, book3); // Deben ser diferentes porque tienen distinto ISBN
    }

    @Test
    void testBooksEqualityWithSameIsbn() {
        Book book1 = new Book("1984", "George Orwell", "123-456-789");
        Book book2 = new Book("Animal Farm", "George Orwell", "123-456-789");  // Mismo ISBN
        assertEquals(book1, book2);  // Esto pasará porque el ISBN es el mismo
    }

    @Test
    void testBooksInequalityWithDifferentIsbn() {
        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", "987-654-321");
        Book book2 = new Book("The Lord of the Rings", "J.R.R. Tolkien", "111-222-333");  // Diferente ISBN
        assertNotEquals(book1, book2);  // Esto pasará porque los ISBN son diferentes
    }
}

