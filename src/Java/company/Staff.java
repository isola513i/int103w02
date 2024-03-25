package Java.company;

public class Staff extends Employee {
    private final int days;

    public Staff(int id, String name, double salary, int days) {
        super(id, name, salary);
        if (days <= 0) {
            throw new IllegalArgumentException("Days must be greater than zero ");
        }
        this.days = days;
    }
    protected String getContent(){
        return super.getContent() + ",days:" + days;
    }
}
