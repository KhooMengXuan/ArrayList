package sg.edu.rp.c346.id18016446.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

        public class MainActivity extends AppCompatActivity {

            TextView tv;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                tv = findViewById(R.id.textView);

                ArrayList<String> fruits;
                fruits = new ArrayList<String>();
                fruits.add("apple");
                fruits.add("banana");
                fruits.add("cherry");
                fruits.add(3, "durian");
                String theFruit = fruits.get(1);
                fruits.remove(0);
                fruits.set(fruits.size()-1, "dragon fruit");

                String arrayList = "Fruits\n=====";

                for (String f : fruits) {
                    arrayList += "\n" + f;
                }

                tv.setText(arrayList);
            }
}
