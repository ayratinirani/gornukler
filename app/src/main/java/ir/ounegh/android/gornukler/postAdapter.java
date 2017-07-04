package ir.ounegh.android.gornukler;
import android.support.v7.widget.*;
import android.widget.*;
import android.view.*;
import android.view.View.*;
import android.graphics.*;

public class postAdapter extends RecyclerView.Adapter<postAdapter.viewHolder>
{

	@Override
	public postAdapter.viewHolder onCreateViewHolder(ViewGroup p1, int p2)
	{ View vh=  LayoutInflater.from(p1.getContext()).inflate(R.layout.post_item,p1,false);
	    
		// TODO: Implement this method
		return new viewHolder(vh);
	}

	@Override
	public void onBindViewHolder(postAdapter.viewHolder holder, int position)
	{
		holder.userName.setText("نام کاربر"+position);
		holder.btnlike.setImageResource(android.R.drawable.btn_star);
		holder.btncomment.setImageResource(android.R.drawable.ic_dialog_dialer);
		holder.postText.setText("متن"+position);
		holder.postimage.setImageResource(android.R.drawable.alert_light_frame);
		holder.userpic.setImageResource(android.R.drawable.btn_default);
		
		
		
	}

	@Override
	public int getItemCount()
	{
		// TODO: Implement this method
		return 0;
	}
	
	
	
	
	
	
	public class viewHolder extends RecyclerView.ViewHolder{
		public ImageView userpic,postimage,btncomment,btnlike;
		public TextView userName,postText;
		int like_flag=0;
		
		public viewHolder(View itemview){
			super(itemview);
			userName=(TextView)itemview.findViewById(R.id.post_item_user_name);
			postText=(TextView)itemview.findViewById(R.id.post_itemText);
			postimage=(ImageView)itemview.findViewById(R.id.post_itemImage);
			userpic=(ImageView)itemview.findViewById(R.id.post_item_user_image);
			btncomment=(ImageView)itemview.findViewById(R.id.post_item_comment);
			btnlike=(ImageView)itemview.findViewById(R.id.post_item_like);
			btnlike.setOnClickListener(
				new OnClickListener(){

					@Override
					public void onClick(View p1)
					{
					    if(like_flag==0){
							
						btnlike.setBackgroundColor((Color.RED));
							
							like_flag=1;
						}else{
							btnlike.setBackgroundColor((Color.GRAY));
							like_flag=0;
						}
					}
			}
			);
			btncomment.setOnClickListener(
				new OnClickListener(){

					@Override
					public void onClick(View p1)
					{
						
					}
			}
			
			);
		}
		
	}
}
