package csc383.busstopbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.R.id.message;
import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class AdminMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_menu);
    }
    /** Behavior for buttons */
    public void backButton(View view) {
        Intent intent = new Intent(this, StartingScreen.class);
        startActivity(intent);
    }

    public void changeToBusTrack(View view) {
        Intent intent = new Intent(this, BusTrackActivity.class);
        startActivity(intent);
    }
    /*public void changeToManageBus(View view) {
        Intent intent = new Intent(this, ManageBusActivity.class);
        startActivity(intent);
    }
    public void changeToStudentInfo(View view) {
        Intent intent = new Intent(this, StudentInfoActivity.class);
        startActivity(intent);
    }
    public void changeToParentInfo(View view) {
        Intent intent = new Intent(this, ParentInfoActivity.class);
        startActivity(intent);
    }
    public void changeToDriverInfo(View view) {
        Intent intent = new Intent(this, DriverInfoActivity.class);
        startActivity(intent);
    }
    public void changeToStudentCheck(View view) {
        Intent intent = new Intent(this, StudentCheckActivity.class);
        startActivity(intent);
    }*/
}
