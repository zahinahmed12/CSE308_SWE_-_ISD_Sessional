import java.util.*;

public class Examiner extends Colleagues {

    public Examiner(Mediator m)
    {
        super(m);
    }

    public int set_marks(Student s)
    {
        Random r=new Random();
        int marks_one= r.nextInt(55);
        s.prev_marks=45+marks_one;
        return marks_one+45;
    }
    public void reset_marks(Student s)
    {
        if(s.prev_marks>=45 && s.prev_marks<=82)
        {
            System.out.println("EXAMINER:  Corrected marks of student id "+s.student_id+"\n");
            //s.prev_marks=s.prev_marks+5;
            s.corrected_marks=s.prev_marks+5;
        }
        else if(s.prev_marks>82)
        {
            System.out.println("EXAMINER:  Corrected marks of student id "+s.student_id+"\n");
            //s.prev_marks=s.prev_marks-2;
            s.corrected_marks=s.prev_marks-2;
        }

    }

    public void notify_checked()
    {
        System.out.println("\nEXAMINER:  Scripts and marks of student id 1,2,3,4,5 sent to exam controller office");
       /* Random r=new Random();
        int marks_one= r.nextInt(55);
        s.prev_marks=45+marks_one;*/
    }

    public boolean recheck(Student s)
    {
       // System.out.println("Recheck request got from student Id "+s.student_id);
        boolean check_marks=new Random().nextBoolean();

        if(check_marks)
        {
            if(s.prev_marks>85)
            {
                System.out.println("EXAMINER:  STUDENT ID: "+s.student_id+" MARKS DECREASED");

                Random r=new Random();
                int dec= r.nextInt(5);
                if(dec<3) dec=2;
                s.corrected_marks=s.prev_marks-dec;
            }
            else
            {
                System.out.println("EXAMINER:  STUDENT ID: "+s.student_id+" MARKS INCREASED");

                Random r=new Random();
                int inc= r.nextInt(11);
                if(inc<3) inc=3;
                s.corrected_marks=s.prev_marks+inc;
            }

        }
        else
        {
            System.out.println("EXAMINER:  STUDENT ID: "+s.student_id+" MARKS UNCHANGED");
        }
        return check_marks;
    }
}
