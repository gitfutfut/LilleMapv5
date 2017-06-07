package futfut.lillemapv5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.id.button1;
import static futfut.lillemapv5.R.id.button2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToParcours(View view) {
        Intent Intent = new Intent(this, parcoursActivity.class);
        startActivity(Intent);
    }
    public void goToUtilitaires(View view) {
        Intent Intent = new Intent(this, UtilitairesActivity.class);
        startActivity(Intent);
    }
    public void goToAide(View view) {
        Intent Intent = new Intent(this, AideActivity.class);
        startActivity(Intent);
    }
}

