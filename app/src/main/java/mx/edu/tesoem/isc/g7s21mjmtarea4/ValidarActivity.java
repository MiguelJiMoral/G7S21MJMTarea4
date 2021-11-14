package mx.edu.tesoem.isc.g7s21mjmtarea4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ValidarActivity extends AppCompatActivity {
    TextView txtsaludo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validar);
         txtsaludo = findViewById(R.id.saludo);

         Bundle parametros = getIntent().getExtras();
         txtsaludo.setText("Bienvenido"+ parametros.getString("nombre"));
    }
}