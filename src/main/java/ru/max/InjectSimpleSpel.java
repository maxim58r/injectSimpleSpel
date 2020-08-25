package ru.max;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class InjectSimpleSpel {
    @Value("#{injectSimpleConfig.name}")
    private String name;
    @Value("#{injectSimpleConfig.age}")
    private int age;
    @Value("#{injectSimpleConfig.height}")
    private float height;
    @Value("#{injectSimpleConfig.programmer}")
    private boolean programmer;
    @Value("#{injectSimpleConfig.ageInSecond}")
    private long ageInSecond;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean isProgrammer() {
        return programmer;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    public long getAgeInSecond() {
        return ageInSecond;
    }

    public void setAgeInSecond(long ageInSecond) {
        this.ageInSecond = ageInSecond;
    }

    @Override
    public String toString() {
        return "InjectSimpleSpel: " + '\n' +
                "name= " + name + '\n' +
                "age= " + age + '\n' +
                "height= " + height + '\n' +
                "Is programmer= " + programmer + '\n' +
                "ageInSecond= " + ageInSecond;
    }
}