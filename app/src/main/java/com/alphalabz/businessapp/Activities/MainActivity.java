package com.alphalabz.businessapp.Activities;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.alphalabz.businessapp.Fragments.FragmentHome;
import com.alphalabz.businessapp.R;
import com.mikepenz.fontawesome_typeface_library.FontAwesome;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.Nameable;

public class MainActivity extends AppCompatActivity {

    private Drawer drawer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        View headerView = View.inflate(this,R.layout.drawer_account_header,null);
        headerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this,"Profile was clicked",Toast.LENGTH_SHORT).show();
            }
        });

        //Create the drawer
        drawer = new DrawerBuilder(this)
                .withToolbar(toolbar)
                .withHeader(headerView)
                .withFullscreen(true)
                .withActionBarDrawerToggleAnimated(true)
                .withDrawerWidthRes(R.dimen._240sdp)
                .withActionBarDrawerToggleAnimated(true)
                .addDrawerItems(
                        new PrimaryDrawerItem().withName("Home").withIcon(FontAwesome.Icon.faw_home),
                        new PrimaryDrawerItem().withName("Notifications").withIcon(FontAwesome.Icon.faw_bell),
                        new PrimaryDrawerItem().withName("About").withIcon(FontAwesome.Icon.faw_coffee),
                        new PrimaryDrawerItem().withName("Team").withIcon(FontAwesome.Icon.faw_group),
                        new PrimaryDrawerItem().withName("Images").withIcon(FontAwesome.Icon.faw_image),
                        new PrimaryDrawerItem().withName("Videos").withIcon(FontAwesome.Icon.faw_play_circle),
                        new PrimaryDrawerItem().withName("Blog").withIcon(FontAwesome.Icon.faw_quote_left),
                        new PrimaryDrawerItem().withName("Social Feeds").withIcon(FontAwesome.Icon.faw_comment),
                        new PrimaryDrawerItem().withName("Event").withIcon(FontAwesome.Icon.faw_calendar),
                        new PrimaryDrawerItem().withName("Contact Us").withIcon(FontAwesome.Icon.faw_phone),
                        new PrimaryDrawerItem().withName("Profile").withIcon(FontAwesome.Icon.faw_user),
                        new PrimaryDrawerItem().withName("Settings").withIcon(FontAwesome.Icon.faw_cog),
                        new PrimaryDrawerItem().withName("Logout")

                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int i, IDrawerItem drawerItem) {

                        if (drawerItem != null && drawerItem instanceof Nameable) {
                            String name = ((Nameable) drawerItem).getName().getText(MainActivity.this);
                            getSupportActionBar().setTitle(name);
                            final Fragment fragment;
                            switch (i) {
                                case 1:
                                    fragment = new FragmentHome();
                                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
                                    break;
                            }
                        }

                        return false;
                    }
                })
                .withOnDrawerListener(new Drawer.OnDrawerListener() {
                    @Override
                    public void onDrawerOpened(View drawerView) {
                    }

                    @Override
                    public void onDrawerClosed(View drawerView) {
                    }

                    @Override
                    public void onDrawerSlide(View drawerView, float slideOffset) {
                    }
                })
                .withFireOnInitialOnClick(false)
                .withSavedInstance(savedInstanceState)
                .build();

        drawer.setSelectionAtPosition(1, true);


    }
}
