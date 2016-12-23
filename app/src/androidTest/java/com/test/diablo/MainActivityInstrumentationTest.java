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
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Diablo on 2016/12/23.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityInstrumentationTest {
    private static final String STRING_TO_BE_TYPED = "Shenyonghe";

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void sayHello() {
        onView(withId(R.id.editText)).perform(typeText(STRING_TO_BE_TYPED));
        onView(withId(R.id.editText)).perform(closeSoftKeyboard());
        onView(withText("Say hello!")).perform(click());
        onView(withId(R.id.textView)).check(matches(withText(STRING_TO_BE_TYPED)));
    }

    public static void delay(double d) {
        try {
            Thread.sleep((long) (d * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
