package com.elcubano.lapack_man;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public class OnManpageClickListener implements OnItemClickListener {

	private ManualActivity activity;

	public OnManpageClickListener(ManualActivity activity){
		this.activity = activity;
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view,
			int position, long id){
		activity.displayManpage((Page)parent.getItemAtPosition(position));
	}

}
