import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CamelCaseTest {
    private CamelCase camelCase;

    @Before
    public void startCamelCase(){
        this.camelCase = new CamelCase();
    }

    @Test
    public void CamelCaseCallEmpty(){
        assertNull(this.camelCase.receivedText);
    }

    @Test
    public void CamelCaseComvert(){
        this.camelCase.receivedText = "ConvertThisStrings";
        this.camelCase.convert();
        assertEquals("convert this strings", this.camelCase.convertedText);
    }
}
