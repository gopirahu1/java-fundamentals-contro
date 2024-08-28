import java.util.*;
public class controllFlow {
   //get input from the user
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();

  //check the num is pos or neg or zero
   if(a==0)
     System.out.print("zero");
   else if(a>0)
     System.out.print("positive");
   else
     System.out.print("negative");

  // check whether it represents any days in week

    switch(a){
      case 1:System.out.print("Sunday");break;
        case 2:System.out.print("monday");break;
        case 3:System.out.print("tueday");break;
        case 4:System.out.print("wednesday");break;
        case 5:System.out.print("thursday");break;
        case 6:System.out.print("friday");break;
        case 7:System.out.print("Saturday");break;
        default :System.out.print("Not a day");
    }

    //looping from 1 to a;

    for(int i=1;i<=a;i++)
      System.out.print(i);
    
    //looping form a to 1;

    for(int i=a;i>0;i--)
      System.out.print(i);

    //do while loop

    int i=1;
      do{
      System.out.print(i);
      i++;}while(i>=1 && i<=3)
  }
}
