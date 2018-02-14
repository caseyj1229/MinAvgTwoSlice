import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinAvgTwoSliceTest {
    @Test
    void solution() {
        int[] A = {4,2,2,5,1,5,8};
        assertEquals(1,MinAvgTwoSlice.solution(A));

        int[] B = {10,10,1,2,10,10,10};
        assertEquals(2,MinAvgTwoSlice.solution(B));

        int[] C = {9,9,9,9,9,9,9,9,1,2};
        assertEquals(8,MinAvgTwoSlice.solution(C));

        int[] D = {2,2,2,2,2,2,2,2,2};
        assertEquals(0,MinAvgTwoSlice.solution(D));

        int[] E = {3,2,1,3,2,1,4};
        assertEquals(1,MinAvgTwoSlice.solution(E));
    }
}