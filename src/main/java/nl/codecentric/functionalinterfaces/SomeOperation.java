package nl.codecentric.functionalinterfaces;

/**
 * Created by hylke on 06/05/15.
 */
@FunctionalInterface
public interface SomeOperation<T> {

    public void doOperation(T t);
}
