package oop.io.bytes.data;

import java.io.*;

public class ObjectInputStreamMy1 extends ObjectInputStream {

    public ObjectInputStreamMy1(InputStream inputStream) throws IOException {
        super(inputStream);
    }

    @Override
    public void readStreamHeader(){

    }
}
