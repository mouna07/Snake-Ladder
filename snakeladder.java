public class snakeladder{
 	static final int initialPosition = 0;
    	static final int winingPosition = 100;
    	static final int ladder = 1;
    	static final int snake = 2;

    	public static void main(String[] args) {
        	System.out.println("Welcome to snakeLadder simulation");
        	int playPosition = 0;
        	boolean validation = true;
        	while (validation) {
            		int rollDice = (int) Math.floor(Math.random() * 6 + 1);
            		int checkForOption = (int) Math.floor(Math.random() * 10) % 3;
            		if (checkForOption == ladder) {
                		playPosition = playPosition + rollDice;
            		}
			else if (checkForOption == snake) {
                		playPosition = playPosition - rollDice;
                		if(playPosition<0){
                    			playPosition=initialPosition;
                	}
            	}
                if (playPosition == winingPosition) {
                	System.out.println("win");
                	break;
            	}

        }

    }
}
