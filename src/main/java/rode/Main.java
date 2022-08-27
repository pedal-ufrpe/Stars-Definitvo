package rode;

import com.aparapi.device.Device;
import java.io.IOException;
import rode.rbd.geradorScript.GeradorScript;
import rode.rbd.modelo.RBD;
import rode.rbd.modelo.composicao.JustRBD;
import rode.rbd.modelo.composicao.ParaleloRBD;
import rode.rbd.modelo.composicao.SerieRBD;
import rode.spn.LugarSPN;
import rode.spn.SPN;
import rode.spn.Transicao;
import rode.spn.TransicaoExponencial;
import rode.spn.trem.Estacao;
import rode.spn.trem.SistemaFerroviario;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONObject;

public class Main {
    @Data
    @AllArgsConstructor
    public static class Ponto{
        public int x;
        public int y;
        
        public JSONObject toJson(){
            JSONObject obj = new JSONObject();
            obj.put("x",this.x);
            obj.put("y",this.y);
            return obj;
        }
        public static Ponto fromJson(JSONObject json){
            return new Ponto(json.getInt("x"),json.getInt("y"));
        }

        public String toString() {
            return "Ponto{" + "x=" + x + ", y=" + y + '}';
        }
        
        
    }
    public static void main(String[] args) throws InterruptedException, IOException {
        /*CloseableHttpClient client = HttpClients.createDefault();
        HttpPost postMethod = new HttpPost("http://localhost:8080/ponto");
        var json = new Ponto(2,2).toJson().toString();
        System.out.println("crua : " + json);
        StringEntity entity = new StringEntity(json);
        System.out.println("encodada : " + entity);
        postMethod.setEntity(entity);
        postMethod.setHeader("Accept", "application/json");
        postMethod.setHeader("Content-type", "application/json");
        
        CloseableHttpResponse rawResponse = client.execute(postMethod);
        var line = rawResponse.getStatusLine();
        System.out.println(line.getStatusCode() + " - " + new String(rawResponse.getEntity().getContent().readAllBytes()));
        client.close();
        /*var device = Device.firstGPU();
        System.out.println(device);
        Locale.setDefault(Locale.US);
        var txt = IntStream.range(0,10)
                .mapToObj(i -> "P"+i)
                .map("(E{#%1$s})"::formatted)
                .collect(Collectors.joining("+"));
        System.out.println(txt);*/
    }

    
}
