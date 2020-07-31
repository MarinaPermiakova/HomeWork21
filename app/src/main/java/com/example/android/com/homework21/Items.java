package com.example.android.com.homework21;

class Items{
    int mimageId;
    String string1;
    String string2;
    Boolean isChecked;

    public Items(int imageId, String string1, String string2, Boolean isChecked) {
        mimageId = imageId;
        this.string1 = string1;
        this.string2 = string2;
        this.isChecked = isChecked;
    }

    public int getImageId() {
        return mimageId;
    }

    public String getString1() {
        return string1;
    }

    public String getString2() {
        return string2;
    }

    public void setChecked(Boolean checked) {
        isChecked = checked;
    }

    public Boolean isChecked(){
        return isChecked;
    }
}
