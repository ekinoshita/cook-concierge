package com.sseze.cook_concierge;

import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewById(R.id.text_form)
    EditText mTextForm;

    @ViewById(R.id.send_button)
    Button mButton;
}
