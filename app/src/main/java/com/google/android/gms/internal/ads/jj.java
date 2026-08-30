package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.os.SystemClock;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class jj {

    /* renamed from: a, reason: collision with root package name */
    public final mf f7450a;

    /* renamed from: b, reason: collision with root package name */
    public final fl f7451b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7452c;

    public jj(mf mfVar) {
        this.f7451b = gl.K();
        this.f7450a = mfVar;
        this.f7452c = ((Boolean) g9.r.e.f17698c.a(sl.f10665b6)).booleanValue();
    }

    public final synchronized void a(ij ijVar) {
        if (this.f7452c) {
            try {
                ijVar.a(this.f7451b);
            } catch (NullPointerException e) {
                f9.k.C.f16817h.d("AdMobClearcutLogger.modify", e);
            }
        }
    }

    public final synchronized void b(int i) {
        if (!this.f7452c) {
            return;
        }
        if (((Boolean) g9.r.e.f17698c.a(sl.f10681c6)).booleanValue()) {
            d(i);
        } else {
            c(i);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.internal.ads.nb, java.lang.Object] */
    public final synchronized void c(int i) {
        fl flVar = this.f7451b;
        flVar.b();
        ((gl) flVar.f4845v).E();
        ArrayList H = k9.f0.H();
        flVar.b();
        ((gl) flVar.f4845v).D(H);
        byte[] b10 = ((gl) flVar.c()).b();
        mf mfVar = this.f7450a;
        Object obj = new Object();
        Objects.requireNonNull(mfVar);
        obj.f8636w = mfVar;
        obj.f8635v = b10;
        int i10 = i - 1;
        obj.f8634u = i10;
        synchronized (obj) {
            ((ExecutorService) ((mf) obj.f8636w).f8338w).execute(new f(11, obj));
        }
        k9.a0.k("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i10, 10))));
    }

    public final synchronized void d(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(new File(externalStorageDirectory, "clearcut_events.txt").getPath()), true);
            try {
                try {
                    fileOutputStream.write(e(i).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        k9.a0.k("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    k9.a0.k("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        k9.a0.k("Could not close Clearcut output stream.");
                    }
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                    k9.a0.k("Could not close Clearcut output stream.");
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            k9.a0.k("Could not find file for Clearcut");
        }
    }

    public final synchronized String e(int i) {
        StringBuilder sb2;
        fl flVar = this.f7451b;
        String J = ((gl) flVar.f4845v).J();
        f9.k.C.f16819k.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String encodeToString = Base64.encodeToString(((gl) flVar.c()).b(), 3);
        sb2 = new StringBuilder("id=");
        sb2.append(J);
        sb2.append(",timestamp=");
        sb2.append(elapsedRealtime);
        sb2.append(",event=");
        sb2.append(i - 1);
        sb2.append(",data=");
        sb2.append(encodeToString);
        sb2.append("\n");
        return sb2.toString();
    }

    public jj() {
        this.f7451b = gl.K();
        this.f7452c = false;
        this.f7450a = new mf(3);
    }
}
