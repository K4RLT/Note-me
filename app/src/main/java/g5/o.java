package g5;

import com.google.android.gms.internal.ads.iw0;

/* loaded from: classes.dex */
public final class o extends iw0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f17495c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, int i) {
        super(i, 1);
        this.f17495c = pVar;
    }

    @Override // com.google.android.gms.internal.ads.iw0
    public final void c(r5.c cVar) {
        this.f17495c.c(new s5.a(cVar));
    }

    @Override // com.google.android.gms.internal.ads.iw0
    public final void d(r5.c cVar, int i, int i10) {
        f(cVar, i, i10);
    }

    @Override // com.google.android.gms.internal.ads.iw0
    public final void e(r5.c cVar) {
        s5.a aVar = new s5.a(cVar);
        p pVar = this.f17495c;
        pVar.e(aVar);
        pVar.f17512h = cVar;
    }

    @Override // com.google.android.gms.internal.ads.iw0
    public final void f(r5.c cVar, int i, int i10) {
        this.f17495c.d(new s5.a(cVar), i, i10);
    }
}
