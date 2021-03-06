package com.alphalabz.businessapp.Activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.alphalabz.businessapp.Fragments.BlogListFragment;
import com.alphalabz.businessapp.Fragments.ContactFragment;
import com.alphalabz.businessapp.Fragments.CustomEventFragment;
import com.alphalabz.businessapp.Fragments.FaqFragment;
import com.alphalabz.businessapp.Fragments.HomeFragment;
import com.alphalabz.businessapp.Fragments.PhotoCategoryFragment;
import com.alphalabz.businessapp.Fragments.SettingsFragment;
import com.alphalabz.businessapp.Fragments.SocialFeedFragment;
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
    private final static int D_FAQS = 11;
    private final static int D_PROFILE = 12;
    private final static int D_SETTINGS = 13;
    private final static int D_LOGOUT = 14;
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
                        new PrimaryDrawerItem().withName("FAQs").withIcon(FontAwesome.Icon.faw_phone),
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
                            Fragment fragment = null;
                            switch (i) {
                                case D_HOME:
                                    fragment = new HomeFragment();
                                    break;
                                case D_NOTIFICATION:
                                    fragment = new HomeFragment();
                                    break;
                                case D_ABOUT:
                                    fragment = new HomeFragment();
                                    break;
                                case D_TEAM:
                                    fragment = new TeamFragment();
                                    break;
                                case D_IMAGES:
                                    fragment = new PhotoCategoryFragment();
                                    break;
                                case D_VIDEOS:
                                    fragment = new VideosFragment();
                                    break;
                                case D_BLOGS:
                                    fragment = new BlogListFragment();
                                    break;
                                case D_SOCIALFEEDS:
                                    fragment = new SocialFeedFragment();
                                    break;
                                case D_EVENT:
                                    fragment = new CustomEventFragment();
                                    break;
                                case D_CONTACTUS:
                                    fragment = new ContactFragment();
                                    break;
                                case D_FAQS:
                                    fragment = new FaqFragment();
                                    break;
                                case D_PROFILE:
                                    fragment = new HomeFragment();
                                    break;
                                case D_SETTINGS:
                                    fragment = new SettingsFragment();
                                    break;
                                case D_LOGOUT:
                                    fragment = new HomeFragment();
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

    public void togglestatehandler(View v){

    }
}
