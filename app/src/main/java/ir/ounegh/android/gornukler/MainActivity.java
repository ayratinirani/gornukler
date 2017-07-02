package ir.ounegh.android.gornukler;

import android.app.*;
import android.os.*;
import android.support.v7.app.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.support.v7.widget.*;
import android.support.v7.widget.Toolbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity 
{
	Button home,newPost,profile,search;
	FrameLayout frameLayout;
	FragmentManager fm;
	FragmentTransaction ft;
	Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		//set toolbar
		toolbar=(Toolbar)findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		//fragment manager
		LoginFragment lfr=new LoginFragment();
		fm=getSupportFragmentManager();
		ft=fm.beginTransaction();
		
		//framelayout
		frameLayout=(FrameLayout)findViewById(R.id.container);
		ft.add(R.id.container,lfr);
		ft.commit();
		//setbuttombar
		setButtombar();
    }

	private void setButtombar(){
		home=(Button) findViewById(R.id.btn_home);

		search=(Button) findViewById(R.id.btn_search);
		newPost=(Button) findViewById(R.id.btn_new_post);
		profile=(Button) findViewById(R.id.btn_profile);


		home.setOnClickListener(
			new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
				}


			}
		);
		search.setOnClickListener(
			new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
				}


			}
		);
		profile.setOnClickListener(
			new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
				}


			}
		);
		newPost.setOnClickListener(
			new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
				}


			}
		);

	}


}
