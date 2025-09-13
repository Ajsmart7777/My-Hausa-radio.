package com.auwal.hausaradio;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        TextView title = findViewById(R.id.aboutTitle);
        TextView dev = findViewById(R.id.devName);
        TextView email = findViewById(R.id.devEmail);
        TextView phone = findViewById(R.id.devPhone);
        TextView policy = findViewById(R.id.privacyText);
        Button btnEmail = findViewById(R.id.btnEmail);
        Button btnCall = findViewById(R.id.btnCall);
        Button btnOnline = findViewById(R.id.btnOnline);

        title.setText(getString(R.string.about_title));
        dev.setText(getString(R.string.developer_name));
        email.setText(getString(R.string.developer_email));
        phone.setText(getString(R.string.developer_phone));
        policy.setText(getString(R.string.privacy_text));

        btnEmail.setOnClickListener(v -> {
            Intent i = new Intent(Intent.ACTION_SENDTO);
            i.setData(Uri.parse("mailto:" + getString(R.string.developer_email)));
            startActivity(i);
        });
        btnCall.setOnClickListener(v -> {
            Intent i = new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:" + getString(R.string.developer_phone)));
            startActivity(i);
        });
        btnOnline.setOnClickListener(v -> {
            // Placeholder link - you can host the privacy policy online and replace this URL
            String url = "https://example.com/privacy_policy.html";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });
    }
}
