package kashif.example.com.assignment;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tv = (TextView) findViewById(R.id.display);

        SharedPreferences sp = getSharedPreferences("Info", Context.MODE_PRIVATE);
        String name = sp.getString("username","");

        tv.setText("Welcome "+ name);


    }
}
