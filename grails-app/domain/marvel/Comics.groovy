package marvel

class Comics implements Serializable {

     Items[] items;

     String collectionURI;

     String available;

     String returned;

     Items[] getItems ()
    {
        return items;
    }

     void setItems (Items[] items)
    {
        this.items = items;
    }

     String getCollectionURI ()
    {
        return collectionURI;
    }

     void setCollectionURI (String collectionURI)
    {
        this.collectionURI = collectionURI;
    }

     String getAvailable ()
    {
        return available;
    }

     void setAvailable (String available)
    {
        this.available = available;
    }

     String getReturned ()
    {
        return returned;
    }

     void setReturned (String returned)
    {
        this.returned = returned;
    }
}
