package com.example.innove.androiddatabinding.view;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.innove.androiddatabinding.R;
import com.example.innove.androiddatabinding.databinding.ActivityMainBinding;
import com.example.innove.androiddatabinding.model.User;

public class MainActivity extends AppCompatActivity {
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User();
        user.setName("Abhishek Sharma");
        user.setEmail("sharmaabhi4433@gmail.com");
        user.setAbout("Working as a Android Develepor");
        user.setProfileImage("https://tineye.com/images/widgets/mona.jpg");

        binding.setUser(user);
    }

    public class myclickhandlers {
        Context context;

        public myclickhandlers(Context context) {
            this.context = context;
        }

        public void onButtonClick(View view) {
            Toast.makeText(context, "Button clicked!", Toast.LENGTH_SHORT).show();
        }

    }
}
