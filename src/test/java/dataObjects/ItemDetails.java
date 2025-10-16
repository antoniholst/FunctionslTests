package dataObjects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"credential","password","dontRememberMe"})
public class ItemDetails {
    private String credential;
    private String password;

    public ItemDetails(String credential, String password) {
        this.credential = credential;
        this.password = password;
    }

    @JsonProperty("credential")
    public String getCredential(){
        return credential;
    }

    @JsonProperty("password")
    public String getPassword(){
        return password;
    }

    @JsonProperty("dontRememberMe")
    public String getDontRememberMe(){
        return "false";
    }
}
