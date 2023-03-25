public class Student {
    private String name;
    private int id;
    private String[] courses;

    public Student(String name,int id){
        this.name = name;
        this.id = id;
        this.courses = new String[0];
    }
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
    public String[] getcourses(){
        return this.courses;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    public void setId(int newId){
        this.id = newId;
    }
    public void setcourses(String[] courses){
        this.courses = courses;
    }
    public void addCourse(String course) {
        String[] newCourses = new String[this.courses.length + 1];
        for (int i = 0; i < this.courses.length; i++) {
            newCourses[i] = this.courses[i];
        }
        newCourses[newCourses.length - 1] = course;
        this.courses = newCourses;
    }
     public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.id);
        for (String course : this.courses) {
            System.out.print(course);
        }
        System.out.println();
    }
}

class Graduatestudent extends Student {
    private String researcharea;
    
    public Graduatestudent(String name,int id,String researcharea){
        super(name,id);
        this.researcharea = researcharea;
    }
    
    public String getReasercharea(){
        return this.researcharea;
    }
    public void setReasercharea(String researharea){
        this.researcharea = researcharea;
    }
    public void printinfo(){
        super.printInfo();
        System.out.println(this.researcharea);
    }
}

