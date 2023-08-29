package com.curso.android.app.practica.proyectoargpr

import android.app.Instrumentation
import android.provider.Settings
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.replaceText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class )
class TestInst {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun disAnimation()
    {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        val transitionDuration = 0
        Settings.Global.putFloat(context.contentResolver, Settings.Global.ANIMATOR_DURATION_SCALE, transitionDuration.toFloat())
        Settings.Global.putFloat(context.contentResolver, Settings.Global.TRANSITION_ANIMATION_SCALE, transitionDuration.toFloat())
        Settings.Global.putFloat(context.contentResolver, Settings.Global.WINDOW_ANIMATION_SCALE, transitionDuration.toFloat())

    }

    @Test
    fun testCompacionButton()
    {
        onView(withId(com.curso.android.app.practica.proyectoargpr.R.id.editTextText)).perform(replaceText("hola"))
        onView(withId(com.curso.android.app.practica.proyectoargpr.R.id.editTextText2)).perform(replaceText("hola"))

        onView(withId(com.curso.android.app.practica.proyectoargpr.R.id.button1)).perform(click())

        onView(withId(com.curso.android.app.practica.proyectoargpr.R.id.textView)).check(matches(withText("Iguales")))
    }
}