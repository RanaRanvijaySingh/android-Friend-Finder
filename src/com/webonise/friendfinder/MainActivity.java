package com.webonise.friendfinder;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.util.Log;

public class MainActivity extends FragmentActivity {
    private FragmentTabHost mTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(),R.id.tabcontent);

        mTabHost.addTab(
                mTabHost.newTabSpec("tab1").setIndicator("Tab 1",
                        getResources().getDrawable(android.R.drawable.star_on)),
                MapFragment.class, null);
        mTabHost.addTab(
                mTabHost.newTabSpec("tab2").setIndicator("Tab 2",
                        getResources().getDrawable(android.R.drawable.star_on)),
                FriendsListFragment.class, null);
    }
}

//public class MainActivity extends FragmentActivity {
//
//	FragmentTabHost mTabHost;
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);
//		
//		
//
////		MapFragment mapFragment = new MapFragment();
////		mapFragment.setArguments(getIntent().getExtras());
////
////		FragmentTransaction fragmentTransaction = getSupportFragmentManager()
////				.beginTransaction();
////
////		fragmentTransaction.add(R.id., mapFragment);
////		fragmentTransaction.addToBackStack(null);
////		fragmentTransaction.commit();
//		
//		
//		
//		setTabContent();
//
//	}
//
//	public void setTabContent() {
//		Log.v(null, "reached");
//
//		mTabHost=(FragmentTabHost)findViewById(android.R.id.tabhost);
//		mTabHost.setup(this,getSupportFragmentManager(),android.R.id.tabcontent);
//		
////		TabSpec tabSpecMap=mTabHost.newTabSpec("map");
////		TabSpec tabSpecFriendList= mTabHost.newTabSpec("friends");
////		
////		tabSpecMap.setIndicator("Map");
////		tabSpecFriendList.setIndicator("Friends");
//		
//		//tabSpecMap.setContent(this, MapFragment.class);
//		
//		
//		mTabHost.addTab(
//                mTabHost.newTabSpec("tab1").setIndicator("Tab 1",
//                        getResources().getDrawable(android.R.drawable.star_on)),
//                MapFragment.class, null);
//		
//		
//		mTabHost.addTab(
//                mTabHost.newTabSpec("tab2").setIndicator("Tab 2",
//                        getResources().getDrawable(android.R.drawable.star_on)),
//                FriendsListFragment.class, null);
//		
//	//	mTabHost.addTab(tabSpec);
//		
//		
////		
////		tabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
////
////		TabSpec tabSpecMap = tabHost.newTabSpec("Map Tab");
////		TabSpec tabSpecFriendList = tabHost.newTabSpec("Friends List");
////
////		tabSpecMap.setIndicator("Map");
////		tabSpecFriendList.setIndicator("Friends");
////
////		tabSpecMap.setContent(new Intent(this, GoogleMapActivity.class));
////		tabSpecFriendList
////				.setContent(new Intent(this, FriendsListActivity.class));
////
////		tabHost.addTab(tabSpecMap);
////		tabHost.addTab(tabSpecFriendList);
//
//	}
//
//}
