import java.io.*;
class Bonus_round
{  static double score2;

  public static void eighth()throws Exception
    {
        //double score2=0;
       BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
     System.out.print("\u000c");  
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
     System.out.println("");
     System.out.println("");
     System.out.println("");
     System.out.println("");
     System.out.println("");
     System.out.println("                  ********************************************");
     System.out.println("");
     System.out.println("\n                           [$$] BONUS ROUND [$$]            ");
     System.out.println("                                                              ");              
     System.out.println("\n                            ~~~~GOOD LUCK~~~~               ");
     System.out.println("                  ********************************************");
     Thread.sleep(6000);
     System.out.println("\u000c");
     System.out.println("o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o");
     System.out.println("");
     System.out.println("       ???? Question 1:In Battle of Kurukshethra,who drove Ajunna's chariot ????         ");
     System.out.println("");
     String array[]=new String[4];
     array[0]="1.Shalya";
     array[1]="2.Krishna";
     array[2]="3.Drishtadyumana";
     array[3]="4.Chithrangada";
      
      for(int i=0;i<array.length;i++)
      {
        System.out.println("\t\t\t"+array[i] );
          
        }
       System.out.println("");
       System.out.println("---Enter your Answer---");
       String b1=br.readLine();
        if(b1.equals(array[1]))
        {
          System.out.println("                      ~~~~Correct answer!~~~~                                         ");
          System.out.println("");
          score2=score2+10;
          System.out.println("                       *Your score:"+score2);
        }
        else 
       {
        System.out.println("");
        System.out.println("               ^^^^^^^Better luck next time!Answer is 2.Krishna^^^^^^^                      ");
       }
      Thread.sleep(6000);
       System.out.print("\u000c");
       System.out.println("o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o");
       System.out.println("       ???? Question 2 :Complete the names of the Mythological Character ????            ");
       System.out.println("");
       System.out.println("                             a)S_R_A                                                     ");
       System.out.println("                             b)K_I_E_I                                                   ");
       System.out.println("                             c)KU__R_                                                    ");
       System.out.println("---Enter your Answer---");
       String b2a=br.readLine();
       String b2b=br.readLine();
       String b2c=br.readLine();
       String my1="SURYA";
       String my2="KAIKEYI";
       String my3="KUBERA";
       
       if(b2a.equals(my1)&& b2b.equals(my2) && b2c.equals(my3))
     
    
        {
          System.out.println("                      ~~~~Correct answer!~~~~                                         ");
          System.out.println("");
          score2=score2+10;
          System.out.println("                       *Your score:"+score2);
        }
          else 
       {
      System.out.println("");
      System.out.println("         ^^^^^^^Better luck next time!Answers are a)SURYA b)KAIKEYI c)KUBERA^^^^^^^        ");
    }
      Thread.sleep(6000);
      System.out.print("\u000c");
      System.out.println("o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o");
      System.out.println("");
      System.out.println("       ???? Question 3:Which Vedic God was known as Purandara ????               ");
      System.out.println("");  
      String array3[]=new String[4];
      array3[0]="1.Indra";
      array3[1]="2.Varuna";
      array3[2]="3.Agni";
      array3[3]="4.Aditi";
      
      for(int i=0;i<array3.length;i++)
      {
        System.out.println("\t\t\t"+array3[i] );
          
        }
       System.out.println("");
       System.out.println("---Enter your Answer---");
       String b3=br.readLine();
        if(b3.equals(array3[0]))
        {
          System.out.println("                     ~~~~Correct answer!~~~~                                 ");
          System.out.println("");
          score2=score2+10;
          System.out.println("                       *Your score:"+score2);
        }
       else 
       {
       System.out.println("");
       System.out.println("          ^^^^^^^Better luck next time!Answer is 1.Indra^^^^^^^                  ");
       }
      Thread.sleep(6000);
      System.out.print("\u000c");
      System.out.println("o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o");
      System.out.println("");
      System.out.println("                 ???? Question 4:Who killed Mahisha ????                 ");
      System.out.println("");  
      System.out.println("---Enter your Answer---");
      String b4=br.readLine();
      String apa="Durga";
        if(b4.equals(apa))
        {
          System.out.println("                     ~~~~Correct answer!~~~~                         ");
          System.out.println("");
          score2=score2+10;
          System.out.println("                      *Your score:"+score2);
        }
         else 
       {
        System.out.println("");
        System.out.println("            ^^^^^^^Better luck next time!Answer is Durga^^^^^^^          ");
       }
      Thread.sleep(6000);
      System.out.print("\u000c");    
      System.out.println("o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o");
      System.out.println("");
      System.out.println("       ???? Question 5:In which language was the holy Quran revealed ????        ");
      System.out.println("");  
      String array5[]=new String[4];
      array5[0]="1.Hebrew";
      array5[1]="2.Greek";
      array5[2]="3.Latin";
      array5[3]="4.Arabic";
      
      for(int i=0;i<array5.length;i++)
      {
        System.out.println("\t\t\t"+array5[i] );
          
        }
       System.out.println("");
       System.out.println("---Enter your Answer---");
       String b5=br.readLine();
           if(b5.equals(array5[3]))
           {
           System.out.println("                      ~~~~Correct answer!~~~~                                 ");
           System.out.println("");
           System.out.println("                      >>>>>YOU'RE ON FIRE<<<<<                                ");
           score2=score2+10;
           System.out.println("");
           System.out.println("                       *Your score:"+score2);
           }
           else 
          {
           System.out.println("");
           System.out.println("           ^^^^^^^Better luck next time!Answer is 4.Arabic^^^^^^^                  ");
    }
   Thread.sleep(6000);
   System.out.print("\u000c");
   System.out.println("o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o");
   System.out.println("");
   System.out.println("  ???? Question 5:What was the name of Lord Shiva's wife who sacrificed her body into ashes ????     ");       
   System.out.println("");  
   String array6[]=new String[4];
          array6[0]="1.Parvati";
          array6[1]="2.Dakshayini";
          array6[2]="3.Kayetki";
          array6[3]="4.Kali";
     for(int i=0;i<array6.length;i++)
      {
        System.out.println("\t\t\t"+array6[i] );
          
        }
       System.out.println("");
       System.out.println("---Enter your Answer---");
       String b6=br.readLine();
         if(b6.equals(array6[1]))
         {
          System.out.println("                          ~~~~Correct answer!~~~~                                                ");
          score2=score2+10;
          System.out.println("");
          System.out.println("                            *Your score:"+score2);
         }
         else 
         {
          System.out.println("");
          System.out.println("                ^^^^^^^Better luck next time!Answer is 2.Dakshayini^^^^^^^                           ");
         }
      Thread.sleep(6000);
      System.out.print("\u000c");       
                                
                          //  void main()throws Exception
                            //{
                                Summary s=new Summary();
                                s.ninth();
                                //Summary.b=score2; 
                            //}
                        }
                        
                    }   
        
    