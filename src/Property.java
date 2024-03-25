public class Property extends Asset{
  private String location;

  public Property(String name, double value, String location) {
    super(name, value);
    this.location = location;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }
  protected String getContent(){
    return super.getContent() + ",location:" + location;
  }
}
