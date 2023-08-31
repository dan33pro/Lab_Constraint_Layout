package unipiloto.edu.co;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ExerciseFourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_fourth);
    }

    public void startMailActivity(View view) {
        Intent intent = new Intent(this, MailActivity.class);
        startActivity(intent);
    }

    public void startTransitReportActivity(View view) {
        Intent intent = new Intent(this, TransitReportActivity.class);
        startActivity(intent);
    }
}