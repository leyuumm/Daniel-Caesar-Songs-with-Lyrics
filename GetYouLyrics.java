public class GetYouLyrics {

   public static void lyricDisplay(String songTitle){
      
      String[] lyrics = {
               "                                                                       ",
               "                                                                       ",
               "  Through drought and famine, natural disasters",
               "  My baby has been around for me",
               "  Kingdoms have fallen, angels be calling",
               "  None of that could ever make me leave",
               "                   ",
               "  Every time I look into your eyes I see it",
               "  You're all I need",
               "  Every time I get a bit inside I feel it",
               "                                     ",
               "  Oooooooooooooooooooooh, who would've thought I'd get you?",
               "                              ",
               "  Oooooooooooooooooooooh, who would've thought I'd get you?",
               "                             ",
               "  And when we're making love",
               "            ",
               "  Your cries they can be heard from far and wide",
               "  It's only the two of us",
               "  Everything I need's between those thighs",
               "                        ",
               "  Every time I look into your eyes I see it",
               "  You're all I need",
               "        ",
               "  Every time I get a bit inside I feel it",
               "                    ",
               "  Oooooooooooooooooooooh, who would've thought I'd get you?",
               "     ",
               "  Oh yeah, oh yeah babe",
               "  Oooooooooooooooooooooh, who would've thought I'd get you?",
               "                                   ",
               "  And I'll take some time",
               "  Just to be thankful",
               "  That I had days full of you, you",
               "  Before it winds down into",
               "  The memories, it's all just memories",
               "  La-la-la-la",
               "            ",
               "  Don't you love when I come around",
               "                ",
               "  Build you up then I take you down",
               "        ",
               "  Don't you love when I come around",
               "  Build you up and I take-",
               "  Oooooooooooooooooooooh, who would've thought I'd get you?",
               "  (Oh yeah, oh yeah babe)",
               "  Ooh, who would've thought I'd get you",
               "     ",
               "  This feels like summer",
               "  Boy you make me feel so alive",
               "  Just be my lover",
               "  Boy you'll lead me to paradise",
         };
         
      int characterDelay = 90; // milliseconds delay
      int lineDelay = 2000; // 2 seconds delay before the line
     
      System.out.println("");
      System.out.println("");
      System.out.println("Get You - Daniel Caesar");
      lyricsThread(lyrics, characterDelay, lineDelay);
      System.out.println("");
      System.out.println("");
      System.out.println("");
   }
   
   
   private static void lyricsThread(String[] lyrics, int characterDelay, int lineDelay){
   
      try{
         for(String line: lyrics){
            System.out.println("\r");
            
            for(char c: line.toCharArray()){
               System.out.print(c);
               
               Thread.sleep(characterDelay);
            }
            Thread.sleep(lineDelay);
         }
      } catch(InterruptedException e){
         e.printStackTrace();
      }
   }
}

