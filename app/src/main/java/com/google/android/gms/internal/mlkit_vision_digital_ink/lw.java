package com.google.android.gms.internal.mlkit_vision_digital_ink;
import b0.e1;
import ic.c;
import j6.i;
import k6.i;
import lb.a1;
import lb.d1;
import lb.g0;
import lb.i1;
import lb.k1;
import lb.l0;
import lb.p1;
import lb.t0;
import lb.u0;
import mb.e;
import mb.f;
import n8.m;
import q.x;
import q0.d;
import u.c;
import vc.a;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.an0;
import com.google.android.gms.internal.ads.ay0;
import com.google.android.gms.internal.ads.bg0;
import com.google.android.gms.internal.ads.bl0;
import com.google.android.gms.internal.ads.bq0;
import com.google.android.gms.internal.ads.cv1;
import com.google.android.gms.internal.ads.dv1;
import com.google.android.gms.internal.ads.ev1;
import com.google.android.gms.internal.ads.gn0;
import com.google.android.gms.internal.ads.gv1;
import com.google.android.gms.internal.ads.l50;
import com.google.android.gms.internal.ads.mw1;
import com.google.android.gms.internal.ads.qm0;
import com.google.android.gms.internal.ads.qu0;
import com.google.android.gms.internal.ads.rs1;
import com.google.android.gms.internal.ads.to0;
import com.google.android.gms.internal.ads.tv1;
import com.google.android.gms.internal.ads.vl0;
import com.google.android.gms.internal.ads.vu1;
import com.google.android.gms.internal.ads.wm0;
import com.google.android.gms.internal.ads.wu1;
import com.google.android.gms.internal.ads.x90;
import com.google.android.gms.internal.ads.xu1;
import com.google.android.gms.internal.ads.xy;
import com.google.android.gms.internal.ads.y51;
import com.google.android.gms.internal.ads.ys1;
import com.google.android.gms.internal.ads.zu1;
import com.google.android.gms.internal.ads.zv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class lw implements f {
    public Object A;
    public Object B;
    public Object C;

    /* renamed from: u, reason: collision with root package name */
    public Object f14643u;

    /* renamed from: v, reason: collision with root package name */
    public Object f14644v;

    /* renamed from: w, reason: collision with root package name */
    public Object f14645w;

    /* renamed from: x, reason: collision with root package name */
    public Object f14646x;

    /* renamed from: y, reason: collision with root package name */
    public Object f14647y;

    /* renamed from: z, reason: collision with root package name */
    public Object f14648z;

    public lw(ys1 ys1Var, rs1 rs1Var, com.google.android.gms.internal.ads.s6 s6Var, int i, int i10, int i11, int i12) {
        this.f14643u = ys1Var;
        this.f14645w = rs1Var;
        this.f14646x = new com.google.android.gms.internal.ads.qg();
        this.f14647y = s6Var.x(ys1Var.M, new bg0(1, this));
        this.f14648z = new qm0(this, i);
        this.A = new wm0(this, i10);
        this.B = new an0(this, i11);
        this.C = new gn0(this, i12);
        vl0 vl0Var = new vl0(this);
        this.f14644v = vl0Var;
        ys1Var.H.a(vl0Var);
    }

    public static void d(String str, JSONObject jSONObject) {
        String str2 = str + jSONObject.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str2, null);
        }
    }

    public a a(int i) {
        a aVar = null;
        try {
            if (!d.a(2, i)) {
                JSONObject l10 = ((c) this.f14647y).l();
                if (l10 != null) {
                    a f10 = ((t.a) this.f14645w).f(l10);
                    d("Loaded cached settings: ", l10);
                    ((m) this.f14646x).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!d.a(3, i) && f10.f27535c < currentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                            return null;
                        }
                    } else {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return f10;
                        } catch (Exception e) {
                            e = e;
                            aVar = f10;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return aVar;
                        }
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e8) {
            e = e8;
        }
    }

    @Override // f
    public Object b() {
        Object b10 = ((e) this.f14643u).b();
        return new l0((t0) b10, new e(new i(9, (c) this.f14644v)), (g0) ((e) this.f14645w).b(), (p1) ((e) this.f14646x).b(), (a1) ((e) this.f14647y).b(), (d1) ((e) this.f14648z).b(), (i1) ((e) this.A).b(), (k1) ((e) this.B).b(), (u0) ((e) this.C).b());
    }

    public a c() {
        return (a) ((AtomicReference) this.B).get();
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.android.gms.internal.ads.f6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [com.google.android.gms.internal.ads.f6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.google.android.gms.internal.ads.f6, java.lang.Object] */
    public ev1 e(cv1 cv1Var) {
        zu1 zu1Var;
        int i;
        boolean booleanValue;
        boolean z3;
        int i10;
        boolean isOffloadedPlaybackSupported;
        int playbackOffloadSupport;
        boolean z9;
        int directPlaybackSupport;
        boolean z10;
        i(cv1Var);
        x90 x90Var = (x90) this.C;
        mw1 mw1Var = cv1Var.f5183a;
        l50 l50Var = cv1Var.f5184b;
        x90Var.getClass();
        mw1Var.getClass();
        String str = mw1Var.f8459o;
        l50Var.getClass();
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 2;
        if (i11 >= 29 && (i = mw1Var.J) != -1) {
            Context context = (Context) x90Var.f12502v;
            Boolean bool = (Boolean) x90Var.f12503w;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                if (context != null) {
                    String parameters = xy.p(context).getParameters("offloadVariableRateSupported");
                    if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    x90Var.f12503w = Boolean.valueOf(z3);
                } else {
                    x90Var.f12503w = Boolean.FALSE;
                }
                booleanValue = ((Boolean) x90Var.f12503w).booleanValue();
            }
            str.getClass();
            int g8 = com.google.android.gms.internal.ads.ha.g(str, mw1Var.f8455k);
            if (g8 != 0) {
                switch (g8) {
                    case 2:
                    case 3:
                        i10 = 3;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        i10 = 21;
                        break;
                    case 7:
                    case 8:
                        i10 = 23;
                        break;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        i10 = 28;
                        break;
                    case 13:
                    case 19:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    default:
                        i10 = Integer.MAX_VALUE;
                        break;
                    case 14:
                        i10 = 25;
                        break;
                    case 20:
                        i10 = 30;
                        break;
                    case com.google.android.gms.internal.ads.gl.zzm /* 21 */:
                    case 22:
                        i10 = 31;
                        break;
                    case 30:
                    case 31:
                        i10 = 34;
                        break;
                }
                if (i11 >= i10) {
                    int i13 = mw1Var.I;
                    if (i13 == -1) {
                        i13 = bq0.e(mw1Var.H);
                    }
                    if (i13 != 0) {
                        try {
                            AudioFormat build = new AudioFormat.Builder().setSampleRate(i).setChannelMask(i13).setEncoding(g8).build();
                            if (i11 >= 33) {
                                directPlaybackSupport = AudioManager.getDirectPlaybackSupport(build, l50Var.a());
                                if ((directPlaybackSupport & 1) == 0) {
                                    zu1Var = zu1.f13272d;
                                } else {
                                    if ((directPlaybackSupport & 3) == 3) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    Object obj = new Object();
                                    obj.f5940a = true;
                                    obj.f5941b = z10;
                                    obj.f5942c = booleanValue;
                                    zu1Var = obj.a();
                                }
                            } else if (i11 >= 31) {
                                playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(build, l50Var.a());
                                if (playbackOffloadSupport == 0) {
                                    zu1Var = zu1.f13272d;
                                } else {
                                    Object obj2 = new Object();
                                    if (i11 > 32 && playbackOffloadSupport == 2) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    obj2.f5940a = true;
                                    obj2.f5941b = z9;
                                    obj2.f5942c = booleanValue;
                                    zu1Var = obj2.a();
                                }
                            } else {
                                isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(build, l50Var.a());
                                if (!isOffloadedPlaybackSupported) {
                                    zu1Var = zu1.f13272d;
                                } else {
                                    Object obj3 = new Object();
                                    obj3.f5940a = true;
                                    obj3.f5942c = booleanValue;
                                    zu1Var = obj3.a();
                                }
                            }
                        } catch (IllegalArgumentException unused) {
                            zu1Var = zu1.f13272d;
                        }
                    } else {
                        zu1Var = zu1.f13272d;
                    }
                }
            }
            zu1Var = zu1.f13272d;
        } else {
            zu1Var = zu1.f13272d;
        }
        dv1 dv1Var = new dv1();
        if (!Objects.equals(str, "audio/raw") ? ((vu1) this.f14647y).b(mw1Var, l50Var) == null : mw1Var.K != 2) {
            i12 = 0;
        }
        dv1Var.f5540d = i12;
        dv1Var.f5537a = zu1Var.f13273a;
        dv1Var.f5538b = zu1Var.f13274b;
        dv1Var.f5539c = zu1Var.f13275c;
        return dv1Var.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, com.google.android.gms.internal.ads.y2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.ads.gv1 f(com.google.android.gms.internal.ads.cv1 r22) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.lw.f(com.google.android.gms.internal.ads.cv1):com.google.android.gms.internal.ads.gv1");
    }

    public zv1 g(com.google.android.gms.internal.consent_sdk.c cVar) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent((Application) this.f14643u));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str = (String) cVar.f13371v;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    e1 e1Var = (e1) cVar.f13372w;
                    if (e1Var != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i = e1Var.f1179b;
                        if (i != 1) {
                            jsonWriter.name("os_type");
                            int i10 = i - 1;
                            if (i10 != 0) {
                                if (i10 == 1) {
                                    jsonWriter.value("ANDROID");
                                }
                            } else {
                                jsonWriter.value("UNKNOWN");
                            }
                        }
                        String str2 = (String) e1Var.f1180c;
                        if (str2 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str2);
                        }
                        Integer num = (Integer) e1Var.f1181d;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str3 = (String) cVar.f13373x;
                    if (str3 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str3);
                    }
                    Boolean bool = (Boolean) cVar.f13374y;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = (Map) cVar.f13375z;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    i iVar = (i) cVar.A;
                    if (iVar != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = (Integer) iVar.f18924u;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = (Integer) iVar.f18925v;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d2 = (Double) iVar.f18926w;
                        if (d2 != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d2);
                        }
                        List<com.google.android.gms.internal.consent_sdk.v> list = (List) iVar.f18927x;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (com.google.android.gms.internal.consent_sdk.v vVar : list) {
                                jsonWriter.beginObject();
                                Integer num4 = vVar.f13577a;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = vVar.f13578b;
                                if (num5 != null) {
                                    jsonWriter.name("left");
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = vVar.f13579c;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = vVar.f13580d;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    com.google.android.gms.internal.consent_sdk.t tVar = (com.google.android.gms.internal.consent_sdk.t) cVar.B;
                    if (tVar != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str4 = tVar.f13569a;
                        if (str4 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str4);
                        }
                        String str5 = tVar.f13570b;
                        if (str5 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str5);
                        }
                        String str6 = tVar.f13571c;
                        if (str6 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str6);
                        }
                        jsonWriter.endObject();
                    }
                    if (((com.google.android.gms.internal.consent_sdk.j4) cVar.C) != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        jsonWriter.name("version");
                        jsonWriter.value("4.0.0");
                        jsonWriter.endObject();
                    }
                    List list2 = (List) cVar.D;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            switch (((com.google.android.gms.internal.consent_sdk.u) it.next()).ordinal()) {
                                case 0:
                                    jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                                    break;
                                case 1:
                                    jsonWriter.value("ALWAYS_SHOW");
                                    break;
                                case 2:
                                    jsonWriter.value("GEO_OVERRIDE_EEA");
                                    break;
                                case 3:
                                    jsonWriter.value("GEO_OVERRIDE_REGULATED_US_STATE");
                                    break;
                                case 4:
                                    jsonWriter.value("GEO_OVERRIDE_OTHER");
                                    break;
                                case 5:
                                    jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                                    break;
                                case 6:
                                    jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                                    break;
                                case 7:
                                    jsonWriter.value("GEO_OVERRIDE_USFL");
                                    break;
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                        if (headerField != null) {
                            zv1 a10 = zv1.a(new JsonReader(new StringReader(headerField)));
                            a10.f13279c = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                            return a10;
                        }
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                        try {
                            bufferedReader.readLine();
                            JsonReader jsonReader = new JsonReader(bufferedReader);
                            try {
                                zv1 a11 = zv1.a(jsonReader);
                                jsonReader.close();
                                bufferedReader.close();
                                return a11;
                            } finally {
                            }
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    outputStreamWriter.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (SocketTimeoutException e) {
            throw new com.google.android.gms.internal.consent_sdk.l1(4, "The server timed out.", e);
        } catch (IOException e8) {
            throw new com.google.android.gms.internal.consent_sdk.l1(2, "Error making request.", e8);
        }
    }

    public tv1 h(gv1 gv1Var) {
        Context context;
        Context createDeviceContext;
        int deviceId;
        try {
            int i = gv1Var.f6485f;
            int i10 = gv1Var.f6486g;
            Context context2 = null;
            if (i10 != -1 && (context = (Context) this.f14643u) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = (Context) this.B;
                if (context3 != null) {
                    deviceId = context3.getDeviceId();
                    if (deviceId != i10) {
                    }
                    context2 = (Context) this.B;
                    i = 0;
                }
                createDeviceContext = context.createDeviceContext(i10);
                this.B = createDeviceContext;
                context2 = (Context) this.B;
                i = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(gv1Var.e.a()).setAudioFormat(new AudioFormat.Builder().setSampleRate(gv1Var.f6482b).setChannelMask(gv1Var.f6483c).setEncoding(gv1Var.f6481a).build()).setTransferMode(1).setBufferSizeInBytes(gv1Var.f6484d).setSessionId(i);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                sessionId.setOffloadedPlayback(false);
            }
            if (i11 >= 34 && context2 != null) {
                sessionId.setContext(context2);
            }
            AudioTrack build = sessionId.build();
            if (build.getState() == 1) {
                return new tv1(build, gv1Var, (bl0) this.f14644v, (com.google.android.gms.internal.ads.s6) this.f14646x);
            }
            try {
                build.release();
            } catch (Exception unused) {
            }
            throw new Exception();
        } catch (IllegalArgumentException e) {
            e = e;
            throw new Exception(e);
        } catch (UnsupportedOperationException e8) {
            e = e8;
            throw new Exception(e);
        }
    }

    public void i(cv1 cv1Var) {
        Context context;
        vu1 a10;
        AudioDeviceInfo audioDeviceInfo = cv1Var.f5185c;
        l50 l50Var = cv1Var.f5184b;
        j();
        com.google.android.gms.internal.ads.pu puVar = (com.google.android.gms.internal.ads.pu) this.f14648z;
        if (puVar == null && (context = (Context) this.f14643u) != null) {
            com.google.android.gms.internal.ads.pu puVar2 = new com.google.android.gms.internal.ads.pu(context, new to0(14, this), l50Var, audioDeviceInfo);
            this.f14648z = puVar2;
            if (puVar2.f9607v) {
                a10 = (vu1) puVar2.C;
                a10.getClass();
            } else {
                puVar2.f9607v = true;
                xu1 xu1Var = (xu1) puVar2.A;
                if (xu1Var != null) {
                    xu1Var.f12629a.registerContentObserver(xu1Var.f12630b, false, xu1Var);
                }
                wu1 wu1Var = (wu1) puVar2.f9610y;
                Handler handler = (Handler) puVar2.f9609x;
                Context context2 = puVar2.f9606u;
                xy.p(context2).registerAudioDeviceCallback(wu1Var, handler);
                if (Build.VERSION.SDK_INT >= 32 && ((com.google.android.gms.internal.ads.d) puVar2.B) == null) {
                    puVar2.B = new com.google.android.gms.internal.ads.d(context2, new qu0(16, puVar2), Boolean.valueOf(bq0.j(context2)));
                }
                a10 = vu1.a(context2, context2.registerReceiver((com.google.android.gms.internal.ads.hg) puVar2.f9611z, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (l50) puVar2.E, (AudioDeviceInfo) puVar2.D, puVar2.j());
                puVar2.C = a10;
            }
            this.f14647y = a10;
        } else if (puVar != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals((AudioDeviceInfo) puVar.D)) {
                puVar.D = audioDeviceInfo;
                Context context3 = puVar.f9606u;
                l50 l50Var2 = (l50) puVar.E;
                List j10 = puVar.j();
                y51 y51Var = vu1.e;
                puVar.k(vu1.a(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), l50Var2, audioDeviceInfo, j10));
            }
            com.google.android.gms.internal.ads.pu puVar3 = (com.google.android.gms.internal.ads.pu) this.f14648z;
            if (!Objects.equals(l50Var, (l50) puVar3.E)) {
                puVar3.E = l50Var;
                Context context4 = puVar3.f9606u;
                AudioDeviceInfo audioDeviceInfo2 = (AudioDeviceInfo) puVar3.D;
                List j11 = puVar3.j();
                y51 y51Var2 = vu1.e;
                puVar3.k(vu1.a(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), l50Var, audioDeviceInfo2, j11));
            }
        }
        ((vu1) this.f14647y).getClass();
    }

    public void j() {
        String name;
        if (((Context) this.f14643u) == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = (Looper) this.A;
        boolean z3 = true;
        if (looper != null && looper != myLooper) {
            z3 = false;
        }
        String str = "null";
        if (looper == null) {
            name = "null";
        } else {
            name = looper.getThread().getName();
        }
        if (myLooper != null) {
            str = myLooper.getThread().getName();
        }
        if (z3) {
            this.A = myLooper;
        } else {
            x.o(ay0.B("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, str));
        }
    }

    public /* synthetic */ lw(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        this.f14643u = obj;
        this.f14644v = obj2;
        this.f14645w = obj3;
        this.f14646x = obj4;
        this.f14647y = obj5;
        this.f14648z = obj6;
        this.A = obj7;
        this.B = obj8;
        this.C = obj9;
    }
}