package edu.eci.cvds.tdd.library;

import edu.eci.cvds.tdd.library.book.Book;
import edu.eci.cvds.tdd.library.loan.Loan;
import edu.eci.cvds.tdd.library.loan.LoanStatus;
import edu.eci.cvds.tdd.library.user.User;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    private Library library;
    private Book book1, book2;
    private User user1, user2;

    @BeforeEach
    void setUp() {
        library = new Library();
        book1 = new Book("The Hobbit", "J.R.R. Tolkien", "12345");
        book2 = new Book("1984", "George Orwell", "67890");
        user1 = new User();
        user1.setName("Alice");
        user1.setId("U001");
        user2 = new User();
        user2.setName("Bob");
        user2.setId("U002");
    }

    @Test
    void testAddBook() {
        assertTrue(library.addBook(book1));
        assertTrue(library.addBook(book1)); 
    }

    @Test
    void testLoanABookSuccessfully() {
        library.addUser(user1);
        library.addBook(book1);

        Loan loan = library.loanABook("U001", "12345");

        assertNotNull(loan);
        assertEquals(user1, loan.getUser());
        assertEquals(book1, loan.getBook());
        assertEquals(LoanStatus.ACTIVE, loan.getStatus());
    }

    @Test
    void testLoanFailsWhenBookNotAvailable() {
        library.addUser(user1);

        Loan loan = library.loanABook("U001", "12345");

        assertNull(loan);
    }

    @Test
    void testLoanFailsWhenUserDoesNotExist() {
        library.addBook(book2);
        
        Loan loan = library.loanABook("U999", "12345");

        assertNull(loan);
    }

    @Test
    void testReturnLoan() {
        library.addUser(user1);
        library.addBook(book1);
        Loan loan = library.loanABook("U001", "12345");

        Loan returnedLoan = library.returnLoan(loan);

        assertNotNull(returnedLoan);
        assertEquals(LoanStatus.RETURNED, returnedLoan.getStatus());
        assertNotNull(returnedLoan.getReturnDate());
    }
}

