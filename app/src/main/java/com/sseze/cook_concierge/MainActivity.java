package com.sseze.cook_concierge;

import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewById(R.id.text_form)
    EditText mTextForm;

    @ViewById(R.id.send_button)
    Button mButton;

    @Click(R.id.send_button)
    void send() {
        String textFormStr = mTextForm.getText().toString();

        if (TextUtils.isEmpty(textFormStr)) {
            Toast.makeText(this, "テキストを入力してください", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, textFormStr, Toast.LENGTH_LONG).show();
        }
    }
}
