package com.example.nikol.myapp;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nikol.myapp.R;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemClick;

public class ContactViewHolder extends RecyclerView.ViewHolder {

    public TextView name;
    public TextView number;
    public TextView email;
    View cItemView;

    public ContactViewHolder(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.contact_name);
        number = (TextView) itemView.findViewById(R.id.contact_number);
        email = (TextView) itemView.findViewById(R.id.contact_email);
        cItemView = itemView;
        ButterKnife.bind(this, itemView);
    }

    @OnClick
    public void clikcOnItem() {
        Intent intent = new Intent(itemView.getContext(), ContactInfoActivity.class);
        itemView.getContext().startActivity(intent);
    }



}
