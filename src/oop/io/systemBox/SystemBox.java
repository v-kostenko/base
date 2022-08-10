package oop.io.systemBox;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SystemBox implements Serializable {
    private List<Memory> memories;
    private Ssd ssd;
    private VideoCart videoCart;
    private Processor processor;
    private long serNumber;

    public SystemBox(List<Memory> memories, Ssd ssd, VideoCart videoCart, Processor processor, long serNumber) {
        this.memories = memories;
        this.ssd = ssd;
        this.videoCart = videoCart;
        this.processor = processor;
        this.serNumber = serNumber;
    }

    public long getSerNumber() {
        return serNumber;
    }

    public void setSsd(Ssd ssd){
        this.ssd = ssd;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemBox)) {
            return false;
        }
        SystemBox temp = (SystemBox) obj;

        return this.serNumber == temp.serNumber;
    }

    public int hashCode() {
        int hashCode = 7;
        hashCode = 7 * Long.hashCode(serNumber);
        return hashCode;
    }

    @Override
    public String toString() {
        return "SystemBox{" +
                "memories=" + memories +
                ", ssd=" + ssd +
                ", videoCart=" + videoCart +
                ", processor=" + processor +
                "ser Number=" + serNumber +
                '}';
    }
}
