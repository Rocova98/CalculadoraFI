
package com.example.calculadorafi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Toolbar toolbar;
    public TextView tv_userInput;
    public TextView tv_userResult;
    public TextView tv_Show;
    public Button btn_C;
    String txt_O;
    int n, ope;
    public double oper1, oper2, res;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.Info:
                Toast.makeText(this, "Calculadora por Rolando Contreras No. 417026156", Toast.LENGTH_SHORT).show();
            case R.id.Salir:
                finish();
        }

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_userInput = findViewById(R.id.tv_userInput);
        tv_userResult = findViewById(R.id.tv_userResult);
        tv_Show=findViewById(R.id.tv_Show);
        btn_C = findViewById(R.id.btn_C);
        tv_Show.setText("");
        tv_userInput.setText("");
        tv_userResult.setText("");
        oper1=0.0;
        oper2=0.0;
        res=0.0;

        btn_C.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                try
                {
                    txt_O="";
                    tv_userInput.setText(txt_O);
                    tv_userResult.setText(txt_O);
                    tv_Show.setText("");
                    res=0;
                    oper1=0;
                    oper2=0;
                }
                catch (IndexOutOfBoundsException error){
                    Log.d("Clear","Barra de entrada vacía");
                }

                return false;
            }
        });

        toolbar = findViewById(R.id.toolbar4);
        setSupportActionBar(toolbar);

    }



    public void onClick(View v)
    {
        int seleccion = v.getId();
        txt_O = tv_Show.getText().toString();
        n=txt_O.length();

        switch (seleccion){

            case R.id.btn_0:
                txt_O+="0";
                tv_Show.setText(txt_O);
                tv_userInput.setText(txt_O);
                break;

            case R.id.btn_1:
                txt_O+="1";
                tv_Show.setText(txt_O);
                tv_userInput.setText(txt_O);
                break;

            case R.id.btn_2:
                txt_O+="2";
                tv_Show.setText(txt_O);
                tv_userInput.setText(txt_O);
                break;

            case R.id.btn_3:
                txt_O+="3";
                tv_Show.setText(txt_O);
                tv_userInput.setText(txt_O);
                break;

            case R.id.btn_4:
                txt_O+="4";
                tv_Show.setText(txt_O);
                tv_userInput.setText(txt_O);
                break;

            case R.id.btn_5:
                txt_O+="5";
                tv_Show.setText(txt_O);
                tv_userInput.setText(txt_O);
                break;

            case R.id.btn_6:
                txt_O+="6";
                tv_Show.setText(txt_O);
                tv_userInput.setText(txt_O);
                break;

            case R.id.btn_7:
                txt_O+="7";
                tv_Show.setText(txt_O);
                tv_userInput.setText(txt_O);
                break;

            case R.id.btn_8:
                txt_O+="8";
                tv_Show.setText(txt_O);
                tv_userInput.setText(txt_O);
                break;

            case R.id.btn_9:
                txt_O+="9";
                tv_Show.setText(txt_O);
                tv_userInput.setText(txt_O);
                break;

            case R.id.btn_dot:
                txt_O+=".";
                tv_Show.setText(txt_O);
                tv_userInput.setText(txt_O);
                break;

            case R.id.btn_entre:
                tv_Show.setText(txt_O);
                tv_userInput.setText(txt_O+="/");
                try {
                    String aux1 = tv_Show.getText().toString();
                    oper1 = Double.parseDouble(aux1);
                    tv_Show.setText("");
                } catch (NumberFormatException nfe) {}
                ope = 4;
                tv_userInput.setText(txt_O);
                break;

            case R.id.btn_por:
                tv_Show.setText(txt_O);
                tv_userInput.setText(txt_O+="x");
                try {
                    String aux1 = tv_Show.getText().toString();
                    oper1 = Double.parseDouble(aux1);
                    tv_Show.setText("");
                } catch (NumberFormatException nfe) {}
                ope = 3;
                tv_userInput.setText(txt_O);
                break;

            case R.id.btn_menos:
                tv_Show.setText(txt_O);
                tv_userInput.setText(txt_O+="-");
                try {
                    String aux1 = tv_Show.getText().toString();
                    oper1 = Double.parseDouble(aux1);
                    tv_Show.setText("");
                } catch (NumberFormatException nfe) {}
                ope = 2;
                tv_userInput.setText(txt_O);
                break;

            case R.id.btn_mas:
                tv_Show.setText(txt_O);
                tv_userInput.setText(txt_O+="+");
                try {
                    String aux1 = tv_Show.getText().toString();
                    oper1 = Double.parseDouble(aux1);
                    tv_Show.setText("");
                } catch (NumberFormatException nfe) {}
                ope = 1;
                tv_userInput.setText(txt_O);
                break;

            case R.id.btn_C:
                try
                {
                    txt_O=txt_O.substring(0,n-1);
                    tv_userInput.setText(txt_O);
                    tv_Show.setText(txt_O);
                }
                catch (IndexOutOfBoundsException error){
                    Log.d("Clear","Barra de entrada vacía");
                }
                break;

            case R.id.btn_sin:
                tv_Show.setText(txt_O);
                tv_userInput.setText(txt_O+="sin(");
                try{ String aux1= tv_Show.getText().toString();
                    oper1= Double.parseDouble(aux1);
                }catch(NumberFormatException nfe){};
                ope=8;
                tv_userInput.setText("Sin (" +oper1+")");

            case R.id.btn_cos:
                tv_Show.setText(txt_O);
                tv_userInput.setText(txt_O+="cos(");
                try{ String aux1= tv_Show.getText().toString();
                    oper1= Double.parseDouble(aux1);
                }catch(NumberFormatException nfe){};
                ope=9;
                tv_userInput.setText("Cos (" +oper1+")");

            case R.id.btn_tan:
                tv_Show.setText(txt_O);
                tv_userInput.setText(txt_O+="tan(");
                try{ String aux1= tv_Show.getText().toString();
                    oper1= Double.parseDouble(aux1);
                }catch(NumberFormatException nfe){};
                ope=9;
                tv_userInput.setText("tan (" +oper1+")");

            case R.id.btn_porcent:
                tv_Show.setText(txt_O);
                tv_userInput.setText(txt_O+="%");
                try{ String aux1= tv_Show.getText().toString();
                    oper1= Double.parseDouble(aux1);
                }catch(NumberFormatException nfe){};
                ope=6;
                tv_userInput.setText("% (" +oper1+")");

            case R.id.btn_pot:
                tv_Show.setText(txt_O);
                tv_userInput.setText(txt_O+="^");
                try {
                    String aux1 = tv_Show.getText().toString();
                    oper1 = Double.parseDouble(aux1);
                    tv_Show.setText("");
                } catch (NumberFormatException nfe) {}
                ope = 5;
                tv_userInput.setText(txt_O);
                break;

            case R.id.btn_facto:
                tv_Show.setText(txt_O);
                tv_userInput.setText(txt_O+="!");
                try {
                    String aux1 = tv_Show.getText().toString();
                    oper1 = Double.parseDouble(aux1);
                    tv_Show.setText("");
                } catch (NumberFormatException nfe) {}
                ope = 14;
                tv_userInput.setText(txt_O);
                break;

            case R.id.btn_square:
                tv_Show.setText(txt_O);
                tv_userInput.setText(txt_O+="√");
                try {
                    String aux1 = tv_Show.getText().toString();
                    oper1 = Double.parseDouble(aux1);
                    tv_Show.setText("");
                } catch (NumberFormatException nfe) {}
                ope = 7;
                tv_userInput.setText(txt_O);
                break;

            case R.id.btn_ln:
                break;

            case R.id.btn_pi:
                break;







            case R.id.btn_equals:
                try{
                    String aux2= tv_Show.getText().toString();
                    oper2= Double.parseDouble(aux2);
                }catch(NumberFormatException nfe){};
                tv_userInput.setText("");
                tv_Show.setText("");

                if (ope==1){
                    res=oper1+oper2;
                    tv_userInput.setText(String.valueOf(oper1)+"+"+String.valueOf(oper2));

                }else if (ope==2){
                    res=oper1-oper2;
                    tv_userInput.setText(String.valueOf(oper1)+"-"+String.valueOf(oper2));

                }else if (ope==3){
                    res=oper1*oper2;
                    tv_userInput.setText(String.valueOf(oper1)+"x"+String.valueOf(oper2));

                }else if (ope==4){
                    if(oper2==0){
                        tv_userInput.setText("Numero no se puede dividir para 0");
                    }else{
                        res= oper1/oper2;
                        tv_userInput.setText(String.valueOf(oper1)+"/"+String.valueOf(oper2));
                    }

                }else if (ope==5){
                    res=Math.pow(oper1, oper2);

                }else if (ope==6){
                    res=oper2*(oper1/100.0);

                }else if (ope==7){
                    res=Math.sqrt(oper1);

                }else if(ope==8){
                    double rad=Math.toRadians(oper1);
                    res= (Math.sin(rad));

                }else if(ope==9){
                    double rad=Math.toRadians(oper1);
                    res= (Math.cos(rad));

                }else if(ope==10){
                    double rad=Math.toRadians(oper1);
                    res= (Math.tan(rad));

                }else if(ope==11){
                    double angulo = (Math.asin(oper1));
                    res=Math.toDegrees(angulo);

                }else if(ope==12){
                    double angulo = (Math.acos(oper1));
                    res=Math.toDegrees(angulo);

                }else if(ope==13){
                    double angulo = (Math.atan(oper1));
                    res=Math.toDegrees(angulo);

                }else if (ope==14){
                    res=1;
                    for(double i=oper1; i>=1; i--){
                        res=res*i;
                    }
                }
                tv_userResult.setText(""+res);
                oper1=res;
                break;

        }
    }



}

