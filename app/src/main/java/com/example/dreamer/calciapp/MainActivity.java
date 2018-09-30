package com.example.dreamer.calciapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button equal;
    private Button clear;
    private TextView answer;
    private TextView exp;
    private final char ADD='+';
    private final char SUB='-';
    private final char MUL='*';
    private final char DIV='/';
    private final char EQ=0;
    private double v1=Double.NaN;
    private double v2;
    private  char A;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp.setText(exp.getText().toString()+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp.setText(exp.getText().toString()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp.setText(exp.getText().toString()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp.setText(exp.getText().toString()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp.setText(exp.getText().toString()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp.setText(exp.getText().toString()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp.setText(exp.getText().toString()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp.setText(exp.getText().toString()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp.setText(exp.getText().toString()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp.setText(exp.getText().toString()+"9");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       compute();
                                       A = ADD;
                                       answer.setText(String.valueOf(v1) + "+");
                                       exp.setText(null);
                                   }
                               });
        sub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    compute();
                    A=SUB;
                    answer.setText(String.valueOf(v1)+"-");
                    exp.setText(null);
                }
        });
        mul.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        compute();
                        A=MUL;
                        answer.setText(String.valueOf(v1)+"*");
                        exp.setText(null);
                    }
        });
        div.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            compute();
                            A=DIV;
                            answer.setText(String.valueOf(v1)+"/");
                            exp.setText(null);
                        }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                A=EQ;
                answer.setText(answer.getText().toString()+String.valueOf(v2)+"="+String.valueOf(v1));
                exp.setText(null);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(exp.getText().length()>0){
                    CharSequence name=exp.getText().toString();
                    exp.setText(name.subSequence(0,name.length()-1));
                }
                else{
                    v1=Double.NaN;
                    v2=Double.NaN;
                    exp.setText(null);
                    answer.setText(null);
                }
            }
        });
    }



    private void setupUIViews(){

        one=(Button)findViewById(R.id.b1);
        two=(Button)findViewById(R.id.b2);
        three=(Button)findViewById(R.id.b3);
        four=(Button)findViewById(R.id.b4);
        five=(Button)findViewById(R.id.b5);
        six =(Button)findViewById(R.id.b6);
        seven=(Button)findViewById(R.id.b7);
        eight=(Button)findViewById(R.id.b8);
        nine=(Button)findViewById(R.id.b9);
        zero=(Button)findViewById(R.id.b0);
        add=(Button)findViewById(R.id.badd);
        sub=(Button)findViewById(R.id.bsub);
        mul=(Button)findViewById(R.id.bmul);
        div=(Button)findViewById(R.id.bdiv);
        equal=(Button)findViewById(R.id.bequal);
        clear=(Button)findViewById(R.id.bclear);
        answer=(TextView)findViewById(R.id.answer);
        exp=(TextView)findViewById(R.id.exp);


    }

    private void compute(){
        if(!Double.isNaN(v1)){
            v2=Double.parseDouble(exp.getText().toString());

            switch (A){
                case ADD:
                    v1=v1+v2;
                    break;
                case SUB:
                    v1=v1-v2;
                    break;

                case MUL:
                    v1=v1*v2;
                    break;

                case DIV:
                    v1=v1/v2;
                    break;

                case EQ:
                    break;
            }
        }
        else{
            v1=Double.parseDouble(exp.getText().toString());

        }

    }


    public Button getSub() {
        return sub;
    }

    public void setSub(Button sub) {
        this.sub = sub;
    }

    public Button getDiv() {
        return div;
    }

    public void setDiv(Button div) {
        this.div = div;
    }

    public Button getEqual() {
        return equal;
    }

    public void setEqual(Button equal) {
        this.equal = equal;
    }

    public Button getClear() {
        return clear;
    }

    public void setClear(Button clear) {
        this.clear = clear;
    }
}