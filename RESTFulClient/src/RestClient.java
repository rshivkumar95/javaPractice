

	
	import com.sun.jersey.api.client.Client;
	import com.sun.jersey.api.client.ClientResponse;
	import com.sun.jersey.api.client.WebResource;
	 
	public class RestClient {
	    
	    public static void main(String[] Java4s) {
	        
	        try {
	            Client client = Client.create();    
	            WebResource resource = client.resource("http://localhost:8084/RESTDemo1/rest/profile?year=2017&start=1&size=3");    
	            ClientResponse response = resource.accept("application/json").get(ClientResponse.class);
	            
	            if(response.getStatus() == 200){
	                
	                String output = response.getEntity(String.class);
	                System.out.println(output);    
	                
	            }else System.out.println("Somthing went wrong..!");        
	    
	          } catch (Exception e) {    
	                  e.printStackTrace();    
	          }
	    
	        }   
	}


