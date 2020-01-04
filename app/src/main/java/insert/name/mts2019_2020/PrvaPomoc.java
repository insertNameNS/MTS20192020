package insert.name.mts2019_2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PrvaPomoc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prva_pomoc);
        setTitle("Prva pomoc");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
