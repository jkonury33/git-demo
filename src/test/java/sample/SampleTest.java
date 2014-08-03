package sample;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SampleTest {
    private Sample sample;
    
    @Before
    public void setUp() {
        sample = new Sample();
    }
    
    
    @Test
    public void test_add() throws Exception {
        assertEquals(10, sample.add(5, 5));
    }
}
