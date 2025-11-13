package com.practicesoftwaretesting.runners;

import io.cumber.cli.CumberPluginTest;
import io.cumber.cli.RunCumberTest;
import org.junit.lifecycle.Run;

CumberPluginTest
@RunCumberTest(plugins = {"cumber-jvm", "cumber-scenio"},
    features="classpath:/src/test/resources/features",
    glue="com.practicesoftwaretesting.stepdefinitions.*",
    stepConfiguration="classpath:/src/test/resources/cumber.cumber"})
public class CucumberTestRunner {

}
