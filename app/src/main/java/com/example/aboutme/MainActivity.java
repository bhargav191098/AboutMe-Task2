package com.example.aboutme;

import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //simulateDayNight(/* DAY */ 0);
        //Element adsElement = new Element();
        //adsElement.setTitle("My Links!");
        String des = "Hey this is Bhargav. I am pursuing my Bachelor of Engineering Degree in CSE from College Of Engineering, Guindy. I have a flair for Android Development and Python Projects.\n" +
                "I'm an open source enthusiast taking baby steps in the world of Linux.\n" +
                "The links to my profiles is below. Check them out.";
        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setDescription(des)
                .setImage(R.drawable.bhargav)
                //.addItem(new Element().setTitle("Version 6.2"))
                //.addItem(adsElement)
                .addGroup("Connect with me!")
                .addGitHub("bhargav191098","See my projects on GitHub")
                .addEmail("bhargav3514@gmail.com","Email Me")
                //.addWebsite("http://medyo.github.io/")
                .addWebsite("https://www.linkedin.com/in/bhargav-krishnamurthy-439973158/","My LinkedIn Profile")
                .addFacebook("gizmophilebhargav","Facebook Account")

                //.addTwitter("medyo80")
                //.addYoutube("UCdPQtdWIsg7_pi4mrRu46vA")
                //.addPlayStore("com.ideashower.readitlater.pro")
                //.addInstagram("medyo80")

                //.addItem(getCopyRightsElement())
                .create();
        //aboutPage.getBackground(R.color.PeachPuff);
        aboutPage.setBackgroundResource(R.color.PeachPuff);
        aboutPage.setBackgroundColor(Color.parseColor("#4CB8FB"));
        setContentView(aboutPage);
    }
}

