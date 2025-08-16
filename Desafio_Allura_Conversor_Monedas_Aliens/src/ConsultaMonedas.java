import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMonedas {
    public Monedas buscarMoneda(String MonedaBase, String MonedaTarget) {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/0e235aa1f0a2be5f506bd1f4/pair/"+MonedaBase+"/"+MonedaTarget);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        }
        catch (Exception e) {
            throw new RuntimeException("Moneda no encontrada");
        }}}