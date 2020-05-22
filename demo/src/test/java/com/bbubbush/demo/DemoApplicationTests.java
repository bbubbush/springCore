package com.bbubbush.demo;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        String[] stringArray = {"1", "2", "3"};
        // 확신한다.                tartget 객체가       이다.  456이랑 같다.
        assertThat(stringArray.length, is(greaterThan(2)));

    }

}
