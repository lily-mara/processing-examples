import java.util.HashSet;

public class Buttons {
	public static final int API_VERSION = 2;

	public static final char PLAYER_1_START = 's';
	public static final char PLAYER_1_JOYSTICK_UP = 'w';
	public static final char PLAYER_1_JOYSTICK_RIGHT = 'd';
	public static final char PLAYER_1_JOYSTICK_DOWN = 'x';
	public static final char PLAYER_1_JOYSTICK_LEFT = 'a';
	public static final char PLAYER_1_BUTTON_1 = 'r';
	public static final char PLAYER_1_BUTTON_2 = 't';
	public static final char PLAYER_1_BUTTON_3 = 'f';
	public static final char PLAYER_1_BUTTON_4 = 'g';
	public static final char PLAYER_1_BUTTON_5 = 'v';
	public static final char PLAYER_1_BUTTON_6 = 'b';

	public static final char PLAYER_2_START = 'j';
	public static final char PLAYER_2_JOYSTICK_UP = 'u';
	public static final char PLAYER_2_JOYSTICK_RIGHT = 'k';
	public static final char PLAYER_2_JOYSTICK_DOWN = 'm';
	public static final char PLAYER_2_JOYSTICK_LEFT = 'h';
	public static final char PLAYER_2_BUTTON_1 = 'o';
	public static final char PLAYER_2_BUTTON_2 = 'p';
	public static final char PLAYER_2_BUTTON_3 = 'l';
	public static final char PLAYER_2_BUTTON_4 = ';';
	public static final char PLAYER_2_BUTTON_5 = '.';
	public static final char PLAYER_2_BUTTON_6 = '/';

	/**
	 * Return true if the given key is any fight pad button. Does not include
	 * start buttons or joystick directions.
	 *
	 * @param key the character keycode to be tested against
	 */
	public static boolean isAnyButton(char key) {
		return isPlayer1Button(key) || isPlayer2Button(key);
	}

	/**
	 * Return true if the given key is any player's start button.
	 *
	 * @param key the character keycode to be tested against
	 */
	public static boolean isStartButton(char key) {
		return key == PLAYER_1_START || key == PLAYER_2_START;
	}

	/**
	 * Return true if the given key is any direction on any joystick.
	 *
	 * @param key the character keycode to be tested against
	 */
	public static boolean isJoystick(char key) {
		return isPlayer1Joystick(key) || isPlayer2Joystick(key);
	}

	/**
	 * Return true if the given key is a valid buton on the fight pad for player
	 * 1 to press. This does not include the start button.
	 *
	 * @param key the character keycode to be tested against
	 */
	public static boolean isPlayer1Button(char key) {
		return key == PLAYER_1_BUTTON_1 || key == PLAYER_1_BUTTON_2 ||
			key == PLAYER_1_BUTTON_3 || key == PLAYER_1_BUTTON_4 ||
			key == PLAYER_1_BUTTON_5 || key == PLAYER_1_BUTTON_6;
	}

	/**
	 * Return true if the given key is a valid buton on the fight pad for player
	 * 2 to press. This does not include the start button.
	 *
	 * @param key the character keycode to be tested against
	 */
	public static boolean isPlayer2Button(char key) {
		return key == PLAYER_2_BUTTON_1 || key == PLAYER_2_BUTTON_2 ||
			key == PLAYER_2_BUTTON_3 || key == PLAYER_2_BUTTON_4 ||
			key == PLAYER_2_BUTTON_5 || key == PLAYER_2_BUTTON_6;
	}

	/**
	 * Return true if the given key is a valid Joystick direction on the player
	 * 1 joystick.
	 *
	 * @param key the character keycode to be tested against
	 */
	public static boolean isPlayer1Joystick(char key) {
		return key == PLAYER_1_JOYSTICK_LEFT || key == PLAYER_1_JOYSTICK_RIGHT ||
			key == PLAYER_1_JOYSTICK_UP || key == PLAYER_1_JOYSTICK_DOWN;
	}

	/**
	 * Return true if the given key is a valid Joystick direction on the player
	 * 2 joystick.
	 *
	 * @param key the character keycode to be tested against
	 */
	public static boolean isPlayer2Joystick(char key) {
		return key == PLAYER_2_JOYSTICK_LEFT || key == PLAYER_2_JOYSTICK_RIGHT ||
			key == PLAYER_2_JOYSTICK_UP || key == PLAYER_2_JOYSTICK_DOWN;
	}

	/**
	 * Return true if the given key is any valid key for the arcade machine
	 * controller to press.
	 *
	 * @param key the character keycode to be tested against the anyKey set
	 */
	public static boolean isAnyKey(char key) {
		return isPlayer1Key(key) || isPlayer2Key(key);
	}

	/**
	 * Return true if the given key is a valid key for Player 1 to press,
	 * including the joystick and start button.
	 *
	 * @param key the character keycode to be tested against
	 */
	public static boolean isPlayer1Key(char key) {
		return isPlayer1Button(key) || isPlayer1Joystick(key) ||
			key == PLAYER_1_START;
	}

	/**
	 * Return true if the given key is a valid key for Player 2 to press,
	 * including the joystick and start button.
	 *
	 * @param key the character keycode to be tested against
	 */
	public static boolean isPlayer2Key(char key) {
		return isPlayer2Button(key) || isPlayer2Joystick(key) ||
			key == PLAYER_2_START;
	}
}
