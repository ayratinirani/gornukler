package ir.ounegh.android.gornukler;
import android.support.v4.app.*;
import android.view.*;
import android.os.*;
import android.widget.*;
import android.support.v7.widget.*;
import android.view.View.*;

public class LoginFragment extends Fragment
{    View view;
     TextView signup,forgetpass;
	 EditText username,pass;
	 Button b;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		// TODO: Implement this method
		//return super.onCreateView(inflater, container, savedInstanceState);
		view=inflater.inflate(R.layout.fragment_login,container,false);
		setViews();
		 return view;
	}
	private void setViews(){
		signup=(TextView)view.findViewById(R.id.lbl_signup);
		forgetpass=(TextView)view.findViewById(R.id.lbl_forget_passeord);
		pass=(EditText)view.findViewById(R.id.password);
		username=(EditText)view.findViewById(R.id.username);
		b=(Button)view.findViewById(R.id.btn_login);
		b.setOnClickListener(
		new OnClickListener()
			{

				@Override
				public void onClick(View p1)
				{
					//Toast.makeText(getActivity(),"cgjjh",Toast.LENGTH_LONG).show();
					LoginToSite();
				}
				
			
		}
		);
		signup.setOnClickListener(
			new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
				}
				
			
		}
		);
		forgetpass.setOnClickListener(
			new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
				}
				
			
		}
		);
	}
	private void LoginToSite(){
		
	}
	
}
