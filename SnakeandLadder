public class Report 
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
        int count=0;
        System.out.println("Player is Starting at: " + StartPosition);

        while(CurrentPosition !=100)
        {
	         count++;
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
         
         if (CurrentPosition == 100) 
         {
                break;
         } 
         else if (CurrentPosition > 100) 
            {
                CurrentPosition -= dice;
                System.out.println("Not valid Dice Face. You are staying on same position.");
            } 
            else if (CurrentPosition < 0)
            {
                CurrentPosition = StartPosition;
                System.out.println("You came back to start.");
            } 
            else 
            {
                System.out.println("New Position: " + CurrentPosition);
            }
        }
        System.out.println("Congratulations! You Won. You have taken total " + count + " plays of dice to Win.");
    }
	

}


