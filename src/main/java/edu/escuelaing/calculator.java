package edu.escuelaing;

import static spark.Spark.*;
import org.json.JSONObject;
import spark.Request;


public class calculator {

    public static void main( String[] args ) {
        port(getPort());
        get("/tan", "application/json", (req, res) -> {
            res.type("application/json");
            return jsonUpdate("Tangente", tan(req.queryParams("value")), req);
        });

        get("/acos", "application/json", (req, res) -> {
            res.type("application/json");
            return jsonUpdate("acos", acos(req.queryParams("value")), req);
        });

    }

    public static Double tan(String value){
        Double ans1 = 0.0;
        ans1 = Math.tan(Double.parseDouble(value));
        return ans1;
    }

    public static Double acos(String value){
        Double ans2 = 0.0;
        ans2 = Math.acos(Double.parseDouble(value));
        return ans2;
    }

    public static JSONObject jsonUpdate(String operation, Double value, Request req) {
        JSONObject json = new JSONObject();
        json.put("output", value);
        json.put("input", req.queryParams("value"));
        json.put("operation", operation);
        
        return json;
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
