import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class changeComputationJUnitTest {
    @Test
    void testUsdToEuroConversion(){
        assertEquals(112.64, ChangeComputation.convertUSDtoEuro(120));
        assertEquals(938.59, ChangeComputation.convertUSDtoEuro(1000));
        assertEquals(37595.81, ChangeComputation.convertUSDtoEuro(40056.02));
        assertEquals(1.89, ChangeComputation.convertUSDtoEuro(2));
        assertEquals(115873.42, ChangeComputation.convertUSDtoEuro(123456));
        assertEquals(199092.67, ChangeComputation.convertUSDtoEuro(212121));
        assertEquals(375.44, ChangeComputation.convertUSDtoEuro(400));
        assertEquals(0, ChangeComputation.convertUSDtoEuro(0));
        assertEquals(521433.15, ChangeComputation.convertUSDtoEuro(555555)); //
        assertEquals(115.88, ChangeComputation.convertUSDtoEuro(123.45));
        assertEquals(92699.33, ChangeComputation.convertUSDtoEuro(98765.43));
        assertEquals(11.38, ChangeComputation.convertUSDtoEuro(12.11));
        assertEquals(11.27, ChangeComputation.convertUSDtoEuro(12.000));
        assertEquals(9385.91, ChangeComputation.convertUSDtoEuro(10000.1));
        assertEquals(2.12, ChangeComputation.convertUSDtoEuro(2.25));


    }

    @Test
    void testComputeChange(){
        assertEquals(0, ChangeComputation.computeChange(50000.00, (50000.00)));
        assertEquals(20, ChangeComputation.computeChange(120, (140)));
        assertEquals(1506.01, ChangeComputation.computeChange(58493.99, (60000)));
        assertEquals(1.01, ChangeComputation.computeChange(20.99, (22)));
        assertEquals(80.79, ChangeComputation.computeChange(319.21, (400)));
        assertEquals(184849, ChangeComputation.computeChange(515151, (700000)));
        assertEquals(0.01, ChangeComputation.computeChange(49.99, (50)));
        assertEquals(7, ChangeComputation.computeChange(3, (10)));
        assertEquals(9999.48, ChangeComputation.computeChange(120000.52, (130000)));
        assertEquals(42.23, ChangeComputation.computeChange(657.77, (700)));
        assertEquals(300.25, ChangeComputation.computeChange(200, (500.25)));
        assertEquals(0.46, ChangeComputation.computeChange(3002.55, (3003.01)));
        assertEquals(96.5, ChangeComputation.computeChange(2304, (2400.50)));
        assertEquals(80.49, ChangeComputation.computeChange(120.50, (200.99)));
        assertEquals(30.23, ChangeComputation.computeChange(369.77, (400)));




    }

    @Test
    void testBillsBack(){
        assertEquals("Twenties: " + 6+ "\nTens: " + 0 + "\nFives: " +0+ "\nOnes: " +0+ "\nQuarters: "+ 0 + "\nDimes: " + 0
                + "\nNickles: " + 0 + "\nPennies: " + 0, ChangeComputation.getBillsBack(120));
        assertEquals("Twenties: " + 7+ "\nTens: " + 0 + "\nFives: " +0+ "\nOnes: " +4+ "\nQuarters: "+ 1 + "\nDimes: " + 1
                + "\nNickles: " + 1 + "\nPennies: " + 4, ChangeComputation.getBillsBack(144.45));
        assertEquals("Twenties: " + 10+ "\nTens: " + 0 + "\nFives: " +0+ "\nOnes: " +0+ "\nQuarters: "+ 2 + "\nDimes: " + 0
                + "\nNickles: " + 0 + "\nPennies: " + 0, ChangeComputation.getBillsBack(200.50));
        assertEquals("Twenties: " + 150+ "\nTens: " + 0 + "\nFives: " +0+ "\nOnes: " +0+ "\nQuarters: "+ 0 + "\nDimes: " + 0
                + "\nNickles: " + 0 + "\nPennies: " + 0, ChangeComputation.getBillsBack(3000));
        assertEquals("Twenties: " + 175+ "\nTens: " + 0 + "\nFives: " +0+ "\nOnes: " +0+ "\nQuarters: "+ 1 + "\nDimes: " + 0
                + "\nNickles: " + 0 + "\nPennies: " + 0, ChangeComputation.getBillsBack(3500.25));
        assertEquals("Twenties: " + 0+ "\nTens: " + 1 + "\nFives: " +0+ "\nOnes: " +0+ "\nQuarters: "+ 0 + "\nDimes: " + 0
                + "\nNickles: " + 0 + "\nPennies: " + 0, ChangeComputation.getBillsBack(10));
        assertEquals("Twenties: " + 1+ "\nTens: " + 1 + "\nFives: " +1+ "\nOnes: " +0+ "\nQuarters: "+ 1 + "\nDimes: " + 0
                + "\nNickles: " + 0 + "\nPennies: " + 0, ChangeComputation.getBillsBack(35.25));
        assertEquals("Twenties: " + 5+ "\nTens: " + 0 + "\nFives: " +0+ "\nOnes: " +0+ "\nQuarters: "+ 2 + "\nDimes: " + 0
                + "\nNickles: " + 1 + "\nPennies: " + 4, ChangeComputation.getBillsBack(100.59));
        assertEquals("Twenties: " + 111+ "\nTens: " + 0 + "\nFives: " +1+ "\nOnes: " +0+ "\nQuarters: "+ 3 + "\nDimes: " + 2
                + "\nNickles: " + 0 + "\nPennies: " + 3, ChangeComputation.getBillsBack(2225.99));
        assertEquals("Twenties: " + 6+ "\nTens: " + 0 + "\nFives: " +0+ "\nOnes: " +0+ "\nQuarters: "+ 0 + "\nDimes: " + 0
                + "\nNickles: " + 0 + "\nPennies: " + 1, ChangeComputation.getBillsBack(120.01));
        assertEquals("Twenties: " + 22+ "\nTens: " + 1 + "\nFives: " +1+ "\nOnes: " +1+ "\nQuarters: "+ 3 + "\nDimes: " + 0
                + "\nNickles: " + 0 + "\nPennies: " + 3, ChangeComputation.getBillsBack(456.78));
        assertEquals("Twenties: " + 450+ "\nTens: " + 0 + "\nFives: " +0+ "\nOnes: " +0+ "\nQuarters: "+ 3 + "\nDimes: " + 1
                + "\nNickles: " + 1 + "\nPennies: " + 1, ChangeComputation.getBillsBack(9000.91));
        assertEquals("Twenties: " + 2+ "\nTens: " + 0 + "\nFives: " +1+ "\nOnes: " +3+ "\nQuarters: "+ 2 + "\nDimes: " + 0
                + "\nNickles: " + 1 + "\nPennies: " + 0, ChangeComputation.getBillsBack(48.55));
        assertEquals("Twenties: " + 4+ "\nTens: " + 1 + "\nFives: " +0+ "\nOnes: " +2+ "\nQuarters: "+ 3 + "\nDimes: " + 0
                + "\nNickles: " + 0 + "\nPennies: " + 2, ChangeComputation.getBillsBack(92.77));
        assertEquals("Twenties: " + 3+ "\nTens: " + 0 + "\nFives: " +0+ "\nOnes: " +2+ "\nQuarters: "+ 0 + "\nDimes: " + 1
                + "\nNickles: " + 1 + "\nPennies: " + 0, ChangeComputation.getBillsBack(62.15));


    }

}
