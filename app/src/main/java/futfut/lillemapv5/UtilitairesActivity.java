package futfut.lillemapv5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class UtilitairesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utilitaires);
    }
    public void goToMetro(View view) {
        Intent Intent = new Intent(this, MetroActivity.class);
        startActivity(Intent);
    }
    public void goToAdresses(View view) {
        Intent Intent = new Intent(this, AdressesActivity.class);
        startActivity(Intent);
    }
}
