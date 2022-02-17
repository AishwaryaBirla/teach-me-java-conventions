package powerpackage;


import org.junit.Test;

public class PowerFinderTest {
    @Test
    public void oneRaisedToOneIsOne() {
        assert PowerFinderTest.calculate(1,1) == 1;
    }

    @Test
    public void twoRaisedToOneIsTwo() {
        assert PowerFinderTest.calculate(2,1) == 2;
    }

    @Test
    public void twoRaisedToTwoIsFour() {
        assert PowerFinderTest.calculate(2, 2) == 4;
    }

    @Test
    public void threeRaisedToTwoIsNine() {
        assert PowerFinderTest.calculate(3, 2) == 9;
    }
}
