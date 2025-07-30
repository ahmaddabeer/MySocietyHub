package com.example.mysocietyhub.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;

import com.example.mysocietyhub.databinding.FragmentGalleryBinding;

import java.util.ArrayList;
import java.util.List;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();



        binding.fragGalleryRec.setLayoutManager(new GridLayoutManager(getContext(),2));
        GalleryFragmentAdapter adapter = new GalleryFragmentAdapter(getContext(),dataset2());
        binding.fragGalleryRec.setAdapter(adapter);




        return root;
    }

    private List<GalleryViewModel> dataset2() {

        List<GalleryViewModel> holder = new ArrayList<>();
        GalleryViewModel obj0 = new GalleryViewModel();
        obj0.setName("Main Entrance");
        obj0.setImage("https://cdn-icons-png.flaticon.com/512/6195/6195560.png");
        holder.add(obj0);

        GalleryViewModel obj1 = new GalleryViewModel();
        obj1.setName("Park Area");
        obj1.setImage("https://cdn-icons-png.flaticon.com/512/1531/1531776.png");
        holder.add(obj1);

        GalleryViewModel obj2 = new GalleryViewModel();
        obj2.setName("Parking Lot");
        obj2.setImage("https://cdn-icons-png.flaticon.com/512/1074/1074763.png");
        holder.add(obj2);

        GalleryViewModel obj3 = new GalleryViewModel();
        obj3.setName("Club House");
        obj3.setImage("https://cdn-icons-png.flaticon.com/512/1183/1183747.png");
        holder.add(obj3);

        GalleryViewModel obj4 = new GalleryViewModel();
        obj4.setName("Swimming Pool");
        obj4.setImage("https://cdn-icons-png.flaticon.com/512/263/263115.png");
        holder.add(obj4);

        GalleryViewModel obj5 = new GalleryViewModel();
        obj5.setName("Gym");
        obj5.setImage("https://cdn-icons-png.flaticon.com/512/2331/2331970.png");
        holder.add(obj5);

        GalleryViewModel obj6 = new GalleryViewModel();
        obj6.setName("Community Hall");
        obj6.setImage("https://cdn-icons-png.flaticon.com/512/3659/3659811.png");
        holder.add(obj6);

        GalleryViewModel obj7 = new GalleryViewModel();
        obj7.setName("Library");
        obj7.setImage("https://cdn-icons-png.flaticon.com/512/4273/4273194.png");
        holder.add(obj7);

        GalleryViewModel obj8 = new GalleryViewModel();
        obj8.setName("Mandir");
        obj8.setImage("https://cdn-icons-png.flaticon.com/512/4061/4061732.png");
        holder.add(obj8);

        GalleryViewModel obj9 = new GalleryViewModel();
        obj9.setName("Masjid");
        obj9.setImage("https://cdn-icons-png.flaticon.com/512/3324/3324842.png");
        holder.add(obj9);

        GalleryViewModel obj10 = new GalleryViewModel();
        obj10.setName("Gurudwara");
        obj10.setImage("https://cdn-icons-png.flaticon.com/512/4922/4922681.png");
        holder.add(obj10);


        return holder;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}