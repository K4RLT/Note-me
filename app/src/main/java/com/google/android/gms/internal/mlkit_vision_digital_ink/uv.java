package com.google.android.gms.internal.mlkit_vision_digital_ink;
import g5.q;
import q.b;
import q1.b;

import android.net.Uri;
import com.google.android.gms.internal.ads.i60;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class uv implements ea {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15086a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i60 f15087b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fs f15088c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls f15089d;
    public final /* synthetic */ String e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f15090f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f15091g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ or f15092h;
    public final /* synthetic */ vr i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f15093j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f15094k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ om f15095l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f15096m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f15097n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f15098o;

    public /* synthetic */ uv(i60 i60Var, w9 w9Var, ha haVar, w9 w9Var2, or orVar, fs fsVar, ls lsVar, int i, long j10, String str, vr vrVar, int i10, List list, om omVar) {
        va vaVar = va.f15125v;
        this.f15087b = i60Var;
        this.f15096m = w9Var;
        this.f15098o = haVar;
        this.f15097n = w9Var2;
        this.f15092h = orVar;
        this.f15088c = fsVar;
        this.f15089d = lsVar;
        this.f15090f = i;
        this.f15091g = j10;
        this.e = str;
        this.i = vrVar;
        this.f15093j = i10;
        this.f15094k = list;
        this.f15095l = omVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
    public final ya l(Object obj) {
        Object s2Var;
        int i = this.f15086a;
        Object obj2 = this.f15098o;
        Object obj3 = this.f15097n;
        Object obj4 = this.f15096m;
        switch (i) {
            case 0:
                va vaVar = va.f15125v;
                os osVar = (os) n5.r((w9) obj4);
                ur urVar = (ur) n5.r(vaVar);
                String str = (String) n5.r((ha) obj2);
                Uri uri = (Uri) n5.r((w9) obj3);
                ds v2 = osVar.v();
                or orVar = this.f15092h;
                cx.b("%s: startDownload status %s for %s", "SharedFileManager", v2, orVar.F());
                ds v4 = osVar.v();
                ds dsVar = ds.DOWNLOAD_COMPLETE;
                i60 i60Var = this.f15087b;
                if (v4 == dsVar) {
                    q2 q2Var = (q2) i60Var.f7027f;
                    if (q2Var.c()) {
                        q2Var.a().getClass();
                        g5.q.b();
                        return null;
                    }
                    return vaVar;
                }
                ds v10 = osVar.v();
                ds dsVar2 = ds.DOWNLOAD_IN_PROGRESS;
                fs fsVar = this.f15088c;
                ls lsVar = this.f15089d;
                int i10 = this.f15090f;
                long j10 = this.f15091g;
                String str2 = this.e;
                vr vrVar = this.i;
                int i11 = this.f15093j;
                List list = this.f15094k;
                om omVar = this.f15095l;
                if (v10 == dsVar2) {
                    lw lwVar = (lw) i60Var.f7025c;
                    ((ss) lwVar.B).getClass();
                    ya yaVar = (ya) ((HashMap) lwVar.C).get(uri);
                    if (yaVar == null) {
                        s2Var = j2.f14494u;
                    } else {
                        s2Var = new s2(yaVar);
                    }
                    va m4 = n5.m(s2Var);
                    uv uvVar = new uv(i60Var, fsVar, uri, lsVar, str, i10, j10, str2, orVar, urVar, vrVar, i11, list, omVar);
                    Executor executor = (Executor) i60Var.i;
                    int i12 = g2.f14354a;
                    return n5.q(m4, new r0(q1.b(), 3, uvVar), executor);
                }
                w9 f10 = i60Var.f(lsVar);
                qv qvVar = new qv(i60Var, lsVar, str, orVar, urVar, fsVar, i10, j10, str2, vrVar, i11, list, omVar);
                int i13 = g2.f14354a;
                return n5.q(f10, new r0(q1.b(), 3, qvVar), (Executor) i60Var.i);
            default:
                Uri uri2 = (Uri) obj4;
                String str3 = (String) obj3;
                ur urVar2 = (ur) obj2;
                q2 q2Var2 = (q2) obj;
                boolean c10 = q2Var2.c();
                i60 i60Var2 = this.f15087b;
                fs fsVar2 = this.f15088c;
                if (c10) {
                    i60Var2.b(fsVar2, uri2);
                    return (ya) q2Var2.a();
                }
                ls lsVar2 = this.f15089d;
                w9 f11 = i60Var2.f(lsVar2);
                qv qvVar2 = new qv(i60Var2, lsVar2, this.e, this.f15092h, urVar2, fsVar2, this.f15090f, this.f15091g, str3, this.i, this.f15093j, this.f15094k, this.f15095l);
                int i14 = g2.f14354a;
                return n5.q(f11, new r0(q1.b(), 3, qvVar2), (Executor) i60Var2.i);
        }
    }

    public /* synthetic */ uv(i60 i60Var, fs fsVar, Uri uri, ls lsVar, String str, int i, long j10, String str2, or orVar, ur urVar, vr vrVar, int i10, List list, om omVar) {
        this.f15087b = i60Var;
        this.f15088c = fsVar;
        this.f15096m = uri;
        this.f15089d = lsVar;
        this.e = str;
        this.f15090f = i;
        this.f15091g = j10;
        this.f15097n = str2;
        this.f15092h = orVar;
        this.f15098o = urVar;
        this.i = vrVar;
        this.f15093j = i10;
        this.f15094k = list;
        this.f15095l = omVar;
    }
}
