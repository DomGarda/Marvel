package marvel

class MarvelResponse implements Serializable {

     String attributionText;

     String etag;

     String status;

     Data data;

     String copyright;

     String code;

     String attributionHTML;

    String getHeroID()
    {
        return data.results
    }

     String getAttributionText ()
    {
        return attributionText;
    }

     void setAttributionText (String attributionText)
    {
        this.attributionText = attributionText;
    }

     String getEtag ()
    {
        return etag;
    }

     void setEtag (String etag)
    {
        this.etag = etag;
    }

     String getStatus ()
    {
        return status;
    }

     void setStatus (String status)
    {
        this.status = status;
    }

     Data getData ()
    {
        return data;
    }

     void setData (Data data)
    {
        this.data = data;
    }

     String getCopyright ()
    {
        return copyright;
    }

     void setCopyright (String copyright)
    {
        this.copyright = copyright;
    }

     String getCode ()
    {
        return code;
    }

     void setCode (String code)
    {
        this.code = code;
    }

     String getAttributionHTML ()
    {
        return attributionHTML;
    }

     void setAttributionHTML (String attributionHTML)
    {
        this.attributionHTML = attributionHTML;
    }



    static constraints = {
    }
}