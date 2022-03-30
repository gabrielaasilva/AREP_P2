package edu.escuelaing;

import static spark.Spark.*;
import org.json.JSONObject;
import spark.Request;


public class calculator {

    public static void main( String[] args )
    {

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

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
