import java.util.Date;

public class Paperbook extends Book{

    private String series;
    private String month;

    public Paperbook(int p, Date r, String t, String i, String series, String month)
    {
        super(p, r, t, i);
        this.series = series;
        this.month = month;
    }
        //Get
        public String getSeries()
        {
            return series;
        }

        public String getMonth()
        {
            return month;
        }

        //Set
        public void setSeries(String series)
        {
            this.series = series;
        }

        public void setMonth(String month)
        {
            this.month = month;
        }

}
