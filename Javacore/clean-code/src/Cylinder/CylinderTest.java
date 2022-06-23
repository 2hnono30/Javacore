package Cylinder;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

class CylinderTest {
    @Test
   void testgetVolume0_0(){
        int radius = 0;
        int height = 0;
        double expected = 0;
        double result = Cylinder.getVolume(radius,height);
        Assertions.assertEquals(expected, result);
    }
    @Test
    void testgetVolume1_2(){
        int radius = 1;
        int height = 2;
        double expected = 18.84955592153876;
        double result = Cylinder.getVolume(radius,height);
        Assertions.assertEquals(expected, result);
    }
}
