import java.util.*;

public abstract class Mediator {

    public abstract void checked_msg(List<Student> s);
    public abstract void notify_students(Student s);
    public abstract void print_marksheet();
    public abstract void recheck(Student s);
}
