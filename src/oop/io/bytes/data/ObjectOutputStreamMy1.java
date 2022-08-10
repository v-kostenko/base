package oop.io.bytes.data;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutputStreamMy1 extends ObjectOutputStream {

    public ObjectOutputStreamMy1(OutputStream outputStream) throws IOException {
        super(outputStream);
    }


    @Override
    public void writeStreamHeader(){

    }
}
