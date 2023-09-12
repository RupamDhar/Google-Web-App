package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.mafia);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                alertDialog("Disco Potato", "Cancel the nigga?", "cancelMafia", "approveMafia");
            }
        });
    }

    //methods of mafia alertDialog
    public void cancelMafia() {
        Toast.makeText(MainActivity.this, "Canceled the noob", Toast.LENGTH_SHORT).show();
    }
    public void approveMafia(){
        Toast.makeText(MainActivity.this, "Fuck the noob", Toast.LENGTH_SHORT).show();
    }

    public void alertDialog(String title, String msg, String cancelMethod, String okMethod)
    {
        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle(title);
        builder.setMessage(msg);

        builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if(cancelMethod.equals("cancelMafia")) cancelMafia();
            }
        });

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if(okMethod.equals("approveMafia")) approveMafia();
            }
        });
        builder.show();
    }
}