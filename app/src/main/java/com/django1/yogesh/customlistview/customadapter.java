package com.django1.yogesh.customlistview;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class customadapter extends ArrayAdapter<String>{

    public customadapter(Context context, String[] names) {
        super(context,R.layout.custom_row, names);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater myinflater=LayoutInflater.from(getContext());

        View customview=myinflater.inflate(R.layout.custom_row,parent,false);
        String name=getItem(position);

        TextView mytextview=(TextView)customview.findViewById(R.id.mytextview);
        ImageView myimageview=(ImageView)customview.findViewById(R.id.myimageview);

        mytextview.setText(name);
        switch(name){
            case "alia":myimageview.setImageResource(R.mipmap.alia);
                break;
            case "alone":myimageview.setImageResource(R.mipmap.alone);
                break;
            case "batman":myimageview.setImageResource(R.mipmap.batman);
                break;
            case "chloe":myimageview.setImageResource(R.mipmap.chloe);
                break;
            case "deadpool":myimageview.setImageResource(R.mipmap.deadpool);
                break;
            case "dino":myimageview.setImageResource(R.mipmap.dino);
                break;
            case "joker":myimageview.setImageResource(R.mipmap.joker);
                break;
            case "kid":myimageview.setImageResource(R.mipmap.kid);
                break;
            case "logan":myimageview.setImageResource(R.mipmap.logan);
                break;
            case "nice":myimageview.setImageResource(R.mipmap.nice);
                break;
            case "padukone":myimageview.setImageResource(R.mipmap.padukone);
                break;
            case "portman":myimageview.setImageResource(R.mipmap.portman);
                break;
            case "swift":myimageview.setImageResource(R.mipmap.swift);
                break;
            default:myimageview.setImageResource(R.mipmap.deepika);
        }

        return customview;
    }
}
