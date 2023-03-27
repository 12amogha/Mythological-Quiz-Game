import java.io.*;
public class Summary
{ 
    static double s,b;static double total;
   public static void ninth()throws Exception
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double s=0;
        System.out.println("Enter your name");
        String n=br.readLine();
        System.out.println("Enter the level played");
        String level=br.readLine();
        String e="Easy";
        String m="Medium";
        String h="Hard";
        String vh="Very Hard";
        if(level.equals(e))
        {
          //  Easy y=new Easy();
        s=Easy.score;
        }
        if(level.equals(m))
        { //Medium x=new Medium();
             s=Medium.score;
        }
        if(level.equals(h))
       { //Hard i=new Hard();
         s=Hard.score;
        }
       if(level.equals(vh))
      {//VeryHard g=new VeryHard();
         s=VeryHard.score;
       }
    //Bonus_round l=new Bonus_round();
    double b=Bonus_round.score2;
        double total=s+b;
        Thread.sleep(2000);
     System.out.println("\u000c");
     System.out.println("");
     System.out.println("");
     System.out.println("");
     System.out.println("");
     System.out.println("");
     System.out.println("");
     System.out.println("");
     System.out.println("");
     System.out.print("                           Loading,please wait...");
     Thread.sleep(3000);
     System.out.print("...");
     Thread.sleep(3000);
     System.out.print("...");
     Thread.sleep(3000);
     System.out.print("\u000c"); 
     System.out.println("=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=");
     System.out.println("                ��  SUMMARY  ��                ");
     System.out.println("                   `````````                   ");
     System.out.println("    Name:"+n                                    );
     System.out.println("    Level played:"+level);               
     System.out.println("    Score obtained in"  +level+ ":"+s);                                    
     System.out.println("    Score obtained in Bonus round:"+b);
     System.out.println("    Total score obtained:"+total);   
     System.out.println("=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=");
        if(total>=120 && total<=160)
        {
       System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");        
       System.out.println("|                *                                    *                   |");
       System.out.println("|             *    *                               *     *                |");
       System.out.println("|  *  *  *  *        *   *  *  *       *  *  *  *          *   *  *  *    |");
       System.out.println("|    *                      *             *                       *       |");
       System.out.println("|        *               *                   *                *           |");
       System.out.println("|           *        *                           *         *              |");
       System.out.println("|         *      *      *                       *      *     *            |");
       System.out.println("|       *    *      *     *                   *     *    *     *          |");
       System.out.println("|     *  *              *   *               *   *            *   *        |");
       System.out.println("|   *                         *           *                        *      |");
       System.out.println("|                                                                         |");
       System.out.println("|                                    *                                    |");
       System.out.println("|                                  *    *                                 |");
       System.out.println("|                       *  *  *  *        *   *  *  *                     |");
       System.out.println("|                         *                      *                        |");
       System.out.println("|                             *               *                           |");
       System.out.println("|                                *        *                               |");
       System.out.println("|                              *      *      *                            |");
       System.out.println("|                            *    *      *     *                          |");
       System.out.println("|                          *  *              *   *                        |");
       System.out.println("|                        *                         *                      |");
       System.out.println("|                                                                         |");
       System.out.println("|                         >>>>YOU ARE A GENIUS<<<<                        |");
       System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
    }
       if(total>=60 && total<=110)
       {
       System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
       System.out.println("|                *                                    *                  |");
       System.out.println("|             *    *                               *     *               |");
       System.out.println("|  *  *  *  *        *   *  *  *       *  *  *  *          *   *  *  *   |");
       System.out.println("|    *                      *             *                       *      |");
       System.out.println("|        *               *                   *                *          |");
       System.out.println("|           *        *                           *         *             |");
       System.out.println("|         *      *      *                       *      *     *           |");
       System.out.println("|       *    *      *     *                   *     *    *     *         |");
       System.out.println("|     *  *              *   *               *   *            *   *       |");
       System.out.println("|   *                         *           *                        *     |");
       System.out.println("|                                                                        |");
       System.out.println("|                       >>>>YOU ARE SMART<<<<                            |");
       System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
    }
    if(total>=0 && total<=50)
    {
        
       System.out.println(" .-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
       System.out.println("|                     *                         |");
       System.out.println("|                  *    *                       |");
       System.out.println("|       *  *  *  *        *   *  *  *           |");
       System.out.println("|         *                      *              |");
       System.out.println("|             *               *                 |");
       System.out.println("|               *        *                      |");
       System.out.println("|              *      *      *                  |");
       System.out.println("|            *    *      *     *                |");
       System.out.println("|          *  *              *   *              |");
       System.out.println("|        *                         *            |");
       System.out.println("|                                               |");
       System.out.println("|    >>>>YOU CAN IMPROVE YOUR KNOWLEDGE<<<<     |");
       System.out.println(" .-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-. ");
        
}
Thread.sleep(10000);
Rating u=new Rating();
    u.tenth();
}
  //static void main()throws Exception
//{

    //}
}


        
        
