package com.example.healerfinder;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class Homescreen extends AppCompatActivity implements View.OnClickListener {

    GoogleSignInClient mGoogleSignInClient;
    String name, email;
    CardView openmap;
    CardView openmap2;
    CardView openload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);

        TextView tvName = (TextView) findViewById(R.id.tvname);
        TextView tvEmail = (TextView) findViewById(R.id.email);

        name = getIntent().getStringExtra("Name");
        email = getIntent().getStringExtra("Email");

        tvName.setText(name);
        tvEmail.setText(email);

        openmap = (CardView) findViewById(R.id.buttonMap);
        openmap.setOnClickListener(this);

        openmap2 = (CardView) findViewById(R.id.buttonMap2);
        openmap2.setOnClickListener(this);

        openload = (CardView) findViewById(R.id.buttonLoad);
        openload.setOnClickListener(this);

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

        // Build a GoogleSignInClient with the options specified by gso.
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);
    }

    public boolean onCreateOptionsMenu(Menu menu){

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu); // resource.directory.xml, variable param

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){

        switch(item.getItemId()){

            case R.id.developer:

                Toast.makeText(this,"Student's Information",Toast.LENGTH_LONG).show();
                //connect and display activitytab :
                Intent intentDev = new Intent(this, Developer.class);
                startActivity(intentDev);
                break;

            case R.id.aboutapp:

                Toast.makeText(this,"Health App Information",Toast.LENGTH_LONG).show();
                Intent intentAbt = new Intent(this, AboutApp.class);
                startActivity(intentAbt);
                break;

            case R.id.signout:
                signOut();
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
   public void onClick(View view) {

        switch (view.getId()) {

            case R.id.buttonMap:
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), MapsActivity.class);
                startActivity(intent);
                break;

            case R.id.buttonMap2:
                Intent intent2 = new Intent();
                intent2.setClass(getApplicationContext(), MapsActivity2.class);
                startActivity(intent2);
                break;

            case R.id.buttonLoad:
                Intent intent3 = new Intent();
                intent3.setClass(getApplicationContext(), Server.class);
                startActivity(intent3);
                break;
        }

    }

    private void signOut() {
        mGoogleSignInClient.signOut()
                .addOnCompleteListener(this, new OnCompleteListener<Void>() {
                   @Override
          public void onComplete(@NonNull Task<Void> task) {
                      Toast.makeText(getApplicationContext(),email +" signed out",Toast.LENGTH_SHORT).show();
                        finish();
                    }
             });
    }

}