package com.example.ram.departmentalstores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by ram on 31/5/16.
 */
class ItemsAdapter extends ArrayAdapter<String> {
    ArrayList<String> itemNames;
    String currentSelection = "";
    ArrayList<String>itemsSelected=new ArrayList<>();

    public ItemsAdapter(Context context, ArrayList<String> itemNames) {
        super(context, 0, itemNames);
        this.itemNames = itemNames;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = new ViewHolder();


        if (convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_list1, parent, false);
            holder.itemView = (TextView) convertView.findViewById(R.id.itemtext);
            holder.image = (ImageView) convertView.findViewById(R.id.itemimage);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        final String text = itemNames.get(position);


        holder.itemView.setText(itemNames.get(position));
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentSelection  = text;
                showPopup(v);
            }
        });

        return convertView;


    }

    static class ViewHolder {

        TextView itemView;
        ImageView image;
    }


    public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(getContext(), v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.item_popup_menu, popup.getMenu());
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                                             @Override
                                             public boolean onMenuItemClick(MenuItem item) {
                                                 switch (item.getItemId()) {
                                                     case R.id.adding:
                                                         itemsSelected(currentSelection);
                                                         return true;
                                                     default:
                                                         return true;
                                                 }
                                             }
                                         }

        );
        popup.show();
    }

    public void itemsSelected(String selectedItem){
        Toast.makeText(getContext(),"selected: "+selectedItem,Toast.LENGTH_LONG).show();
        itemsSelected.add(selectedItem);

}

    public ArrayList<String> getFinalSelection(){
        return itemsSelected;
    }

}