package sg.edu.rp.c346.id20024402.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lvExamTips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips = findViewById(R.id.listViewExamTips);

        String[] examtips = new String[5];

        examtips[0] = "Don't just read the code, code it as much as possible during each practical session";
        examtips[1] = "Seek help from the lecturer ASAP, don't wait till you lost in the jungle";
        examtips[2] = "Prepare your template source code for each topic";
        examtips[3] = "Create a few empty Android projects to speed up your coding during the exam";
        examtips[4] = "Ensure that your Android Studio is up and running before the exam";

        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, examtips);

        lvExamTips.setAdapter(adapter);

    }

}