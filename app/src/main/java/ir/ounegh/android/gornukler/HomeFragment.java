package ir.ounegh.android.gornukler;
import android.support.v4.app.*;
import android.view.*;
import android.os.*;

public class HomeFragment extends Fragment
{

	private View view;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		// TODO: Implement this method
		view=inflater.inflate(R.layout.fragment_home,container,false);
		return view;
	}
	
}
