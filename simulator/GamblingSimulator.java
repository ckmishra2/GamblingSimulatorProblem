package gambling.simulator;

class Gambler {
	int stake;
	int profit;
	int loose;

	Gambler() {
		this.stake = 100;
		this.profit = 0;
		loose = 0;
	}

	// start playing
	//bet for either win or loose
	void play() {
		int outcome = (int) (Math.floor(Math.random() * 10) % 2);
		switch (outcome) {
		case 0:
			this.stake -= 1;
			this.loose -= 1;
			System.out.println("You loose this game !  ");
			System.out.println("loose is " + this.loose);
			break;
		case 1:
			this.stake += 1;
			this.profit += 1;
			System.out.println("You can start the game \nBut you can invest maximum 100$ in a day \nAnd bet $1 everygame");		
			System.out.println("profit is " + this.profit);
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
