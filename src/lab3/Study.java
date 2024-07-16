package lab3;

class Study {

    private String course;
    public Study(String course) {
        this.course = course;
    }
    //TODO

    public String printCourse() {
        return this.course;
    }
}

class JavaProgram {
    public static void main(String[] args) {
        Study myStudy = new Study("Изучение Java - это просто!");
        System.out.println(myStudy.printCourse());
    }
        //TODO
    }

