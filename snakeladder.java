public class snakeladder{
 	static final int initialPosition = 0;
 	public static void main(String[]args){
  	System.out.println("****Welcome to snakeLadder simulation****");
  	int numberOfPosition=0;
  	int playPosition=0;
  	int rollDice =(int) Math.floor(Math.random()*6+1);
  	int checkForOption=(int) Math.floor(Math.random()*10)%3;

  	switch(checkForOption){
     		case 1:
      			System.out.println("Ladder");
      			playPosition=playPosition+rollDice;
      			System.out.println("play position : " + playPosition);
      			break;
     		case 2:
      			System.out.println("Snake");
      			playPosition=playPosition-rollDice;
      			System.out.println("play position : " + playPosition);
      			break;
     		default:
      			System.out.println("No Play");
    }
}
