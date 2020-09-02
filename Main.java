class Main {
  
  public static void main(String[] args) {
    System.out.println("M&M Color Counts"+"\n");
    int totalCnt;
    double blueCnt,yellowCnt,orangeCnt,redCnt,brownCnt,greenCnt;

    totalCnt=55*10;
    yellowCnt=totalCnt*.14;
    blueCnt=totalCnt*.24;
    orangeCnt=totalCnt*.20;
    redCnt=totalCnt*.13;
    brownCnt=totalCnt*.13;
    greenCnt=totalCnt*.16;

  System.out.println("Blue: "+blueCnt);
  System.out.println("Yewllow: "+yellowCnt);
  System.out.println("Orange: "+orangeCnt);
  System.out.println("Red: "+redCnt);
  System.out.println("Brown: "+brownCnt);
  System.out.println("Green: "+greenCnt+"\n");

  double mmSum=yellowCnt+blueCnt+orangeCnt+redCnt+brownCnt+greenCnt;

  System.out.println("Sum: "+ mmSum+"\n");

  if(blueCnt>brownCnt&&greenCnt>orangeCnt)
  {
    System.out.println("Blue over Brown and Green over Orange");
  }

  if(brownCnt<=redCnt)
  {
    System.out.println("Brown is less than or equal to Red");
  }
  if(mmSum==totalCnt)
  {
    System.out.println("\n"+"Numbers match");
  }



    



  }
}