package com.alphalabz.businessapp.Adapters;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.alphalabz.businessapp.Fragments.EventDetailFragment;
import com.alphalabz.businessapp.Objects.CustomEventCardObject;
import com.alphalabz.businessapp.R;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by swainroshankumar on 10/03/16.
 */
public class RecyclerAdapterCustomEventCard extends RecyclerView.Adapter<RecyclerViewHolderCustomEventCard> implements View.OnClickListener

{

    Context context;


    private ArrayList<CustomEventCardObject> customEventCardObjects=new ArrayList<>();

    public RecyclerAdapterCustomEventCard(Context context, ArrayList<CustomEventCardObject> customEventCardObjects) {
        this.context = context;
        this.customEventCardObjects = customEventCardObjects;
    }


    @Override
    public int getItemCount() {
        return customEventCardObjects.size();
    }

    @Override
    public void onClick(View view) {


        ((AppCompatActivity)context).getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container,new EventDetailFragment()).commit();

    }

    @Override
    public void onBindViewHolder(RecyclerViewHolderCustomEventCard holder, int position) {



        holder.customEventImage.setImageResource(customEventCardObjects.get(position).image);


    holder.titleText.setText(customEventCardObjects.get(position).titleText);

        holder.dateText.setText(customEventCardObjects.get(position).dateText);

        holder.timeText.setText(customEventCardObjects.get(position).timeText);





    }

    @Override
    public RecyclerViewHolderCustomEventCard onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());

        View eventView= inflater.inflate(R.layout.custom_event_card,parent,false);


        return new RecyclerViewHolderCustomEventCard(eventView);
    }
}


class RecyclerViewHolderCustomEventCard extends RecyclerView.ViewHolder {

   public
   @Bind(R.id.image)
   ImageView customEventImage;





   public
   @Bind(R.id.titleText)
   TextView titleText;



    public
    @Bind(R.id.dateText)
    TextView dateText;

    public
    @Bind(R.id.timeText)
    TextView timeText;



    public RecyclerViewHolderCustomEventCard(View itemView) {
       super(itemView);
       ButterKnife.bind(this,itemView);
   }


}