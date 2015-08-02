package marvel

import grails.transaction.Transactional

class ResponseService {

    static MarvelResponse response;

    public ResponseService(){

    }

    public static setResponse(MarvelResponse response){
        this.response = response
    }

    public static getResponse(){
        return response
    }



}
