package com.shsl.android.zeamo.view.object;

import com.shsl.android.zeamo.R;

import java.util.ArrayList;

/**
 * Created by shsl on 07/01/2017.
 */

public class SpinningCollection {
    public static ArrayList<SpinningObj> getSpinningCollection(){
        ArrayList<SpinningObj> spArr = new ArrayList<>();
        SpinningObj sp = null;

        sp = new SpinningObj();
        sp.setImageStudio(R.drawable.sp);
        sp.setAddress("266 E 10th St");
        sp.setLocation("0.2 mi");
        sp.setName("Green Fitness Studio");
        sp.setReview(1);
        spArr.add(sp);

        sp = new SpinningObj();
        sp.setImageStudio(R.drawable.sp);
        sp.setAddress("266 E 10th St");
        sp.setLocation("0.2 mi");
        sp.setName("Green Fitness Studio");
        sp.setReview(2);
        spArr.add(sp);

        sp = new SpinningObj();
        sp.setImageStudio(R.drawable.sp);
        sp.setAddress("266 E 10th St");
        sp.setLocation("0.2 mi");
        sp.setName("Green Fitness Studio");
        sp.setReview(3);
        spArr.add(sp);

        sp = new SpinningObj();
        sp.setImageStudio(R.drawable.sp);
        sp.setAddress("266 E 10th St");
        sp.setLocation("0.2 mi");
        sp.setName("Green Fitness Studio");
        sp.setReview(4);
        spArr.add(sp);

        sp = new SpinningObj();
        sp.setImageStudio(R.drawable.sp);
        sp.setAddress("266 E 10th St");
        sp.setLocation("0.2 mi");
        sp.setName("Green Fitness Studio");
        sp.setReview(5);
        spArr.add(sp);

        return spArr;
    }
}
