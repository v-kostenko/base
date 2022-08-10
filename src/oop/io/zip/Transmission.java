package oop.io.zip;

import java.io.Serializable;
import java.util.Objects;

enum Type{AUTOMAT, MECHANICKS}

public class Transmission implements Serializable {
    private int count;
    private Type type;

    public Transmission(int count, Type type) {
        this.count = count;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transmission that = (Transmission) o;
        return count == that.count && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, type);
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "count=" + count +
                ", type=" + type +
                '}';
    }
}
