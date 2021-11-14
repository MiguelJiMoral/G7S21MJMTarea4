package mx.edu.tesoem.isc.g7s21mjmtarea4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtuser, txtcontraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtuser = findViewById(R.id.nombre);
        txtcontraseña = findViewById(R.id.contraseña);
    }
    public void presiona(View v){
        String user = "Miguel";
        String contra = "Android2021";
        if (user.equals(txtuser.getText().toString()) && contra.equals(txtcontraseña.getText().toString())){
            Intent intent = new Intent(this,ValidarActivity.class);
            intent.putExtra("nombre", txtuser.getText().toString());
            startActivity(intent);
            finish();

        }   else{
            Toast.makeText(this, "Error Usuario y o Contraseña equivocados", Toast.LENGTH_SHORT).show();
        }
    }
}