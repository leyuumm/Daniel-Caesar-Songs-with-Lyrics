import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{	
      Scanner scanner = new Scanner(System.in);
      
      String[] songs = {
      "GET YOU",
      "ALWAYS",
      "BEST PART",
      };
      
      System.out.println("I have 3 Daniel Caesar songs here. Which of these songs you wanna play?");
      for(int i = 0; i < songs.length; i++){
         System.out.println((i + 1) + ". " + songs[i]);
      }
      
      int choice;

      while(true){
         
         System.out.print("Enter the the number of your choice: ");

         if(scanner.hasNextInt()){
            choice = scanner.nextInt();

            if(choice >= 1 && choice <= songs.length){
               break;
            } else{
               System.out.println("Invalid choice. Please enter a number");
            }
         } else{
            System.out.println("Invalid input. Please enter a number");
            scanner.next();
         }
      }
      
      String songTitle = songs[choice - 1];
      String songFile = "songs\\" + songTitle + ".wav";
      
		   File file = new File(songFile);
		   AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
      	Clip clip = AudioSystem.getClip();
     		clip.open(audioStream);	
      
      
		String response = "";

		do{
			System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
			System.out.print("Enter your choice: ");
			response = scanner.next();
			response = response.toUpperCase();
         
         
         switch(response){
            case "P":
               clip.setMicrosecondPosition(0);
               clip.start();
               lyricDisplay(songTitle);
            break;
            
            case "S":
               clip.stop();
            break;

            case "R":
               clip.setMicrosecondPosition(0);
            break;

            case "Q":
               clip.close();
            break;
            
            default:
               System.out.println("Not a valid response");
            break;
         }
			
		 }while(!response.equals("Q"));

		System.out.println("K,Byeeee!");	

	}
   
   private static void lyricDisplay(String songTitle){
      
      if("GET YOU".equals(songTitle)){
         GetYouLyrics.lyricDisplay(songTitle);
      } else if("ALWAYS".equals(songTitle)){
         AlwaysLyrics.lyricDisplay(songTitle);
      } else if("BEST PART".equals(songTitle)){
         BestPartLyrics.lyricDisplay(songTitle);
      } else{
         System.out.println("No lyrics for this selection");
      }
   }

} 