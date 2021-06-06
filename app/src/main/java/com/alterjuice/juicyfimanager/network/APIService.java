package com.alterjuice.juicyfimanager.network;

import retrofit2.Call;

public interface APIService {
    String BASE_URL = "";

    Call<String> getTopContributors();
    Call<String> getCustomMarkers();
    Call<String> getMyMarkers();
    Call<String> getMarkerInfo();
    Call<String> addMarker();
    Call<String> userGetFullInfo();
    Call<String> userSignIn();
    Call<String> sendPassword();
    Call<String> userSighUp();

    Call<String> userChangeIsFavourite();
    Call<String> markerChangeDescription();
    Call<String> markerPostComment();
    Call<String> markerGetComments();

}
