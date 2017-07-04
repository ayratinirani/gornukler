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
		ft.replace(R.id.container,lfr);
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
					HomeFragment homefagment=new HomeFragment();
					ft=fm.beginTransaction();
					ft.replace(R.id.container,homefagment).commit();
				}


			}
		);
		search.setOnClickListener(
			new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
				SearchFragment searchfagment=new SearchFragment();
					ft=fm.beginTransaction();
					ft.replace(R.id.container,searchfagment).commit();
					
				}


			}
		);
		profile.setOnClickListener(
			new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					ProfileFragment profilefagment=new ProfileFragment();
					ft=fm.beginTransaction();
					ft.replace(R.id.container,profilefagment).commit();
					
				}


			}
		);
		newPost.setOnClickListener(
			new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					NewPostFragment newPostfagment=new NewPostFragment();
					ft=fm.beginTransaction();
					ft.replace(R.id.container,newPostfagment).commit();
					
				}


			}
		);

	}


}
