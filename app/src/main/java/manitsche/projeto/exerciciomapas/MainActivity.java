package manitsche.projeto.exerciciomapas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextInputEditText cEstado = findViewById(R.id.cEstado);
        PhotoView layoutPhotoView = findViewById(R.id.layoutPhotoView);
        Button bMostrarInformacoes = findViewById(R.id.bMostrarInformacoes);

        layoutPhotoView.setImageResource(R.drawable.regiao_sul);

        bMostrarInformacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("estado", cEstado.getText().toString());
                startActivity(intent);
            }
        });
    }
}

