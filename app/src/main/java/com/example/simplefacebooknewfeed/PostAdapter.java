package com.example.simplefacebooknewfeed;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import java.util.List;

class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {

    private List<Post> posts;

    PostAdapter(List<Post> posts) {
        this.posts = posts;
    }

    @NonNull
    @Override
    public PostAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Log.d("ViewType", "Type is " + i);
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.post_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostAdapter.ViewHolder viewHolder, int i) {
        viewHolder.getUsername().setText(posts.get(i).getUsername());
        viewHolder.getText().setText(posts.get(i).getText());
        Picasso.get()
                .load(posts.get(i).getPhoto())
                .into(viewHolder.getPhoto());

    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView username = itemView.findViewById(R.id.username);
        private TextView text = itemView.findViewById(R.id.text);
        private ImageView photo = itemView.findViewById(R.id.photo);

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public TextView getText() {
            return text;
        }

        public ImageView getPhoto() {
            return photo;
        }


        public TextView getUsername() {
            return username;
        }

    }
}
