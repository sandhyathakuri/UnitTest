
/*
package com.Junit.example;

import com.junitClass.example.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import  static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertAllExample {

    @Test
    public void groupedAssetions(){
        Student studentOne =new Student("TestUserOne ", "TestUserTwo");

        assertAll("Student", () ->
                assertEquals("TestUserOne",studentOne.getFirstName()),
                () -> assertEquals("TestUserLaSTName",studentOne.getLastName()));
    }

    @Test
    public void dependentAssertions(){
        //within a block of an assertions fails the
        //subsequent code in the same block will be skipped

        Student student = new Student("Mike", "Miller");

        assertAll("Properties",
                ()->{String firstName = Student.getFirstName();
                    Assertions.assertNotEquals(firstName);

                    assertAll("First Name",() -> Assertions.assertTrue(firstName.equalsIgnoreCase
                            ("mIKE")));

                });
    }
}
*/