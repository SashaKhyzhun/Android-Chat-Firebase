/*
package com.sashakhyzhun.wearexample;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.wearable.view.CardFragment;
import android.support.wearable.view.FragmentGridPagerAdapter;

import java.util.ArrayList;

class SampleGridPagerAdapter extends FragmentGridPagerAdapter {

    private final Context mContext;
    private ArrayList<SimpleRow> mPages;

    SampleGridPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
        initPages();
    }

    private void initPages() {
        mPages = new ArrayList<>();

        SimpleRow row1 = new SimpleRow();
        row1.addPages(new SimplePage("MainFragment", "ListView", R.drawable.ic_mic_white_18dp, R.mipmap.ic_launcher));
        row1.addPages(new SimplePage("SettingsFragment", "Color/Size", R.drawable.ic_add_alert_white_18dp, R.mipmap.ic_launcher));
        row1.addPages(new SimplePage("NotificationFragment", "On/Off", R.drawable.ic_close_white, R.mipmap.ic_launcher));

//        SimpleRow row2 = new SimpleRow();
//        row2.addPages(new SimplePage("Title3", "Text3", R.drawable.ic_mic_white_18dp, R.mipmap.ic_launcher));
//
//        SimpleRow row3 = new SimpleRow();
//        row3.addPages(new SimplePage("Title4", "Text4", R.drawable.ic_add_alert_white_18dp, R.mipmap.ic_launcher));
//
//        SimpleRow row4 = new SimpleRow();
//        row4.addPages(new SimplePage("Title5", "Text5", R.drawable.ic_close_white, R.mipmap.ic_launcher));
//        row4.addPages(new SimplePage("Title6", "Text6", R.drawable.ic_mic_white_18dp, R.mipmap.ic_launcher));

        mPages.add(row1);
//        mPages.add(row2);
//        mPages.add(row3);
//        mPages.add(row4);
    }

    @Override
    public Fragment getFragment(int row, int col) {
        SimplePage page = mPages.get(row).getPages(col);
        return CardFragment.create(page.mTitle, page.mText, page.mIconId);
    }

    @Override
    public Drawable getBackgroundForPage(int row, int col) {
        SimplePage page = mPages.get(row).getPages(col);
        return mContext.getResources().getDrawable(page.mBackgroundId);
    }

    @Override
    public int getRowCount() {
        return mPages.size();
    }

    @Override
    public int getColumnCount(int row) {
        return mPages.get(row).size();
    }
}*/
