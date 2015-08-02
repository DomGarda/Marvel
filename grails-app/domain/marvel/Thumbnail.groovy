
package marvel

class Thumbnail implements Serializable {

     String extension;

     String path;

     String getExtension ()
    {
        return extension;
    }

     void setExtension (String extension)
    {
        this.extension = extension;
    }

     String getPath ()
    {
        return path;
    }

     void setPath (String path)
    {
        this.path = path;
    }
}
