package com.dibbus.android.demo.gradients;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

public class AndroidGradientsActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		GridView gridview = (GridView) findViewById(R.id.gvButtons);
		gridview.setAdapter(new ButtonAdapter(this));
	}
}