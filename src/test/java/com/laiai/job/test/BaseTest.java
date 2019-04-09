package com.laiai.job.test;

import com.laiai.job.JobApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @description: 单元测试base class
 * @author zengyou
 * @date 2019-04-08 11:52:19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=JobApplication.class)
@WebAppConfiguration
public class BaseTest {

}
