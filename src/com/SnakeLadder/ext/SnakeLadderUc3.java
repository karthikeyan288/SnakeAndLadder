package com.SnakeLadder.ext;

public class SnakeLadderUc3 {
	public static void main(String[] args) {
		int player = 0;
		int position = 0;
		int snake = 5;
		int ladder = 2;
		int die_random = 0;
		int player_position = 0;
		double die_value = Math.floor(Math.random() * 10) % 6 + 1;
		// die value is between 0 to 6
		System.out.println(die_value);
		switch ((int) die_value) {
		case 0:
			System.out.println("no play");
			die_random = 0;
			break;
		case 2:
			System.out.println("ladder");
			die_random = 2;
		case 3:
			System.out.println("snake");
			die_random = -3;

		default:
			die_random = 0;

			position += die_value;
		}
		System.out.println(position);

	}

}
