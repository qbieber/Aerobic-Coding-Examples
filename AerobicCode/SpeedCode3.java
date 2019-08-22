class Student
{
    protected String id = "";

    public void generateId(int num)
    {
        this.id = num;
    }

    public String getID()
    {
        return id;
    }
}

class UndergraduateStudent extends Student
{
    public void generateId(int num)
    {
        id = "u" + num;
    }
}

class GraduateStudent extends Student
{
    public void generateId(int num)
    {
        id = "g" + num;
    }
}

public class SpeedCode3 extends Student
{
    public static void main(String[] args)
    {
        UndergraduateStudent undergrad1 = new UndergraduateStudent();
        GraduateStudent gradstud = new GraduateStudent();
        UndergraduateStudent undergrad2 = new UndergraduateStudent();

        Student[] students = {undergrad1, gradstud, undergrad2};
        undergrad1.generateId(0);
        gradstud.generateId(1);
        undergrad2.generateId(2);

        for (int i = 0; i < students.length; i++)
        {
            System.out.print("Student " + students[i].getID());
            if (students[i] instanceof UndergraduateStudent)
            {
                System.out.println(" is an undergraduate student");
            }
            else
            {
                System.out.println(" is a graduate student");
            }
        }
    }

}