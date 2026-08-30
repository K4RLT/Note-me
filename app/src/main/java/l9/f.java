package l9;

import android.util.JsonWriter;
import c4.s;
import c7.x;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import nd.o;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f20043c = false;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f20044d = false;

    /* renamed from: a, reason: collision with root package name */
    public final List f20045a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f20042b = new Object();
    public static final HashSet e = new HashSet(Arrays.asList(new String[0]));

    public f() {
        List asList;
        if (!c()) {
            asList = new ArrayList();
        } else {
            asList = Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
        }
        this.f20045a = asList;
    }

    public static boolean c() {
        boolean z3;
        synchronized (f20042b) {
            try {
                z3 = false;
                if (f20043c && f20044d) {
                    z3 = true;
                }
            } finally {
            }
        }
        return z3;
    }

    public static void d(JsonWriter jsonWriter, Map map) {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!e.contains(str)) {
                if (entry.getValue() instanceof List) {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                } else if (entry.getValue() instanceof String) {
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    i.c("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                    break;
                }
            }
        }
        jsonWriter.endArray();
    }

    public final void a(HttpURLConnection httpURLConnection, byte[] bArr) {
        HashMap hashMap;
        if (!c()) {
            return;
        }
        if (httpURLConnection.getRequestProperties() == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap(httpURLConnection.getRequestProperties());
        }
        e("onNetworkRequest", new o(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), hashMap, bArr));
    }

    public final void b(HttpURLConnection httpURLConnection, int i) {
        HashMap hashMap;
        if (c()) {
            String str = null;
            if (httpURLConnection.getHeaderFields() == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(httpURLConnection.getHeaderFields());
            }
            e("onNetworkResponse", new x(i, hashMap));
            if (i >= 200 && i < 300) {
                return;
            }
            try {
                str = httpURLConnection.getResponseMessage();
            } catch (IOException e8) {
                i.f("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e8.getMessage())));
            }
            e("onNetworkRequestError", new s(str, 5));
        }
    }

    public final void e(String str, e eVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(System.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.f20045a.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            eVar.c(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e8) {
            i.d("unable to log", e8);
        }
        String stringWriter2 = stringWriter.toString();
        synchronized (f.class) {
            try {
                i.e("GMA Debug BEGIN");
                int i = 0;
                while (i < stringWriter2.length()) {
                    int i10 = i + 4000;
                    i.e("GMA Debug CONTENT ".concat(stringWriter2.substring(i, Math.min(i10, stringWriter2.length()))));
                    i = i10;
                }
                i.e("GMA Debug FINISH");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
