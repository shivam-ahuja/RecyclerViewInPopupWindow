package ahuja.shivam.recyclerviewinpopupwindow;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by root on 26/11/17.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context context;
    ArrayList<String> colors;

    public Adapter(Context context, ArrayList<String> colors) {
        this.context = context;
        this.colors = colors;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.listitem_circle, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.circle.setImageDrawable(new ColorDrawable(Color.parseColor(colors.get(position))));
    }

    @Override
    public int getItemCount() {
        return colors.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final CircleImageView circle;

        public ViewHolder(View itemView) {
            super(itemView);
            circle = (CircleImageView) itemView;
        }
    }
}
