import java.util.*;
class get
{
    int n,marks[];
    int per,sum,total;
    Scanner sc = new Scanner(System.in);
    void get_marks()
    {
        System.out.println("Enter Marks out of 100!!!");
        System.out.print("Enter number of subject : ");
        n=sc.nextInt();
        marks=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter marks for sub "+(i+1)+" : ");
            marks[i] = sc.nextInt();
            sum+=marks[i];
        }
    }
    void d_marks()
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("Sub "+ (i + 1)+" : "+marks[i]);
        }
        total=n*100;
        System.out.println("Total marks : "+sum+" / "+(n*100));


    }
    void d_per()
    {
        per = (sum*100) /total ;
        System.out.println("Percentage : "+per);
        System.out.println("Average : "+(sum/5));
    }
    void d_Garde()
    {
        if(per>=80) {
            System.out.println("Grade O");
        }
        else if(per>=70) {
            System.out.println("Grade A");
        }
        else if(per>=60){
            System.out.println("Grade B");
        }
        else if(per>=50){
            System.out.println("Grade C");
        }
        else if(per>40){
            System.out.println("Grade D");
        }
        else if(per==40){
            System.out.println("Grade P(PASS)");
        }
        else if(per<40){
            System.out.println("FAIL!!!!");
        }
    }
}
public class studentgrade
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ch=0;
        get g = new get();
        System.out.println("*********************** Exercise 02 *********************** ");
        System.out.println("------------------ STUDENT GRADED SYSTEM -------------------");
        System.out.println(" Made by (Gaurav Kathe)  ");
        do
        {
            System.out.println(" Main Menu \n 1. Enter Marks \n 2. Dispaly Marks & Percentage \n 3. Dispaly Percentage and Average \n 4. Display Grade \n 5. Exit ");
            System.out.print("Enter Choice : ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    g.get_marks();
                    break;
                case 2:
                    g.d_marks();
                    break;
                case 3:
                    g.d_per();
                    break;
                case 4:
                    g.d_Garde();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Incorrect Choice !!!!");
            }
        }while(ch!=5);
    }
}