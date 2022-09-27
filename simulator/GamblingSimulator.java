package gambling.simulator;

class Gambler {
	int stake;
	int profit;
	int countWin, countLoss;

	Gambler() {
		this.stake = 100;
		this.profit = 0;
		this.countLoss=0;
		this.countWin=0;
		
	}

	// start playing
	// bet for either win or loose
	// As a gambler if won or lost 50% of the stake,would resign for the day
	void play() {
		int daysProfit=0;
		this.stake=100;
		while (this.stake < 150 && this.stake > 50) {
			int outcome = (int) (Math.floor(Math.random() * 10) % 2);
			switch (outcome) {
			case 0:
				this.stake -= 1;
				this.profit -= 1;
				daysProfit-=1;
				System.out.println("You loose this game !  ");
				break;
			case 1:
				this.stake += 1;
				this.profit += 1;
				daysProfit+=1;
				System.out.println("You win this game !");
				break;
			}
		}
		System.out.println("Gambler is resigning for the day \nToday stake is "+ this.stake);
		if(daysProfit>0)
		{
			this.countWin++;
			System.out.println("Todays profit is "+ daysProfit);
		}
		if(daysProfit<0)
		{
			this.countLoss++;
			System.out.println("Today loss is "+daysProfit);
		}
	}
}

public class GamblingSimulator {
	public static void main(String[] args) {
		Gambler player = new Gambler();
		//play for a month
		for(int day=0;day<30;day++)
		{
			player.play();
		}
		System.out.println("win "+player.countWin+"\nloss "+player.countLoss);
	}
}
