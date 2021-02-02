
public class Dice 
{
	public static final int IS_LADDER = 1;
    public static final int IS_SNAKE = 2;

    
	public static void main(String[] args) 
	{
		System.out.println("Welcome To Snake and Ladder Simulator .... ");
        System.out.println("************************************");

       
        int StartPosition = 0;
        int CurrentPosition = 0;
        int dice;
        int play;
        
        System.out.println("Player is Starting at: " + StartPosition);

         dice=(int) ((Math.floor(Math.random() *10) % 6) +1);
         System.out.println("Dice Face are: " + dice);
         play = (int) (Math.floor(Math.random() *10) % 3);
         
         switch(play)
         {
         
	         case IS_LADDER:
	        	 CurrentPosition+= dice;
	        	 break;
	        	
	         case IS_SNAKE:
	        	 CurrentPosition-= dice;
	        	 break;
	        	 
	        default:
	        	CurrentPosition = CurrentPosition + 0;
	        	break;
         }
         System.out.println("New Position: " + CurrentPosition);
	}
}