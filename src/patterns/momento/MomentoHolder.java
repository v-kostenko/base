package patterns.momento;

import java.util.EmptyStackException;
import java.util.Stack;

public class MomentoHolder {
    private Stack<Object> momentos = new Stack<>();


    public void addMomento(Object momento) {
        momentos.push(momento);
    }

    public Object getMomento() {
        if (!momentos.isEmpty()) {
            return momentos.pop();
        }
        throw new EmptyStackException();
    }
}
