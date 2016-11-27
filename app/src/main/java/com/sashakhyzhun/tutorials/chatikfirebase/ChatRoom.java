package com.sashakhyzhun.tutorials.chatikfirebase;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ChatRoom extends Activity {

    private Button buttonSend;
    private EditText etMessage;
    private TextView tvMessages;
    private String userName, roomName, tempKey;
    private DatabaseReference root;

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_chat_room);

        buttonSend = (Button) findViewById(R.id.buttonSend);
        etMessage = (EditText) findViewById(R.id.etMessage);
        tvMessages = (TextView) findViewById(R.id.textViewMessage);

        userName = getIntent().getStringExtra("user_name");
        roomName = getIntent().getStringExtra("room_name");

        setTitle("Room: " + roomName);

        root = FirebaseDatabase.getInstance().getReference().child(roomName);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Map<String, Object> map = new HashMap<>();
                tempKey = root.push().getKey();
                root.updateChildren(map);

                DatabaseReference messageRoot = root.child(tempKey);
                Map<String, Object> map2 = new HashMap<>();
                map2.put("name", userName);
                map2.put("msg", etMessage.getText().toString());

                messageRoot.updateChildren(map2);

            }
        });

        root.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                appendChildConversation(dataSnapshot);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                appendChildConversation(dataSnapshot);
            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }

    private String chatUserName, chatMessage;

    private void appendChildConversation(DataSnapshot dataSnapshot) {
        Iterator i = dataSnapshot.getChildren().iterator();

        while (i.hasNext()) {

            chatMessage  = (String) ((DataSnapshot)i.next()).getValue();
            chatUserName = (String) ((DataSnapshot)i.next()).getValue();

            tvMessages.append(chatUserName + ": " + chatMessage + " \n");
        }

    }


}
