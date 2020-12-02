import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Tests {
    RepeatedChars repeatedChars = new RepeatedChars();

    @Test
    public void checkIfFunctionWorksProperlyWithCorrectInput(){
        String s = "aaascaapp1124df4==";
        assertEquals("14=ap", new String(repeatedChars.getRepeatedChars(s)));
    }

    @Test
    public void checkWhatIfSizeOfStringIs1() throws WrongInputException{
        String s = "a";

        try {
            repeatedChars.getRepeatedChars(s);
            Assert.fail("Expected WrongInputException");
        } catch (WrongInputException thrown) {
            Assert.assertEquals("size of string is 1 or less", thrown.getMessage());
        }

    }

    @Test
    public void checkWhatIfSizeOfStringIs0() throws WrongInputException{
        String s = "";

        try {
            repeatedChars.getRepeatedChars(s);
            Assert.fail("Expected WrongInputException");
        } catch (WrongInputException thrown) {
            Assert.assertEquals("size of string is 1 or less", thrown.getMessage());
        }

    }

    @Test
    public void checkIfCharsDontRepeat() throws WrongInputException{
        String s = "abcdefg";

        try {
            repeatedChars.getRepeatedChars(s);
            Assert.fail("Expected WrongInputException");
        } catch (WrongInputException thrown) {
            Assert.assertEquals("there are no repeating chars in given string", thrown.getMessage());
        }
    }


}
