package com.example.edittext;

import  android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.util.Log;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;
import  static  android.support.test.espresso.action.ViewActions.click;
import  static  android.support.test.espresso.matcher.ViewMatchers.withId;

public class MainActivityTest {

    @Rule
    public  ActivityTestRule<MainActivity> activityTestRule = new  ActivityTestRule<>(MainActivity.class);
    private  MainActivity mainActivity = null;

    @Before
    public void setUp() throws Exception {
        mainActivity = activityTestRule.getActivity();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void onCreate() {
        Log.d("TAG","onCreate()");
    }

    @Test
    public void btn_click() {
        Log.d("TAG","Button was clicked");
    }

    @Test
    public  void  testClickButton(){
        Espresso.onView(withId(R.id.btn)).perform(click());
    }

}