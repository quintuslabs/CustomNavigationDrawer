package com.quintus.labs.slidingmenu.slidingmenu1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.quintus.labs.slidingmenu.R;

public class UserProfile extends Fragment {

    RelativeLayout rlCover;
    ImageView ivUserImage;
    RoundedImage roundedImage;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.def_profile_pic);
        roundedImage = new RoundedImage(bm);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.user_profile, container, false);

        init(v);

        return v;
    }

    private void init(View v) {

        rlCover = v.findViewById(R.id.ivCover);
        ivUserImage = v.findViewById(R.id.ivImage);
        ivUserImage.setImageDrawable(roundedImage);

    }

}
