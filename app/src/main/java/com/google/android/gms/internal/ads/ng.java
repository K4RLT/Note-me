package com.google.android.gms.internal.ads;
import fg.a;
import g9.r;
import ng.a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class ng extends wg {

    /* renamed from: k, reason: collision with root package name */
    public static final lx0 f8710k = new lx0(7);

    /* renamed from: h, reason: collision with root package name */
    public final sd f8711h;
    public final Context i;

    /* renamed from: j, reason: collision with root package name */
    public final hq0 f8712j;

    public ng(dg dgVar, wd wdVar, int i, Context context, sd sdVar, hq0 hq0Var) {
        super(dgVar, "Y4Si1UCd8xFA1yCw6ohazV+GUSwhVa9ffV9ZnN++nWMAkqLsgU7cmmd4wBpbGVgj", "1k+Az7ZOHMkdpE7lGA2cF/gUEsamDqjjLqQDV0dmR3A=", wdVar, i, 27);
        this.i = context;
        this.f8711h = sdVar;
        this.f8712j = hq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:4:0x000d, B:6:0x0017, B:8:0x001d, B:13:0x0029, B:15:0x0033, B:18:0x00eb, B:19:0x00f1, B:35:0x0041, B:37:0x0047, B:38:0x00e8, B:39:0x004d, B:41:0x0075, B:42:0x007b, B:44:0x0081, B:47:0x0089, B:52:0x0095, B:54:0x009b, B:57:0x00a6, B:58:0x00ad, B:59:0x00ab, B:60:0x00b0, B:62:0x00b6, B:64:0x00bc, B:68:0x00a0, B:71:0x00c3, B:73:0x00d8, B:76:0x00e1), top: B:3:0x000d }] */
    @Override // com.google.android.gms.internal.ads.wg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a():void");
    }

    public final String b() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            nl nlVar = sl.f10851n3;
            r rVar = r.e;
            byte[] a10 = a((String) rVar.f17698c.a(nlVar));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(a10)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(a((String) rVar.f17698c.a(sl.f10868o3)))));
            }
            Context context = this.i;
            String packageName = context.getPackageName();
            ExecutorService executorService = this.f12232a.f5419b;
            return ct.e(context, packageName, arrayList);
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }

    public final ve c() {
        int A;
        String str;
        h91 h91Var;
        nl nlVar = sl.A3;
        r rVar = r.e;
        ql qlVar = rVar.f17698c;
        ql qlVar2 = rVar.f17698c;
        int intValue = ((Integer) qlVar.a(nlVar)).intValue();
        sd sdVar = this.f8711h;
        if (intValue > 0 && ((Integer) qlVar2.a(nlVar)).intValue() < sdVar.A()) {
            A = ((Integer) qlVar2.a(nlVar)).intValue();
        } else {
            A = sdVar.A();
        }
        ve veVar = new ve((String) this.e.invoke(null, this.i, Boolean.FALSE, ""));
        hq0 hq0Var = this.f8712j;
        if (hq0Var != null && (h91Var = (h91) hq0Var.f6872v) != null) {
            try {
                str = (String) h91Var.get(A, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
            veVar.O = str;
            return veVar;
        }
        str = "E";
        veVar.O = str;
        return veVar;
    }
}
