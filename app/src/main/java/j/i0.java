package j;
import a.a;
import b0.x;
import f.a;
import j.a;
import j.i0;
import l.b;
import n.i0;
import p.a;
import q.h;
import q.x;
import r.m1;

import android.app.Activity;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.l3;
import com.google.android.gms.internal.ads.ou1;
import com.google.android.gms.internal.ads.wd0;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.zip.Adler32;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.SSLSocket;
import lb.t0;
import lb.u0;
import n.p0;
import pf.d1;
import r0.n2;
import t.m1;
import ya.hb;

/* loaded from: classes.dex */
public final class i0 implements kb.c, mb.f, mc.b, mc.a, p8.b, ad.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18635u;

    /* renamed from: v, reason: collision with root package name */
    public Object f18636v;

    /* renamed from: w, reason: collision with root package name */
    public Object f18637w;

    /* renamed from: x, reason: collision with root package name */
    public Object f18638x;

    public i0(int i) {
        this.f18635u = i;
        switch (i) {
            case 7:
                this.f18636v = new com.google.android.gms.internal.ads.h0(8);
                return;
            case 14:
                this.f18636v = new com.google.android.gms.internal.ads.h0(16);
                long[] jArr = p0.f20923a;
                this.f18637w = new n.i0();
                this.f18638x = new Object();
                return;
            case gl.zzm /* 21 */:
                this.f18638x = new Object();
                return;
            case 24:
                this.f18636v = new WeakHashMap();
                this.f18637w = new WeakHashMap();
                this.f18638x = new WeakHashMap();
                return;
            case 27:
                this.f18636v = new HashMap();
                this.f18637w = new HashMap();
                this.f18638x = wa.e.f29599c;
                return;
            default:
                this.f18636v = new ArrayList();
                this.f18637w = new ArrayList();
                this.f18638x = new ArrayList();
                return;
        }
    }

    public static File K(int i, int i10, Context context, String str) {
        context.getClass();
        str.getClass();
        File file = new File(context.getFilesDir(), "drawings");
        if (!file.exists()) {
            file.mkdirs();
        }
        String a10 = v7.a(i10);
        if (!str.startsWith("?")) {
            return new File(file, a.j(i, ".bin", a.q("inkvec_", a10, "_notebook_", str, "_spread_")));
        }
        return new File(file, a.j(i, ".bin", a.q("inkvec_", a10, "_book_", str, "_spread_")));
    }

    public static void L(File file, List list) {
        try {
            if (list.isEmpty()) {
                if (file.exists()) {
                    file.delete();
                    return;
                }
                return;
            }
            File file2 = new File(file.getParentFile(), "inkvec_tmp_" + System.nanoTime() + ".bin");
            DataOutputStream dataOutputStream = new DataOutputStream(new GZIPOutputStream(new BufferedOutputStream(new FileOutputStream(file2), 8192)));
            try {
                dataOutputStream.writeInt(1398164273);
                dataOutputStream.writeByte(2);
                dataOutputStream.writeInt(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    v7.n nVar = (v7.n) it.next();
                    int i = nVar.f27463a;
                    float[] fArr = nVar.f27467f;
                    dataOutputStream.writeByte(i);
                    int i10 = v7.m.f27462a[nVar.f27464b.ordinal()];
                    int i11 = 1;
                    if (i10 != 1) {
                        if (i10 != 2) {
                            i11 = 3;
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    if (i10 == 5) {
                                        i11 = 4;
                                    } else {
                                        throw new ab.b(false);
                                    }
                                }
                            } else {
                                i11 = 2;
                            }
                        }
                    } else {
                        i11 = 0;
                    }
                    dataOutputStream.writeByte(i11);
                    dataOutputStream.writeInt(nVar.f27465c);
                    dataOutputStream.writeFloat(nVar.f27466d);
                    dataOutputStream.writeBoolean(nVar.e);
                    int length = fArr.length;
                    dataOutputStream.writeInt(length);
                    for (int i12 = 0; i12 < length; i12++) {
                        dataOutputStream.writeFloat(fArr[i12]);
                        dataOutputStream.writeFloat(nVar.f27468g[i12]);
                        dataOutputStream.writeInt(nVar.f27469h[i12]);
                        dataOutputStream.writeFloat(nVar.i[i12]);
                    }
                }
                dataOutputStream.close();
                if (file.exists()) {
                    file.delete();
                }
                if (!file2.renameTo(file)) {
                    af.b(file2, file);
                    file2.delete();
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    pa.a(dataOutputStream, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final URL c(i0 i0Var) {
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority((String) i0Var.f18638x).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        vd.b bVar = (vd.b) i0Var.f18636v;
        Uri.Builder appendPath2 = appendPath.appendPath(bVar.f27546a).appendPath("settings");
        vd.a aVar = bVar.f27547b;
        return new URL(appendPath2.appendQueryParameter("build_version", aVar.f27540c).appendQueryParameter("display_version", aVar.f27539b).build().toString());
    }

    public static String f(HashMap hashMap, String str) {
        String str2;
        String str3;
        StringBuilder sb2 = new StringBuilder();
        Iterator it = hashMap.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb2.append((String) entry.getKey());
        sb2.append("=");
        if (entry.getValue() == null) {
            str2 = "";
        } else {
            str2 = URLEncoder.encode((String) entry.getValue(), "UTF-8");
        }
        sb2.append(str2);
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append("&");
            sb2.append((String) entry2.getKey());
            sb2.append("=");
            if (entry2.getValue() == null) {
                str3 = "";
            } else {
                str3 = URLEncoder.encode((String) entry2.getValue(), "UTF-8");
            }
            sb2.append(str3);
        }
        String sb3 = sb2.toString();
        if (sb3.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                sb3 = "&".concat(sb3);
            }
            return str.concat(sb3);
        }
        return wd0.n(str, "?", sb3);
    }

    public static List z(File file) {
        File file2;
        DataInputStream dataInputStream;
        p7.a aVar;
        qe.s sVar = qe.s.f24023u;
        try {
            file2 = file;
            try {
                dataInputStream = new DataInputStream(new GZIPInputStream(new BufferedInputStream(new FileInputStream(file2), 8192)));
                try {
                } finally {
                }
            } catch (Exception unused) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
                return sVar;
            }
        } catch (Exception unused3) {
            file2 = file;
        }
        if (dataInputStream.readInt() == 1398164273) {
            byte b10 = 2;
            if (dataInputStream.readByte() != 2) {
                try {
                    file2.delete();
                } catch (Throwable unused4) {
                }
                dataInputStream.close();
                return sVar;
            }
            int readInt = dataInputStream.readInt();
            if (readInt >= 0 && readInt <= 200000) {
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i < readInt) {
                    byte readByte = dataInputStream.readByte();
                    byte readByte2 = dataInputStream.readByte();
                    if (readByte2 != 0) {
                        if (readByte2 != 1) {
                            if (readByte2 != b10) {
                                if (readByte2 != 3) {
                                    if (readByte2 != 4) {
                                        aVar = null;
                                    } else {
                                        aVar = p7.a.PRESSURE_PEN;
                                    }
                                } else {
                                    aVar = p7.a.HIGHLIGHTER;
                                }
                            } else {
                                aVar = p7.a.MARKER;
                            }
                        } else {
                            aVar = p7.a.PENCIL;
                        }
                    } else {
                        aVar = p7.a.PEN;
                    }
                    p7.a aVar2 = aVar;
                    int readInt2 = dataInputStream.readInt();
                    float readFloat = dataInputStream.readFloat();
                    boolean readBoolean = dataInputStream.readBoolean();
                    int readInt3 = dataInputStream.readInt();
                    if (readInt3 >= 0 && readInt3 <= 100000) {
                        float[] fArr = new float[readInt3];
                        float[] fArr2 = new float[readInt3];
                        int[] iArr = new int[readInt3];
                        float[] fArr3 = new float[readInt3];
                        int i10 = readInt;
                        for (int i11 = 0; i11 < readInt3; i11++) {
                            fArr[i11] = dataInputStream.readFloat();
                            fArr2[i11] = dataInputStream.readFloat();
                            iArr[i11] = dataInputStream.readInt();
                            fArr3[i11] = dataInputStream.readFloat();
                        }
                        if (aVar2 != null) {
                            arrayList.add(new v7.n(readByte, aVar2, readInt2, readFloat, readBoolean, fArr, fArr2, iArr, fArr3));
                        }
                        i++;
                        readInt = i10;
                        b10 = 2;
                    }
                }
                dataInputStream.close();
                return arrayList;
            }
        }
        dataInputStream.close();
        return sVar;
    }

    public void A() {
        ((TypedArray) this.f18637w).recycle();
    }

    public synchronized void B(Context context, String str, int i, int i10, int i11, boolean z3) {
        List list;
        try {
            context.getClass();
            if (i == i10) {
                return;
            }
            pe.o oVar = new pe.o(str, Integer.valueOf(i), Integer.valueOf(i11));
            pe.o oVar2 = new pe.o(str, Integer.valueOf(i10), Integer.valueOf(i11));
            File K = K(i, i11, context, str);
            File K2 = K(i10, i11, context, str);
            d1 d1Var = (d1) ((ConcurrentHashMap) this.f18638x).remove(oVar2);
            d1 d1Var2 = null;
            if (d1Var != null) {
                d1Var.j(null);
            }
            ((ConcurrentHashMap) this.f18637w).remove(oVar2);
            try {
                if (K2.exists()) {
                    K2.delete();
                }
            } catch (Throwable unused) {
            }
            d1 d1Var3 = (d1) ((ConcurrentHashMap) this.f18638x).remove(oVar);
            if (d1Var3 != null) {
                d1Var3.j(null);
                d1Var2 = d1Var3;
            }
            if (d1Var2 != null && (list = (List) ((ConcurrentHashMap) this.f18637w).get(oVar)) != null) {
                L(K, list);
            }
            try {
                if (z3) {
                    if (K.exists()) {
                        af.b(K, K2);
                    }
                } else {
                    List list2 = (List) ((ConcurrentHashMap) this.f18637w).remove(oVar);
                    if (list2 != null) {
                        ((ConcurrentHashMap) this.f18637w).put(oVar2, list2);
                    }
                    if (K.exists() && !K.renameTo(K2)) {
                        af.b(K, K2);
                        K.delete();
                    }
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void C(n8.i iVar, int i, boolean z3) {
        Long l10;
        t8.a aVar = (t8.a) this.f18638x;
        Context context = (Context) this.f18636v;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.f21181a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        k8.d dVar = iVar.f21183c;
        adler32.update(allocate.putInt(x8.a(dVar)).array());
        byte[] bArr = iVar.f21182b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z3) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i10 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i10 >= i) {
                        hb.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", iVar);
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((u8.f) this.f18637w).f().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(x8.a(dVar))});
        try {
            if (rawQuery.moveToNext()) {
                l10 = Long.valueOf(rawQuery.getLong(0));
            } else {
                l10 = 0L;
            }
            rawQuery.close();
            long longValue = l10.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(aVar.a(dVar, longValue, i));
            Set set = ((t8.b) aVar.f25664b.get(dVar)).f25667c;
            if (set.contains(t8.c.f25668u)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(t8.c.f25670w)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(t8.c.f25669v)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", x8.a(dVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {iVar, Integer.valueOf(value), Long.valueOf(aVar.a(dVar, longValue, i)), l10, Integer.valueOf(i)};
            String c10 = hb.c("JobInfoScheduler");
            if (Log.isLoggable(c10, 3)) {
                Log.d(c10, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public void D(Context context, pe.o oVar) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f18638x;
        d1 d1Var = (d1) concurrentHashMap.remove(oVar);
        te.c cVar = null;
        if (d1Var != null) {
            d1Var.j(null);
        }
        y4.a aVar = (y4.a) this.f18636v;
        wf.e eVar = pf.l0.f22767a;
        concurrentHashMap.put(oVar, pf.x(aVar, wf.d.f29913w, new m1(this, oVar, context, cVar, 13), 2));
    }

    public void E(String str) {
        if (str != null) {
            this.f18636v = str;
        } else {
            g5.h("Null backendName");
        }
    }

    public void F(k1.p pVar) {
        ((m1.b) this.f18638x).f20423u.f20421c = pVar;
    }

    public void G(y2.c cVar) {
        ((m1.b) this.f18638x).f20423u.f20419a = cVar;
    }

    public void H(y2.m mVar) {
        ((m1.b) this.f18638x).f20423u.f20420b = mVar;
    }

    public void I(long j10) {
        ((m1.b) this.f18638x).f20423u.f20422d = j10;
    }

    public synchronized List J(int i, int i10, Context context, String str) {
        context.getClass();
        str.getClass();
        return q(context, new pe.o(str, Integer.valueOf(i), Integer.valueOf(i10)));
    }

    public void M(String str, double d2, double d10) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) this.f18637w;
        ArrayList arrayList3 = (ArrayList) this.f18638x;
        int i = 0;
        while (true) {
            arrayList = (ArrayList) this.f18636v;
            if (i >= arrayList.size()) {
                break;
            }
            double doubleValue = ((Double) arrayList3.get(i)).doubleValue();
            double doubleValue2 = ((Double) arrayList2.get(i)).doubleValue();
            if (d2 < doubleValue || (doubleValue == d2 && d10 < doubleValue2)) {
                break;
            } else {
                i++;
            }
        }
        arrayList.add(i, str);
        arrayList3.add(i, Double.valueOf(d2));
        arrayList2.add(i, Double.valueOf(d10));
    }

    public void N() {
        Log.i("HsdpLoadingPanel", "try to hideLoading");
        View view = (View) this.f18638x;
        if (view == null) {
            return;
        }
        ((Activity) this.f18636v).runOnUiThread(new ou1(this, 26, view));
    }

    public boolean O() {
        if ((((Activity) this.f18636v).getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    @Override // ad.a
    public /* bridge */ /* synthetic */ ad.a a(Class cls, zc.d dVar) {
        ((HashMap) this.f18636v).put(cls, dVar);
        ((HashMap) this.f18637w).remove(cls);
        return this;
    }

    @Override // mb.f
    public Object b() {
        switch (this.f18635u) {
            case 4:
                int i = 9;
                return new t0((lb.v) ((mb.e) this.f18636v).b(), new mb.e(new k6.i(i, (ic.c) this.f18637w)), (lb.n0) ((mb.e) this.f18638x).b());
            default:
                mb.e eVar = (mb.e) this.f18638x;
                mb.e eVar2 = (mb.e) this.f18637w;
                return new u0((t0) ((mb.e) this.f18636v).b(), (lb.v) eVar2.b(), (lb.c0) eVar.b());
        }
    }

    public n8.i d() {
        String str;
        if (((String) this.f18636v) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((k8.d) this.f18638x) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new n8.i((String) this.f18636v, (byte[]) this.f18637w, (k8.d) this.f18638x);
        }
        x.o("Missing required properties:".concat(str));
        return null;
    }

    public synchronized void e(Context context, String str, int i, Iterable iterable) {
        try {
            context.getClass();
            iterable.getClass();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                pe.o oVar = new pe.o(str, Integer.valueOf(i), Integer.valueOf(intValue));
                d1 d1Var = (d1) ((ConcurrentHashMap) this.f18638x).remove(oVar);
                if (d1Var != null) {
                    d1Var.j(null);
                }
                ((ConcurrentHashMap) this.f18637w).put(oVar, qe.s.f24023u);
                try {
                    K(i, intValue, context, str).delete();
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public rd.m g() {
        /*
            r8 = this;
            java.lang.String r0 = "GET Request URL: "
            java.lang.String r1 = "FirebaseCrashlytics"
            r2 = 0
            java.lang.Object r3 = r8.f18636v     // Catch: java.lang.Throwable -> Lae
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r4 = r8.f18637w     // Catch: java.lang.Throwable -> Lae
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: java.lang.Throwable -> Lae
            java.lang.String r3 = f(r4, r3)     // Catch: java.lang.Throwable -> La9
            java.lang.String r0 = r0.concat(r3)     // Catch: java.lang.Throwable -> La9
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r1, r4)     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L23
            android.util.Log.v(r1, r0, r2)     // Catch: java.lang.Throwable -> L20
            goto L23
        L20:
            r0 = move-exception
            goto Lac
        L23:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> La9
            r0.<init>(r3)     // Catch: java.lang.Throwable -> La9
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> La9
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch: java.lang.Throwable -> La9
            r1 = 10000(0x2710, float:1.4013E-41)
            r0.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L63
            r0.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = "GET"
            r0.setRequestMethod(r1)     // Catch: java.lang.Throwable -> L63
            java.lang.Object r1 = r8.f18638x     // Catch: java.lang.Throwable -> L63
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L63
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L63
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L63
        L47:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L63
            if (r3 == 0) goto L65
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L63
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L63
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L63
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L63
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L63
            r0.addRequestProperty(r4, r3)     // Catch: java.lang.Throwable -> L63
            goto L47
        L63:
            r1 = move-exception
            goto Lb0
        L65:
            r0.connect()     // Catch: java.lang.Throwable -> L63
            int r1 = r0.getResponseCode()     // Catch: java.lang.Throwable -> L63
            java.io.InputStream r3 = r0.getInputStream()     // Catch: java.lang.Throwable -> L63
            if (r3 == 0) goto L9b
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L98
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L98
            java.lang.String r5 = "UTF-8"
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L98
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L98
            r4 = 8192(0x2000, float:1.14794E-41)
            char[] r4 = new char[r4]     // Catch: java.lang.Throwable -> L98
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L98
            r5.<init>()     // Catch: java.lang.Throwable -> L98
        L87:
            int r6 = r2.read(r4)     // Catch: java.lang.Throwable -> L98
            r7 = -1
            if (r6 == r7) goto L93
            r7 = 0
            r5.append(r4, r7, r6)     // Catch: java.lang.Throwable -> L98
            goto L87
        L93:
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L98
            goto L9b
        L98:
            r1 = move-exception
            r2 = r3
            goto Lb0
        L9b:
            if (r3 == 0) goto La0
            r3.close()
        La0:
            r0.disconnect()
            rd.m r0 = new rd.m
            r0.<init>(r1, r2)
            return r0
        La9:
            r1 = move-exception
        Laa:
            r0 = r2
            goto Lb0
        Lac:
            r1 = r0
            goto Laa
        Lae:
            r0 = move-exception
            goto Lac
        Lb0:
            if (r2 == 0) goto Lb5
            r2.close()
        Lb5:
            if (r0 == 0) goto Lba
            r0.disconnect()
        Lba:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j.i0.g():rd.m");
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [w8.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [w8.a, java.lang.Object] */
    @Override // oe.a
    public Object get() {
        switch (this.f18635u) {
            case 10:
                return new n8.q(new Object(), new Object(), (s8.a) ((com.google.android.gms.internal.mlkit_vision_digital_ink.u0) this.f18636v).get(), (com.google.android.gms.internal.consent_sdk.c) ((m0) this.f18637w).get(), (nd.o) ((j6.i) this.f18638x).get());
            default:
                return new i0(22, (Context) ((oe.a) this.f18636v).get(), (u8.f) ((oe.a) this.f18637w).get(), (t8.a) ((nf.a) this.f18638x).get());
        }
    }

    @Override // mc.b
    public void h(String str, Bundle bundle) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f18638x;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList i(android.content.Context r14) {
        /*
            r13 = this;
            r14.getClass()
            java.lang.Object r0 = r13.f18638x
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.util.Set r1 = r0.keySet()
            r1.getClass()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = qe.l.P(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L1f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L65
            java.lang.Object r3 = r1.next()
            r7 = r3
            pe.o r7 = (pe.o) r7
            java.lang.Object r3 = r0.remove(r7)
            pf.d1 r3 = (pf.d1) r3
            r4 = 0
            if (r3 == 0) goto L45
            r3.j(r4)
            java.lang.Object r3 = r13.f18637w
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            java.lang.Object r3 = r3.get(r7)
            r8 = r3
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L47
        L45:
            r6 = r14
            goto L5e
        L47:
            java.lang.Object r3 = r13.f18636v
            y4.a r3 = (y4.a) r3
            wf.e r4 = pf.l0.f22767a
            wf.d r12 = wf.d.f29913w
            b8.u9 r4 = new b8.u9
            r10 = 6
            r11 = 0
            r9 = 0
            r5 = r13
            r6 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r14 = 2
            pf.r1 r4 = pf.x(r3, r12, r4, r14)
        L5e:
            if (r4 == 0) goto L63
            r2.add(r4)
        L63:
            r14 = r6
            goto L1f
        L65:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j.i0.i(android.content.Context):java.util.ArrayList");
    }

    public k1.p j() {
        return ((m1.b) this.f18638x).f20423u.f20421c;
    }

    @Override // mc.a
    public void k(Bundle bundle) {
        synchronized (this.f18637w) {
            try {
                lc.d dVar = lc.d.f20327a;
                dVar.e("Logging event _ae to Firebase Analytics with params " + bundle);
                this.f18638x = new CountDownLatch(1);
                ((ic.c) this.f18636v).k(bundle);
                dVar.e("Awaiting app exception callback from Analytics...");
                try {
                    if (((CountDownLatch) this.f18638x).await(500, TimeUnit.MILLISECONDS)) {
                        dVar.e("App exception callback received from Analytics listener.");
                    } else {
                        dVar.f(null, "Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.f18638x = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public y2.c l() {
        return ((m1.b) this.f18638x).f20423u.f20419a;
    }

    public Drawable m(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f18637w;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            return o.c().d((Context) this.f18636v, resourceId);
        }
        return typedArray.getDrawable(i);
    }

    public Typeface n(int i, int i10, l3 l3Var) {
        int resourceId = ((TypedArray) this.f18637w).getResourceId(i, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.f18638x) == null) {
                this.f18638x = new TypedValue();
            }
            Context context = (Context) this.f18636v;
            TypedValue typedValue = (TypedValue) this.f18638x;
            ThreadLocal threadLocal = i3.j.f18193a;
            if (context.isRestricted()) {
                return null;
            }
            return i3.a(context, resourceId, typedValue, i10, l3Var, true);
        }
        return null;
    }

    public y2.m o() {
        return ((m1.b) this.f18638x).f20423u.f20420b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if ((r4.getModifiers() & 1) == 0) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.reflect.Method p(java.lang.Class r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f18637w
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r3.f18638x
            java.lang.Class[] r1 = (java.lang.Class[]) r1
            r2 = 0
            java.lang.reflect.Method r4 = r4.getMethod(r0, r1)     // Catch: java.lang.NoSuchMethodException -> L15
            int r0 = r4.getModifiers()     // Catch: java.lang.NoSuchMethodException -> L16
            r0 = r0 & 1
            if (r0 != 0) goto L16
        L15:
            r4 = r2
        L16:
            if (r4 == 0) goto L29
            java.lang.Object r0 = r3.f18636v
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L29
            java.lang.Class r1 = r4.getReturnType()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L29
            goto L2a
        L29:
            r2 = r4
        L2a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j.i0.p(java.lang.Class):java.lang.reflect.Method");
    }

    public synchronized List q(Context context, pe.o oVar) {
        List list;
        try {
            List list2 = (List) ((ConcurrentHashMap) this.f18637w).get(oVar);
            if (list2 != null) {
                return list2;
            }
            File K = K(((Number) oVar.f22704v).intValue(), ((Number) oVar.f22705w).intValue(), context, (String) oVar.f22703u);
            if (K.exists()) {
                list = z(K);
            } else {
                list = qe.s.f24023u;
            }
            if (K.exists()) {
                Log.d("ScraplyVecInk", "load pliego=" + oVar.f22704v + " capa=" + oVar.f22705w + ": " + list.size() + " trazo(s) de " + K.length() + " bytes");
            }
            ((ConcurrentHashMap) this.f18637w).put(oVar, list);
            return list;
        } catch (Throwable th) {
            throw th;
        }
    }

    public long r() {
        return ((m1.b) this.f18638x).f20423u.f20422d;
    }

    public ic.c s() {
        return (ic.c) this.f18636v;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(80:5|(2:7|(2:9|(2:10|(2:12|(3:14|15|(1:17)(0))(1:18))(1:19)))(0))(0)|20|(77:244|245|(1:24)|25|26|27|(1:29)|241|31|32|(3:216|217|(72:219|(64:221|(1:223)|35|(1:37)|38|(1:40)|41|(2:43|(1:200)(54:47|48|(1:50)|51|(1:53)(2:190|(1:195)(1:194))|54|(1:56)(1:189)|57|(1:59)(5:177|(1:179)|180|(1:182)(1:188)|(1:184)(2:185|(1:187)))|60|(1:62)(6:159|(4:162|(2:170|171)(1:168)|169|160)|172|173|(1:175)|176)|63|(1:65)(1:158)|(1:67)|68|(37:154|155|(1:74)|75|(1:77)|78|(31:145|(1:149)|(1:82)|83|(27:140|(1:144)|(1:87)|88|(23:137|(1:139)|(1:92)|93|(1:95)|96|(1:98)|99|(3:101|(1:106)(1:104)|105)|107|(1:109)|110|(1:112)|113|(1:115)|116|(1:136)|118|(4:125|126|(1:128)(1:131)|129)|120|(1:122)|123|124)|90|(0)|93|(0)|96|(0)|99|(0)|107|(0)|110|(0)|113|(0)|116|(0)|118|(0)|120|(0)|123|124)|85|(0)|88|(0)|90|(0)|93|(0)|96|(0)|99|(0)|107|(0)|110|(0)|113|(0)|116|(0)|118|(0)|120|(0)|123|124)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|96|(0)|99|(0)|107|(0)|110|(0)|113|(0)|116|(0)|118|(0)|120|(0)|123|124)|70|(37:150|151|(0)|75|(0)|78|(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|96|(0)|99|(0)|107|(0)|110|(0)|113|(0)|116|(0)|118|(0)|120|(0)|123|124)|72|(0)|75|(0)|78|(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|96|(0)|99|(0)|107|(0)|110|(0)|113|(0)|116|(0)|118|(0)|120|(0)|123|124))(1:215)|201|(2:210|211)|(1:209)(1:208)|48|(0)|51|(0)(0)|54|(0)(0)|57|(0)(0)|60|(0)(0)|63|(0)(0)|(0)|68|(0)|70|(0)|72|(0)|75|(0)|78|(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|96|(0)|99|(0)|107|(0)|110|(0)|113|(0)|116|(0)|118|(0)|120|(0)|123|124)|224|(67:226|(1:228)|35|(0)|38|(0)|41|(0)(0)|201|(1:203)|210|211|(1:206)|209|48|(0)|51|(0)(0)|54|(0)(0)|57|(0)(0)|60|(0)(0)|63|(0)(0)|(0)|68|(0)|70|(0)|72|(0)|75|(0)|78|(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|96|(0)|99|(0)|107|(0)|110|(0)|113|(0)|116|(0)|118|(0)|120|(0)|123|124)(1:237)|229|(3:231|(1:233)(1:235)|234)|236|35|(0)|38|(0)|41|(0)(0)|201|(0)|210|211|(0)|209|48|(0)|51|(0)(0)|54|(0)(0)|57|(0)(0)|60|(0)(0)|63|(0)(0)|(0)|68|(0)|70|(0)|72|(0)|75|(0)|78|(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|96|(0)|99|(0)|107|(0)|110|(0)|113|(0)|116|(0)|118|(0)|120|(0)|123|124))|34|35|(0)|38|(0)|41|(0)(0)|201|(0)|210|211|(0)|209|48|(0)|51|(0)(0)|54|(0)(0)|57|(0)(0)|60|(0)(0)|63|(0)(0)|(0)|68|(0)|70|(0)|72|(0)|75|(0)|78|(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|96|(0)|99|(0)|107|(0)|110|(0)|113|(0)|116|(0)|118|(0)|120|(0)|123|124)|22|(0)|25|26|27|(0)|241|31|32|(0)|34|35|(0)|38|(0)|41|(0)(0)|201|(0)|210|211|(0)|209|48|(0)|51|(0)(0)|54|(0)(0)|57|(0)(0)|60|(0)(0)|63|(0)(0)|(0)|68|(0)|70|(0)|72|(0)|75|(0)|78|(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|96|(0)|99|(0)|107|(0)|110|(0)|113|(0)|116|(0)|118|(0)|120|(0)|123|124) */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0200, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0201, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x00b6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x00b7, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b2, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x051f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x038e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0 A[Catch: NameNotFoundException -> 0x00b6, TRY_LEAVE, TryCatch #0 {NameNotFoundException -> 0x00b6, blocks: (B:27:0x00aa, B:29:0x00b0), top: B:26:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04a8  */
    /* JADX WARN: Type inference failed for: r0v104, types: [int] */
    /* JADX WARN: Type inference failed for: r0v130 */
    /* JADX WARN: Type inference failed for: r0v180 */
    /* JADX WARN: Type inference failed for: r0v181 */
    /* JADX WARN: Type inference failed for: r15v0, types: [f3.i] */
    /* JADX WARN: Type inference failed for: r5v29, types: [f3.j, f3.f] */
    /* JADX WARN: Type inference failed for: r5v40, types: [f3.j, f3.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean t() {
        /*
            Method dump skipped, instructions count: 1440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.i0.t():boolean");
    }

    public synchronized boolean u(Context context, String str, int i) {
        boolean z3;
        try {
            context.getClass();
            str.getClass();
            Iterable iterable = v7.j.f27439a;
            z3 = false;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (!((jf.c) it).f19194w) {
                        break;
                    }
                    if (!q(context, new pe.o(str, Integer.valueOf(i), Integer.valueOf(((jf.c) it).nextInt()))).isEmpty()) {
                        z3 = true;
                        break;
                    }
                }
            }
        } finally {
        }
        return z3;
    }

    public void v(String str, String str2) {
        ((HashMap) this.f18638x).put(str, str2);
    }

    public Object w(SSLSocket sSLSocket, Object... objArr) {
        Method p10 = p(sSLSocket.getClass());
        if (p10 != null) {
            try {
                return p10.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException e) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + p10);
                assertionError.initCause(e);
                throw assertionError;
            }
        }
        throw new AssertionError("Method " + ((String) this.f18637w) + " not supported for object " + sSLSocket);
    }

    public void x(SSLSocket sSLSocket, Object... objArr) {
        try {
            Method p10 = p(sSLSocket.getClass());
            if (p10 == null) {
                return;
            }
            try {
                p10.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public boolean y() {
        if (((n2) this.f18636v).getValue() == this.f18638x) {
            i0 i0Var = (i0) this.f18637w;
            if (i0Var == null || !i0Var.y()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // kb.c, com.google.android.gms.internal.ads.i81
    /* renamed from: zza */
    public Object mo207zza() {
        Object mo207zza = ((kb.c) this.f18636v).mo207zza();
        return new jb.e((jb.i) mo207zza, ((jb.f) ((z5.h) this.f18638x).f31922v).f19108a);
    }

    public /* synthetic */ i0(int i, boolean z3) {
        this.f18635u = i;
    }

    public i0(mb.e eVar, ic.c cVar, mb.e eVar2, mb.e eVar3) {
        this.f18635u = 4;
        this.f18636v = eVar;
        this.f18637w = cVar;
        this.f18638x = eVar2;
    }

    public /* synthetic */ i0(int i, Object obj, Object obj2, Object obj3) {
        this.f18635u = i;
        this.f18636v = obj;
        this.f18637w = obj2;
        this.f18638x = obj3;
    }

    public i0(Activity activity) {
        this.f18635u = 15;
        this.f18638x = null;
        this.f18636v = activity;
        this.f18637w = (WindowManager) activity.getSystemService("window");
    }

    public i0(List list) {
        this.f18635u = 17;
        this.f18638x = list;
        this.f18636v = new ArrayList(list.size());
        this.f18637w = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ((ArrayList) this.f18636v).add(new r6.l((List) ((w6.f) list.get(i)).f27731b.f3443v));
            ((ArrayList) this.f18637w).add(((w6.f) list.get(i)).f27732c.b());
        }
    }

    public i0(vd.b bVar, te.g gVar) {
        this.f18635u = 29;
        this.f18636v = bVar;
        this.f18637w = gVar;
        this.f18638x = "firebase-settings.crashlytics.com";
    }

    public i0(HashMap hashMap, String str) {
        this.f18635u = 20;
        this.f18636v = str;
        this.f18637w = hashMap;
        this.f18638x = new HashMap();
    }

    public i0(ic.c cVar) {
        this.f18635u = 8;
        this.f18637w = new Object();
        this.f18636v = cVar;
    }

    public i0(bc.g gVar, hd.e eVar, rd.f fVar, rd.b bVar, Context context, rd.i iVar, ScheduledExecutorService scheduledExecutorService) {
        this.f18635u = 18;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f18636v = linkedHashSet;
        this.f18637w = new rd.k(gVar, eVar, fVar, bVar, context, linkedHashSet, iVar, scheduledExecutorService);
        this.f18638x = scheduledExecutorService;
    }

    public i0(FirebaseMessagingService firebaseMessagingService, ic.c cVar, ExecutorService executorService) {
        this.f18635u = 11;
        this.f18636v = executorService;
        this.f18637w = firebaseMessagingService;
        this.f18638x = cVar;
    }

    public i0(View view) {
        this.f18635u = 16;
        this.f18636v = view;
        this.f18637w = pe.a.c(pe.h.f22691v, new m1(1, this));
        this.f18638x = new k6.i(view);
    }

    public i0(m1.b bVar) {
        this.f18635u = 6;
        this.f18638x = bVar;
        this.f18636v = new ic.c(13, this);
    }

    public i0(Context context, TypedArray typedArray) {
        this.f18635u = 0;
        this.f18636v = context;
        this.f18637w = typedArray;
    }

    public i0(y4.a aVar) {
        this.f18635u = 25;
        this.f18636v = aVar;
        this.f18637w = new ConcurrentHashMap();
        this.f18638x = new ConcurrentHashMap();
    }

    public i0(q2.f0 f0Var, i0 i0Var) {
        this.f18635u = 23;
        this.f18636v = f0Var;
        this.f18637w = i0Var;
        this.f18638x = f0Var.getValue();
    }
}
