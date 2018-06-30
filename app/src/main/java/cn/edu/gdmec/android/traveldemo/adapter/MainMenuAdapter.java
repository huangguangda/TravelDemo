package cn.edu.gdmec.android.traveldemo.adapter;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import cn.edu.gdmec.android.traveldemo.R;
import cn.edu.gdmec.android.traveldemo.entity.Menu;


public class MainMenuAdapter extends RecyclerView.Adapter<MainMenuAdapter.MainMenuViewholder>{

    protected Context context;
    protected List<Menu> menus;

    public MainMenuAdapter(Context context, List<Menu> menus){
        this.context=context;
        this.menus=menus;
    }

    @NonNull
    @Override
    public MainMenuViewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MainMenuViewholder(LayoutInflater.from(context).inflate(R.layout.item_main_menu,null));
    }

    @Override
    public void onBindViewHolder(@NonNull MainMenuViewholder holder, int i) {

        Menu menu=menus.get(i);
        holder.mImgMenuIcon.setImageResource(menu.icon);
        holder.mTextMenuName.setText(menu.menuName);
    }

    @Override
    public int getItemCount() {
        return null!=menus?menus.size():0;
    }

    // ViewHolder
    class MainMenuViewholder extends RecyclerView.ViewHolder{

        public ImageView mImgMenuIcon;
        public TextView mTextMenuName;
        public MainMenuViewholder(@NonNull View itemView) {
            super(itemView);
            mImgMenuIcon=itemView.findViewById(R.id.img_menu_icon);
            mTextMenuName=itemView.findViewById(R.id.txt_menu_name);
        }
    }
}
