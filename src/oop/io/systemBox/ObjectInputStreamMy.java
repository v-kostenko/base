package oop.io.systemBox;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamMy extends ObjectInputStream {

    public ObjectInputStreamMy(InputStream inputStream) throws IOException {
        super(inputStream);
    }

    @Override
    public void readStreamHeader(){

    }
}
