
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestDemoJUnitTest {
	private TestDemo testDemo;

	@BeforeEach
	void setUp() throws Exception {
		testDemo = new TestDemo();
	}

	@ParameterizedTest
	@MethodSource("TestDemoJUnitTest#argumentsForAddPositive")

	void assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, boolean expectException ) {
		if(!expectException) {
			assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
		} else {
			assertThatThrownBy(() -> testDemo.addPositive(a, b)).isInstanceOf(IllegalArgumentException.class);
		}	
	}
	@Test
	void assertThatPairsOfPositiveNumbersAreAddedCorrectly() {
		assertThat(testDemo.addPositive(4,5)).isEqualTo(9);
		assertThat(testDemo.addPositive(40,50)).isEqualTo(90);
		assertThat(testDemo.addPositive(30,45)).isEqualTo(75);
		assertThat(testDemo.addPositive(36,49)).isEqualTo(85);
	}
	@Test
	//Subtracts two positive numbers to find a value that remains positive
	void assertThatPairsOfPositiveNumbersAreSubtractedCorrectly() {
		assertThat(testDemo.addPositive(9,5)).isEqualTo(4);
		assertThat(testDemo.addPositive(50,50)).isEqualTo(0);
		assertThat(testDemo.addPositive(90,45)).isEqualTo(45);
		assertThat(testDemo.addPositive(72,49)).isEqualTo(23);
	}
	@Test
	void assertThatNumberSquaredIsCorrect () {
		TestDemo mockDemo = spy(testDemo);
		
		doReturn(5).when(mockDemo).getRandomInt();
		int fiveSquared = mockDemo.randomNumberSquared();
		assertThat(fiveSquared).isEqualTo(25);

	}
	
		
	public static Stream argumentsForAddPositive() {
		arguments(2,4,6,false);
		arguments(2,-2,0,false);
		arguments(0,2,2,false);
		arguments(2,2,5,true);
		Object arguments = null;
		return Stream.of(arguments);
}
}
