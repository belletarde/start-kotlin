package exercises

import org.junit.Assert
import org.junit.Test

class ManyParamTest {

    @Test fun sumAllaParameters() {
        Assert.assertEquals(19, sumAllParameters(5,5, true,"",3,7, -1))
    }
}