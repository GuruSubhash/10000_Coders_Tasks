
public class Student {
    int rollNo;
    String name;
    Course crs[];

    public Student(int num, String name, Course[] crs){
        rollNo=num;
        this.name= name;
        this.crs=crs;
    }
    public double _4AssesmentsAverage(int marks[] ){
        double sum=0.0;
        for(int ele:marks) sum+=ele;
        return sum/4.0;
    }
    double getoverallAverage(){
        double sum=0.0;
        for(int i=0; i<crs.length;++i) sum+=(_4AssesmentsAverage(crs[i].marks));
        return sum/crs.length;
    }

    void displayStudentPerformance(){
        System.out.println("------------------------------------------------------------------------");
        System.out.println("\nStudent Name : "+ name + "/nStudent id : "+rollNo);
        System.out.println("--------Course-wise marks---------");
        for(int i=0; i<crs.length;++i) System.out.println("course 1 average across overall 4 assignments is : "+ _4AssesmentsAverage(crs[i].marks) );
        System.out.println("Overall Course Average is : "+getoverallAverage());
    }

    public static void main(String[] args) {
        Course cs1=new Course("Java",new int[]{90,80,95,99});
        Course cs2=new Course("Python",new int[]{90,80,95,99});
        Course cs3=new Course("JS",new int[]{90,80,95,99});

        Course[] courses=new Course[]{cs1,cs2,cs3};
        Student st1= new Student(6, "Guru Subhash", courses);
        Student st2= new Student(12, "Deepika", courses);

        Student [] stds=new Student[]{st1,st2};
        for(Student std:stds) std.displayStudentPerformance();
    }

}
