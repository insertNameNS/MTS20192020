package insert.name.mts2019_2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Kompas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kompas);
        setTitle("Kompas");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
