import java.io.*;
class menu
{
   public static void third()throws Exception
   {
            
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          Thread.sleep(6000);
      System.out.println("\u000c");         
      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.println("                     LOADING         ");
      System.out.println("            -------------------------");
      System.out.println("            |////                    |");
      System.out.println("            -------------------------");
      Thread.sleep(3000);
      System.out.print("\u000c");
      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.println("                     LOADING         ");
      System.out.println("            -------------------------");
      System.out.println("            |///////////            |");
      System.out.println("            -------------------------");
      Thread.sleep(3000);
      System.out.print("\u000c");
      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.println("                     LOADING         ");
      System.out.println("            -------------------------");
      System.out.println("            |////////////////       |");
      System.out.println("            -------------------------");
      Thread.sleep(3000);
      System.out.print("\u000c");
      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.println("                     LOADING         ");
      System.out.println("            -------------------------");
      System.out.println("            |///////////////////////|");
      System.out.println("            -------------------------");
      System.out.print("\u000c");

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("***********************************************************************");
            System.out.println("|                      CHOOSE YOUR LEVEL                               |");
            System.out.println("|                     ``````` ```` `````                               |");
            System.out.println("|                                                                      |");
            System.out.println("|         >-----Enter 1 to play Easy level-----<                       |");
            System.out.println("|                                                                      |");
            System.out.println("|         >-----Enter 2 to play Medium level-----<                     |");
            System.out.println("|                                                                      |");
            System.out.println("|         >-----Enter 3 to play Hard level-----<                       |");
            System.out.println("|                                                                      |");
            System.out.println("|         >-----Enter 4 to play Very Hard level-----<                  |");
            System.out.println("|                                                                      |");  
            System.out.println("***********************************************************************");
           int n=Integer.parseInt(br.readLine());
            switch(n)
            {
            case 1:
            Easy e=new Easy();
            e.fourth();
            break;
            case 2:
            Medium m=new Medium();
            m.fivth();
            break;
            case 3:
            Hard h=new Hard();
            h.sixth();
            break;
            case 4:
            VeryHard vh=new VeryHard();
            vh.seventh();
            break;
            default:System.out.print("**Wrong Input**");
        
        }
    
    }
}



    
        
            
            












           







           
            








        
