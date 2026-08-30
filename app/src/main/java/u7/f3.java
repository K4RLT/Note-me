package u7;

import android.content.Context;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class f3 extends ve.i implements df.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ Context B;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Bitmap f26172u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int[] f26173v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f26174w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f26175x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m3 f26176y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f26177z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(Bitmap bitmap, int[] iArr, int i, int i10, m3 m3Var, int i11, int i12, Context context, te.c cVar) {
        super(2, cVar);
        this.f26172u = bitmap;
        this.f26173v = iArr;
        this.f26174w = i;
        this.f26175x = i10;
        this.f26176y = m3Var;
        this.f26177z = i11;
        this.A = i12;
        this.B = context;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new f3(this.f26172u, this.f26173v, this.f26174w, this.f26175x, this.f26176y, this.f26177z, this.A, this.B, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        f3 f3Var = (f3) create((pf.z) obj, (te.c) obj2);
        pe.z zVar = pe.z.f22715a;
        f3Var.invokeSuspend(zVar);
        return zVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        pe.a.e(obj);
        Bitmap bitmap = this.f26172u;
        int[] iArr = this.f26173v;
        int i = this.f26174w;
        bitmap.setPixels(iArr, 0, i, 0, 0, i, this.f26175x);
        this.f26176y.H(this.f26177z, this.A);
        this.f26176y.f26546t = true;
        m3 m3Var = this.f26176y;
        int i10 = this.f26177z;
        int i11 = this.A;
        m3Var.H0(i10, i11, m3Var.k(i10, i11), this.B);
        return pe.z.f22715a;
    }
}
