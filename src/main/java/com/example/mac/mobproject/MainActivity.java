package com.example.mac.mobproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int[] IMAGES = {R.drawable.ic_launcher_background};
    String[] NAMES = {"egypt", "brazil", "usa", "germany"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);
        CustomAdapter ca = new CustomAdapter();
        listView.setAdapter(ca);
    }

    ////////////ListView//////////////////

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup parent) {
            view = getLayoutInflater().inflate(R.layout.custom_list_view, null);
            ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
            TextView textViewname = (TextView) view.findViewById(R.id.textViewname);
            imageView.setImageResource(IMAGES[i]);
            textViewname.setText(NAMES[i]);


            return view;
        }

    }
}