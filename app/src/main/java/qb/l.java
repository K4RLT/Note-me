package qb;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IInterface;
import android.util.Log;
import c7.a0;
import com.google.android.gms.internal.ads.pu1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import ya.af;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final za.c f23647a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f23648b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23649c;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23651f;

    /* renamed from: g, reason: collision with root package name */
    public final Intent f23652g;

    /* renamed from: h, reason: collision with root package name */
    public final j f23653h;

    /* renamed from: j, reason: collision with root package name */
    public a0 f23654j;

    /* renamed from: k, reason: collision with root package name */
    public IInterface f23655k;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f23650d = new ArrayList();
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final kb.j i = new kb.j(2, this);

    public l(Context context, String str, Intent intent, j jVar) {
        this.f23648b = context;
        this.f23649c = str;
        this.f23652g = intent;
        this.f23653h = jVar;
        this.f23647a = af.a(new c4.s(str, 6));
    }

    public final void a(Runnable runnable) {
        c(new pu1(this, 24, runnable));
    }

    public final void b() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.getClass();
            Log.i("HsdpClientImpl", "HSDP bound service disconnected");
            ((Handler) dVar.f23627b.f23647a.zza()).post(new t(0, dVar));
        }
    }

    public final void c(Runnable runnable) {
        ((Handler) this.f23647a.zza()).post(new jc.j(3, runnable));
    }
}
