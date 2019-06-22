import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LetterConvertTest {
    @Test
    public void testConvert1(){
        int [] inputData = {0, 2, 3};

        LetterConvert lc = new LetterConvert();
        List<String> resultList = lc.convertLetter(inputData);
        Collections.sort(resultList);

        ArrayList<String> assertResult = new ArrayList<String>();
        assertResult.add("ad");assertResult.add("ae");assertResult.add("af");
        assertResult.add("bd");assertResult.add("be");assertResult.add("bf");
        assertResult.add("cd");assertResult.add("ce");assertResult.add("cf");
        Collections.sort(assertResult);
        assertEquals(assertResult, resultList);
    }

    @Test
    public void testConvert2(){
        int [] inputData = {9};

        LetterConvert lc = new LetterConvert();
        List<String> resultList = lc.convertLetter(inputData);
        Collections.sort(resultList);

        ArrayList<String> assertResult = new ArrayList<String>();
        assertResult.add("w");assertResult.add("x");assertResult.add("y");
        assertResult.add("z");
        Collections.sort(assertResult);

        assertEquals(assertResult, resultList);
    }

    @Test
    public void testConvert3(){
        int [] inputData = {-1, 100};

        LetterConvert lc = new LetterConvert();
        List<String> resultList = lc.convertLetter(inputData);

        assertEquals(0, resultList.size());
    }

    @Test
    public void testConvert4(){
        int [] inputData = { 22, 3};

        LetterConvert lc = new LetterConvert();
        List<String> resultList = lc.convertLetter(inputData);
        Collections.sort(resultList);

        ArrayList<String> assertResult = new ArrayList<String>();
        assertResult.add("ad");assertResult.add("ae");assertResult.add("af");
        assertResult.add("bd");assertResult.add("be");assertResult.add("bf");
        assertResult.add("cd");assertResult.add("ce");assertResult.add("cf");
        Collections.sort(assertResult);

        assertEquals(assertResult, resultList);
    }

}
