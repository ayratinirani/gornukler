package ir.ounegh.android.gornukler;
import android.support.v4.app.*;
import android.view.*;
import android.os.*;

public class SearchFragment extends Fragment
{
	private View view;


	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		// TODO: Implement this method
		view=inflater.inflate(R.layout.fragment_search,container,false);
		return view;
	}
}
