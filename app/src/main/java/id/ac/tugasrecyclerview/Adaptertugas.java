package id.ac.tugasrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adaptertugas extends RecyclerView.Adapter<Adaptertugas.ViewHolderTugas> {

    String data1[],data2[];
    int images[];
    Context context;

    public Adaptertugas(Context ct,String s1[],String s2[],int img[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;
    }

    @NonNull
    @Override
    public ViewHolderTugas onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.trv_row, parent, false);
        return new ViewHolderTugas(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderTugas holder, int position) {
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.myImage.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class ViewHolderTugas extends RecyclerView.ViewHolder{

        TextView myText1, myText2;
        ImageView myImage;

        public ViewHolderTugas(@NonNull View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.myText1);
            myText2 = itemView.findViewById(R.id.myText2);
            myImage = itemView.findViewById(R.id.MyImageView);
        }
    }
}
