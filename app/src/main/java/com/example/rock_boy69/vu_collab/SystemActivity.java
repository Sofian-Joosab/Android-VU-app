package com.example.rock_boy69.vu_collab;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class SystemActivity extends AppCompatActivity {


    private Toolbar mToolbar;
    private ViewPager mViewPager;
    private SectionPagerAdapter mSectionsPager;
    private TabLayout mTabLayout;

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.system_activity);
        mToolbar = findViewById(R.id.main_page_toolbar);

        setSupportActionBar(mToolbar);
        try{
            getSupportActionBar().setTitle("My Space");
        }catch (NullPointerException ex){

        }

        mDrawerLayout = findViewById(R.id.drawer_layout);
        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.Open, R.string.Close);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Tabs
        mViewPager = findViewById(R.id.main_TabPage);
        mSectionsPager = new SectionPagerAdapter(getSupportFragmentManager());

        mViewPager.setAdapter(mSectionsPager);

        mTabLayout = findViewById(R.id.main_tabs);
        mTabLayout.setupWithViewPager(mViewPager);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        getMenuInflater().inflate(R.menu.main_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
         super.onOptionsItemSelected(item);

         if (item.getItemId() == R.id.Main_menu){
             Intent mainPage = new Intent(SystemActivity.this,SystemActivity.class);
             startActivity(mainPage);
         }

         if (mToggle.onOptionsItemSelected(item)){
             return true;
         }

        return true;
    }

    private void toastMessage(String message){
        Toast.makeText(this,message, Toast.LENGTH_LONG).show();
    }


}
