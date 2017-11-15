package org.gradle;

import org.apache.commons.collections.list.GrowthList;

public class Person {
    private final String testName;
    private final String testComment;

    public Person(String testName, String testComment) {
        this.testName = testName;
        this.testComment = testComment;
        new GrowthList();
    }

    public String getTestName() {
        return testName;
    }

    public String getTestComment() {
        return testComment;
    }
}
