package com.google.android.gms.internal.ads;
import a1.d;
import a1.s;
import a9.d;
import ba.p;
import ca.f;
import df.l;
import df.p;
import e4.a;
import e4.e;
import f9.k;
import fa.y;
import g9.y1;
import ib.c;
import ib.h;
import ib.i;
import ib.o;
import ic.c;
import j.a;
import j6.s;
import k6.i;
import k9.a0;
import k9.b0;
import k9.f0;
import k9.m;
import k9.u;
import l9.c;
import l9.k;
import lb.i1;
import lb.v;
import mb.e;
import mb.f;
import o2.d;
import ra.e;
import ra.g;
import t0.e;
import vb.h;
import y9.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import com.daren.scraply.R;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class x90 implements s, zx, n80, s81, af1, com.google.android.gms.internal.mlkit_vision_digital_ink.qa, c, f, d, a, c {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f12501u;

    /* renamed from: v, reason: collision with root package name */
    public Object f12502v;

    /* renamed from: w, reason: collision with root package name */
    public Object f12503w;

    public x90(Context context, int i) {
        e eVar;
        Context applicationContext;
        this.f12501u = i;
        switch (i) {
            case 15:
                y.h(context);
                Resources resources = context.getResources();
                this.f12502v = resources;
                this.f12503w = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                return;
            case 19:
                this.f12502v = new g(context, f.f4036b);
                synchronized (e.class) {
                    try {
                        if (e.f24673y == null) {
                            e.f24673y = new e(context.getApplicationContext());
                        }
                        eVar = e.f24673y;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f12503w = eVar;
                return;
            default:
                if (context == null) {
                    applicationContext = null;
                } else {
                    applicationContext = context.getApplicationContext();
                }
                this.f12502v = applicationContext;
                return;
        }
    }

    @Override // a
    public o a() {
        o a10 = ((g) this.f12502v).a();
        i iVar = new i(25, this);
        a10.getClass();
        return a10.h(i.f18364a, iVar);
    }

    @Override // f
    public Object b() {
        int i = 9;
        return new i1((v) ((e) this.f12502v).b(), new e(new i(i, (c) this.f12503w)));
    }

    @Override // s
    public Object c(Object obj) {
        return ((l) this.f12503w).invoke(obj);
    }

    @Override // s
    public Object d(d dVar, Object obj) {
        return ((p) this.f12502v).invoke(dVar, obj);
    }

    @Override // com.google.android.gms.internal.ads.af1
    public byte[] e(byte[] bArr, int i) {
        if (bArr.length <= 64) {
            return ((bf1) this.f12502v).e(bArr, i);
        }
        return ((s) this.f12503w).e(bArr, i);
    }

    @Override // c
    public void f(o oVar) {
        h hVar = (h) this.f12502v;
        h hVar2 = (h) this.f12503w;
        synchronized (hVar.f27525f) {
            hVar.e.remove(hVar2);
        }
    }

    @Override // d
    public int g(int i) {
        CharSequence charSequence = (CharSequence) this.f12502v;
        do {
            i = ((l3) this.f12503w).j(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // d
    public int h(int i) {
        do {
            i = ((l3) this.f12503w).m(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f12502v).charAt(i - 1)));
        return i;
    }

    @Override // d
    public int i(int i) {
        do {
            i = ((l3) this.f12503w).m(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f12502v).charAt(i)));
        return i;
    }

    @Override // d
    public int j(int i) {
        do {
            i = ((l3) this.f12503w).j(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f12502v).charAt(i - 1)));
        return i;
    }

    public String k(String str) {
        String str2 = (String) this.f12503w;
        Resources resources = (Resources) this.f12502v;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override // com.google.android.gms.internal.ads.n80, com.google.android.gms.internal.ads.ie0
    /* renamed from: l */
    public /* synthetic */ void mo205l(Object obj) {
        ((d) obj).p((String) this.f12502v, (String) this.f12503w);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x018b, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x012e, code lost:
    
        ((com.google.android.gms.internal.measurement.c5) r8.D).getClass();
        r2 = r2.query(com.google.android.gms.internal.measurement.x3.f13964a, null, null, new java.lang.String[]{r1}, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0142, code lost:
    
        if (r2 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0148, code lost:
    
        if (r2.moveToFirst() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014a, code lost:
    
        r3 = r2.getString(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014e, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0159, code lost:
    
        if (r3 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015f, code lost:
    
        if (r3.equals(null) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0161, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0162, code lost:
    
        monitor-enter(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0165, code lost:
    
        if (r0 != r8.B) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0167, code lost:
    
        ((java.util.HashMap) r8.f4806w).put(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0171, code lost:
    
        monitor-exit(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0172, code lost:
    
        if (r3 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0174, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0175, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x016f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0177, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0155, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0158, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017f, code lost:
    
        throw new java.lang.Exception("Failed to connect to GservicesProvider");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0152, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0180, code lost:
    
        if (r2 != null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0182, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0186, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0187, code lost:
    
        r0.addSuppressed(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x018a, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m() {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x90.m():java.lang.Object");
    }

    @Override // c
    public k o(String str) {
        b0 b0Var = f0.f19676l;
        f0 f0Var = k.C.f16813c;
        new u((Context) this.f12502v, (String) this.f12503w, str, null).r();
        return k.f20054u;
    }

    @Override // com.google.android.gms.internal.ads.s81
    /* renamed from: r */
    public void mo202r(Object obj) {
        switch (this.f12501u) {
            case 7:
                String str = (String) obj;
                try {
                    bv bvVar = (bv) this.f12503w;
                    uu uuVar = (uu) this.f12502v;
                    Parcel g22 = bvVar.g2();
                    g22.writeString(str);
                    qh.c(g22, uuVar);
                    bvVar.v2(g22, 1);
                    return;
                } catch (RemoteException e) {
                    a0.l("Service can't call client", e);
                    return;
                }
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.s81
    public void t(Throwable th) {
        String message;
        switch (this.f12501u) {
            case 7:
                try {
                    bv bvVar = (bv) this.f12503w;
                    y1 g8 = x21.g(th);
                    if (xy.y(th.getMessage())) {
                        message = g8.f17715v;
                    } else {
                        message = th.getMessage();
                    }
                    m mVar = new m(message, g8.f17714u);
                    Parcel g22 = bvVar.g2();
                    qh.c(g22, mVar);
                    bvVar.v2(g22, 2);
                    return;
                } catch (RemoteException e) {
                    a0.l("Service can't call client", e);
                    return;
                }
            default:
                e eVar = ((com.google.android.gms.internal.mlkit_vision_digital_ink.dt) this.f12503w).f14217f;
                String str = ((com.google.android.gms.internal.mlkit_vision_digital_ink.ht) this.f12502v).f14438a;
                eVar.getClass();
                com.google.android.gms.internal.mlkit_vision_digital_ink.cx.l("%s: submitting request to remove in-progress download future with key: %s", str);
                ((com.google.android.gms.internal.mlkit_vision_digital_ink.s5) eVar.f24675v).i(new s(eVar, 12, str), (Executor) eVar.f24676w);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zx
    /* renamed from: zza */
    public void mo212zza() {
        a0.k("callJs > getEngine: Promise rejected");
        ((yx) this.f12502v).c(new p("Unable to obtain a JavascriptEngine.", 1));
        ((br) this.f12503w).l();
    }

    public /* synthetic */ x90(Object obj, int i, Object obj2) {
        this.f12501u = i;
        this.f12502v = obj;
        this.f12503w = obj2;
    }

    public x90(br brVar, lr lrVar, yx yxVar) {
        this.f12501u = 4;
        this.f12502v = yxVar;
        this.f12503w = brVar;
    }

    public x90(eh0 eh0Var, bv bvVar, uu uuVar) {
        this.f12501u = 7;
        this.f12503w = bvVar;
        this.f12502v = uuVar;
    }

    public x90(y51 y51Var, int[] iArr) {
        this.f12501u = 9;
        this.f12502v = d51.u(y51Var);
        this.f12503w = iArr;
    }

    public /* synthetic */ x90(int i, Object obj, Object obj2, boolean z3) {
        this.f12501u = i;
        this.f12503w = obj;
        this.f12502v = obj2;
    }

    public x90(int i) {
        this.f12501u = i;
        switch (i) {
            case 12:
                return;
            default:
                this.f12502v = new e(new Reference[16]);
                this.f12503w = new ReferenceQueue();
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.text.Editable$Factory, a] */
    public x90(a aVar) {
        this.f12501u = 14;
        this.f12502v = aVar;
        e eVar = new e(aVar);
        this.f12503w = eVar;
        aVar.addTextChangedListener(eVar);
        if (a.f15902b == null) {
            synchronized (a.f15901a) {
                try {
                    if (a.f15902b == null) {
                        Editable.Factory factory = new Editable.Factory();
                        try {
                            a.f15903c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        a.f15902b = factory;
                    }
                } finally {
                }
            }
        }
        aVar.setEditableFactory(a.f15902b);
    }
}