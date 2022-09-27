package gambling.simulator;

class Gambler {
	int stake;
	int profit;

	Gambler() {
		this.stake = 100;
		this.profit = 0;
	}

	// start playing
	// bet for either win or loose
	// As a gambler if won or lost 50% of the stake,would resign for the day
	void play() {
		while (this.stake < 150 && this.stake > 50) {
			int outcome = (int) (Math.floor(Math.random() * 10) % 2);
			switch (outcome) {
			case 0:
				this.stake -= 1;
				this.profit -= 1;
				System.out.println("You loose this game !  ");
				System.out.println("loss is  " + this.profit);
				break;
			case 1:
				this.stake += 1;
				this.profit += 1;
				System.out.println("You win this game !");
				System.out.println("profit is  " + this.profit);
				break;
			}
		}
		System.out.println("Gambler is resigning for the day \nToday stake is "+ this.stake);
	}
}

public class GamblingSimulator {
	public static void main(String[] args) {
		Gambler player = new Gambler();
		player.play();
	}
}
