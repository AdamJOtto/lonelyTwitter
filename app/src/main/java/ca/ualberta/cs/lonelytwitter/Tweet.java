package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Tweet {

    private String message;
    private Date date;

    /**
     * Constructor for tweet
     * @param message the message of the tweet
     */

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Constructor for tweet
     * @param message the message of the tweet
     * @param date the date the message was posted.
     */

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public abstract Boolean isImportant();




    /**
     * sets the message of the tweet
     * @param message the message of the tweet
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    /**
     * returns the message of the tweet
     * @return  message the message of the tweet
     */
    public String getMessage(){
        return this.message;
    }

    /**
     * returns the date of the tweet
     * @return  date the date of the tweet
     */
    public Date getDate() {
        return date;
    }

    /**
     * sets the date of the tweet
     * @param  date the date of the tweet
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * returns the date and message of the tweet in a string
     * @return  a modified date and string of the tweet.
     */
    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
