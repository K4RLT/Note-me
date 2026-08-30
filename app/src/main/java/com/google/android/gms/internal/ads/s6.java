package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class s6 implements e3, zn1, r31, e2, p2, h7, o7, hc, in1 {

    /* renamed from: w, reason: collision with root package name */
    public static Cipher f10531w;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f10535u;

    /* renamed from: v, reason: collision with root package name */
    public static final s6 f10530v = new s6(0);

    /* renamed from: x, reason: collision with root package name */
    public static final Object f10532x = new Object();

    /* renamed from: y, reason: collision with root package name */
    public static final Object f10533y = new Object();

    /* renamed from: z, reason: collision with root package name */
    public static final s6 f10534z = new s6(2);
    public static final s6 A = new s6(3);
    public static final s6 B = new s6(4);
    public static final s6 C = new s6(5);
    public static final s6 D = new s6(7);
    public static final s6 E = new s6(8);
    public static final /* synthetic */ s6 F = new s6(10);
    public static final /* synthetic */ s6 G = new s6(12);
    public static final /* synthetic */ s6 H = new s6(13);
    public static final /* synthetic */ s6 I = new s6(16);

    public /* synthetic */ s6(boolean z3) {
        this.f10535u = 21;
    }

    public static final vo1 D(Object obj) {
        dn1 dn1Var = (dn1) obj;
        vo1 vo1Var = dn1Var.zzt;
        if (vo1Var == vo1.f11961f) {
            vo1 a10 = vo1.a();
            dn1Var.zzt = a10;
            return a10;
        }
        return vo1Var;
    }

    public static final void E(WebView webView, String str) {
        if (webView != null && !TextUtils.isEmpty(str)) {
            try {
                try {
                    webView.evaluateJavascript(str, null);
                } catch (IllegalStateException unused) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12);
                    sb2.append("javascript: ");
                    sb2.append(str);
                    webView.loadUrl(sb2.toString());
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    public static l3 l(gb gbVar, Map map) {
        String str = gbVar.f6355w;
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(gbVar.e());
        URL url = new URL(str);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int i = gbVar.F.f4254a;
        httpURLConnection.setConnectTimeout(i);
        httpURLConnection.setReadTimeout(i);
        boolean z3 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        url.getProtocol();
        try {
            for (String str2 : hashMap.keySet()) {
                httpURLConnection.setRequestProperty(str2, (String) hashMap.get(str2));
            }
            if (gbVar.f6354v != 0) {
                httpURLConnection.setRequestMethod("POST");
                byte[] f10 = gbVar.f();
                if (f10 != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(f10);
                    dataOutputStream.close();
                }
            } else {
                httpURLConnection.setRequestMethod("GET");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != -1) {
                if ((responseCode < 100 || responseCode >= 200) && responseCode != 204 && responseCode != 304) {
                    try {
                        return new l3(responseCode, t(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new sb(httpURLConnection));
                    } catch (Throwable th) {
                        th = th;
                        z3 = true;
                        if (!z3) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                l3 l3Var = new l3(responseCode, t(httpURLConnection.getHeaderFields()), -1, (sb) null);
                httpURLConnection.disconnect();
                return l3Var;
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static id m(final long j10) {
        return id.f(new bd() { // from class: com.google.android.gms.internal.ads.kc
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                try {
                    ((dd) obj).f5402a.d(id.b(j10));
                    return Optional.empty();
                } catch (zc unused) {
                    return Optional.of(dc.f5393v);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [j6.e, java.lang.Object, fa.c] */
    public static final fj n(Context context, dj djVar) {
        mf mfVar = new mf(context, 2);
        fj fjVar = new fj(mfVar);
        zd1 zd1Var = new zd1(mfVar, djVar, fjVar, 4, false);
        fa.c obj = new Object();
        obj.f18918u = fjVar;
        obj.f18919v = mfVar;
        synchronized (mfVar.f8338w) {
            cj cjVar = new cj(context, f9.k.C.f16828t.a(), zd1Var, (fa.c) obj, 0);
            mfVar.f8337v = cjVar;
            cjVar.m();
        }
        return fjVar;
    }

    public static String o(byte[] bArr, byte[] bArr2) {
        byte[] doFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f10532x) {
                w().init(1, secretKeySpec, (SecureRandom) null);
                doFinal = w().doFinal(bArr2);
                iv = w().getIV();
            }
            int length2 = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length2];
            allocate.get(bArr3);
            return Base64.encodeToString(bArr3, 2);
        } catch (InvalidKeyException e) {
            throw new Exception(e);
        } catch (NoSuchAlgorithmException e8) {
            throw new Exception(e8);
        } catch (BadPaddingException e10) {
            throw new Exception(e10);
        } catch (IllegalBlockSizeException e11) {
            throw new Exception(e11);
        } catch (NoSuchPaddingException e12) {
            throw new Exception(e12);
        }
    }

    public static final void q(com.google.android.gms.internal.consent_sdk.c cVar, tw twVar) {
        File externalStorageDirectory;
        Context context = (Context) twVar.f11472x;
        String str = (String) twVar.f11473y;
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                String str2 = (String) twVar.f11470v;
                LinkedHashMap linkedHashMap = (LinkedHashMap) twVar.f11471w;
                cVar.f13375z = context;
                cVar.A = str;
                cVar.f13374y = str2;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                cVar.C = atomicBoolean;
                atomicBoolean.set(((Boolean) sm.f11062c.p()).booleanValue());
                if (((AtomicBoolean) cVar.C).get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
                    cVar.D = new File(new File(externalStorageDirectory, "sdk_csi_data.txt").getPath());
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    ((LinkedHashMap) cVar.f13372w).put((String) entry.getKey(), (String) entry.getValue());
                }
                xx.f12651a.execute(new f(12, cVar));
                HashMap hashMap = (HashMap) cVar.f13373x;
                tl tlVar = tl.f11371c;
                hashMap.put("action", tlVar);
                hashMap.put("ad_format", tlVar);
                hashMap.put("e", tl.f11372d);
                return;
            }
            q.x.n("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
            return;
        }
        q.x.n("Context can't be null. Please set up context in CsiConfiguration.");
    }

    public static final SharedPreferences s(Context context) {
        try {
            return context.getSharedPreferences("google_ads_flags", 0);
        } catch (IllegalStateException e) {
            l9.i.g("", e);
            return null;
        }
    }

    public static ArrayList t(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new ab((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public static void u(long j10, hx0 hx0Var, boolean z3) {
        long j11;
        boolean z9;
        long[] jArr = {2000490107, 1476547902, 1834034217, 268849430, 1839467528, 4368198174L, 449620248, 1652701270, 1629190168};
        long j12 = jArr[0];
        long j13 = jArr[1];
        long j14 = jArr[2];
        long j15 = jArr[3];
        long j16 = jArr[4];
        long j17 = jArr[5];
        long j18 = jArr[6];
        long j19 = jArr[7];
        long j20 = (((((~j12) & j13) | j14) + ((j12 & j15) | j16)) - j17) + j18;
        long j21 = j19 % 1629190168;
        if (z3) {
            j11 = (j10 + j10) ^ (j10 >> 63);
        } else {
            j11 = j10;
        }
        int i = 1;
        while (true) {
            long j22 = j20 ^ j21;
            long j23 = j11 >>> 7;
            if (j23 != 0 || i < 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            int i10 = (int) (j11 & j22);
            if (z9) {
                i10 = ((i10 | 128) << 24) >> 24;
            }
            ((ByteArrayOutputStream) hx0Var.f6914v).write((byte) i10);
            if (!z9) {
                return;
            }
            i++;
            j11 = j23;
        }
    }

    public static byte[] v(String str, byte[] bArr) {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] decode = Base64.decode(str, 2);
            if (decode.length == 0 && str.length() > 0) {
                throw new IllegalArgumentException("Unable to decode ".concat(str));
            }
            int length2 = decode.length;
            if (length2 > 16) {
                ByteBuffer allocate = ByteBuffer.allocate(length2);
                allocate.put(decode);
                allocate.flip();
                byte[] bArr2 = new byte[16];
                byte[] bArr3 = new byte[length2 - 16];
                allocate.get(bArr2);
                allocate.get(bArr3);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (f10532x) {
                    w().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                    doFinal = w().doFinal(bArr3);
                }
                return doFinal;
            }
            throw new Exception();
        } catch (IllegalArgumentException e) {
            throw new Exception(e);
        } catch (InvalidAlgorithmParameterException e8) {
            throw new Exception(e8);
        } catch (InvalidKeyException e10) {
            throw new Exception(e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new Exception(e11);
        } catch (BadPaddingException e12) {
            throw new Exception(e12);
        } catch (IllegalBlockSizeException e13) {
            throw new Exception(e13);
        } catch (NoSuchPaddingException e14) {
            throw new Exception(e14);
        }
    }

    public static final Cipher w() {
        Cipher cipher;
        synchronized (f10533y) {
            try {
                if (f10531w == null) {
                    f10531w = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = f10531w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }

    public static boolean y(int i, androidx.datastore.preferences.protobuf.i iVar, Object obj) {
        rm1 rm1Var = (rm1) iVar.f737y;
        int i10 = iVar.f734v;
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                iVar.G0(5);
                                ((vo1) obj).d(5 | (i11 << 3), Integer.valueOf(rm1Var.E()));
                                return true;
                            }
                            androidx.datastore.preferences.protobuf.s1.o();
                            return false;
                        }
                        if (i != 0) {
                            return false;
                        }
                        androidx.datastore.preferences.protobuf.s1.t("Protocol message end-group tag did not match expected tag.");
                        return false;
                    }
                    vo1 a10 = vo1.a();
                    int i13 = i11 << 3;
                    int i14 = i + 1;
                    if (i14 >= 100) {
                        androidx.datastore.preferences.protobuf.s1.t("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                        return false;
                    }
                    while (iVar.X0() != Integer.MAX_VALUE && y(i14, iVar, a10)) {
                    }
                    if ((i13 | 4) == iVar.f734v) {
                        if (a10.e) {
                            a10.e = false;
                        }
                        ((vo1) obj).d(i13 | 3, a10);
                        return true;
                    }
                    androidx.datastore.preferences.protobuf.s1.t("Protocol message end-group tag did not match expected tag.");
                    return false;
                }
                ((vo1) obj).d((i11 << 3) | 2, iVar.d1());
                return true;
            }
            iVar.G0(1);
            ((vo1) obj).d((i11 << 3) | 1, Long.valueOf(rm1Var.D()));
            return true;
        }
        iVar.G0(0);
        ((vo1) obj).d(i11 << 3, Long.valueOf(rm1Var.B()));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.p2
    public i3 A(int i, int i10) {
        switch (this.f10535u) {
            case 14:
                throw new UnsupportedOperationException();
            default:
                return new l2();
        }
    }

    @Override // com.google.android.gms.internal.ads.p2
    public void B(a3 a3Var) {
        switch (this.f10535u) {
            case 14:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    public void C(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("if(window.omidBridge!==undefined){omidBridge.");
            sb2.append(str);
            sb2.append("(");
            for (Object obj : objArr) {
                if (obj == null) {
                    sb2.append("null");
                } else if (obj instanceof String) {
                    String obj2 = obj.toString();
                    if (obj2.startsWith("{")) {
                        sb2.append(obj2);
                    } else {
                        sb2.append('\"');
                        sb2.append(obj2);
                        sb2.append('\"');
                    }
                } else {
                    sb2.append(obj);
                }
                sb2.append(",");
            }
            sb2.setLength(sb2.length() - 1);
            sb2.append(")}");
            String sb3 = sb2.toString();
            Handler handler = webView.getHandler();
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            if (Looper.myLooper() == handler.getLooper()) {
                E(webView, sb3);
            } else {
                handler.post(new t81(this, webView, sb3));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public boolean a(Class cls) {
        return dn1.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public jo1 b(Class cls) {
        if (dn1.class.isAssignableFrom(cls)) {
            try {
                return (jo1) dn1.s(cls.asSubclass(dn1.class)).v(3, null);
            } catch (Exception e) {
                l4.a.k("Unable to get message info for ".concat(cls.getName()), e);
                return null;
            }
        }
        q.x.n("Unsupported message type: ".concat(cls.getName()));
        return null;
    }

    @Override // com.google.android.gms.internal.ads.h7
    public a3 c() {
        return new r2(-9223372036854775807L, 0L);
    }

    @Override // com.google.android.gms.internal.ads.h7
    public long e(o2 o2Var) {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.o7
    public boolean f(mw1 mw1Var) {
        switch (this.f10535u) {
            case 18:
                String str = mw1Var.f8459o;
                if (!Objects.equals(str, "text/x-ssa") && !Objects.equals(str, "text/vtt") && !Objects.equals(str, "application/x-mp4-vtt") && !Objects.equals(str, "application/x-subrip") && !Objects.equals(str, "application/x-quicktime-tx3g") && !Objects.equals(str, "application/pgs") && !Objects.equals(str, "application/vobsub") && !Objects.equals(str, "application/dvbsubs") && !Objects.equals(str, "application/ttml+xml")) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.hc
    public byte h(oc ocVar, int i) {
        return ocVar.b(i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r4.equals("application/vobsub") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        if (r4.equals("application/x-quicktime-tx3g") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        if (r4.equals("application/x-mp4-vtt") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        if (r4.equals("application/pgs") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
    
        if (r4.equals("application/dvbsubs") != false) goto L19;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0011. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.o7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int i(com.google.android.gms.internal.ads.mw1 r4) {
        /*
            r3 = this;
            int r0 = r3.f10535u
            switch(r0) {
                case 18: goto L7;
                default: goto L5;
            }
        L5:
            r4 = 1
            return r4
        L7:
            java.lang.String r4 = r4.f8459o
            if (r4 == 0) goto L67
            int r0 = r4.hashCode()
            r1 = 1
            r2 = 2
            switch(r0) {
                case -1351681404: goto L5e;
                case -1248334819: goto L55;
                case -1026075066: goto L4c;
                case -1004728940: goto L43;
                case 691401887: goto L3a;
                case 822864842: goto L31;
                case 1157994102: goto L27;
                case 1668750253: goto L1e;
                case 1693976202: goto L15;
                default: goto L14;
            }
        L14:
            goto L67
        L15:
            java.lang.String r0 = "application/ttml+xml"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L67
            goto L75
        L1e:
            java.lang.String r0 = "application/x-subrip"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L67
            goto L75
        L27:
            java.lang.String r0 = "application/vobsub"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L67
        L2f:
            r1 = r2
            goto L75
        L31:
            java.lang.String r0 = "text/x-ssa"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L67
            goto L75
        L3a:
            java.lang.String r0 = "application/x-quicktime-tx3g"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L67
            goto L2f
        L43:
            java.lang.String r0 = "text/vtt"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L67
            goto L75
        L4c:
            java.lang.String r0 = "application/x-mp4-vtt"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L67
            goto L2f
        L55:
            java.lang.String r0 = "application/pgs"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L67
            goto L2f
        L5e:
            java.lang.String r0 = "application/dvbsubs"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L67
            goto L2f
        L67:
            java.lang.String r0 = "Unsupported MIME type: "
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r0.concat(r4)
            q.x.n(r4)
            r1 = 0
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s6.i(com.google.android.gms.internal.ads.mw1):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0017. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.a8, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.o7
    public p7 j(mw1 mw1Var) {
        p7 p7Var;
        switch (this.f10535u) {
            case 18:
                String str = mw1Var.f8459o;
                List list = mw1Var.f8462r;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1351681404:
                            if (str.equals("application/dvbsubs")) {
                                Object obj = new Object();
                                xk0 xk0Var = new xk0((byte[]) list.get(0));
                                int L = xk0Var.L();
                                int L2 = xk0Var.L();
                                Paint paint = new Paint();
                                obj.f4405u = paint;
                                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                                paint.setPathEffect(null);
                                Paint paint2 = new Paint();
                                obj.f4406v = paint2;
                                paint2.setStyle(Paint.Style.FILL);
                                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
                                paint2.setPathEffect(null);
                                obj.f4407w = new Canvas();
                                int i = 719;
                                obj.f4408x = new u7(i, 575, 0, i, 0, 575);
                                obj.f4409y = new t7(0, new int[]{0, -1, -16777216, -8421505}, a8.f(), a8.i());
                                obj.f4410z = new z7(L, L2);
                                p7Var = obj;
                                return p7Var;
                            }
                            break;
                        case -1248334819:
                            if (str.equals("application/pgs")) {
                                return new tw(3);
                            }
                            break;
                        case -1026075066:
                            if (str.equals("application/x-mp4-vtt")) {
                                return new jk0(5);
                            }
                            break;
                        case -1004728940:
                            if (str.equals("text/vtt")) {
                                return new com.google.android.gms.internal.mlkit_vision_digital_ink.gw();
                            }
                            break;
                        case 691401887:
                            if (str.equals("application/x-quicktime-tx3g")) {
                                p7Var = new q8(list);
                                return p7Var;
                            }
                            break;
                        case 822864842:
                            if (str.equals("text/x-ssa")) {
                                p7Var = new c8(list);
                                return p7Var;
                            }
                            break;
                        case 1157994102:
                            if (str.equals("application/vobsub")) {
                                p7Var = new s8(list);
                                return p7Var;
                            }
                            break;
                        case 1668750253:
                            if (str.equals("application/x-subrip")) {
                                return new g8();
                            }
                            break;
                        case 1693976202:
                            if (str.equals("application/ttml+xml")) {
                                return new l8();
                            }
                            break;
                    }
                }
                q.x.n("Unsupported MIME type: ".concat(String.valueOf(str)));
                return null;
            default:
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
        }
    }

    @Override // com.google.android.gms.internal.ads.hc
    public oc k(oc ocVar, int i, int i10) {
        byte[] bArr;
        int length;
        byte[] bArr2;
        if (i >= 0 && i <= i10 && i10 <= (length = (bArr = ocVar.f9089a).length) && i <= i10 && i10 <= length) {
            int i11 = i10 - i;
            if (i11 == 0) {
                bArr2 = new byte[0];
            } else {
                byte[] bArr3 = new byte[i11];
                System.arraycopy(bArr, i, bArr3, 0, i11);
                bArr2 = bArr3;
            }
            return new oc(bArr2);
        }
        throw new IndexOutOfBoundsException();
    }

    public Constructor p() {
        switch (this.f10535u) {
            case 12:
                int[] iArr = k2.f7602w;
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(n2.class).getConstructor(null);
            default:
                int[] iArr2 = k2.f7602w;
                if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return null;
                }
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(n2.class).getConstructor(Integer.TYPE);
        }
    }

    public long r() {
        return SystemClock.elapsedRealtime();
    }

    public String toString() {
        switch (this.f10535u) {
            case 0:
                return "NoDeclaredBrand";
            default:
                return super.toString();
        }
    }

    public io0 x(Looper looper, Handler.Callback callback) {
        return new io0(new Handler(looper, callback));
    }

    @Override // com.google.android.gms.internal.ads.p2
    public void z() {
        switch (this.f10535u) {
            case 14:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.r31
    public /* synthetic */ Object zza() {
        int i = d1.f5246a;
        try {
            return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
        } catch (Exception e) {
            androidx.datastore.preferences.protobuf.s1.r(e);
            return null;
        }
    }

    public /* synthetic */ s6(int i) {
        this.f10535u = i;
    }

    public s6(jf jfVar, bv0 bv0Var) {
        this.f10535u = 24;
    }

    @Override // com.google.android.gms.internal.ads.hc
    /* renamed from: c, reason: collision with other method in class */
    public hc mo211c() {
        return new s6(false);
    }

    private final void F() {
    }

    private final void G(a3 a3Var) {
    }

    @Override // com.google.android.gms.internal.ads.e2
    public long d(long j10) {
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.h7
    public void g(long j10) {
    }
}
