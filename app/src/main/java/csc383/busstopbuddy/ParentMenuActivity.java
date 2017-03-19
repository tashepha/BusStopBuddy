package csc383.busstopbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ParentMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_menu);
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
    /*public void changeToGetETA(View view) {
        Intent intent = new Intent(this, ManageBusActivity.class);
        startActivity(intent);
    }
    public void changeToDriverInfo(View view) {
        Intent intent = new Intent(this, DriverInfoActivity.class);
        startActivity(intent);
    }
    public void changeToAbsenceNotify(View view) {
        Intent intent = new Intent(this, AbsenceNotifyActivity.class);
        startActivity(intent);
    }
    public void changeToStudentCheck(View view) {
        Intent intent = new Intent(this, StudentCheckActivity.class);
        startActivity(intent);
    }*/
}
