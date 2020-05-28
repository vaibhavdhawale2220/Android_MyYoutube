package com.example.myyoutube;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Marshmellow extends YouTubeBaseActivity {

    private static final String TAG = "MainActivity";

    YouTubePlayerView mYouTubePlayerView;
    Button btnPlay;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtubeplayer);
        Log.d(TAG, "onCreate: Starting.");

        btnPlay = findViewById(R.id.btnPlay);
        mYouTubePlayerView = findViewById(R.id.youtubePlay);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG, "Onclick: Done Initialization.");

                youTubePlayer.loadPlaylist("PLcYK4PlHbZQvaeTEq00C59B-650S705k0");


            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG, "Onclick: Failed To Initialize.");


            }
        };
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Onclick: Initialization Youtube Player.");
                mYouTubePlayerView.initialize(YoutubeConfigApi.getApiKey(), mOnInitializedListener);

            }
        });

    }
}
