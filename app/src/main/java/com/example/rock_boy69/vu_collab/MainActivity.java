package com.example.rock_boy69.vu_collab;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private Button mLogin,mForgotPassword;
    private EditText mUsername,mPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.main_page_toolbar);
        mLogin = (Button) findViewById(R.id.loin_button);
        mForgotPassword= (Button) findViewById(R.id.forgot_button);
        mUsername = (EditText) findViewById(R.id.email_editText);
        mPassword = (EditText) findViewById(R.id.pass_editText);

        Spinner SpinnerLanguage = (Spinner) findViewById(R.id.Spinner_Language);

        ArrayAdapter<String> myAdapter =new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Languages));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpinnerLanguage.setAdapter(myAdapter);


        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Victoria University");



        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = mUsername.getText().toString();

                if(username.equals("") || username.equals("")){
                    Intent mainPage = new Intent(MainActivity.this,SystemActivity.class);
                    startActivity(mainPage);
                }else{
                    toastMessage("Username or password Incorrect! Please try again");
                }
            }
        });
    }

    private void toastMessage(String message){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
    }
}
