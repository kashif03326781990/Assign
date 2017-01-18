package kashif.example.com.assignment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText uname,pass;
    Button login,saveS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname = (EditText) findViewById(R.id.editText);
        pass  = (EditText) findViewById(R.id.editText2);
        login   = (Button) findViewById(R.id.login);
        saveS = (Button) findViewById(R.id.ss);

        saveS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sp = getSharedPreferences("Info", Context.MODE_PRIVATE);

                SharedPreferences.Editor editor = sp.edit();

                editor.putString("username",uname.getText().toString());
                editor.putString("password",pass.getText().toString());
                editor.apply();

                Toast.makeText(getApplicationContext(),"Sessions Save",Toast.LENGTH_LONG).show();
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(uname.getText().toString().equals("kashif") && pass.getText().toString().equals("789"))
                {
                    Intent i = new Intent(MainActivity.this,Main2Activity.class);

                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Username or Password is Incorrect",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
