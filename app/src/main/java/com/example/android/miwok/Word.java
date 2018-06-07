package com.example.android.miwok;

import android.media.MediaPlayer;

public class Word {
    //Miwok translation of the word
    private String miwokWord;
    //English translation of the word
    private String englishWord;
    //Image recource ID for the word
    private int imageResourceID = NO_IMAGE_AVAIBLE;

    public static final int NO_IMAGE_AVAIBLE = -1;
    //Audio recourse ID for the word
    private int audioRecourseID;

    /**
     * Create a new Word object
     *
     * @param englishWord     is the word in English which the user is already familiar with
     * @param miwokWord       is the word translated to Miwok language
     * @param audioRecourseID is Miwok pronunciation of the word
     */

    public Word(String englishWord, String miwokWord, int audioRecourseID) {
        this.miwokWord = miwokWord;
        this.englishWord = englishWord;
        this.audioRecourseID = audioRecourseID;
    }

    /**
     * Create a new Word object
     *
     * @param englishWord   is the word in English which the user is already familiar with
     * @param miwokWord     is the word translated to Miwok language
     * @param imageResource is an ID of image in res/drawable file associated with the word
     */

    public Word(String englishWord, String miwokWord, int imageResource, int audioRecourseID) {
        this.miwokWord = miwokWord;
        this.englishWord = englishWord;
        this.imageResourceID = imageResource;
        this.audioRecourseID = audioRecourseID;
    }

    /**
     * @return Miwok translation of the word
     */

    public String getMiwokWord() {
        return miwokWord;
    }

    /**
     * @return English translation of the word
     */

    public String getEnglishWord() {
        return englishWord;
    }

    /**
     * @return image resource ID
     */

    public int getImageResourceID() {
        return imageResourceID;
    }

    /**
     * @return weather the word is associated with an image
     */
    public boolean hasImage() {
        return imageResourceID != NO_IMAGE_AVAIBLE;
    }

    /**
     * @return audio resource ID
     */

    public int getAudioRecourseID() {
        return audioRecourseID;
    }

    @Override
    public String toString() {
        return "Word{" +
                "miwokWord='" + miwokWord + '\'' +
                ", englishWord='" + englishWord + '\'' +
                '}';
    }
}
