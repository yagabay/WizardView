package com.vismus.wizardview;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {

    WizardView _wizardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _wizardView = findViewById(R.id.wizard_view);
        List<WizardPage> pages = new ArrayList<>();
        pages.add(new MyWizardPage1());
        pages.add(new MyWizardPage2());
        pages.add(new MyWizardPage3());
        _wizardView.setPages(pages);
    }
}
