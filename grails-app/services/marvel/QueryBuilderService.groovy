package marvel

import grails.transaction.Transactional
import org.apache.commons.codec.digest.DigestUtils

@Transactional
class QueryBuilderService {


    final static String publicKey = "2d0d4d06307e3fd024bcb84dd9e49134"
    final static String privateKey = "6fcc1fd442981651876c43078633e70a8ddc04ef"
    final static String marvelUrl = "http://gateway.marvel.com:80/v1/public/"

    static String createUrl(String name) {
        String timeStamp = System.currentTimeMillis()
        String stringToHash = timeStamp + privateKey + publicKey
        String hashKey = DigestUtils.md5Hex(stringToHash)
        return marvelUrl + "characters?nameStartsWith=" + name + "&ts=" + timeStamp + "&apikey=" + publicKey + "&hash=" + hashKey

    }
}

