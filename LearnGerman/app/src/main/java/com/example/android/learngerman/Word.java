package com.example.android.learngerman;

public class Word {
    /** Default translation for the word */
    private String mEnglishTranslation;

    /** German translation for the word */
    private String mGermanTranslation;

    /** Audio for the word */
    private int mAudioResourceId;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param englishTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param germanTranslation is the word in the German language
     */
    public Word(String englishTranslation, String germanTranslation) {
        mEnglishTranslation = englishTranslation;
        mGermanTranslation = germanTranslation;
    }

    /**
     * Create a new Word object.
     *
     * @param englishTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param germanTranslation is the word in the German language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     *
     */
    public Word(String englishTranslation, String germanTranslation, int imageResourceId) {
        mEnglishTranslation = englishTranslation;
        mGermanTranslation = germanTranslation;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getEnglishTranslation() {
        return mEnglishTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getGermanTranslation() {
        return mGermanTranslation;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

}

