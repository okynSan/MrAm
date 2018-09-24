package ua.am.mr.mram;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;

import retrofit2.Call;
import ua.am.mr.mram.controller.login.ILoginController;
import ua.am.mr.mram.controller.login.LoginController;
import ua.am.mr.mram.model.login.GlobalToken;
import ua.am.mr.mram.model.login.LoginResponse;
import ua.am.mr.mram.service.login.ILoginService;
import ua.am.mr.mram.service.utils.ApiFactory;

public class LoginActivity extends AppCompatActivity {

    private EditText loginField;
    private EditText passwordField;
    private Button loginButton;
    private TextView badCreditionalsLabel;
    private ILoginController iLoginController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

        this.iLoginController = new LoginController();
        this.loginField = (EditText) findViewById(R.id.loginField);
        this.passwordField = (EditText) findViewById(R.id.passwordField);
        this.loginButton = (Button) findViewById(R.id.loginButton);
        this.badCreditionalsLabel = (TextView) findViewById(R.id.badCreditionalsLabel);
        badCreditionalsLabel.setVisibility(View.INVISIBLE);

    }

    public void login(View view) {
        badCreditionalsLabel.setVisibility(View.INVISIBLE);

        if (iLoginController.isLogedIn(loginField.getText().toString(), passwordField.getText().toString())) {
            Intent orderIntent = new Intent(LoginActivity.this, OrderActivity.class);
            LoginActivity.this.startActivity(orderIntent);
        } else {
            badCreditionalsLabel.setVisibility(View.VISIBLE);
        }
    }

}
