package w7;
import d.i;
import r0.a1;
import u6.a;

import android.content.Context;
import android.os.Build;
import android.util.LruCache;

/* loaded from: classes.dex */
public final class a6 extends ve.i implements df.p {
    public final /* synthetic */ a1 A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f27873u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ pf.z f27874v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f27875w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1 f27876x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b1.v f27877y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ LruCache f27878z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(Context context, pf.z zVar, i iVar, a1 a1Var, b1.v vVar, LruCache lruCache, a1 a1Var2, te.c cVar) {
        super(2, cVar);
        this.f27873u = context;
        this.f27874v = zVar;
        this.f27875w = iVar;
        this.f27876x = a1Var;
        this.f27877y = vVar;
        this.f27878z = lruCache;
        this.A = a1Var2;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new a6(this.f27873u, this.f27874v, this.f27875w, this.f27876x, this.f27877y, this.f27878z, this.A, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        a6 a6Var = (a6) create((pf.z) obj, (te.c) obj2);
        pe.z zVar = pe.z.f22715a;
        a6Var.invokeSuspend(zVar);
        return zVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        String str;
        pe.a.e(obj);
        a1 a1Var = this.f27876x;
        boolean booleanValue = ((Boolean) a1Var.getValue()).booleanValue();
        pe.z zVar = pe.z.f22715a;
        if (booleanValue) {
            return zVar;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            str = "android.permission.READ_MEDIA_IMAGES";
        } else {
            str = "android.permission.READ_EXTERNAL_STORAGE";
        }
        if (wa.a(this.f27873u, str) == 0) {
            a1Var.setValue(Boolean.TRUE);
            pf.b0.x(this.f27874v, null, new z5(this.f27877y, this.f27873u, this.f27878z, this.A, null, 0), 3);
            return zVar;
        }
        this.f27875w.a(str);
        return zVar;
    }
}
