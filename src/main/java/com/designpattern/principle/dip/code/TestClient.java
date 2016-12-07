package com.designpattern.principle.dip.code;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

/**
 * JMock怎么用???????
 * Created by liyimeng on 2016/12/3.
 */
public class TestClient {

    Mockery context = new Mockery();

    @Test
    public void test() {
        final ICar car = context.mock(ICar.class);
        IDriver driver = new Driver();

        context.checking(new Expectations(){{
            oneOf(car).run();
        }});

        driver.drive(car);

        context.assertIsSatisfied();
    }
}
