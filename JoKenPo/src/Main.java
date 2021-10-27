import java.util.Random;	
import java.util.Scanner;

public class Main {
	
	public static int Pscore;
	public static int Cscore;
	public static int num_rounds=1;
	public static int max_rounds;
	public static Scanner typeMe = new Scanner(System.in);
	public static Random randomGen = new Random();
	
	public static void main(String[] args) {
	
		System.out.println("Type the number of rounds you wish to play:");
		System.out.println("0 = Infinite Rounds");
		max_rounds = typeMe.nextInt();
	    mainGame();
	}
	
		
	public static void mainGame() {
		
		System.out.printf("---=ROUND %s=---\n",num_rounds);
		System.out.println("Make your move! Type 1, 2 or 3;");
		System.out.println("1 - Rock");
		System.out.println("2 - Paper");
		System.out.println("3 - Scissors");
		System.out.println("0 - End Game");
		byte playerMove = typeMe.nextByte();
		byte comMove = (byte) (randomGen.nextInt(3)+1);
		
		if(playerMove==1) {
        	if(comMove==1) {
        		System.out.println("You drew ROCK"); 
        		System.out.println("CPU drew ROCK");
        		System.out.println("<< Round Draw >>");
        		checkRounds();
        	} else if(comMove==2) {
        		System.out.println("You drew ROCK"); 
        		System.out.println("CPU drew PAPER");
        		System.out.println("<< +1 CPU Score >>");
        		Cscore++;
        		checkRounds();
        	} else if(comMove==3) {
        		System.out.println("You drew ROCK"); 
        		System.out.println("CPU drew SCISSORS");
        		System.out.println("<< +1 Player Score :) >>");
        		Pscore++;
        		checkRounds();
        	} 
        } else if(playerMove==2)  {
            	if(comMove==1) {
            		System.out.println("You drew PAPER");
            		System.out.println("CPU drew ROCK");
            		System.out.println("<< +1 Player Score :) >>");
            		Pscore++;
            		checkRounds();
            	} else if(comMove==2) {
            		System.out.println("You drew PAPER");
            		System.out.println("CPU drew PAPER");
            		System.out.println("<< Round Draw >>");
            		checkRounds();
            	} else if(comMove==3) {
            		System.out.println("You drew PAPER");
            		System.out.println("CPU drew SCISSORS");
            		System.out.println("<< +1 CPU Score >>");
            		Cscore++;
            		checkRounds();
            	}
            } else if(playerMove==3)  {
            	if(comMove==1) {
            		System.out.println("You drew SCISSORS");
            		System.out.println("CPU drew ROCK");
            		System.out.println("<< +1 CPU Score >>");
            		Cscore++;
            		checkRounds();
            	} else if(comMove==2) {
            		System.out.println("You drew SCISSORS");
            		System.out.println("CPU drew PAPER");
            		System.out.println("<< +1 Player Score :) >>");
            		Pscore++;
            		checkRounds();
            	} else if(comMove==3) {
            		System.out.println("You drew SCISSORS");
            		System.out.println("CPU drew SCISSORS");
            		System.out.println("<< Round Draw >>");
            		checkRounds();
            	}
            } else if(playerMove==0) {
            	stopGame();
            } else if((playerMove!=1)||(playerMove!=2)||(playerMove!=3)||(playerMove!=0)) {
            	System.out.println("INVALID NUMBER! >:(");
            	mainGame();
            }
	}
	
	public static void checkRounds() {
		if(num_rounds==max_rounds) {
			stopGame();
		} else {num_rounds++; mainGame();}
	}
	
	
	public static void stopGame() {
		System.out.println("---=!GAME OVER!=---");
		System.out.println("--Total Score--");
		System.out.printf("You - %s\n",Pscore);
		System.out.printf("CPU - %s\n",Cscore);
		if(Pscore>Cscore) {
			System.out.println("<<< YOU WIN!!! :D >>>");
		} else if(Pscore<Cscore) {
			System.out.println("<<< YOU LOSE! :'( >>>");
		} else if(Pscore==Cscore) {
			System.out.println("<<< TOTAL DRAW! :O >>>");
		}
		
	}
} 
