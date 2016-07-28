package net.sjava.androidutil.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import net.sjava.androidutil.JTimingLogger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        display();
    }


    public void display() {
        Log.d("AA", "1111111111111111");

        JTimingLogger.setLogLevel(Log.INFO);
        JTimingLogger.setLogLevel(Log.VERBOSE);

        JTimingLogger logger = new JTimingLogger("AA", "VV");
        logger.addSplit("aaaaaaaaaaaaaaa");

        try {
            Thread.sleep(100);

            logger.addSplit("aaaaaaaaaaaaaaa");

            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        logger.addSplit("bbb");
        logger.dumpToLog();
    }





}
