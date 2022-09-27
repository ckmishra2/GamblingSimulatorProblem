package gambling.simulator;

class Gambler {
	int stake;
	int profit;

	Gambler() {
		this.stake = 100;
		this.profit = 0;
	}

	// start playing
	void play() {
		int outcome = (int) (Math.floor(Math.random() * 10) % 2);
		switch (outcome) {
		case 0:
			System.out.println("You loose this game !  ");
			break;
		case 1:
			System.out.println(
					"You can start the game \nBut you can invest maximum 100$ in a day \nAnd bet $1 everygame");
			break;
		}
	}
}

public class GamblingSimulator {
	public static void main(String[] args) {
		Gambler player = new Gambler();
		player.play();
	}
}
