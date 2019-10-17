package e.play.HttpdServer;

import android.util.Log;

import java.io.IOException;
import java.util.Map;

import fi.iki.elonen.NanoHTTPD;

public class Server extends NanoHTTPD {

    private static final String LOG_TAG = "e.foundation";


    public Server() throws IOException {
        super(8080);

        android.util.Log.d(LOG_TAG, "Nano Httpd!");
        start(NanoHTTPD.SOCKET_READ_TIMEOUT, false);


    }

    @Override
    public Response serve(IHTTPSession session) {
        android.util.Log.d(LOG_TAG, "In Serve method!");

        String msg = "<html><body><h1>Hello server</h1>\n";
        Map<String, String> parms = session.getParms();
        if (parms.get("username") == null) {
            msg += "<form action='?' method='get'>\n  <p>Your name: <input type='text' name='username'></p>\n" + "</form>\n";
        } else {
            msg += "<p>Hello, " + parms.get("username") + "!</p>";
        }
        return newFixedLengthResponse(msg + "</body></html>\n");
    }
}
