package cn.edu.gdmec.android.traveldemo.util;
import android.content.Context;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

import cn.edu.gdmec.android.traveldemo.entity.Menu;

public class DataUtil {

    /**
     * @param context
     * @param icons
     * @return
     */
    public static List<ImageView> getHeaderAddInfo(Context context, int icons[]){
        List<ImageView>  datas=new ArrayList<>();
        for (int i = 0; i <icons.length ; i++) {
            ImageView  icon=new ImageView(context);
            icon.setScaleType(ImageView.ScaleType.CENTER_CROP);
            icon.setImageResource(icons[i]);
            datas.add(icon);
        }
        return datas;
    }


    /**
     * 主菜单
     * @param icons
     * @param names
     * @return
     */
   public static List<Menu>  getMainMenus(int icons[], String names[]){
        List<Menu>  menus=new ArrayList<>();

        for (int i = 0; i <icons.length ; i++) {
            Menu menu=new Menu(icons[i],names[i]);
            menus.add(menu);
        }
        return menus;
    }
}

