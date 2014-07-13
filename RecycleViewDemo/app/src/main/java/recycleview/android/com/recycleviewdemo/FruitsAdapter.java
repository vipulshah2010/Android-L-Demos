package recycleview.android.com.recycleviewdemo;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class FruitsAdapter extends RecyclerView.Adapter<FruitsAdapter.ViewHolder>
{
    private ArrayList<String> fruits;

    public FruitsAdapter() {
        fruits=new ArrayList<String>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");
    }

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        public CardView cardView;
        public TextView info_text;
        public ViewHolder(View itemView) {
            super(itemView);
            this.cardView=(CardView)itemView.findViewById(R.id.card_view);
            this.info_text=(TextView)itemView.findViewById(R.id.info_text);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        FrameLayout v = (FrameLayout)LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row, parent,false);
//        v.setLayoutParams(new ViewGroup.LayoutParams(CardView.LayoutParams.MATCH_PARENT,CardView.LayoutParams.WRAP_CONTENT));
//        v.setPadding(10,10,10,10);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.info_text.setText(fruits.get(i));
    }

    @Override
    public int getItemCount() {
        return fruits.size();
    }
}
