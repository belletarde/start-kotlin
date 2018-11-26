package exercises

import org.junit.Assert
import org.junit.Test

class ExtensionNumberTest {

    @Test fun percentOfNumber() {
        Assert.assertEquals(87.5f, 25.0f.percentOf(350.0f), .01f)
    }
}