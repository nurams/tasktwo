package task.one.taskcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class tambah extends AppCompatActivity {
    private Button B1;
    private TextView Thasil;
    private EditText edA2, edA1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah);

        Thasil = findViewById(R.id.Thasil);
        edA1 = findViewById(R.id.edA1);
        edA2 = findViewById(R.id.edA2);
        B1 = findViewById(R.id.B1);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sAngka1 = edA1.getText().toString();
                    String sAngka2 = edA2.getText().toString();


                    double angka1 = Double.parseDouble(sAngka1);
                    double angka2 = Double.parseDouble(sAngka2);


                    double hasil = angka1 + angka2;

                    String sHasil = String.valueOf(hasil);
                    Thasil.setText(sHasil);

                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "lalalal", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}
