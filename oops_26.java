import java.util.*;
class grading{
    private int regno;
    private int [] acad;
    grading(int regno, int [] acad){
        acad  = new int[5];
    }
    public void get_RegNo(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the registration no. ");
      regno = sc.nextInt();
    }
    public put_RegNo(){
      System.out.println("Registraion no. "+regno);
    }
    public void get_Acad(){
       Scanner sc = new Scanner(System.in);
       int acad[] = new int[5];
       System.out.println("enter the marks of the student");
       for(int i =0;i<5;i++){
        acad[i] = sc.nextInt();
       }
    }
    public void put_Acad(){
      System.out.println("the marks are");
      for(int i=0;i<5;i++){
        System.out.println(acad[i]);
      }  
    }
    public int getTotalAcademicScore() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total / 5;
    }
}
interface Co_Curricular{
    void get_score();
    void put_score();
}
class Result extends grading implements Co_Curricular{
    private int cocurricularscore;
    private double finalscore;
    Result(){
        super();
    }
    public get_score(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the score in cocurricular activities");
        cocurricularscore = sc.nextInt();
    }
    public void put_score(){
        System.out.println("Score in Cocurricuar activities " +cocurricularscore);
    }
    public void calculateanddisplayScore(){
    int academicScore = getTotalAcademicScore(); 
    finalScore = (academicScore * 0.8) + (coCurricularScore * 0.2); 
    System.out.println("Final Score (out of 100): " + finalScore);
   }
}
public class Main {
    public static void main(String[] args) {
        Result student = new Result();
        student.get_RegNo();
        student.get_Acad();
        student.get_Score();
        System.out.println("\nStudent Details:");
        student.put_RegNo();
        student.put_Acad();
        student.put_Score();
        student.calculateAndDisplayFinalScore();
    }
}