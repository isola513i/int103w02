package Java.util;

import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

public class Container<T> { //type
  private T[] oa;
  private int count;

  public Container(int n) {
    if (n <= 0) {
      throw new IllegalArgumentException("size must be greater than zero");
    }
    oa = (T[]) new Object[n];
    count = 0;
  }

  public int getCount() {
    return count;
  }

  public Object get(int i) {
    if (i >= count) {
      throw new IndexOutOfBoundsException("Over");
    }
    return oa[i];
  }

  public void set(int i, T o) {
    if (i >= count) {
      throw new IndexOutOfBoundsException("Over");
    }
    oa[i] = Objects.requireNonNull(o, "object cannot be null");
  }

  public Object add(T o) {
    Objects.requireNonNull(o, "object cannot be null");
    if (count == oa.length) {
      oa = Arrays.copyOf(oa, count << 1);
    }
    oa[count++] = o;
    return o;
  }

  @Override
  public String toString() {
    StringJoiner j = new StringJoiner("\n", "Container \n", "");
    for (int i = 0; i < count; i++) {
      j.add(oa[i].toString());
    }
    return j.toString();
  }
  public void sort(){
    Arrays.sort(oa,0,count);
  }
}
