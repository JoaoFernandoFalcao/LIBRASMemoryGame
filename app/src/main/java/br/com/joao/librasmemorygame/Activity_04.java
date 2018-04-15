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


public class Activity_04 extends AppCompatActivity  implements View.OnClickListener {

    final int linhas = 6, colunas = 3;
    ImageView  jogo [][];
    Button botaoNovasCartas;
    int clicou [][] = new int [linhas][colunas];
    int estaAtivo [][] = new int [linhas][colunas];
    String sorteio [][] = new String [linhas][colunas];

    int vezes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_04);

        jogo = new ImageView [linhas][colunas];
        jogo[0][0] = (ImageView) findViewById(R.id.imageView401);
        jogo[0][1] = (ImageView) findViewById(R.id.imageView402);
        jogo[0][2] = (ImageView) findViewById(R.id.imageView403);
        jogo[1][0] = (ImageView) findViewById(R.id.imageView404);
        jogo[1][1] = (ImageView) findViewById(R.id.imageView405);
        jogo[1][2] = (ImageView) findViewById(R.id.imageView406);
        jogo[2][0] = (ImageView) findViewById(R.id.imageView407);
        jogo[2][1] = (ImageView) findViewById(R.id.imageView408);
        jogo[2][2] = (ImageView) findViewById(R.id.imageView409);
        jogo[3][0] = (ImageView) findViewById(R.id.imageView410);
        jogo[3][1] = (ImageView) findViewById(R.id.imageView411);
        jogo[3][2] = (ImageView) findViewById(R.id.imageView412);
        jogo[4][0] = (ImageView) findViewById(R.id.imageView413);
        jogo[4][1] = (ImageView) findViewById(R.id.imageView414);
        jogo[4][2] = (ImageView) findViewById(R.id.imageView415);
        jogo[5][0] = (ImageView) findViewById(R.id.imageView416);
        jogo[5][1] = (ImageView) findViewById(R.id.imageView417);
        jogo[5][2] = (ImageView) findViewById(R.id.imageView418);

        botaoNovasCartas = (Button) findViewById(R.id.button41);

        botaoNovasCartas.setClickable(true);
        botaoNovasCartas.setOnClickListener(this);

        iniciojogo();

    }//fim da função onCreate

    public void onClick (View v){

        String textoFigura;
        int imageResource;
        switch (v.getId()){
            case R.id.button41:
                iniciojogo();
                break;
            case R.id.imageView401:
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
            case R.id.imageView402:
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
            case R.id.imageView403:
                textoFigura = "@drawable/"+sorteio[0][2];
                imageResource = getResources().getIdentifier(textoFigura, null, getPackageName());
                jogo[0][2].setImageResource(imageResource);
                jogo[0][2].setClickable(false);
                estaAtivo[0][2] = 0;
                clicou [0][2]= 1;
                vezes ++;
                if (vezes == 2){
                    esperaeverifica();
                    vezes = 0;
                }//fim do if
                break;
            case R.id.imageView404:
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
            case R.id.imageView405:
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
            case R.id.imageView406:
                textoFigura = "@drawable/"+sorteio[1][2];
                imageResource = getResources().getIdentifier(textoFigura, null, getPackageName());
                jogo[1][2].setImageResource(imageResource);
                jogo[1][2].setClickable(false);
                estaAtivo[1][2] = 0;
                clicou [1][2]= 1;
                vezes ++;
                if (vezes == 2){
                    esperaeverifica();
                    vezes = 0;
                }//fim do if
                break;
            case R.id.imageView407:
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
            case R.id.imageView408:
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
            case R.id.imageView409:
                textoFigura = "@drawable/"+sorteio[2][2];
                imageResource = getResources().getIdentifier(textoFigura, null, getPackageName());
                jogo[2][2].setImageResource(imageResource);
                jogo[2][2].setClickable(false);
                estaAtivo[2][2] = 0;
                clicou [2][2]= 1;
                vezes ++;
                if (vezes == 2){
                    esperaeverifica();
                    vezes = 0;
                }//fim do if
                break;
            case R.id.imageView410:
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
            case R.id.imageView411:
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
            case R.id.imageView412:
                textoFigura = "@drawable/"+sorteio[3][2];
                imageResource = getResources().getIdentifier(textoFigura, null, getPackageName());
                jogo[3][2].setImageResource(imageResource);
                jogo[3][2].setClickable(false);
                estaAtivo[3][2] = 0;
                clicou [3][2]= 1;
                vezes ++;
                if (vezes == 2){
                    esperaeverifica();
                    vezes = 0;
                }//fim do if
                break;
            case R.id.imageView413:
                textoFigura = "@drawable/"+sorteio[4][0];
                imageResource = getResources().getIdentifier(textoFigura, null, getPackageName());
                jogo[4][0].setImageResource(imageResource);
                jogo[4][0].setClickable(false);
                estaAtivo[4][0] = 0;
                clicou [4][0]= 1;
                vezes ++;
                if (vezes == 2){
                    esperaeverifica();
                    vezes = 0;
                }//fim do if
                break;
            case R.id.imageView414:
                textoFigura = "@drawable/"+sorteio[4][1];
                imageResource = getResources().getIdentifier(textoFigura, null, getPackageName());
                jogo[4][1].setImageResource(imageResource);
                jogo[4][1].setClickable(false);
                estaAtivo[4][1] = 0;
                clicou [4][1]= 1;
                vezes ++;
                if (vezes == 2){
                    esperaeverifica();
                    vezes = 0;
                }//fim do if
                break;
            case R.id.imageView415:
                textoFigura = "@drawable/"+sorteio[4][2];
                imageResource = getResources().getIdentifier(textoFigura, null, getPackageName());
                jogo[4][2].setImageResource(imageResource);
                jogo[4][2].setClickable(false);
                estaAtivo[4][2] = 0;
                clicou [4][2]= 1;
                vezes ++;
                if (vezes == 2){
                    esperaeverifica();
                    vezes = 0;
                }//fim do if
                break;
            case R.id.imageView416:
                textoFigura = "@drawable/"+sorteio[5][0];
                imageResource = getResources().getIdentifier(textoFigura, null, getPackageName());
                jogo[5][0].setImageResource(imageResource);
                jogo[5][0].setClickable(false);
                estaAtivo[5][0] = 0;
                clicou [5][0]= 1;
                vezes ++;
                if (vezes == 2){
                    esperaeverifica();
                    vezes = 0;
                }//fim do if
                break;
            case R.id.imageView417:
                textoFigura = "@drawable/"+sorteio[5][1];
                imageResource = getResources().getIdentifier(textoFigura, null, getPackageName());
                jogo[5][1].setImageResource(imageResource);
                jogo[5][1].setClickable(false);
                estaAtivo[5][1] = 0;
                clicou [5][1]= 1;
                vezes ++;
                if (vezes == 2){
                    esperaeverifica();
                    vezes = 0;
                }//fim do if
                break;
            case R.id.imageView418:
                textoFigura = "@drawable/"+sorteio[5][2];
                imageResource = getResources().getIdentifier(textoFigura, null, getPackageName());
                jogo[5][2].setImageResource(imageResource);
                jogo[5][2].setClickable(false);
                estaAtivo[5][2] = 0;
                clicou [5][2]= 1;
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
            long milliseconds = 25; //tempo em milissegundos
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
        String Palavras[] = {"maoa", "maob", "maoc", "maod", "maoe", "maof", "maog",
                "maoh", "maoi", "maoj", "maok", "maol", "maom", "maon",
                "maoo", "maop", "maoq", "maor", "maos", "maot", "maou",
                "maov", "maow", "maox", "maoy", "maoz"};

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

}//fim da classe Activity_04


