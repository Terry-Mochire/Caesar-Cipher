package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EncodingTest {
    Encoding testEncoding = new Encoding();
    @Test
    public void setPlaintext_enterLetter_String(){
        assertEquals(true, testEncoding instanceof Encoding);
    }

    @Test
    public void setPlaintext_savesInputText_String(){
        assertEquals("USERINPUT", testEncoding.setPlaintext("UserInput"));
    }

    @Test
    public void getPlainText_returnsInputText_String(){
        assertEquals("", testEncoding.getPlaintext());
    }


}
