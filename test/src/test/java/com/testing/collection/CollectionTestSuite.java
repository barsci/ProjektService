package com.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){

        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        ArrayList<Integer> test = new ArrayList<>();

        test=exterminator.exterminate(test);
        Assert.assertTrue(test.isEmpty());
        System.out.println("Pusta lista");

    }

    @Test
    public void testOddNumbersExterminatorNormalList(){

        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        ArrayList<Integer> test = new ArrayList<>();
        for(int i=0;i<7;i++){
            test.add(i);
        }

        test = exterminator.exterminate(test);

        for(int i=0;i<test.size();i++) {
            Assert.assertTrue(test.get(i)%2==0);
        }
        System.out.println("Nie ma nieparzystych");

    }
}
