package com.example.myapplication;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;

import java.util.List;

public class HouseAdapter
        extends RecyclerView.Adapter<HouseAdapter.ViewHolder> {
    private Context context;
    private List<House> items;


    public HouseAdapter(Context context, List<House> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.housecard,
                parent,
                false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final House house = items.get(position);
        CardView cardView = holder.cardView;
        ImageView imageView = (ImageView) cardView.findViewById(R.id.image);
        Glide.with(context).load(house.getImageId()).into(imageView);
        TextView city =  cardView.findViewById(R.id.txtName);
        city.setText("City: "+house.getCity());
        TextView price =  cardView.findViewById(R.id.txtPrice);
        price.setText("Price:  "+ house.getPrice());
        TextView bed =  cardView.findViewById(R.id.txtBedroom);
        bed.setText("Number of bedrooms: "+house.getNumOfbedrooms());
        TextView surface  =  cardView.findViewById(R.id.txtsurface);
        surface.setText("Surface: "+house.getSurface());
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;

        public ViewHolder(CardView cardView) {
            super(cardView);
            this.cardView = cardView;
        }

    }
}


