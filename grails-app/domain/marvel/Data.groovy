package marvel

class Data implements Serializable{


     String total;

     String limit;

     Results[] results;

     String count;

     String offset;



    Results getResultByID(String Id){
        Results responseResult = null
        results.each{ result ->
            if (result.id == Id) {
                responseResult = result
            }
        }
        return responseResult
    }















     String getTotal ()
    {
        return total;
    }

     void setTotal (String total)
    {
        this.total = total;
    }

     String getLimit ()
    {
        return limit;
    }

     void setLimit (String limit)
    {
        this.limit = limit;
    }

     Results[] getResults ()
    {
        return results;
    }

     void setResults (Results[] results)
    {
        this.results = results;
    }

     String getCount ()
    {
        return count;
    }

     void setCount (String count)
    {
        this.count = count;
    }

     String getOffset ()
    {
        return offset;
    }

     void setOffset (String offset)
    {
        this.offset = offset;
    }



}
