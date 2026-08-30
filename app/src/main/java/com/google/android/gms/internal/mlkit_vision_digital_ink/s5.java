package com.google.android.gms.internal.mlkit_vision_digital_ink;
import b2.f1;
import g2.a;
import i0.a;
import ig.q;
import j6.c;
import p8.a;
import pa.f;
import q.x;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.ads.z11;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public final class s5 implements h, da, go, ct, uq, qa {

    /* renamed from: w, reason: collision with root package name */
    public static final r5 f14958w = new Object();

    /* renamed from: x, reason: collision with root package name */
    public static final jm f14959x = new jm(20);

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f14960u;

    /* renamed from: v, reason: collision with root package name */
    public Object f14961v;

    public s5(int i) {
        this.f14960u = i;
        switch (i) {
            case 2:
                return;
            case 6:
                this.f14961v = new c(11);
                return;
            case 22:
                this.f14961v = new s5(6);
                return;
            default:
                oo ooVar = oo.f14756c;
                s5 s5Var = new s5(14, new go[]{jm.f14515y, f14959x});
                Charset charset = vn.f15137a;
                this.f14961v = s5Var;
                return;
        }
    }

    public static void j(String str, q5 q5Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(q5Var.f14838b / 1000000)));
        sb2.append(": logging error [");
        z5 z5Var = q5Var.f14840d;
        if (z5Var != null) {
            tl.h(1, z5Var, sb2);
            sb2.append("]: ");
            sb2.append(str);
            System.err.println(sb2);
            System.err.flush();
            return;
        }
        x.o("cannot request log site information prior to postProcess()");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.go
    public qo a(Class cls) {
        for (int i = 0; i < 2; i++) {
            go goVar = ((go[]) this.f14961v)[i];
            if (goVar.b(cls)) {
                return goVar.a(cls);
            }
        }
        androidx.datastore.preferences.protobuf.s1.k("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.go
    public boolean b(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((go[]) this.f14961v)[i].b(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.uq
    public Object c() {
        switch (this.f14960u) {
            case 17:
                Context context = ((ew) this.f14961v).f14283a;
                f(context);
                return context;
            case 18:
                return ((f1) this.f14961v).c();
            default:
                return ((com.google.android.gms.internal.ads.hb) this.f14961v).c();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.h
    public Object d(g gVar) {
        g0 g0Var;
        f fVar = null;
        switch (this.f14960u) {
            case 2:
                OutputStream l10 = gVar.f14346b.l(gVar.f14349f);
                ArrayList arrayList = new ArrayList();
                arrayList.add(l10);
                ArrayList arrayList2 = gVar.f14348d;
                if (!arrayList2.isEmpty()) {
                    Uri uri = gVar.e;
                    int i = f.f14287v;
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        kx kxVar = (kx) obj;
                        synchronized (kxVar.f14578b) {
                            g0Var = (g0) kxVar.f14580d.get(uri);
                        }
                        if (g0Var != null) {
                            arrayList3.add(g0Var);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        fVar = new f(l10, arrayList3);
                    }
                    if (fVar != null) {
                        arrayList.add(fVar);
                    }
                }
                e4 listIterator = gVar.f14347c.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList.add(new DeflaterOutputStream((OutputStream) gn.o(arrayList)));
                }
                Collections.reverse(arrayList);
                z11[] z11VarArr = (z11[]) this.f14961v;
                if (z11VarArr != null) {
                    z11 z11Var = z11VarArr[0];
                    z11Var.getClass();
                    OutputStream outputStream = (OutputStream) gn.o(arrayList);
                    if (outputStream instanceof a0) {
                        z11Var.f13047w = (a0) outputStream;
                        z11Var.f13046v = (OutputStream) arrayList.get(0);
                    }
                }
                return (OutputStream) arrayList.get(0);
            default:
                Uri uri2 = (Uri) this.f14961v;
                i iVar = gVar.f14345a;
                try {
                    i0 a10 = a();
                    a10.f14451u = true;
                    ZipInputStream zipInputStream = new ZipInputStream(a10.d(gVar));
                    while (true) {
                        try {
                            ZipEntry nextEntry = zipInputStream.getNextEntry();
                            if (nextEntry != null) {
                                String name = nextEntry.getName();
                                if (name.contains("..")) {
                                    for (File file = new File(name); file != null; file = file.getParentFile()) {
                                        if (file.getName().equals("..")) {
                                            throw new ZipException("Illegal name: ".concat(name));
                                        }
                                    }
                                }
                                Uri build = uri2.buildUpon().appendPath(name).build();
                                if (nextEntry.isDirectory()) {
                                    iVar.j(build.getScheme()).j(build.buildUpon().fragment(null).build());
                                } else {
                                    OutputStream outputStream2 = (OutputStream) iVar.c(build, new s5(2));
                                    try {
                                        a(zipInputStream, outputStream2);
                                        outputStream2.close();
                                    } finally {
                                    }
                                }
                            } else {
                                zipInputStream.close();
                                return null;
                            }
                        } finally {
                        }
                    }
                } catch (IOException e) {
                    iVar.f(uri2);
                    throw e;
                }
        }
    }

    public Context e() {
        Context context = ((ew) this.f14961v).f14283a;
        f(context);
        return context;
    }

    public p5 f(Level level) {
        cp cpVar = (cp) this.f14961v;
        boolean i = cpVar.i(level);
        String str = (String) cpVar.f14164a;
        ((g7) b7.f14067a).getClass();
        l7.f14597b.c(str, level, i);
        if (!i) {
            return f14958w;
        }
        return new q5(this, level);
    }

    public lr g() {
        return (lr) ((z2) this.f14961v).zza();
    }

    public Iterator h(w2 w2Var, CharSequence charSequence) {
        switch (this.f14960u) {
            case 7:
                return new v2(w2Var, charSequence, (String) this.f14961v, 1);
            default:
                return new v2(w2Var, charSequence, (k2) this.f14961v, 0);
        }
    }

    public ya i(da daVar, Executor executor) {
        return ((c) ((s5) this.f14961v).f14961v).p(a(daVar), executor);
    }

    public void k(int i, Object obj, ro roVar) {
        ym ymVar = (ym) this.f14961v;
        ymVar.w(i, 3);
        roVar.f((km) obj, this);
        ymVar.w(i, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ct
    public r8 l(Object obj) {
        return (r8) this.f14961v;
    }

    public void m(int i, Object obj, ro roVar) {
        ym ymVar = (ym) this.f14961v;
        km kmVar = (km) obj;
        ymVar.w(i, 2);
        ymVar.y(kmVar.b(roVar));
        roVar.f(kmVar, this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.qa
    public /* bridge */ /* synthetic */ void r(Object obj) {
        cx.c("%s: Successfully incremented LoggingStateStore network usage for %s", "NetworkUsageMonitor", ((yr) ((u0) this.f14961v).f15038x).y().w());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.qa
    public void t(Throwable th) {
        cx.j(th, "%s: Unable to increment LoggingStateStore network usage for %s", "NetworkUsageMonitor", ((yr) ((u0) this.f14961v).f15038x).y().w());
    }

    public String toString() {
        switch (this.f14960u) {
            case 9:
                return ((com.google.android.gms.internal.ads.xe) this.f14961v).toString();
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.da
    public ya zza() {
        switch (this.f14960u) {
            case 5:
                return (n9) this.f14961v;
            default:
                return n5.m(((com.google.android.gms.internal.ads.xe) this.f14961v).call());
        }
    }

    public /* synthetic */ s5(int i, Object obj) {
        this.f14960u = i;
        this.f14961v = obj;
    }

    public s5(lf lfVar) {
        this.f14960u = 10;
        this.f14961v = lfVar;
        jm.h();
    }

    public s5(ym ymVar) {
        this.f14960u = 13;
        Charset charset = vn.f15137a;
        this.f14961v = ymVar;
        ymVar.f15286a = this;
    }

    public s5(ss ssVar) {
        this.f14960u = 16;
        this.f14961v = gn.b(new jv(0, ssVar));
    }

    public s5(q qVar) {
        this.f14960u = 12;
        this.f14961v = new ir(qVar);
    }

    public s5(c cVar, com.google.android.gms.internal.ads.xe xeVar) {
        this.f14960u = 9;
        this.f14961v = xeVar;
        Objects.requireNonNull(cVar);
    }
}
