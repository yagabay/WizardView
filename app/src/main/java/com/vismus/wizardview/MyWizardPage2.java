package com.vismus.wizardview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyWizardPage2 extends WizardPage {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_wizard_page_2, container, false);
        return rootView;
    }

    @Override
    public void setData(Bundle params){
        // TBD
    }

}
