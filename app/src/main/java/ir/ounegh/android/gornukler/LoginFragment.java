package ir.ounegh.android.gornukler;
import android.support.v4.app.*;
import android.view.*;
import android.os.*;

public class LoginFragment extends Fragment
{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		// TODO: Implement this method
		//return super.onCreateView(inflater, container, savedInstanceState);
		 View view=inflater.inflate(R.layout.fragment_login,container,false);
		 return view;
	}
	
}
