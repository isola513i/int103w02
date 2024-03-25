package Java.company;

import Java.world.Person;

public class Employee extends Person {
  private int id;
  private double salary;

  public Employee(int id, String name, double salary) {
    super(name);
    if (id <= 0 | salary <= 0.0) {
      throw new IllegalArgumentException("ID and salary must be greater than zero");
    }
    this.id = id;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    if (id <= 0) {
      throw new IllegalArgumentException("Id must be greater than zero");
    }
    this.id = id;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    if (salary <= 0.0) {
      throw new IllegalArgumentException("Salary must be greater than 0.0");
    }
    this.salary = salary;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Employee employee)) return false;
    if (!super.equals(o)) return false;

    return getId() == employee.getId();
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + getId();
    return result;
  }

  protected String getContent() {
    return super.getContent() + ",id:" + id + ",salary:" + salary;
  }


}
