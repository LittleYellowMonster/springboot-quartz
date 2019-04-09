package com.laiai.job.test.demo;

import com.laiai.job.test.BaseTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description:
 * @author zengyou
 * @date 2019-04-08 11:52:19
 */
public class DemoTest extends BaseTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void demo(){
        logger.info("我是一个junit测试类");
    }
}

