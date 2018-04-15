package br.com.joao.librasmemorygame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Activity_05 extends AppCompatActivity implements View.OnClickListener{

    ImageView letra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_05);

        letra = (ImageView) findViewById(R.id.imageView51);

        Button botaoA = (Button) findViewById(R.id.buttonA);
        botaoA.setClickable(true);
        botaoA.setOnClickListener(this);

        Button botaoB = (Button) findViewById(R.id.buttonB);
        botaoB.setClickable(true);
        botaoB.setOnClickListener(this);

        Button botaoC = (Button) findViewById(R.id.buttonC);
        botaoC.setClickable(true);
        botaoC.setOnClickListener(this);

        Button botaoD = (Button) findViewById(R.id.buttonD);
        botaoD.setClickable(true);
        botaoD.setOnClickListener(this);

        Button botaoE = (Button) findViewById(R.id.buttonE);
        botaoE.setClickable(true);
        botaoE.setOnClickListener(this);

        Button botaoF = (Button) findViewById(R.id.buttonF);
        botaoF.setClickable(true);
        botaoF.setOnClickListener(this);

        Button botaoG = (Button) findViewById(R.id.buttonG);
        botaoG.setClickable(true);
        botaoG.setOnClickListener(this);

        Button botaoH = (Button) findViewById(R.id.buttonH);
        botaoH.setClickable(true);
        botaoH.setOnClickListener(this);

        Button botaoI = (Button) findViewById(R.id.buttonI);
        botaoI.setClickable(true);
        botaoI.setOnClickListener(this);

        Button botaoJ = (Button) findViewById(R.id.buttonJ);
        botaoJ.setClickable(true);
        botaoJ.setOnClickListener(this);

        Button botaoK = (Button) findViewById(R.id.buttonK);
        botaoK.setClickable(true);
        botaoK.setOnClickListener(this);

        Button botaoL = (Button) findViewById(R.id.buttonL);
        botaoL.setClickable(true);
        botaoL.setOnClickListener(this);

        Button botaoM = (Button) findViewById(R.id.buttonM);
        botaoM.setClickable(true);
        botaoM.setOnClickListener(this);

        Button botaoN = (Button) findViewById(R.id.buttonN);
        botaoN.setClickable(true);
        botaoN.setOnClickListener(this);

        Button botaoO = (Button) findViewById(R.id.buttonO);
        botaoO.setClickable(true);
        botaoO.setOnClickListener(this);

        Button botaoP = (Button) findViewById(R.id.buttonP);
        botaoP.setClickable(true);
        botaoP.setOnClickListener(this);

        Button botaoQ = (Button) findViewById(R.id.buttonQ);
        botaoQ.setClickable(true);
        botaoQ.setOnClickListener(this);

        Button botaoR = (Button) findViewById(R.id.buttonR);
        botaoR.setClickable(true);
        botaoR.setOnClickListener(this);

        Button botaoS = (Button) findViewById(R.id.buttonS);
        botaoS.setClickable(true);
        botaoS.setOnClickListener(this);

        Button botaoT = (Button) findViewById(R.id.buttonT);
        botaoT.setClickable(true);
        botaoT.setOnClickListener(this);

        Button botaoU = (Button) findViewById(R.id.buttonU);
        botaoU.setClickable(true);
        botaoU.setOnClickListener(this);

        Button botaoV = (Button) findViewById(R.id.buttonV);
        botaoV.setClickable(true);
        botaoV.setOnClickListener(this);

        Button botaoW = (Button) findViewById(R.id.buttonW);
        botaoW.setClickable(true);
        botaoW.setOnClickListener(this);

        Button botaoX = (Button) findViewById(R.id.buttonX);
        botaoX.setClickable(true);
        botaoX.setOnClickListener(this);

        Button botaoY = (Button) findViewById(R.id.buttonY);
        botaoY.setClickable(true);
        botaoY.setOnClickListener(this);

        Button botaoZ = (Button) findViewById(R.id.buttonZ);
        botaoZ.setClickable(true);
        botaoZ.setOnClickListener(this);

    }//fim da função onCreate

    @Override
    public void onClick (View v){
        String texto;
        switch (v.getId()){
            case R.id.buttonA:
                letra.setImageResource(R.drawable.letraa);
                break;
            case R.id.buttonB:
                letra.setImageResource(R.drawable.letrab);
                break;
            case R.id.buttonC:
                letra.setImageResource(R.drawable.letrac);
                break;
            case R.id.buttonD:
                letra.setImageResource(R.drawable.letrad);
                break;
            case R.id.buttonE:
                letra.setImageResource(R.drawable.letrae);
                break;
            case R.id.buttonF:
                letra.setImageResource(R.drawable.letraf);
                break;
            case R.id.buttonG:
                letra.setImageResource(R.drawable.letrag);
                break;
            case R.id.buttonH:
                letra.setImageResource(R.drawable.letrah);
                break;
            case R.id.buttonI:
                letra.setImageResource(R.drawable.letrai);
                break;
            case R.id.buttonJ:
                letra.setImageResource(R.drawable.letraj);
                break;
            case R.id.buttonK:
                letra.setImageResource(R.drawable.letrak);
                break;
            case R.id.buttonL:
                letra.setImageResource(R.drawable.letral);
                break;
            case R.id.buttonM:
                letra.setImageResource(R.drawable.letram);
                break;
            case R.id.buttonN:
                letra.setImageResource(R.drawable.letran);
                break;
            case R.id.buttonO:
                letra.setImageResource(R.drawable.letrao);
                break;
            case R.id.buttonP:
                letra.setImageResource(R.drawable.letrap);
                break;
            case R.id.buttonQ:
                letra.setImageResource(R.drawable.letraq);
                break;
            case R.id.buttonR:
                letra.setImageResource(R.drawable.letrar);
                break;
            case R.id.buttonS:
                letra.setImageResource(R.drawable.letras);
                break;
            case R.id.buttonT:
                letra.setImageResource(R.drawable.letrat);
                break;
            case R.id.buttonU:
                letra.setImageResource(R.drawable.letrau);
                break;
            case R.id.buttonV:
                letra.setImageResource(R.drawable.letrav);
                break;
            case R.id.buttonW:
                letra.setImageResource(R.drawable.letraw);
                break;
            case R.id.buttonX:
                letra.setImageResource(R.drawable.letrax);
                break;
            case R.id.buttonY:
                letra.setImageResource(R.drawable.letray);
                break;
            case R.id.buttonZ:
                letra.setImageResource(R.drawable.letraz);
                break;


        }//fim switch

    }//fim da função onClick

}//fim da classe Activity_05