package ly.bsagar.applifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String TAG = "Life Cycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");

        Button button1 = findViewById(R.id.button1);
        /*button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                        startActivity(intent);
                    }
                }

        );
        */
        button1.setOnLongClickListener
                (new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(MainActivity.this, "Long Press", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

    }

    public void goToActivity2(View view) {
        Intent i = new Intent
                (
                        this,
                        Main2Activity.class);
        i.putExtra("count",5);
        String name = "baha";
        i.putExtra("MyName",name);
        startActivity(i);
    }
}
