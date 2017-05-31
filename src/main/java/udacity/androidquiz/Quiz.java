package udacity.androidquiz;

import android.content.Intent;
import android.database.DatabaseUtils;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import udacity.androidquiz.databinding.ActivityQuizBinding;

public class Quiz extends AppCompatActivity
{
    ActivityQuizBinding binding;

    public Integer duration = Toast.LENGTH_SHORT;
    public Integer score = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_quiz);
    }


    private Boolean exit = false;

    @Override
    public void onBackPressed()
    {
        if (exit)
        {
            finish();
        }
        else
        {
            Toast.makeText(this, "Press Back again to Exit.", Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable()
            {
                @Override
                public void run()
                {
                    exit = false;
                }
            }, 3 * 1000);

        }

    }

    public void Submit(View view)
    {

        if (binding.radioButton1b.isChecked())
        {
            this.score++;
        }

        if (binding.radioButton2a.isChecked())
        {
            this.score++;
        }

        if (binding.radioButton3c.isChecked())
        {
            this.score++;
        }

        if (binding.radioButton4b.isChecked())
        {
            this.score++;
        }

        if (binding.editText5.getText().toString().trim().toLowerCase().equals("luciferin"))
        {
            this.score++;
        }

        if (binding.radioButton6b.isChecked())
        {
            this.score++;
        }

        if (binding.radioButton7c.isChecked())
        {
            this.score++;
        }

        if (binding.radioButton8a.isChecked())
        {
            this.score++;
        }

        if (binding.radioButton9b.isChecked())
        {
            this.score++;
        }

        if (binding.editText10.getText().toString().trim().toLowerCase().equals("japan"))
        {
            this.score++;
        }

        binding.radioGroup1.clearCheck();
        binding.radioGroup2.clearCheck();
        binding.radioGroup3.clearCheck();
        binding.radioGroup4.clearCheck();
        binding.editText5.setText("");
        binding.radioGroup6.clearCheck();
        binding.radioGroup7.clearCheck();
        binding.radioGroup8.clearCheck();
        binding.radioGroup9.clearCheck();
        binding.editText10.setText("");

        Toast toast = Toast.makeText(getApplicationContext(), "Your Score is : " + this.score.toString(), duration);
        toast.show();

        this.score = 0;
    }
}
