package com.example.mp_10homework_test;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Contact> lstContact;

    public FragmentContact() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_contact, container, false);


        myrecyclerview = v.findViewById(R.id.contact_recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), lstContact);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter);


        return v;
    }


    // nCteate메서드 에서 데이터관련 코드 넣음
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContact = new ArrayList<>();
        lstContact.add(new Contact("Aaron Jones", "(111) 251236211", R.drawable.ic_group));
        lstContact.add(new Contact("chan Jones", "(02) 251236211", R.drawable.ic_call));
        lstContact.add(new Contact("park Jones", "(031) 251236211", R.drawable.ic_star));
        lstContact.add(new Contact("Aaron Jones", "(111) 251236211", R.drawable.ic_group));
        lstContact.add(new Contact("chan Jones", "(02) 251236211", R.drawable.ic_call));
        lstContact.add(new Contact("park Jones", "(031) 251236211", R.drawable.ic_star));
        lstContact.add(new Contact("Aaron Jones", "(111) 251236211", R.drawable.ic_group));
        lstContact.add(new Contact("chan Jones", "(02) 251236211", R.drawable.ic_call));
        lstContact.add(new Contact("park Jones", "(031) 251236211", R.drawable.ic_star));
        lstContact.add(new Contact("Aaron Jones", "(111) 251236211", R.drawable.ic_group));
        lstContact.add(new Contact("chan Jones", "(02) 251236211", R.drawable.ic_call));
        lstContact.add(new Contact("park Jones", "(031) 251236211", R.drawable.ic_star));
        lstContact.add(new Contact("Aaron Jones", "(111) 251236211", R.drawable.ic_group));
        lstContact.add(new Contact("chan Jones", "(02) 251236211", R.drawable.ic_call));
        lstContact.add(new Contact("park Jones", "(031) 251236211", R.drawable.ic_star));
        lstContact.add(new Contact("Aaron Jones", "(111) 251236211", R.drawable.ic_group));
        lstContact.add(new Contact("chan Jones", "(02) 251236211", R.drawable.ic_call));
        lstContact.add(new Contact("Aaron Jones", "(111) 251236211", R.drawable.ic_group));
        lstContact.add(new Contact("chan Jones", "(02) 251236211", R.drawable.ic_call));
        lstContact.add(new Contact("park Jones", "(031) 251236211", R.drawable.ic_star));
        lstContact.add(new Contact("park Jones", "(031) 251236211", R.drawable.ic_star));
        lstContact.add(new Contact("Aaron Jones", "(111) 251236211", R.drawable.ic_group));
        lstContact.add(new Contact("chan Jones", "(02) 251236211", R.drawable.ic_call));
        lstContact.add(new Contact("park Jones", "(031) 251236211", R.drawable.ic_star));

    }
}

/*
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

*/
/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentContact#newInstance} factory method to
 * create an instance of this fragment.
 *//*

public class FragmentContact extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentContact() {
        // Required empty public constructor
    }

    */
/**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentContact.
     *//*

    // TODO: Rename and change types and number of parameters
    public static FragmentContact newInstance(String param1, String param2) {
        FragmentContact fragment = new FragmentContact();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact, container, false);
    }
}*/
