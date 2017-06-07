package futfut.lillemapv5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class parcoursActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcours);
    }
    public void goToInsoliteListe(View view) {
        Intent Intent = new Intent(this, ListeActivityInsolite.class);
        startActivity(Intent);
    }
    public void goToInsoliteMap(View view) {
        Intent Intent = new Intent(this, MapsActivityInsolite.class);
        startActivity(Intent);
    }
    public void goToBarsListe(View view) {
        Intent Intent = new Intent(this, ListeActivityBars.class);
        startActivity(Intent);
    }
    public void goToBarsMap(View view) {
        Intent Intent = new Intent(this, MapsActivityBars.class);
        startActivity(Intent);
    }

}
