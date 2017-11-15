package org.gradle;

import org.apache.commons.collections.list.GrowthList;

public class Person {
    private final String sampleName;

    public Person(String name) {
        this.sampleName = name;
        new GrowthList();
    }

    public String getName() {
        return sampleName;
    }
}
