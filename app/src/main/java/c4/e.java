package c4;
import p.a;

import android.os.Build;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public final class e extends wa.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f3829a;

    public e(f fVar) {
        this.f3829a = fVar;
    }

    @Override // wa.r
    public final void a(Throwable th) {
        ((k) this.f3829a.f3832c).f(th);
    }

    @Override // wa.r
    public final void b(j6.n nVar) {
        Set<int[]> a10;
        f fVar = this.f3829a;
        fVar.f3831b = nVar;
        j6.n nVar2 = (j6.n) fVar.f3831b;
        k kVar = (k) fVar.f3832c;
        de.b bVar = kVar.f3846g;
        d dVar = kVar.i;
        if (Build.VERSION.SDK_INT >= 34) {
            a10 = a();
        } else {
            a10 = wa.a();
        }
        fVar.f3830a = new ra.e(nVar2, bVar, dVar, a10);
        k kVar2 = (k) fVar.f3832c;
        ArrayList arrayList = new ArrayList();
        kVar2.f3841a.writeLock().lock();
        try {
            kVar2.f3843c = 1;
            arrayList.addAll(kVar2.f3842b);
            kVar2.f3842b.clear();
            kVar2.f3841a.writeLock().unlock();
            kVar2.f3844d.post(new i(arrayList, kVar2.f3843c, (Throwable) null));
        } catch (Throwable th) {
            kVar2.f3841a.writeLock().unlock();
            throw th;
        }
    }
}
