package ru.max;

import org.springframework.stereotype.Component;

@Component("injectSimpleConfig")
public class InjectSimpleConfig {

    private final String name = "John Mayer";
    private final String name1 = "John Travolta";
    private final int age = 39;
    private final float height = 1.92f;
    private final boolean programmer = false;
    private final long ageInSecond = 1_234_567_891_011_121_314L;

    public String getName1() {
        return name1;
    }

    public long getAgeInSecond() {
        return ageInSecond;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public boolean isProgrammer() {
        return programmer;
    }
}
