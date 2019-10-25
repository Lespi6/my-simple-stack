package deqo.tles.MySimpleStack;

import java.util.EmptyStackException;
/* Commentaire exigence 1 */

public interface SimpleStack {

    boolean isEmpty();

    int getSize();

    void push(Item item);

    Item peek() throws EmptyStackException;

    Item pop() throws EmptyStackException;
}
