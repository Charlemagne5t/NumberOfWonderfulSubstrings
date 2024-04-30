import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1(){
        String word = "aba";
        long expected = 4;
        long actual = new Solution().wonderfulSubstrings(word);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        String word = "aabb";
        long expected = 9;
        long actual = new Solution().wonderfulSubstrings(word);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        String word = "ehaehcjjaafjdceac";
        long expected = 29;
        long actual = new Solution().wonderfulSubstrings(word);

        Assert.assertEquals(expected, actual);
    }
}
