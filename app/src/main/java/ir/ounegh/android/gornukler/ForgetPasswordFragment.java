package ir.ounegh.android.gornukler;
import android.support.v4.app.*;
import android.view.*;
import android.widget.*;
import android.view.View.*;
import android.os.*;

public class ForgetPasswordFragment extends Fragment
{    View view;
	TextView signup;
	EditText email;
	Button b;
	
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
		
		
		email=(EditText)view.findViewById(R.id.email);
		b=(Button)view.findViewById(R.id.btn_send);
		b.setOnClickListener(
			new OnClickListener()
			{

				@Override
				public void onClick(View p1)
				{
					//Toast.makeText(getActivity(),"cgjjh",Toast.LENGTH_LONG).show();
					SendToSite();
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
		
	}
	private void SendToSite(){

	}

}
