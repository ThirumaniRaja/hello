public class Student {
    int roll_no;
    String s_name;
    int mark;
  Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.s_name = name;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }
}
