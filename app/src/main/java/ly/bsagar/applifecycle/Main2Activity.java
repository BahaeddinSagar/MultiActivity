package ly.bsagar.applifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        int c = intent.getIntExtra("count", -10);
        int d = intent.getIntExtra("notfound", -100);
        String name = intent.getStringExtra("MyName");

        TextView textView = findViewById(R.id.textview2);
        textView.setText("the passed string is : "+name +"\n passed int is : "+ c+
                "\n not found int : "+d);
    }

    public void gotoURL(View view) {
        Intent in = new Intent(
                Intent.ACTION_VIEW);
        in.setData(Uri.parse(
                "http://www.google.com"));
        if(in.resolveActivity(
                getPackageManager()) != null) {
            startActivity(in);
        }
        else{
            Toast.makeText(this, "No app available to handle intent", Toast.LENGTH_SHORT).show();
        }

    }
}
