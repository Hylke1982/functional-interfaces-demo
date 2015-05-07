package nl.codecentric.functionalinterfaces;

import org.junit.Test;

/**
 * Created by hylke on 06/05/15.
 */
public class AnonymousInnerClassExample {

    @Test
    public void testAnonymousInnerClassExampeOldSchool() {
        bla(new SomeOperation<String>() {
            @Override
            public void doOperation(String s) {
                System.out.println("Old skool type");
            }
        });

    }

    @Test
    public void testAnonymousInnerClassExampe() {
        bla(x -> {
            System.out.println("this is actual body that is executed");
        });

    }

    private void bla(SomeOperation<String> x) {
        x.doOperation("bla");
    }

    private void doSomething(String bla)
    {

    }
}
