
package com.microroad.carrepair.ui;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;

import com.microroad.carrepair.R;

public class TabMenuActivity extends TabActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.tab_my_own_layout);

        TabHost tabHost = getTabHost();
        TabSpec first = tabHost.newTabSpec("tab1");
        first.setIndicator(setTabMenu(getResources().getString(R.string.tab_faxian), R.drawable.tab_item1_selector));
        first.setContent(new Intent(this, MainMassageActivity.class));

        TabSpec sccond = tabHost.newTabSpec("tab2");
        sccond.setIndicator(setTabMenu(getResources().getString(R.string.tab_huodong), R.drawable.tab_item2_selector));
        sccond.setContent(new Intent(this, MyPractiveAdapter.class));

        TabSpec three = tabHost.newTabSpec("tab3");
        three.setIndicator(setTabMenu(getResources().getString(R.string.tab_faqi), R.drawable.tab_item3_selector));
        three.setContent(new Intent(this, MyMassageActivity.class));

        TabSpec four = tabHost.newTabSpec("tab4");
        four.setIndicator(setTabMenu(getResources().getString(R.string.tab_wode), R.drawable.tab_item4_selector));
        four.setContent(new Intent(this, MoreInfoActivity.class));

        tabHost.addTab(first);
        tabHost.addTab(sccond);
        tabHost.addTab(three);
        tabHost.addTab(four);
    }

    public View setTabMenu(String name, int image) {
        View v = LayoutInflater.from(this).inflate(R.layout.tab_own_item_layout, null);
        TextView menuText = (TextView) v.findViewById(R.id.tab_menu_txt);
        ImageView menuImg = (ImageView) v.findViewById(R.id.tab_image);
        menuText.setText(name);
        menuImg.setImageResource(image);
        return v;
    }
}
