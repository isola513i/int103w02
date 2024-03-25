package world;

import java.util.Objects;
import java.util.StringJoiner;

public class Person {
    private String name;

    public Person(String name) {
        this.name = Objects.requireNonNull(name, "Name cannot be null"); // requireNonNull function for check null
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name not be null");
        }
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;

        return getName() != null ? getName().equals(person.getName()) : person.getName() == null;
    }

    @Override
    public int hashCode() {
        return getName() != null ? getName().hashCode() : 0;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + getContent() + ")";
    }

    protected String getContent() {
        return "name:" + name;
    }
}
