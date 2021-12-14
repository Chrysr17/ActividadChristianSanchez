package com.example.actividadchristiansnchez.Adaptadores;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.actividadchristiansnchez.R;

public class ImageGaleryAdapter extends BaseAdapter {
    private Context mContext;
    public int [] imagesArray={
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.images6,
            R.drawable.image7,
            R.drawable.image8

    };

    public ImageGaleryAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return imagesArray.length;
    }

    @Override
    public Object getItem(int i) {
        return imagesArray[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        ImageView imageView= new ImageView(mContext);
        imageView.setImageResource(imagesArray[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(
                new ViewGroup.LayoutParams(
                        500,
                        500
                ));

        return imageView;
    }
}
