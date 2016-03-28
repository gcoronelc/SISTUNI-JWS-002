package pe.edu.sistemasuni.appwsclient;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import pe.edu.sistemasuni.wsclient.WSSuma;

public class MainActivity extends Activity {

    private EditText etNum1;
    private EditText etNum2;
    private TextView tvSuma;
    private TextView tvResta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Acceder a los controles
        etNum1 = (EditText) findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);
        tvSuma = (TextView) findViewById(R.id.tvSuma);
        tvResta = (TextView) findViewById(R.id.tvResta);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void doProcesar(View v){
        // Datos
        String n1 = etNum1.getText().toString();
        String n2 = etNum2.getText().toString();

        WSSuma wsSuma = new WSSuma();
        wsSuma.setNum1(n1);
        wsSuma.setNum2(n2);
        wsSuma.setTvResultado(tvSuma);
        wsSuma.execute();

    }
}
