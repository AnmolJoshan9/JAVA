
class Student {
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;

    public int total() {
        return m1+m2+m3;
    }

    public float average() {
        return (float)total()/3;
    }

    public char grade() {
        if(average() >= 60){
            return 'A';
        }
        else {
            return 'B';
        }
    }

    public String toString() {
        return "ROll no:"+roll+"\n"+"Name:"+name+"\n"+"course:"+course+"\n";
    }
}
public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();

        s.roll = 1;
        s.name = "john";
        s.course = "CSE";
        s.m1 = 70;
        s.m2 = 80;
        s.m3 = 65;

        System.out.println(s.total());
        System.out.println(s.average());
        System.out.println( s );
    }

}
