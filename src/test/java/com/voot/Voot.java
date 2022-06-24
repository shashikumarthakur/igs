package com.voot;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.applitools.eyes.visualgrid.model.DeviceName;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Voot {

	@Test
	public static void test() throws MalformedURLException {
		URL url=new URL("http://localhost:4723/wd/hub");
		
		
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "POCO C31");
		cap.setCapability(MobileCapabilityType.UDID, "5HNNH6XCEINZAYEU");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.VERSION, "10");
		cap.setCapability("appPackage", "com.tv.v18.viola");
		cap.setCapability("appActivity", ".view.activity.SVSplashScreenActivity");
		AndroidDriver driver=new AndroidDriver(url,cap);
	}
}
