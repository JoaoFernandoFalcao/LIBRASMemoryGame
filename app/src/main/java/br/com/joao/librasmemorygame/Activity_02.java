package br.com.joao.librasmemorygame;

import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.os.Handler;

import java.util.Random;


public class Activity_02 extends AppCompatActivity  implements View.OnClickListener {

    final int linhas = 4, colunas = 2;
    ImageView  jogo [][];
    Button botaoNovasCartas;
    int clicou [][] = new int [linhas][colunas];
    int estaAtivo [][] = new int [linhas][colunas];
    String sorteio [][] = new String [linhas][colunas];

    int vezes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_02);

        jogo = new ImageView [linhas][colunas];
        jogo[0][0] = (ImageView) findViewById(R.id.imageView21);
        jogo[0][1] = (ImageView) findViewById(R.id.imageView22);
        jogo[1][0] = (ImageView) findViewById(R.id.imageView23);
        jogo[1][1] = (ImageView) findViewById(R.id.imageView24);
        jogo[2][0] = (ImageView) findViewById(R.id.imageView25);
        jogo[2][1] = (ImageView) findViewById(R.id.imageView26);
        jogo[3][0] = (ImageView) findViewById(R.id.imageView27);
        jogo[3][1] = (ImageView) findViewById(R.id.imageView28);

        botaoNovasCartas = (Button) findViewById(R.id.button21);

        botaoNovasCartas.setClickable(true);
        botaoNovasCartas.setOnClickListener(this);

        iniciojogo();

    }//fim da função onCreate

    public void onClick (View v){

        String textoFigura;
        int imageResource;
        switch (v.getId()){
            case R.id.button21:
                iniciojogo();
                break;
            case R.id.imageView21:
                textoFigura = "@drawable/"+sorteio[0][0];
                imageResource = getResources().getIdentifier(textoFigura, null, getPackageName());
                jogo[0][0].setImageResource(imageResource);
                jogo[0][0].setClickable(false);
                estaAtivo[0][0] = 0;
                clicou [0][0]= 1;
                vezes ++;
                if (vezes == 2){
                    esperaeverifica();
                    vezes = 0;
                }//fim do if
                break;
            case R.id.imageView22:
                textoFigura = "@drawable/"+sorteio[0][1];
                imageResource = getResources().getIdentifier(textoFigura, null, getPackageName());
                jogo[0][1].setImageResource(imageResource);
                jogo[0][1].setClickable(false);
                estaAtivo[0][1] = 0;
                clicou [0][1]= 1;
                vezes ++;
                if (vezes == 2){
                    esperaeverifica();
                    vezes = 0;
                }//fim do if
                break;
            case R.id.imageView23:
                textoFigura = "@drawable/"+sorteio[1][0];
                imageResource = getResources().getIdentifier(textoFigura, null, getPackageName());
                jogo[1][0].setImageResource(imageResource);
                jogo[1][0].setClickable(false);
                estaAtivo[1][0] = 0;
                clicou [1][0]= 1;
                vezes ++;
                if (vezes == 2){
                    esperaeverifica();
                    vezes = 0;
                }//fim do if
                break;
            case R.id.imageView24:
                textoFigura = "@drawable/"+sorteio[1][1];
                imageResource = getResources().getIdentifier(textoFigura, null, getPackageName());
                jogo[1][1].setImageResource(imageResource);
                jogo[1][1].setClickable(false);
                estaAtivo[1][1] = 0;
                clicou [1][1]= 1;
                vezes ++;
                if (vezes == 2){
                    esperaeverifica();
                    vezes = 0;
                }//fim do if
                break;
            case R.id.imageView25:
                textoFigura = "@drawable/"+sorteio[2][0];
                imageResource = getResources().getIdentifier(textoFigura, null, getPackageName());
                jogo[2][0].setImageResource(imageResource);
                jogo[2][0].setClickable(false);
                estaAtivo[2][0] = 0;
                clicou [2][0]= 1;
                vezes ++;
                if (vezes == 2){
                    esperaeverifica();
                    vezes = 0;
                }//fim do if
                break;
            case R.id.imageView26:
                textoFigura = "@drawable/"+sorteio[2][1];
                imageResource = getResources().getIdentifier(textoFigura, null, getPackageName());
                jogo[2][1].setImageResource(imageResource);
                jogo[2][1].setClickable(false);
                estaAtivo[2][1] = 0;
                clicou [2][1]= 1;
                vezes ++;
                if (vezes == 2){
                    esperaeverifica();
                    vezes = 0;
                }//fim do if
                break;
            case R.id.imageView27:
                textoFigura = "@drawable/"+sorteio[3][0];
                imageResource = getResources().getIdentifier(textoFigura, null, getPackageName());
                jogo[3][0].setImageResource(imageResource);
                jogo[3][0].setClickable(false);
                estaAtivo[3][0] = 0;
                clicou [3][0]= 1;
                vezes ++;
                if (vezes == 2){
                    esperaeverifica();
                    vezes = 0;
                }//fim do if
                break;
            case R.id.imageView28:
                textoFigura = "@drawable/"+sorteio[3][1];
                imageResource = getResources().getIdentifier(textoFigura, null, getPackageName());
                jogo[3][1].setImageResource(imageResource);
                jogo[3][1].setClickable(false);
                estaAtivo[3][1] = 0;
                clicou [3][1]= 1;
                vezes ++;
                if (vezes == 2){
                    esperaeverifica();
                    vezes = 0;
                }//fim do if
                break;

        }//fim switch

    }//fim da função onClick

    public void esperaeverifica (){
        int i,j;
        for (i=0;i<linhas;i++)
            for (j=0;j<colunas;j++) {
                if (estaAtivo[i][j] == 1)
                   jogo[i][j].setClickable(false);
            }//fim do for
        botaoNovasCartas.setClickable(false);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                int i,j;
                verificarigualdade();
                for (i=0;i<linhas;i++)
                    for (j=0;j<colunas;j++) {
                        if (estaAtivo[i][j] == 1)
                            jogo[i][j].setClickable(true);
                    }//fim do for
                botaoNovasCartas.setClickable(true);
            }
        }, 1000);
    }//fim função espera

    public void verificarigualdade(){
        //verificar se são as mesmas figuras através da tabela clicou
        int i, j;
        int i_figura1=0, j_figura1=0, i_figura2=0, j_figura2=0;
        int aux = 0;

        for (i=0;i<linhas;i++)
            for (j=0;j<colunas;j++) {
                if (clicou[i][j] == 1)
                    if (aux == 0){
                        i_figura1 = i; j_figura1 = j; aux = 1; clicou[i][j] = 0;
                    }
                    else {
                        i_figura2 = i; j_figura2 = j; clicou[i][j] = 0;
                    }

            }//fim do for

       //setar a função setClickable
        if (!sorteio[i_figura1][j_figura1].equals(sorteio[i_figura2][j_figura2])){

            Vibrator rr = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            long milliseconds = 30; //tempo em milissegundos
            rr.vibrate(milliseconds);

            jogo[i_figura1][j_figura1].setImageResource(R.drawable.amolibras);
            jogo[i_figura1][j_figura1].setClickable(true);
            estaAtivo[i_figura1][j_figura1] = 1;
            jogo[i_figura2][j_figura2].setImageResource(R.drawable.amolibras);
            jogo[i_figura2][j_figura2].setClickable(true);
            estaAtivo[i_figura2][j_figura2] = 1;
        }//fim do if
    }//fim da função verificarigualdade

    public void iniciojogo(){
        //início do jogo
        int i, j, k, var;
        for (i=0;i<linhas;i++)
            for (j=0;j<colunas;j++) {
                jogo[i][j].setImageResource(R.drawable.amolibras);
                jogo[i][j].setClickable(true);
                jogo[i][j].setOnClickListener(this);
                clicou[i][j]=0;
                estaAtivo[i][j]=1;
            }//fim do for

        //sorteio das posições e inicialização das variáveis
        vezes = 0;

        for (i=0;i<linhas;i++)
            for (j=0;j<colunas;j++) {
                sorteio[i][j] = "X";
            }//fim do for


        final int TAM = 26;
        String Palavras[] = {"letraa", "letrab", "letrac", "letrad", "letrae", "letraf", "letrag",
                "letrah", "letrai", "letraj", "letrak", "letral", "letram", "letran",
                "letrao", "letrap", "letraq", "letrar", "letras", "letrat", "letrau",
                "letrav", "letraw", "letrax", "letray", "letraz"};

        Random numRandomico = new Random();

        k = 1;
        while (k <= linhas*colunas){
            var = numRandomico.nextInt(TAM);
            do {
                i = numRandomico.nextInt(linhas);
                j = numRandomico.nextInt(colunas);
            } while (sorteio[i][j] != "X");
            sorteio[i][j]=Palavras[var];
            do {
                i = numRandomico.nextInt(linhas);
                j = numRandomico.nextInt(colunas);
            } while (sorteio[i][j] != "X");
            sorteio[i][j]=Palavras[var];
            k+=2;
        }//fim do while

    }//fim da função iniciojogo

}//fim da classe Activity_02

