package ahuja.shivam.recyclerviewinpopupwindow;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private AppCompatImageView PopupWindowOpener_iv;
    private PopupWindow popupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PopupWindowOpener_iv = (AppCompatImageView) findViewById(R.id.PopupWindowOpener_iv);
        PopupWindowOpener_iv.setOnClickListener(this);
        initPopup();
    }

    private void initPopup() {
        RecyclerView recyclerview = (RecyclerView) LayoutInflater.from(this).inflate(R.layout.recyclerview, null);
        recyclerview.setLayoutManager(new GridLayoutManager(this, 6));
        //make colors list
        ArrayList<String> colors = new ArrayList<>();
        colors.add("#f29a8b"); colors.add("#ffcc85"); colors.add("#7fdba9"); colors.add("#80b8d1"); colors.add("#bf93eb"); colors.add("#ed93d6");
        colors.add("#f29a8b"); colors.add("#ffcc85"); colors.add("#7fdba9"); colors.add("#80b8d1"); colors.add("#bf93eb"); colors.add("#ed93d6");
        colors.add("#f29a8b"); colors.add("#ffcc85"); colors.add("#7fdba9"); colors.add("#80b8d1"); colors.add("#bf93eb"); colors.add("#ed93d6");
        colors.add("#f29a8b"); colors.add("#ffcc85"); colors.add("#7fdba9"); colors.add("#80b8d1"); colors.add("#bf93eb"); colors.add("#ed93d6");
        colors.add("#f29a8b"); colors.add("#ffcc85"); colors.add("#7fdba9"); colors.add("#80b8d1"); colors.add("#bf93eb"); colors.add("#ed93d6");
        colors.add("#f29a8b"); colors.add("#ffcc85"); colors.add("#7fdba9"); colors.add("#80b8d1"); colors.add("#bf93eb"); colors.add("#ed93d6");
        //set Adapter
        final Adapter adapter = new Adapter(this, colors);
        recyclerview.setAdapter(adapter);

        //create popup and setView->> public PopupWindow (View contentView, int width, int height, boolean focusable)
        popupWindow = new PopupWindow(
                recyclerview,
                RecyclerView.LayoutParams.WRAP_CONTENT,
                RecyclerView.LayoutParams.WRAP_CONTENT, true);
        popupWindow.setElevation(3);

    }

    @Override
    public void onClick(View view) {
        //show Popup
        popupWindow.showAsDropDown(PopupWindowOpener_iv);
    }
}
