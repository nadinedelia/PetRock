import org.junit.Test;

import static org.junit.Assert.*;

public class PetRockTest {

    @Test
    public void getName() throws Exception {
        PetRock rocky = new PetRock("Rocky");
        assertEquals("Rocky", rocky.getName());
    }

    @Test
    public void testHappy() throws Exception {
        PetRock rocky = new PetRock("Rocky");
        assertFalse(rocky.isHappy());
    }

}