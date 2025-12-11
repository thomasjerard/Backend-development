package sample;
public class Calc {
    protected int math;
    Calc() {
        System.out.println("Calc Constructor");
        // Constructor
    }
    public void display() {
        System.out.println("This is Calc class");
    }
    public int getMath() {
        return math;
    }
    public void setMath(int math) {
        this.math = math;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + math;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Calc other = (Calc) obj;
        if (math != other.math)
            return false;
        return true;
    }

}
