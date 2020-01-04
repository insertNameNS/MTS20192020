package insert.name.mts2019_2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PodesavanjaSosPoruke extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podesavanja_sos_poruke);
        setTitle("Podesavanje SOS poruke");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
