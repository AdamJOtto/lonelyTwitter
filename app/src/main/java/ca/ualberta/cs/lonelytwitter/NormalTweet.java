package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by watts1 on 9/12/17.
 */

public class NormalTweet extends Tweet {

    /**
     * constructor of a normal tweet.
     * @param message the message of the tweet
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * constructor of a normal tweet.
     * @param message the message of the tweet
     * @param date the date the tweet was posted
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * constructor of a normal tweet.
     * @return a boolean false. this message is not important.
     */
    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }

}
