package marvel
import grails.converters.JSON
import org.apache.commons.codec.digest.DigestUtils
import org.grails.web.json.JSONObject
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder
import org.springframework.web.client.RestTemplate

class HeroController {



    def index() { }

    def search()
    {
        grails.converters.JSON.use('deep')
        String heroToSearch = params.heroName
        String url = QueryBuilderService.createUrl(heroToSearch)
        RestTemplate restTemplate = new RestTemplate();
        MarvelResponse response = restTemplate.getForObject(url, MarvelResponse.class);
        ResponseService.setResponse(response)

        [response:response]

    }

    def show(Long id){
        MarvelResponse response = ResponseService.getResponse()
        Data datafromResponse = response.getData()
        Results results = datafromResponse.getResultByID(id.toString())
        [results:results]
    }
}
