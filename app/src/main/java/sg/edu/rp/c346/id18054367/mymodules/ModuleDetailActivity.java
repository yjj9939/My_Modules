package sg.edu.rp.c346.id18054367.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvmoduleCode;
    TextView tvmoduleName;
    TextView tvacademicYear;
    TextView tvsem;
    TextView tvmoduleCredit;
    TextView tvVenue;
    Button btnReturn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvmoduleCode = findViewById(R.id.ModuleCode);
        tvmoduleName = findViewById(R.id.ModuleName);
        tvacademicYear = findViewById(R.id.AcademicYear);
        tvsem = findViewById(R.id.Semester);
        tvmoduleCredit = findViewById(R.id.ModuleCredit);
        tvVenue = findViewById(R.id.Venue);
        btnReturn = findViewById(R.id.btnReturn);

        Intent intentReceived = getIntent();
        String moduleCodeSelected = intentReceived.getStringExtra("moduleCode");
        tvmoduleCode.setText("Module Code: " + moduleCodeSelected);

        String moduleNameSelected = intentReceived.getStringExtra("moduleName");
        tvmoduleName.setText("Module Name: " + moduleNameSelected);

        String academicYearSelected = intentReceived.getStringExtra("academicYear");
        tvacademicYear.setText("Academic Year : " + academicYearSelected);

        int semSelected = intentReceived.getIntExtra("sem", 1);
        tvsem.setText("Semester : " + semSelected);

        int moduleCreditSelected = intentReceived.getIntExtra("moduleCredit" , 0);
        tvmoduleCredit.setText("Module Credit : " + moduleCreditSelected);

        String venueSelected = intentReceived.getStringExtra("venue");
        tvVenue.setText("Venue : " + venueSelected);

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
