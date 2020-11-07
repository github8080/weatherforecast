package com.example.shoppingmall;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Message implements Parcelable {
    private  String username;
    private  String sex;
    private  int age;

    @NonNull
    @Override
    public String toString() {
        return "Message[username="+username+"sex="+sex+"age="+age+"]";
    }

    public Message(String username, String sex, int age){
        this.username = username;
        this.sex = sex;
        this.age = age;
    }

    public Message(Parcel in){
        username = in.readString();
        sex = in.readString();
        age = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(username);
        dest.writeString(sex);
        dest.writeInt(age);
    }

    public static Parcelable.Creator<Message> CREATOR = new Parcelable.Creator<Message>(){
        @Override
        public Message createFromParcel(Parcel source) {
            return new Message(source);
        }

        @Override
        public Message[] newArray(int size) {
            return new Message[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

}
