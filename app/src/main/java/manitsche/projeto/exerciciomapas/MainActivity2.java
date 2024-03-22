package manitsche.projeto.exerciciomapas;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.github.chrisbanes.photoview.PhotoView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        PhotoView layoutPhotoView = findViewById(R.id.layoutPhotoView);
        Button bVoltar = findViewById(R.id.bVoltar);
        TextView textView = findViewById(R.id.textView);
        TextView tInformacaoEstado = findViewById(R.id.tInformacaoEstado);

        String estado = getIntent().getStringExtra("estado");

        if (estado.equals("RS") || estado.equals("rs")) {
            textView.setText("Rio Grande do Sul");
            layoutPhotoView.setImageResource(R.drawable.rio_grande_do_sul);
            tInformacaoEstado.setText("População: Aproximadamente 11.422.973 (2020)\n" + "Área: Cerca de 281.748 km²\n" + "IDH: 0,774 (2019)\n" + "Número de municípios: 497");
        }
        if (estado.equals("SC") || estado.equals("sc")) {
            textView.setText("Santa Catarina");
            layoutPhotoView.setImageResource(R.drawable.santa_catarina);
            tInformacaoEstado.setText("População: Aproximadamente 7.252.502 (2020)\n" + "Área: Cerca de 95.736 km²\n" + "IDH: 0,774 (2019)\n" + "Número de municípios: 295");
        }
        if (estado.equals("PR") || estado.equals("pr")) {
            textView.setText("Paraná");
            layoutPhotoView.setImageResource(R.drawable.parana);
            tInformacaoEstado.setText("População: Aproximadamente 11.516.840 (2020)\n" + "Área: Cerca de 199.314 km²\n" + "IDH: 0,770 (2019)\n" + "Número de municípios: 399");
        }

        bVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}