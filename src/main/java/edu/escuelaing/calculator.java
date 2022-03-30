package edu.escuelaing;

import static spark.Spark.*;
import org.json.JSONObject;
import spark.Request;


public class calculator
{
    public static void main( String[] args )
    {

    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
