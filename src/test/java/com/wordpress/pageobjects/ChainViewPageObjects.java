package com.wordpress.pageobjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;

import static io.appium.java_client.pagefactory.LocatorGroupStrategy.CHAIN;

/**
 * Created by saikrisv on 12/29/16.
 */
public class ChainViewPageObjects {

    @AndroidFindBy(className = "android.widget.ScrollView")
    @AndroidFindBy(accessibility = "container2")
    @AndroidFindBy(accessibility = "textView")
    public MobileElement views;

    }

/**
 * ((AndroidDriver) driver).
 * findElementByAndroidUIAutomator("new UiSelector().resourceId(\"org.wordpress.android:id/stats_latest_post_tabs\")").
 * findElementByAndroidUIAutomator(("new UiSelector().resourceId(\"org.wordpress.android:id/stats_visitors_and_views_tab_inner_container\").enabled(true).instance(2)")).
 * findElement(MobileBy.id("stats_visitors_and_views_tab_value")).getText()
 *
 */