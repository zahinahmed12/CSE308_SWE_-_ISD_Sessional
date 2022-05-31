import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class ConcreteMediator extends Mediator {

    private Examiner e;
    private Student s;

    public void setE(Examiner e) {
        this.e = e;
    }

    public void setS(Student s) {
        this.s = s;
    }

    @Override
    public void checked_msg(List<Student> stu) {

        e.notify_checked();
        System.out.println("EXAM CONTROLLER OFFICE: Scripts and marks of student id 1,2,3,4,5 got from examiner");
        for(Student s:stu)
        {
            setS(s);
            e.set_marks(s);
        }
        //int m=e.set_marks(s);
        //boolean res_m=new Random().nextBoolean();
        /*if(res_m)
        {
            if(m>=50 && m<=70)
            {
                System.out.println("\nThere's a mistake. Update marks of student id "+s.student_id);
                e.reset_marks(s);
            }
            else if(m>80)
            {
                System.out.println("\nThere's a mistake. Update marks of student id "+s.student_id);
                e.reset_marks(s);
            }
        }*/
        int res=new Random().nextInt(6);
        if(res==0) res=1;

        //int res = ThreadLocalRandom.current().nextInt(1, 6);
        for(Student s:stu)
        {
            setS(s);
            if(res==s.student_id)
            {
                if(s.prev_marks>=45 && s.prev_marks<=82)
                {
                    System.out.println("\nEXAM CONTROLLER OFFICE: There's a mistake. Update marks of student id "+s.student_id);
                    e.reset_marks(s);
                    //s.updated_marks();
                    System.out.println("Student id: "+s.student_id+" previous marks: "+s.prev_marks+" corrected_marks "+s.corrected_marks+"\n");
                    s.prev_marks=s.corrected_marks;
                }
                else if(s.prev_marks>82)
                {
                    System.out.println("\nEXAM CONTROLLER OFFICE: There's a mistake. Update marks of student id "+s.student_id);
                    e.reset_marks(s);
                    //s.updated_marks();
                    System.out.println("Student id: "+s.student_id+" previous marks: "+s.prev_marks+" corrected_marks "+s.corrected_marks+"\n");
                    s.prev_marks=s.corrected_marks;
                }
                break;
            }
        }

    }

    @Override
    public void notify_students(Student s) {
       // e.notify_checked(s);
        System.out.println("EXAM CONTROLLER OFFICE: Scripts and marks of student id 1,2,3,4,5 published");
    }

    @Override
    public void print_marksheet() {

        //System.out.println("Student Id "+ s.student_id+": "+" marks: "+s.prev_marks);
        s.notify_marks();
    }

    @Override
    public void recheck(Student s) {
        setS(s);
        s.recheck();
        System.out.println("EXAM CONTROLLER OFFICE: Recheck request got from student Id "+s.student_id);
        System.out.println("EXAM CONTROLLER OFFICE: Exam script of student id "+s.student_id+" sent to examiner for recheck");
        boolean x=e.recheck(s);

        if(x)
        {
            s.updated_marks();
        }

    }
}
