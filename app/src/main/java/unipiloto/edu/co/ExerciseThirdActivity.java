package unipiloto.edu.co;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ExerciseThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_third);
    }

    public void startFourthActivity(View view) {
        Intent intent = new Intent(this, ExerciseFourthActivity.class);
        startActivity(intent);
    }
}