import java.util.*;

public class Student extends Colleagues {

    int prev_marks;
    int corrected_marks;
    int student_id;

    public Student(Mediator m,int a)
    {
        super(m);
        student_id=a;

        /*Random r=new Random();
        int marks_one= r.nextInt(55);
        prev_marks=45+marks_one;*/

    }
    public void notify_marks()
    {
        /*Random r=new Random();
        Random rand=new Random();

        int marks_one= r.nextInt(100);
        int marks_two=rand.nextInt(80);
        int marks=(marks_one+marks_two)/2;

        prev_marks=marks;*/

        System.out.println("Student Id "+ student_id+": "+" marks: "+prev_marks);
    }
    public void recheck()
    {
        System.out.println("STUDENT:  Recheck request sent from student id "+student_id);
    }
    public void updated_marks()
    {
       /* Random r=new Random();
        Random rand=new Random();

        int marks_one= r.nextInt(100);
        int marks_two=rand.nextInt(80);
        int marks=(marks_one+marks_two)/2;

        if(marks<35)
        {
            marks=35+marks;
        }

        corrected_marks=marks;*/

        /*if(corrected_marks>prev_marks)
        {
            System.out.println("Marks increased");
            System.out.println("Student id: "+student_id+" previous marks: "+prev_marks+" corrected_marks "+corrected_marks);
            prev_marks=corrected_marks;
        }
        else
        {
            System.out.println("Marks decreased");
            System.out.println("Student id: "+student_id+" previous marks: "+prev_marks+" corrected_marks "+corrected_marks);
            prev_marks=corrected_marks;
        }*/

        System.out.println("Student id: "+student_id+" previous marks: "+prev_marks+" corrected_marks "+corrected_marks+"\n");
        prev_marks=corrected_marks;

    }

}
