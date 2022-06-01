package com.example.jogodeperguntas;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.wear.tiles.material.Button;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public class CadastrarFragment extends Fragment {

    public CadastrarFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cadastrar, container, false);
    }
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // Adiciona o Listener para o botão Jogar
        View mButtonJogar;
        mButtonJogar = getActivity().findViewById(R.id.buttonJogar);
        mButtonJogar.setOnClickListener(mJogarListener);
        }
private OnClickListener mJogarListener = new OnClickListener() {
@Override
public void onClick(View v) {
            // Inicia o Jogar Fragment ao clicar no botão Jogar
            getActivity().getSupportFragmentManager().beginTransaction()
            .replace(R.id.constraintLayout, new JogarFragment())
            .commit();
            }
};


}