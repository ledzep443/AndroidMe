package com.purnellsoftwaredevelopment.androidme.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import com.purnellsoftwaredevelopment.androidme.R;
import com.purnellsoftwaredevelopment.androidme.data.AndroidImageAssets;

public class AndroidMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_me);
        if (savedInstanceState == null) {
            BodyPartFragment headFragment = new BodyPartFragment();
            // Use FragmentManager and transaction to add the fragment to the screen
            FragmentManager fragmentManager = getSupportFragmentManager();
            // Set the list of image id's for the head fragment and set the position to the second head
            headFragment.setImageIds(AndroidImageAssets.getHeads());
            headFragment.setListIndex(1);
            // Fragment transaction
            fragmentManager.beginTransaction()
                    .add(R.id.head_container, headFragment)
                    .commit();
            // Create a BodyPartFragment for the body image
            BodyPartFragment bodyFragment = new BodyPartFragment();
            // Set the list of image id's for the body fragment and set the position to the second body
            bodyFragment.setImageIds(AndroidImageAssets.getBodies());
            bodyFragment.setListIndex(1);
            fragmentManager.beginTransaction()
                    .add(R.id.body_container, bodyFragment)
                    .commit();
            // Create a BodyPartFragment for the leg image
            BodyPartFragment legFragment = new BodyPartFragment();
            // Set the list of image id's for the leg fragment and set the position to the second leg
            legFragment.setImageIds(AndroidImageAssets.getLegs());
            legFragment.setListIndex(1);
            fragmentManager.beginTransaction()
                    .add(R.id.leg_container, legFragment)
                    .commit();
        }

    }
}