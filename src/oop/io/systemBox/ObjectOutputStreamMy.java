package oop.io.systemBox;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutputStreamMy extends ObjectOutputStream {

    public ObjectOutputStreamMy(OutputStream outputStream) throws IOException {
        super(outputStream);
    }

    @Override
    public void writeStreamHeader(){

    }
}
