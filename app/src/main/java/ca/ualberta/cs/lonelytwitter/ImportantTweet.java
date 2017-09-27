package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class ImportantTweet extends Tweet implements Tweetable {

    public ImportantTweet(String message){
        super(message);
    }

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Verifies that this is an important tweet.
     * @return  a boolean true.
     */
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
