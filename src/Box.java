import Java.util.Container;

import java.util.Objects;

public class Box<T> extends Container<T> {
  public Box(int n) {
    super(n);
  }
  public Object remove(T o){
    Objects.requireNonNull(o, "object cannot be null");
    return null;
  }
}
