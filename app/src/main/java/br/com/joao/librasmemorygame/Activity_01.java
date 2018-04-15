package br.com.joao.librasmemorygame;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_01 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_01);

        Button botao01 = (Button) findViewById(R.id.button11);
        TextView texto01 = (TextView) findViewById(R.id.textView11);

        Button botao02 = (Button) findViewById(R.id.button12);
        TextView texto02 = (TextView) findViewById(R.id.textView12);

        Button botao03 = (Button) findViewById(R.id.button13);
        TextView texto03 = (TextView) findViewById(R.id.textView13);

        Button botao04 = (Button) findViewById(R.id.button14);
        TextView texto04 = (TextView) findViewById(R.id.textView14);

        Button botao05 = (Button) findViewById(R.id.button15);
        TextView texto05 = (TextView) findViewById(R.id.textView15);

        Button botao06 = (Button) findViewById(R.id.button16);
        TextView texto06 = (TextView) findViewById(R.id.textView16);

        botao01.setClickable(true);
        botao01.setOnClickListener(this);
        texto01.setClickable(true);
        texto01.setOnClickListener(this);

        botao02.setClickable(true);
        botao02.setOnClickListener(this);
        texto02.setClickable(true);
        texto02.setOnClickListener(this);

        botao03.setClickable(true);
        botao03.setOnClickListener(this);
        texto03.setClickable(true);
        texto03.setOnClickListener(this);

        botao04.setClickable(true);
        botao04.setOnClickListener(this);
        texto04.setClickable(true);
        texto04.setOnClickListener(this);

        botao05.setClickable(true);
        botao05.setOnClickListener(this);
        texto05.setClickable(true);
        texto05.setOnClickListener(this);

        botao06.setClickable(true);
        botao06.setOnClickListener(this);
        texto06.setClickable(true);
        texto06.setOnClickListener(this);

    }//fim da função onCreate


    @Override
    public void onClick (View v){
        String texto;
        switch (v.getId()){
            case R.id.button11:
            case R.id.textView11:
                Intent it02 = new Intent(this, Activity_02.class);
                startActivity(it02);
                break;
            case R.id.button12:
            case R.id.textView12:
                Intent it03 = new Intent(this, Activity_03.class);
                startActivity(it03);
                break;
            case R.id.button13:
            case R.id.textView13:
                Intent it04 = new Intent(this, Activity_04.class);
                startActivity(it04);
                break;
            case R.id.button16:
            case R.id.textView16:
                Intent it05 = new Intent(this, Activity_05.class);
                startActivity(it05);
                break;
            case R.id.button14:
            case R.id.textView14:
                Uri uri = Uri.parse ("http://www.projetobeethoven.com.br");
                Intent itSite02 = new Intent (Intent.ACTION_VIEW, uri);
                startActivity(Intent.createChooser(itSite02, getString(R.string.textoActivity_00_04)));
                //Outra opção: startActivity (itSite02);
                break;
            case R.id.button15:
            case R.id.textView15:
                Intent itEmail = new Intent (Intent.ACTION_SEND);
                itEmail.setType("message/rfc822");
                itEmail.putExtra(Intent.EXTRA_EMAIL, new String[]{"contato@projetobeethoven.com.br"});
                itEmail.putExtra(Intent.EXTRA_SUBJECT,getString(R.string.textoActivity_01_09));
                itEmail.putExtra(Intent.EXTRA_TEXT,getString(R.string.textoActivity_01_06));
                try {
                    startActivity(Intent.createChooser(itEmail, getString(R.string.textoActivity_01_07)));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(this, getString(R.string.textoActivity_01_08), Toast.LENGTH_LONG).show();
                }
                break;
        }//fim switch

    }//fim da função onClick

}//fim da classe Activity_01
