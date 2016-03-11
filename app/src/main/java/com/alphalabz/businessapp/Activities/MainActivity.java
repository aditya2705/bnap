package com.alphalabz.businessapp.Activities;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.alphalabz.businessapp.Fragments.ContactFormFragment;
import com.alphalabz.businessapp.Fragments.ContactFragment;
import com.alphalabz.businessapp.Fragments.ContactUsFragment;
import com.alphalabz.businessapp.Fragments.FragmentBlog;
import com.alphalabz.businessapp.Fragments.FragmentEvent;
import com.alphalabz.businessapp.Fragments.FragmentHome;
import com.alphalabz.businessapp.Fragments.GalleryFragment;
import com.alphalabz.businessapp.Fragments.PhotoCategoryFragment;
import com.alphalabz.businessapp.Fragments.TeamFragment;
import com.alphalabz.businessapp.Fragments.VideosFragment;
import com.alphalabz.businessapp.R;
import com.mikepenz.fontawesome_typeface_library.FontAwesome;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.Nameable;

public class MainActivity extends AppCompatActivity {

    private Drawer drawer = null;
    private final static int D_HOME = 1;
    private final static int D_NOTIFICATION = 2;
    private final static int D_ABOUT = 3;
    private final static int D_TEAM = 4;
    private final static int D_IMAGES = 5;
    private final static int D_VIDEOS = 6;
    private final static int D_BLOGS = 7;
    private final static int D_SOCIALFEEDS = 8;
    private final static int D_EVENT = 9;
    private final static int D_CONTACTUS = 10;
    private final static int D_PROFILE = 11;
    private final static int D_SETTINGS = 12;
    private final static int D_LOGOUT = 13;


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
                                case D_HOME:
                                    fragment = new FragmentHome();
                                    break;

                                case D_IMAGES:
                                    fragment = new PhotoCategoryFragment();
                                    break;
                                case D_VIDEOS:
                                    fragment = new VideosFragment();
                                    break;
                                case D_TEAM:
                                    fragment = new TeamFragment();
                                    break;
                                case D_EVENT:
                                    fragment = new FragmentEvent();
                                    break;
                                case D_CONTACTUS:
                                    fragment = new ContactFragment();
                                    break;
                                case D_BLOGS:
                                    fragment = new FragmentBlog();
                                    break;
                                default:
                                    fragment = new FragmentHome();
                                    break;

                            }
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
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
