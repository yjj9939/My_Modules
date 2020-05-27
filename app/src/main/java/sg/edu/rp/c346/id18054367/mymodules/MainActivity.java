package sg.edu.rp.c346.id18054367.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC346;
    TextView tvC349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvC346 = findViewById(R.id.AndroidProgramming);
        tvC349 = findViewById(R.id.IPadProgramming);

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("moduleCode","C346");
                intent.putExtra("moduleName","Android Programming");
                intent.putExtra("academicYear","2020");
                intent.putExtra("sem",1);
                intent.putExtra("moduleCredit",4);
                intent.putExtra("venue","W66M");
                startActivity(intent);
            }
        });

        tvC349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("moduleCode","C349");
                intent.putExtra("moduleName","iPad Programming");
                intent.putExtra("academicYear","2020");
                intent.putExtra("sem",1);
                intent.putExtra("moduleCredit",4);
                intent.putExtra("venue","W66N");
                startActivity(intent);
            }
        });
    }
}
