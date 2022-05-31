import java.util.*;

public class Main {
    public static void main(String[] args) {

        ConcreteMediator concreteMediator=new ConcreteMediator();
        List<Student> students=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            Student s=new Student(concreteMediator,i+1);
            students.add(s);
        }
        Examiner examiner=new Examiner(concreteMediator);

        concreteMediator.setE(examiner);

        concreteMediator.checked_msg(students);
       /* for(Student s:students)
        {
            concreteMediator.setS(s);
            concreteMediator.checked_msg(s);
        }*/
        for(Student s:students)
        {
            concreteMediator.setS(s);
            concreteMediator.notify_students(s);
        }
        System.out.println("\nMarksheet: ");
        for(int i=0;i<students.size();i++)
        {
            concreteMediator.setS(students.get(i));
            //int j=i+1;
            concreteMediator.print_marksheet();
        }
        while(true)
        {
            System.out.println("\nDO YOU WANT TO RECHECK?\n1.YES\n2.NO");
            Scanner ch=new Scanner(System.in);
            int a=ch.nextInt();
            if(a==1)
            {
                System.out.println("FOR RECHECK YOU HAVE TO PROVIDE YOUR STUDENT ID");
                Scanner sid=new Scanner(System.in);
                int c=sid.nextInt();

                for(Student s:students)
                {
                    if(s.student_id==c)
                    {
                        concreteMediator.recheck(s);
                        break;
                    }
                }
                System.out.println("\nMarksheet: ");
                for(int i=0;i<students.size();i++)
                {
                    concreteMediator.setS(students.get(i));
                    //int j=i+1;
                    concreteMediator.print_marksheet();
                }

            }
            else
            {
                System.out.println("ENTER 'E' TO EXIT, 'C' TO CONTINUE");
                Scanner c=new Scanner(System.in);
                String str=c.nextLine();
                if(str.equals("E"))
                {
                    break;
                }
                else if(str.equals("C"))
                {
                    continue;
                }

            }
        }

    }
}
