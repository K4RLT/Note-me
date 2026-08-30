package b1;
import p.e;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1292u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f1293v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1294w;

    public /* synthetic */ a(Object obj, int i, Object obj2) {
        this.f1292u = i;
        this.f1293v = obj;
        this.f1294w = obj2;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        long j10;
        switch (this.f1292u) {
            case 0:
                m mVar = (m) obj;
                synchronized (p.f1387c) {
                    j10 = e;
                    e = 1 + j10;
                }
                return new d(j10, mVar, (df.l) this.f1293v, (df.l) this.f1294w);
            default:
                com.google.android.gms.internal.ads.d dVar = (com.google.android.gms.internal.ads.d) this.f1293v;
                Object obj2 = dVar.f5230v;
                pf.l lVar = (pf.l) this.f1294w;
                synchronized (obj2) {
                    ((ArrayList) dVar.f5231w).remove(lVar);
                }
                return pe.z.f22715a;
        }
    }
}