//Codigo para leer con cadenas falta modificar la jerarquia
/*int tam = txt_O.length();
                String A[] = new String[100];
                String operaciones [] = new String[100];
                int pos =0;
                double sum =0;
                String aux="";

                operaciones[0] ="+";
                int index_operacion = 1;
                for(int i = 0; i<tam ; i++)
                {
                    if(txt_O.charAt(i) == '+' || txt_O.charAt(i) == '-' || txt_O.charAt(i) == 'x' || txt_O.charAt(i) == '÷')
                    {
                        A[pos] = aux;
                        operaciones[index_operacion] = String.valueOf(txt_O.charAt(i));
                        pos++;
                        index_operacion++;
                        aux = "";
                    }
                    else
                    {
                        aux = aux + txt_O.charAt(i);
                    }
                }
                A[pos] = aux;
                pos++;

                for(int i = 0; i<pos ; i++)
                {

                    if(operaciones[i].equals("+")){
                        sum=sum+Integer.parseInt(A[i]);
                    }else if (operaciones[i].equals("-")){
                        sum=sum-Integer.parseInt(A[i]);
                    }else if (operaciones[i].equals("x")){
                        sum=sum*Integer.parseInt(A[i]);
                    }else if (operaciones[i].equals("÷")){
                        sum=sum/Integer.parseInt(A[i]);
                    }

                }

                tv_userResult.setText("= "+sum);*/

