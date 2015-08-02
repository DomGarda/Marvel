
package marvel

class Items implements Serializable {

    String resourceURI

    String name

    String type


    String getType() {
        return type
    }

    void setType(String type) {
        this.type = type
    }


    String getResourceURI() {
        return resourceURI
    }

    void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }


}
