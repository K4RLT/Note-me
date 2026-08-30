package wa;
import j.i0;
import k8.a;
import k8.c;
import k8.d;
import l4.a;
import l8.a;
import n8.o;
import n8.p;
import n8.q;
import na.b;
import va.q;
import wa.ha;

import android.content.Context;
import com.google.android.gms.internal.ads.hb;
import com.google.android.gms.internal.ads.z11;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class ka implements ha {

    /* renamed from: a, reason: collision with root package name */
    public final ic.n f29724a;

    /* renamed from: b, reason: collision with root package name */
    public final ga f29725b;

    public ka(Context context, ga gaVar) {
        this.f29725b = gaVar;
        a aVar = a.e;
        q.b(context);
        o c10 = q.a().c(aVar);
        if (a.f20019d.contains(new c("json"))) {
            new ic.n(new q(c10, 2));
        }
        this.f29724a = new ic.n(new q(c10, 3));
    }

    @Override // ha
    public final void a(z11 z11Var) {
        f fVar;
        zc.d dVar;
        p pVar = (p) this.f29724a.get();
        na naVar = na.f29766w;
        i0 i0Var = (i0) z11Var.f13046v;
        ((hb) z11Var.f13047w).C = false;
        hb hbVar = (hb) z11Var.f13047w;
        hbVar.A = Boolean.FALSE;
        i0Var.f18636v = new j9(hbVar);
        try {
            b();
            i7 i7Var = new i7(i0Var);
            i0 i0Var2 = new i0(27);
            naVar.a(i0Var2);
            HashMap hashMap = new HashMap((HashMap) i0Var2.f18636v);
            HashMap hashMap2 = new HashMap((HashMap) i0Var2.f18637w);
            e eVar = (e) i0Var2.f18638x;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar);
                dVar = (zc.d) hashMap.get(i7.class);
            } catch (IOException unused) {
            }
            if (dVar != null) {
                dVar.a(i7Var, fVar);
                pVar.a(new a(byteArrayOutputStream.toByteArray(), d.f19627v, null), new a(17));
                return;
            }
            throw new RuntimeException("No encoder for ".concat(String.valueOf(i7.class)));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
