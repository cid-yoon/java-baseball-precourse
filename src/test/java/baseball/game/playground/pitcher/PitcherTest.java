package baseball.game.playground.pitcher;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import baseball.ui.impl.TestUiSystem;

class PitcherTest {

	TestUiSystem uiSystem = new TestUiSystem();

	@Test
	@DisplayName("입력 시스템을 통해 전달 받은 숫자를 throwing 메소드를 통해 반환한다")
	void should_throwingNumber_When_InputEvent() {

		// Given
		String makeNumber = "123";
		uiSystem.setGameInput("123");
		Pitcher pitcher = new Pitcher(uiSystem);

		// When
		String pitchNumber = pitcher.throwing();

		// Then
		assertThat(pitchNumber).isEqualTo(makeNumber);
	}

}