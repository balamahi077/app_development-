package com.example.api2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {



    List<Post> postList;
    Context context;


    public PostAdapter(Context context, List<Post> posts){
        this.context = context;
        postList = posts;
    }
    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item , parent , false);

        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {

        Post post = postList.get(position);
        holder.id.setText("Id : " + post.getId());
        holder.userId.setText("userId : " + post.getUserId());
        holder.title.setText("Title : " + post.getTitle());
        holder.body.setText("Body : " + post.getBody());

    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder{

        TextView title , id, userId , body;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);

            userId = itemView.findViewById(R.id.textView);
            id = itemView.findViewById(R.id.textView2);
            title = itemView.findViewById(R.id.textView3);
            body = itemView.findViewById(R.id.textView4);
        }
    }
}
