package baseball.game.playground.enums;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SystemCommandTest {

	@ParameterizedTest
	@CsvSource(value = {"input:false", "again:true", "exit:true", "a gain:false", " exit :true"}, delimiter = ':')
	@DisplayName("보유한 명령어와 일치한 문자열 입력시 보유하고 있다는 결과값을 반환한다")
	public void should_containsTrue_When_hasCommandName(String input, boolean condition) {

		// Given
		String command = input.trim().toLowerCase();

		// When
		boolean contains = SystemCommand.contains(command);

		// Then
		assertThat(contains).isEqualTo(condition);
	}

	@ParameterizedTest
	@CsvSource(value = {"again:true", "exit:false"}, delimiter = ':')
	@DisplayName("입력받은 유효한 명령어를 통해 재시작 여부를 판단한다")
	public void should_validCondition_When_canRestartInputCommand(String input, boolean condition) {
		// Given
		String command = input.trim().toLowerCase();

		// When
		boolean canAgain = SystemCommand.canAgain(command);

		// Then
		assertThat(canAgain).isEqualTo(condition);

	}

}