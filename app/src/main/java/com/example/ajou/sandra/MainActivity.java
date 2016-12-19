package com.example.ajou.sandra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<ImageModel> imageData = new ArrayList<>();
    private static String IMAGE_URLS[] = {
            "http://placehold.it/350x150&text=image1",
            "http://placehold.it/350x150&text=image2",
            "http://placehold.it/350x150&text=image3",
            "http://placehold.it/350x150&text=image4",
            "http://placehold.it/350x150&text=image5",
            "http://placehold.it/350x150&text=image6",
            "http://placehold.it/350x150&text=image7",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < IMAGE_URLS.length; ++i) {
            ImageModel imageModel = new ImageModel("Image " + i, IMAGE_URLS[i]);
            imageData.add(imageModel);
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setHasFixedSize(true);

        GalleryAdapter
    }
}
