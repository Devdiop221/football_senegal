package com.devdiop.gestionfoot;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class StadiumFragment extends Fragment {

    private ListView listRencontres;
    private String[] tabMatchs, tabTickets;
    private String  match, tickets;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_stadium, container, false);

        listRencontres = view.findViewById(R.id.listRencontres);
        tabMatchs = getResources().getStringArray(R.array.tab_match);
        tabTickets = getResources().getStringArray(R.array.tab_tickets);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, tabMatchs);
        listRencontres.setAdapter(adapter);

        listRencontres.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                match = tabMatchs[position];
                tickets = tabTickets[position];

                AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity());
                dialog.setIcon(R.mipmap.ic_launcher);
                dialog.setTitle(match);
                dialog.setMessage(tickets);

                dialog.setNegativeButton(getString(R.string.back), null);
                dialog.setPositiveButton(getString(R.string.inscription), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog.show();

            }
        });


        return view;
    }
}