package ya;
import b9.a;
import c7.t;
import de.c;
import de.e;
import de.k;
import de.m;
import fa.j;
import ib.o;
import pa.d;
import va.o;
import wa.xa;

import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class pf {

    /* renamed from: k, reason: collision with root package name */
    public static m f31434k;

    /* renamed from: l, reason: collision with root package name */
    public static final xa f31435l;

    /* renamed from: a, reason: collision with root package name */
    public final String f31436a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31437b;

    /* renamed from: c, reason: collision with root package name */
    public final nf f31438c;

    /* renamed from: d, reason: collision with root package name */
    public final k f31439d;
    public final o e;

    /* renamed from: f, reason: collision with root package name */
    public final o f31440f;

    /* renamed from: g, reason: collision with root package name */
    public final String f31441g;

    /* renamed from: h, reason: collision with root package name */
    public final int f31442h;
    public final HashMap i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f31443j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f31435l = new xa(objArr, 1);
    }

    public pf(Context context, k kVar, nf nfVar) {
        int i;
        this.f31436a = context.getPackageName();
        this.f31437b = c.a(context);
        this.f31439d = kVar;
        this.f31438c = nfVar;
        rf.b();
        this.f31441g = "subject-segmentation";
        e a10 = e.a();
        t tVar = new t(8, this);
        a10.getClass();
        this.e = e.b(tVar);
        e a11 = e.a();
        kVar.getClass();
        o oVar = new o(kVar, 2);
        a11.getClass();
        this.f31440f = e.b(oVar);
        xa xaVar = f31435l;
        if (xaVar.containsKey("subject-segmentation")) {
            i = d.d(context, (String) xaVar.get("subject-segmentation"), false);
        } else {
            i = -1;
        }
        this.f31442h = i;
    }

    public static long a(ArrayList arrayList, double d2) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d2 / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void b(of ofVar, bb bbVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!d(bbVar, elapsedRealtime)) {
            return;
        }
        this.i.put(bbVar, Long.valueOf(elapsedRealtime));
        m.f15854u.execute(new a(this, ofVar.zza(), bbVar, c()));
    }

    public final String c() {
        o oVar = this.e;
        if (oVar.l()) {
            return (String) oVar.j();
        }
        return j.f16877c.a(this.f31441g);
    }

    public final boolean d(bb bbVar, long j10) {
        HashMap hashMap = this.i;
        if (hashMap.get(bbVar) == null || j10 - ((Long) hashMap.get(bbVar)).longValue() > 30000) {
            return true;
        }
        return false;
    }
}
