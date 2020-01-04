package insert.name.mts2019_2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ListaSluzbi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sluzbi);
        setTitle("Lista sluzbi po drzavama");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
