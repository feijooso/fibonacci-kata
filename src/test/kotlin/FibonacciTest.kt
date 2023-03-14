import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class FibonacciTest {

    @Test
    fun `fibonacci of 0 is 0`() {
        assertThat(fib(0)).isEqualTo(0)
    }

    @Test
    fun `fibonacci of 1 is 1`() {
        assertThat(fib(1)).isEqualTo(1)
    }

    @ParameterizedTest
    @CsvSource(
        "2,1",
        "3,2",
        "4,3",
        "15,610",
    )
    fun `fibonacci of a number is the sum of the previous two numbers`(steps: Int, result: Int) {
        assertThat(fib(steps)).isEqualTo(result)
    }

}
