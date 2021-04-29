package com.example.bottomnav;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SmurfDetails extends AppCompatActivity {

    public final static String details = "SMURF_Details";

    private ImageView iv_photo;
    private TextView tv_name;
    private TextView tv_summary;
    private SmurfsModel smurfsDetails;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smurf_details);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        iv_photo = findViewById(R.id.iv_detail);
        tv_name = findViewById(R.id.tv_detailName);
        tv_summary = findViewById(R.id.tv_detailSummary);

    }

    @Override
    protected void onStart() {
        super.onStart();
        smurfsDetails = getIntent().getParcelableExtra(details);
        iv_photo.setImageResource(smurfsDetails.getPhoto());
        tv_name.setText(smurfsDetails.getName());
        tv_summary.setText(smurfsDetails.getSummary());
        getSupportActionBar().setTitle(smurfsDetails.getName());

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

//    public void backButton(View view) {
//        Intent back = new Intent(SmurfDetails.this, MainActivity.class);
//        startActivity(back);
//    }


}