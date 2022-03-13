import org.junit.jupiter.api.Test;

import java.util.OptionalInt;

import static org.junit.jupiter.api.Assertions.*;
public class MinMaxTest {
    @Test
    void minmax(){
        MinMaxFinder obj=new MinMaxFinder();
        int[]ar={69,65,84,75};
        int[] expected={65,84};
        int[]actual= obj.findMinMax(ar);

        assertArrayEquals(expected,actual);
    }


}
