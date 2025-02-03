package edu.eci.cvds.tdd.library.loan;

import edu.eci.cvds.tdd.library.book.Book;
import edu.eci.cvds.tdd.library.user.User;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class LoanTest {

    @Test
    public void testLoanCreation() {
        Book book = new Book("Clean Code", "Robert C. Martin", "9780132350884");
        User user = new User();
        user.setName("John Doe");
        user.setId("12345");
        LocalDateTime loanDate = LocalDateTime.now();
        
        Loan loan = new Loan();
        loan.setBook(book);
        loan.setUser(user);
        loan.setLoanDate(loanDate);
        loan.setStatus(LoanStatus.ACTIVE);
        
        assertEquals(book, loan.getBook());
        assertEquals(user, loan.getUser());
        assertEquals(loanDate, loan.getLoanDate());
        assertEquals(LoanStatus.ACTIVE, loan.getStatus());
        assertNull(loan.getReturnDate()); // La fecha de devolución debe ser null inicialmente
    }

    @Test
    public void testSetReturnDate() {
        Loan loan = new Loan();
        LocalDateTime returnDate = LocalDateTime.now().plusDays(7);
        loan.setReturnDate(returnDate);

        assertEquals(returnDate, loan.getReturnDate());
    }

    @Test
    public void testSetStatus() {
        Loan loan = new Loan();
        loan.setStatus(LoanStatus.RETURNED);

        assertEquals(LoanStatus.RETURNED, loan.getStatus());
    }

    @Test
    public void testSetBook() {
        Loan loan = new Loan();
        Book book = new Book("Refactoring", "Martin Fowler", "9780201485676");
        loan.setBook(book);

        assertEquals(book, loan.getBook());
    }

    @Test
    public void testSetUser() {
        Loan loan = new Loan();
        User user = new User();
        user.setName("Alice");
        user.setId("67890");
        loan.setUser(user);

        assertEquals(user, loan.getUser());
    }
}
