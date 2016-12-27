package com.test.diablo;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.hasSibling;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

/**
 * Created by Diablo on 2016/12/23.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityInstrumentationTest {
    private static final String NAME = "shenyonghe";
    private static final String PW = "taishuaile";

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Rule
    public ActivityTestRule<SecondAct> mSecondActivityRule = new ActivityTestRule<>(
            SecondAct.class);

    @Test
    public void test_login() {
        onView(withId(R.id.et_name)).perform(typeText(NAME), closeSoftKeyboard());
        delay(2);
        onView(withId(R.id.et_password)).perform(typeText(PW), closeSoftKeyboard());
        delay(2);
        onView(withId(R.id.loginBtn)).perform(click());
        delay(2);
        test_listview();
    }


    public void test_listview() {
        //点击可见的item
        onView(allOf(withId(R.id.id_num), hasSibling(withText("C")))).perform(click());
        delay (2);
        test_dialog();
    }

    public void test_dialog(){
        onView(withId(R.id.sure)).perform(click());
        delay (2);
    }

    public static void delay(double d) {
        try {
            Thread.sleep((long) (d * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
