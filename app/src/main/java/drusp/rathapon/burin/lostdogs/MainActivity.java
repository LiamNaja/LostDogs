package drusp.rathapon.burin.lostdogs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Exolicit
    private Button signInButton, signUpButton;
    private EditText userEditText, passwordEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initial View
        initilaview();

        // Button Controller
        buttonController();

    } // Main Method

    private void buttonController() {
        signInButton.setOnClickListener(MainActivity.this);
        signUpButton.setOnClickListener(MainActivity.this);
    }

    private void initilaview() {
        signInButton = (Button) findViewById(R.id.btnSignIn);
        signUpButton = (Button) findViewById(R.id.btnSignUp);
        userEditText = (EditText) findViewById(R.id.edtUser);
        passwordEditText = (EditText) findViewById(R.id.edtPassword);

    }

    @Override
    public void onClick(View view) {

        // For SugnIn
        if (view == signInButton) {
            startActivity(new Intent(MainActivity.this, Service.class));
        }

        // For SignUp
        if (view == signUpButton) {
            startActivity(new Intent(MainActivity.this, SignUp.class));
        }

    } // On click
} // Main Clss
