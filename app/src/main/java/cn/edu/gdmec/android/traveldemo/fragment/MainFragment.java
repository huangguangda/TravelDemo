package cn.edu.gdmec.android.traveldemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.edu.gdmec.android.traveldemo.R;
import cn.edu.gdmec.android.traveldemo.adapter.MainHeaderAdAdapter;
import cn.edu.gdmec.android.traveldemo.adapter.MainMenuAdapter;
import cn.edu.gdmec.android.traveldemo.util.DataUtil;


/**
 * 主界面视图
 */
public class MainFragment extends Fragment{

    protected  int [] icons={R.drawable.header_pic_ad1,R.drawable.header_pic_ad2,R.drawable.header_pic_ad1};
    protected ViewPager mVPagerHeaderAd;//广告头

    //菜单图标
    protected  int [] menuIons={R.drawable.menu_airport,R.drawable.menu_car
            ,R.drawable.menu_course,R.drawable.menu_hatol,
            R.drawable.menu_nearby,R.drawable.menu_trav,
            R.drawable.menu_ticket,R.drawable.menu_train};
    protected  String [] menus;
    protected RecyclerView mRecycleViewMenu;//主菜单


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        menus=this.getActivity().getResources().getStringArray(R.array.main_menu);

        mVPagerHeaderAd= (ViewPager) getView().findViewById(R.id.vpager_main_header_ad);
        mRecycleViewMenu= (RecyclerView) getView().findViewById(R.id.recycleview_main_menu);


        MainHeaderAdAdapter adapter=new MainHeaderAdAdapter(getActivity(), DataUtil.getHeaderAddInfo(getActivity(),icons));
        mVPagerHeaderAd.setAdapter(adapter);

        //菜单
        //布局样式
        mRecycleViewMenu.setLayoutManager(new GridLayoutManager(getActivity(),4));
        MainMenuAdapter mainMenuAdapter=new MainMenuAdapter(getActivity(),DataUtil.getMainMenus(menuIons,menus));
        mRecycleViewMenu.setAdapter(mainMenuAdapter);

    }
}
