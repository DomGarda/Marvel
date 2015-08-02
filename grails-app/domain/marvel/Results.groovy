
package marvel

class Results implements Serializable {

     String id;

     Series series;

     Stories stories;

     Thumbnail thumbnail;

     String resourceURI;

     Events events;

     Urls[] urls;

     String description;

     String name;

     Comics comics;

     String modified;

     String getId ()
    {
        return id;
    }

     void setId (String id)
    {
        this.id = id;
    }

     Series getSeries ()
    {
        return series;
    }

     void setSeries (Series series)
    {
        this.series = series;
    }

     Stories getStories ()
    {
        return stories;
    }

     void setStories (Stories stories)
    {
        this.stories = stories;
    }

     Thumbnail getThumbnail ()
    {
        return thumbnail;
    }

     void setThumbnail (Thumbnail thumbnail)
    {
        this.thumbnail = thumbnail;
    }

     String getResourceURI ()
    {
        return resourceURI;
    }

     void setResourceURI (String resourceURI)
    {
        this.resourceURI = resourceURI;
    }

     Events getEvents ()
    {
        return events;
    }

     void setEvents (Events events)
    {
        this.events = events;
    }

     Urls[] getUrls ()
    {
        return urls;
    }

     void setUrls (Urls[] urls)
    {
        this.urls = urls;
    }

     String getDescription()
    {
        return description;
    }

     void setDescription (String description)
    {
        this.description = description;
    }

     String getName()
    {
        return name;
    }

     void setName (String name)
    {
        this.name = name;
    }

     Comics getComics ()
    {
        return comics;
    }

     void setComics (Comics comics)
    {
        this.comics = comics;
    }

     String getModified ()
    {
        return modified;
    }

     void setModified (String modified)
    {
        this.modified = modified;
    }

}
