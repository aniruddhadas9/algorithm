package com.candifood.test.testCases.string;

import com.candifood.string.StringCompair;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCompairTest {

    @Test
    public void compairStringByEqualsOperator() {
        StringCompair stringCompair = new StringCompair();
        assertEquals("\"abd\" == \"abc\" =>", true, stringCompair.compairStringByEqualsOperator());
        assertEquals("\"abd\".equals(\"abc\") =>", true, stringCompair.compairStringByEqualsMethod());
        assertEquals("new String(\"abc\") == \"abc\" =>", false, stringCompair.compairStringLiteralWithStringObjectByEqualsOperator());
        assertEquals("new String(\"abc\").equals(\"abc\") =>", true, stringCompair.compairStringLiteralWithStringObjectByEqualsMethod());
    }
}
