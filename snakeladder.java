public class snakeladder{
 	static final int initialPosition = 0;
 	public static void main(String[]args){
  	System.out.println("****Welcome to snakeLadder simulation****");
  	System.out.println("snake&ladder start with single player at start pos : " + initialPosition);
	int rollDice =(int) Math.floor(Math.random()*6+1);
  	System.out.println("player roll a dice: " + rollDice);
    }
}
