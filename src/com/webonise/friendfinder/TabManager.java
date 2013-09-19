package com.webonise.friendfinder;

import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


public class TabManager extends TabActivity {
	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setTabContent();
	}

	public void setTabContent() {
		Log.v(null, "reached");
		
		TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);

		TabSpec tabSpecMap=tabHost.newTabSpec("Map Tab");
		TabSpec tabSpecFriendList= tabHost.newTabSpec("Friends List");
		
		tabSpecMap.setIndicator("Map");
		tabSpecFriendList.setIndicator("Friends");
		
		tabSpecMap.setContent(new Intent(TabManager.this,GoogleMapActivity.class));
		tabSpecFriendList.setContent(new Intent(TabManager.this,FriendsListActivity.class));
		
		tabHost.addTab(tabSpecMap);
		tabHost.addTab(tabSpecFriendList);
		
		/*

		Log.v(null, "reached");

		Intent mapIntent = new Intent().setClass(mContext,
				GoogleMapActivity.class);
		TabSpec tabSpecMap = tabHost
				.newTabSpec("Map")
				.setIndicator("",
						resources.getDrawable(R.drawable.google_map_icon_view))
				.setContent(mapIntent);

		Intent friendsListIntent = new Intent().setClass(mContext,
				FriendsListActivity.class);
		TabSpec tabSpecFriendsList = tabHost
				.newTabSpec("Friends")
				.setIndicator(
						"",
						resources
								.getDrawable(R.drawable.friends_list_icon_view))
				.setContent(friendsListIntent);

		tabHost.addTab(tabSpecMap);
		tabHost.addTab(tabSpecFriendsList);

		tabHost.setCurrentTab(2);
*/	}
}
