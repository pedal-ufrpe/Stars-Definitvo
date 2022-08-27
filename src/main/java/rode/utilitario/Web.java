/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rode.utilitario;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONObject;
import rode.Main;

/**
 *
 * @author rodemarck
 */
public class Web {
    public static HashMap<String,List<String>> empurra(Dados dados) throws UnsupportedEncodingException, IOException{
        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost postMethod = new HttpPost("http://localhost:8080/ponto");
        var json = new JSONObject(dados).toString();
        System.out.println("crua : " + json);
        StringEntity entity = new StringEntity(json);
        System.out.println("encodada : " + entity);
        postMethod.setEntity(entity);
        postMethod.setHeader("Accept", "application/json");
        postMethod.setHeader("Content-type", "application/json");
        
        CloseableHttpResponse rawResponse = client.execute(postMethod);
        var line = rawResponse.getStatusLine();
        System.out.println(line.getStatusCode() + " - " + line.getReasonPhrase());
        
        String s = new String(rawResponse.getEntity().getContent().readAllBytes());
        client.close();
        var obj = new JSONObject(s);
        var map = new HashMap<String,List<String>>();
        Iterator<String> keys = obj.keys();
        while(keys.hasNext()){
            var key = keys.next();
            var lista = new LinkedList<String>();
            obj.getJSONArray(key).forEach(item -> lista.addLast(item.toString()));
            map.put(key, lista);
        }
        return map;
    }
}
