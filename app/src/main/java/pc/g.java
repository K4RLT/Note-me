package pc;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f22658b = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final tc.c f22659a;

    public g(tc.c cVar) {
        this.f22659a = cVar;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }

    public static ArrayList b(String str) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                z5.h hVar = m.f22675a;
                JSONObject jSONObject = new JSONObject(string);
                String string2 = jSONObject.getString("rolloutId");
                String string3 = jSONObject.getString("parameterKey");
                String string4 = jSONObject.getString("parameterValue");
                String string5 = jSONObject.getString("variantId");
                long j10 = jSONObject.getLong("templateVersion");
                if (string4.length() > 256) {
                    string4 = string4.substring(0, 256);
                }
                arrayList.add(new b(string2, string3, string4, string5, j10));
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e);
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(m.f22675a.g(list.get(i))));
            } catch (JSONException e) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [long] */
    public final Map c(String str, boolean z3) {
        File d2;
        FileInputStream fileInputStream;
        Exception e;
        tc.c cVar = this.f22659a;
        if (z3) {
            d2 = cVar.d(str, "internal-keys");
        } else {
            d2 = cVar.d(str, "keys");
        }
        if (d2.exists()) {
            Object length = d2.length();
            if (length != 0) {
                Closeable closeable = null;
                try {
                    try {
                        fileInputStream = new FileInputStream(d2);
                        try {
                            HashMap a10 = a(oc.g.j(fileInputStream));
                            oc.g.c(fileInputStream, "Failed to close user metadata file.");
                            return a10;
                        } catch (Exception e8) {
                            e = e8;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            f(d2);
                            oc.g.c(fileInputStream, "Failed to close user metadata file.");
                            return Collections.EMPTY_MAP;
                        }
                    } catch (Throwable th) {
                        th = th;
                        closeable = length;
                        oc.g.c(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                } catch (Exception e10) {
                    fileInputStream = null;
                    e = e10;
                } catch (Throwable th2) {
                    th = th2;
                    oc.g.c(closeable, "Failed to close user metadata file.");
                    throw th;
                }
            }
        }
        f(d2);
        return Collections.EMPTY_MAP;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    public final String d(String str) {
        FileInputStream fileInputStream;
        String str2;
        File d2 = this.f22659a.d(str, "user-data");
        Closeable closeable = null;
        if (d2.exists()) {
            Object r32 = (d2.length() > 0L ? 1 : (d2.length() == 0L ? 0 : -1));
            try {
                if (r32 != 0) {
                    try {
                        fileInputStream = new FileInputStream(d2);
                        try {
                            JSONObject jSONObject = new JSONObject(oc.g.j(fileInputStream));
                            if (!jSONObject.isNull("userId")) {
                                str2 = jSONObject.optString("userId", null);
                            } else {
                                str2 = null;
                            }
                            String str3 = "Loaded userId " + str2 + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str3, null);
                            }
                            oc.g.c(fileInputStream, "Failed to close user metadata file.");
                            return str2;
                        } catch (Exception e) {
                            e = e;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            f(d2);
                            oc.g.c(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e8) {
                        e = e8;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        oc.g.c(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = r32;
            }
        }
        String k3 = g3.a.k("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", k3, null);
        }
        f(d2);
        return null;
    }

    public final void g(String str, Map map, boolean z3) {
        File d2;
        String jSONObject;
        BufferedWriter bufferedWriter;
        tc.c cVar = this.f22659a;
        if (z3) {
            d2 = cVar.d(str, "internal-keys");
        } else {
            d2 = cVar.d(str, "keys");
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                jSONObject = new JSONObject(map).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(d2), f22658b));
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(jSONObject);
            bufferedWriter.flush();
            oc.g.c(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e8) {
            e = e8;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
            f(d2);
            oc.g.c(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            oc.g.c(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    public final void h(String str, List list) {
        String e;
        BufferedWriter bufferedWriter;
        File d2 = this.f22659a.d(str, "rollouts-state");
        if (list.isEmpty()) {
            f(d2);
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                e = e(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(d2), f22658b));
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(e);
            bufferedWriter.flush();
            oc.g.c(bufferedWriter, "Failed to close rollouts state file.");
        } catch (Exception e10) {
            e = e10;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
            f(d2);
            oc.g.c(bufferedWriter2, "Failed to close rollouts state file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            oc.g.c(bufferedWriter2, "Failed to close rollouts state file.");
            throw th;
        }
    }

    public final void i(String str, String str2) {
        String obj;
        BufferedWriter bufferedWriter;
        File d2 = this.f22659a.d(str, "user-data");
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("userId", str2);
                obj = jSONObject.toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(d2), f22658b));
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(obj);
            bufferedWriter.flush();
            oc.g.c(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e8) {
            e = e8;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
            oc.g.c(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            oc.g.c(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }
}