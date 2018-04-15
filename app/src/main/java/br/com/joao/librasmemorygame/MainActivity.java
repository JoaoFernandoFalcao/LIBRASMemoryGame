package br.com.joao.librasmemorygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imagemPB = (ImageView) findViewById(R.id.imageView01);
        Button botaoComecar = (Button) findViewById(R.id.button01);

        imagemPB.setClickable(true);
        imagemPB.setOnClickListener(this);

        botaoComecar.setClickable(true);
        botaoComecar.setOnClickListener(this);

    }//fim da função onCreate

    @Override
    public void onClick (View v){
        String texto;
        switch (v.getId()){
            case R.id.imageView01:
                texto = getString(R.string.textoActivity_00_01);
                Toast.makeText(this, texto, Toast.LENGTH_LONG).show();
                break;
            case R.id.button01:
                Intent it01 = new Intent(this, Activity_01.class);
                startActivity(it01);
                break;
        }//fim switch

    }//fim da função onClick

}//fim da classe MainActivity
