package Programming_with_classes_4;

class Student {
    private String name;
    private String initials;
    private int group;
    private int grades[];
    private int nGrades;
    public Student(String name_, String initials_, int group_) {
        name = name_;
        initials = initials_;
        nGrades = 0;
        grades = new int[5];
    }
    boolean addGrade(int grade) {
        if (nGrades >= 5) {
            return false;
        }
        grades[nGrades] = grade;
        nGrades++;
        return true;
    }
    boolean isGood() {
        for (int i = 0; i < nGrades; ++i)
            if (grades[i] != 9 && grades[i] != 10)
                return false;
        return true;
    }
    void print() {
        System.out.print(name + " " + initials);
        System.out.print(". Group: " + Integer.toString(group) + ". Grades: ");
        for (int i = 0; i < nGrades; ++i)
            System.out.print(Integer.toString(grades[i]) + " ");
        System.out.print("\n");
    }
}