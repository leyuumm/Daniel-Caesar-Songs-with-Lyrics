public class BestPartLyrics {

    public static void lyricDisplay(String songTitle){

        String[] lyrics = {
            "                    ",
            "                 ",
            "   OooOooOooh, eeey",
            "   You don't know, babe",
            "   When you hold me",
            "   And kiss me slowly, It's the sweetest thing",
            "   And it don't change",
            "   If I had it my way",
            "   You would know that you are",
            "   You're the coffee that I need in the morning",
            "   You're my sunshine in the rain when it's pouring",
            "   Won't you give yourself to me",
            "   Give it all, oh",
            "   I just wanna see",
            "   I just wanna see how beautiful you are",
            "   You know that I see it",
            "   I know you're a star",
            "   Where you go I follow",
            "   No matter how far",
            "   If life is a movie",
            "   Oh you're the best part, oh oh oh",
            "   You're the best part, oh oh oh",
            "                             ",
            "   Best part",
            "   It's the sunrise",
            "   And those brown eyes, yes",
            "   You're the one that I desire",
            "   When we wake up",
            "   And then we make love",
            "   It makes me feel so nice",
            "   You're my water when I'm stuck in the desert",
            "   You're the Tylenol I take when my head hurts",
            "   You're the sunshine on my life",
            "   I just wanna see how beautiful you are",
            "   You know that I see it",
            "   I know you're a star",
            "   Where you go I follow",
            "   No matter how far",
            "   If life is a movie",
            "   Then you're the best part, oh oh oh",
            "   You're the best part, oh oh oh",
            "                             ",
            "   Best part",
            "   If you love me won't you say something",
            "   If you love me won't you, Won't you",
            "   If you love me won't you say something",
            "   If you love me won't you, Love me, won't you",
            "   (3x)",
        };


        int characterDelay = 80; // milliseconds delay
        int lineDelay = 1500; // 1.5 seconds delay before the line
       
        System.out.println("");
        System.out.println("");
        System.out.println("Best Part - Daniel Caesar");
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
