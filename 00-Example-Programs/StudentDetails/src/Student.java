public class Student {
    private String name;
    private String className;
    private Integer rollNumber;
    private boolean isMale;

    public Student(String name, String className, Integer rollNumber, boolean isMale) {
        this.name = name;
        this.className = className;
        this.rollNumber = rollNumber;
        this.isMale = isMale;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", rollNumber=" + rollNumber +
                ", isMale=" + isMale +
                '}';
    }
}
