package com.example.openfashion;

public interface OnMainCallback {
    default void callback(String key, Object data){
    }
    void showFragment(String tag, Object data, boolean isBack);


}
