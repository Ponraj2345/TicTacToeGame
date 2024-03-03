package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.airbnb.lottie.Lottie;
import com.airbnb.lottie.LottieAnimationView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    ImageView I1,I2,I3,I4,I5,I6,I7,I8,I9;
    HashMap<Integer,String> XOHashMap;
    GridLayout gridParent;
    LottieAnimationView celebration;
    HashMap<Integer,Boolean> filledHashMap;
    Button btnNewGame;
    int filled=0;
    int count=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        celebration=findViewById(R.id.lottieCelebration);
        gridParent=findViewById(R.id.gridParent);
        btnNewGame=findViewById(R.id.btnNewGame);
        I1=findViewById(R.id.imageView1);
        I2=findViewById(R.id.imageView2);
        I3=findViewById(R.id.imageView3);
        I4=findViewById(R.id.imageView4);
        I5=findViewById(R.id.imageView5);
        I6=findViewById(R.id.imageView6);
        I7=findViewById(R.id.imageView7);
        I8=findViewById(R.id.imageView8);
        I9=findViewById(R.id.imageView9);


        XOHashMap=new HashMap<>();
        filledHashMap=new HashMap<>();

        filledHashMap.put(1,false);
        filledHashMap.put(2,false);
        filledHashMap.put(3,false);
        filledHashMap.put(4,false);
        filledHashMap.put(5,false);
        filledHashMap.put(6,false);
        filledHashMap.put(7,false);
        filledHashMap.put(8,false);
        filledHashMap.put(9,false);

        btnNewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetGame();
                celebration.setVisibility(View.INVISIBLE);
            }
        });
        I1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(filledHashMap.get(1)==false){
                    if(count%2!=0){
                        I1.setImageResource(R.drawable.x);
                        filled++;
                        count++;
                        XOHashMap.put(1,"x1");
                        filledHashMap.put(1,true);
                        ticTacChec();
                    }
                    else{
                        I1.setImageResource(R.drawable.o);
                        filled++;
                        count++;
                        XOHashMap.put(1,"o1");
                        filledHashMap.put(1,true);
                        ticTacChec();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();
                }

            }
        });

        I2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(filledHashMap.get(2)==false){
                    if(count%2!=0){
                        I2.setImageResource(R.drawable.x);
                        filled++;
                        count++;
                        XOHashMap.put(2,"x2");
                        filledHashMap.put(2,true);
                        ticTacChec();
                    }
                    else{
                        I2.setImageResource(R.drawable.o);
                        filled++;
                        count++;
                        XOHashMap.put(2,"o2");
                        filledHashMap.put(2,true);
                        ticTacChec();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        I3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(filledHashMap.get(3)==false){
                    if(count%2!=0){
                        I3.setImageResource(R.drawable.x);
                        filled++;
                        count++;
                        XOHashMap.put(3,"x3");
                        filledHashMap.put(3,true);
                        ticTacChec();
                    }
                    else{
                        I3.setImageResource(R.drawable.o);
                        filled++;
                        count++;
                        XOHashMap.put(3,"o3");
                        filledHashMap.put(3,true);
                        ticTacChec();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        I4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(filledHashMap.get(4)==false){
                    if(count%2!=0){
                        I4.setImageResource(R.drawable.x);
                        filled++;
                        count++;
                        XOHashMap.put(4,"x4");
                        filledHashMap.put(4,true);
                        ticTacChec();
                    }
                    else{
                        I4.setImageResource(R.drawable.o);
                        filled++;
                        count++;
                        XOHashMap.put(4,"o4");
                        filledHashMap.put(4,true);
                        ticTacChec();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        I5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(filledHashMap.get(5)==false){
                    if(count%2!=0){
                        I5.setImageResource(R.drawable.x);
                        filled++;
                        count++;
                        XOHashMap.put(5,"x5");
                        filledHashMap.put(5,true);
                        ticTacChec();
                    }
                    else{
                        I5.setImageResource(R.drawable.o);
                        filled++;
                        count++;
                        XOHashMap.put(5,"o5");
                        filledHashMap.put(5,true);
                        ticTacChec();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        I6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(filledHashMap.get(6)==false){
                    if(count%2!=0){
                        I6.setImageResource(R.drawable.x);
                        filled++;
                        count++;
                        XOHashMap.put(6,"x6");
                        filledHashMap.put(6,true);
                        ticTacChec();
                    }
                    else{
                        I6.setImageResource(R.drawable.o);
                        filled++;
                        count++;
                        XOHashMap.put(6,"o6");
                        filledHashMap.put(6,true);
                        ticTacChec();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();
                }
            }
        });
        I7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View  view) {
                if(filledHashMap.get(7)==false){
                    if(count%2!=0){
                        I7.setImageResource(R.drawable.x);
                        filled++;
                        count++;
                        XOHashMap.put(7,"x7");
                        filledHashMap.put(7,true);
                        ticTacChec();
                    }
                    else{
                        I7.setImageResource(R.drawable.o);
                        filled++;
                        count++;
                        XOHashMap.put(7,"o7");
                        filledHashMap.put(7,true);
                        ticTacChec();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();
                }
            }
        });
        I8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(filledHashMap.get(8)==false){
                    if(count%2!=0){
                        I8.setImageResource(R.drawable.x);
                        filled++;
                        count++;
                        XOHashMap.put(8,"x8");
                        filledHashMap.put(8,true);
                        ticTacChec();
                    }
                    else{
                        I8.setImageResource(R.drawable.o);
                        filled++;
                        count++;
                        XOHashMap.put(8,"o8");
                        filledHashMap.put(8,true);
                        ticTacChec();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();
                }
            }
        });
        I9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(filledHashMap.get(9)==false){
                    if(count%2!=0){
                        I9.setImageResource(R.drawable.x);
                        filled++;
                        count++;
                        XOHashMap.put(9,"x9");
                        filledHashMap.put(9,true);
                        ticTacChec();
                    }
                    else{
                        I9.setImageResource(R.drawable.o);
                        filled++;
                        count++;
                        XOHashMap.put(9,"o9");
                        filledHashMap.put(9,true);
                        ticTacChec();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Already Clicked", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void ticTacChec() {

        // Check for a win
        if (checkWin()) {
            celebration.setAnimation(R.raw.celebration);
            celebration.setVisibility(View.VISIBLE);
            celebration.playAnimation();
        } else if (filled == 9) {
            gridParent.setBackgroundColor(getResources().getColor(R.color.drawColor));
            celebration.setAnimation(R.raw.draw);
            celebration.setVisibility(View.VISIBLE);
            celebration.playAnimation();
        }
    }

    private boolean checkWin() {
        // Define winning combinations
        int[][] winCombinations = {
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9},
                {1, 4, 7}, {2, 5, 8}, {3, 6, 9},
                {1, 5, 9}, {3, 5, 7}
        };

        for (int[] combination : winCombinations) {
            int pos1 = combination[0];
            int pos2 = combination[1];
            int pos3 = combination[2];

            String value1 = XOHashMap.get(pos1);
            String value2 = XOHashMap.get(pos2);
            String value3 = XOHashMap.get(pos3);

            if (value1 != null && value2 != null && value3 != null) {
                // Extract the player symbol from the values
                String symbol1 = value1.substring(0, 1);
                String symbol2 = value2.substring(0, 1);
                String symbol3 = value3.substring(0, 1);

                if (symbol1.equals(symbol2) && symbol2.equals(symbol3)) {
                    setWinningCombinationBackground(pos1, pos2, pos3);
                    return true;
                }
            }
        }
        return false;
    }



    private void resetGame() {
        I1.setImageResource(R.drawable.placeholder);
        I2.setImageResource(R.drawable.placeholder);
        I3.setImageResource(R.drawable.placeholder);
        I4.setImageResource(R.drawable.placeholder);
        I5.setImageResource(R.drawable.placeholder);
        I6.setImageResource(R.drawable.placeholder);
        I7.setImageResource(R.drawable.placeholder);
        I8.setImageResource(R.drawable.placeholder);
        I9.setImageResource(R.drawable.placeholder);

        clearBackgroundColor(I1);
        clearBackgroundColor(I2);
        clearBackgroundColor(I3);
        clearBackgroundColor(I4);
        clearBackgroundColor(I5);
        clearBackgroundColor(I6);
        clearBackgroundColor(I7);
        clearBackgroundColor(I8);
        clearBackgroundColor(I9);

        XOHashMap.clear();
        filledHashMap.clear();

        filledHashMap.put(1, false);
        filledHashMap.put(2, false);
        filledHashMap.put(3, false);
        filledHashMap.put(4, false);
        filledHashMap.put(5, false);
        filledHashMap.put(6, false);
        filledHashMap.put(7, false);
        filledHashMap.put(8, false);
        filledHashMap.put(9, false);

        filled = 0;
        count = 1;
    }

    private void setWinningCombinationBackground(int pos1, int pos2, int pos3) {
        switch (pos1) {
            case 1:
                I1.setBackgroundColor(getResources().getColor(R.color.winningColor));
                break;
            case 2:
                I2.setBackgroundColor(getResources().getColor(R.color.winningColor));
                break;
            case 3:
                I3.setBackgroundColor(getResources().getColor(R.color.winningColor));
                break;
            case 4:
                I4.setBackgroundColor(getResources().getColor(R.color.winningColor));
                break;
            case 5:
                I5.setBackgroundColor(getResources().getColor(R.color.winningColor));
                break;
            case 6:
                I6.setBackgroundColor(getResources().getColor(R.color.winningColor));
                break;
            case 7:
                I7.setBackgroundColor(getResources().getColor(R.color.winningColor));
                break;
            case 8:
                I8.setBackgroundColor(getResources().getColor(R.color.winningColor));
                break;
            case 9:
                I9.setBackgroundColor(getResources().getColor(R.color.winningColor));
                break;
        }

        switch (pos2) {
            case 1:
                I1.setBackgroundColor(getResources().getColor(R.color.winningColor));
                break;
            case 2:
                I2.setBackgroundColor(getResources().getColor(R.color.winningColor));
                break;
            case 3:
                I3.setBackgroundColor(getResources().getColor(R.color.winningColor));
                break;
            case 4:
                I4.setBackgroundColor(getResources().getColor(R.color.winningColor));
                break;
            case 5:
                I5.setBackgroundColor(getResources().getColor(R.color.winningColor));
                break;
            case 6:
                I6.setBackgroundColor(getResources().getColor(R.color.winningColor));
                break;
            case 7:
                I7.setBackgroundColor(getResources().getColor(R.color.winningColor));
                break;
            case 8:
                I8.setBackgroundColor(getResources().getColor(R.color.winningColor));
                break;
            case 9:
                I9.setBackgroundColor(getResources().getColor(R.color.winningColor));
                break;
        }

        switch (pos3) {
            case 1:
                I1.setBackgroundColor(getResources().getColor(R.color.winningColor));
                break;
            case 2:
                I2.setBackgroundColor(getResources().getColor(R.color.winningColor));
                break;
            case 3:
                I3.setBackgroundColor(getResources().getColor(R.color.winningColor));
                break;
            case 4:
                I4.setBackgroundColor(getResources().getColor(R.color.winningColor));
                break;
            case 5:
                I5.setBackgroundColor(getResources().getColor(R.color.winningColor));
                break;
            case 6:
                I6.setBackgroundColor(getResources().getColor(R.color.winningColor));
                break;
            case 7:
                I7.setBackgroundColor(getResources().getColor(R.color.winningColor));
                break;
            case 8:
                I8.setBackgroundColor(getResources().getColor(R.color.winningColor));
                break;
            case 9:
                I9.setBackgroundColor(getResources().getColor(R.color.winningColor));
                break;
        }
    }

    private void clearBackgroundColor(ImageView imageView) {
        imageView.setBackgroundColor(Color.WHITE);
        gridParent.setBackgroundColor(Color.WHITE);
    }

}