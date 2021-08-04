package quotes;

public class ApiQuote {
    private String quoteText;
    private String quoteAuthor;
    private String senderName;
    private String senderLink;
    private String quoteLink;

    public ApiQuote(String quoteText, String quoteAuthor, String senderName, String senderLink, String quoteLink) {
        this.quoteText = quoteText;
        this.quoteAuthor = quoteAuthor;
        this.senderName = senderName;
        this.senderLink = senderLink;
        this.quoteLink = quoteLink;
    }

    public void setQuoteText(String quoteText) {
        this.quoteText = quoteText;
    }

    public void setQuoteAuthor(String quoteAuthor) {
        this.quoteAuthor = quoteAuthor;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public void setSenderLink(String senderLink) {
        this.senderLink = senderLink;
    }

    public void setQuoteLink(String quoteLink) {
        this.quoteLink = quoteLink;
    }

    public String getQuoteText() {
        return quoteText;
    }

    public String getQuoteAuthor() {
        return quoteAuthor;
    }

    @Override
    public String toString() {
        return "ApiQuote{" +
                "quoteText='" + quoteText + '\'' +
                ", quoteAuthor='" + quoteAuthor + '\'' +
                ", senderName='" + senderName + '\'' +
                ", senderLink='" + senderLink + '\'' +
                ", quoteLink='" + quoteLink + '\'' +
                '}';
    }

    public String getSenderName() {
        return senderName;
    }

    public String getSenderLink() {
        return senderLink;
    }

    public String getQuoteLink() {
        return quoteLink;
    }

}
