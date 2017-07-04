package ir.ounegh.android.gornukler;
import android.support.v4.app.*;
import android.view.*;
import android.os.*;
import android.widget.*;
import android.support.v7.widget.*;
import android.view.View.*;

public class SignUpFragment extends Fragment
{    View view;
	TextView login;
	EditText username,pass,fullName,Email;
	Button b;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		// TODO: Implement this method
		//return super.onCreateView(inflater, container, savedInstanceState);
		view=inflater.inflate(R.layout.fragment_sign_up,container,false);
		setViews();
		return view;
	}
	private void setViews(){
		login=(TextView)view.findViewById(R.id.lbl_login);
		pass=(EditText)view.findViewById(R.id.password);
		username=(EditText)view.findViewById(R.id.username);
		fullName=(EditText)view.findViewById(R.id.full_name);
		Email=(EditText)view.findViewById(R.id.email);
		b=(Button)view.findViewById(R.id.btn_sign_up);
		b.setOnClickListener(
			new OnClickListener()
			{

				@Override
				public void onClick(View p1)
				{
					//Toast.makeText(getActivity(),"cgjjh",Toast.LENGTH_LONG).show();
                  signUptoSite();
				}


			}
		);
		
		login.setOnClickListener(
			new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
				}
				
			
			
		}
		);
	}
	private void signUptoSite(){

	}

}
