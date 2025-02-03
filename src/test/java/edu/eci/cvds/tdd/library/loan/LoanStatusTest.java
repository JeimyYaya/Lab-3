package edu.eci.cvds.tdd.library.loan;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoanStatusTest {

    @Test
    public void testLoanStatusValues() {
        LoanStatus[] statuses = LoanStatus.values();
        assertEquals(2, statuses.length);
        assertEquals(LoanStatus.ACTIVE, statuses[0]);
        assertEquals(LoanStatus.RETURNED, statuses[1]);
    }

    @Test
    public void testLoanStatusValueOf() {
        assertEquals(LoanStatus.ACTIVE, LoanStatus.valueOf("ACTIVE"));
        assertEquals(LoanStatus.RETURNED, LoanStatus.valueOf("RETURNED"));
    }
}
