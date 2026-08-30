package v7;
import k.a;

import android.content.Context;
import b1.y;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final u.c f27440a;

    /* renamed from: f, reason: collision with root package name */
    public l f27444f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f27445g;

    /* renamed from: h, reason: collision with root package name */
    public int f27446h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f27447j;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f27441b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f27442c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final y f27443d = new y();
    public final y e = new y();

    /* renamed from: k, reason: collision with root package name */
    public final int f27448k = 200;

    /* renamed from: l, reason: collision with root package name */
    public final long f27449l = Math.min(167772160L, Runtime.getRuntime().maxMemory() / 3);

    public k(u.c cVar) {
        this.f27440a = cVar;
    }

    public static final void h(HashMap hashMap, Map map) {
        for (Map.Entry entry : hashMap.entrySet()) {
            pe.j jVar = (pe.j) entry.getKey();
            qe.j jVar2 = (qe.j) entry.getValue();
            int i = 0;
            while (i < jVar2.a()) {
                l lVar = (l) jVar2.get(i);
                if (lVar.c() > 0) {
                    jVar2.b(i);
                    lVar.d();
                } else {
                    i++;
                }
            }
            map.put(jVar, Integer.valueOf(jVar2.a()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8 A[Catch: all -> 0x005b, TryCatch #1 {all -> 0x005b, blocks: (B:13:0x0049, B:16:0x0057, B:17:0x005f, B:19:0x0063, B:23:0x006b, B:25:0x006f, B:34:0x00a4, B:36:0x00a8, B:38:0x00ae, B:40:0x00c0, B:49:0x010d, B:51:0x0113, B:52:0x011b, B:55:0x0128, B:57:0x0138, B:59:0x013f, B:62:0x014f, B:67:0x0153, B:74:0x007d, B:76:0x0086, B:78:0x008a, B:79:0x008d, B:81:0x0094, B:83:0x0098, B:84:0x009b), top: B:12:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0113 A[Catch: all -> 0x005b, TryCatch #1 {all -> 0x005b, blocks: (B:13:0x0049, B:16:0x0057, B:17:0x005f, B:19:0x0063, B:23:0x006b, B:25:0x006f, B:34:0x00a4, B:36:0x00a8, B:38:0x00ae, B:40:0x00c0, B:49:0x010d, B:51:0x0113, B:52:0x011b, B:55:0x0128, B:57:0x0138, B:59:0x013f, B:62:0x014f, B:67:0x0153, B:74:0x007d, B:76:0x0086, B:78:0x008a, B:79:0x008d, B:81:0x0094, B:83:0x0098, B:84:0x009b), top: B:12:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0138 A[Catch: all -> 0x005b, TryCatch #1 {all -> 0x005b, blocks: (B:13:0x0049, B:16:0x0057, B:17:0x005f, B:19:0x0063, B:23:0x006b, B:25:0x006f, B:34:0x00a4, B:36:0x00a8, B:38:0x00ae, B:40:0x00c0, B:49:0x010d, B:51:0x0113, B:52:0x011b, B:55:0x0128, B:57:0x0138, B:59:0x013f, B:62:0x014f, B:67:0x0153, B:74:0x007d, B:76:0x0086, B:78:0x008a, B:79:0x008d, B:81:0x0094, B:83:0x0098, B:84:0x009b), top: B:12:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0086 A[Catch: all -> 0x005b, TryCatch #1 {all -> 0x005b, blocks: (B:13:0x0049, B:16:0x0057, B:17:0x005f, B:19:0x0063, B:23:0x006b, B:25:0x006f, B:34:0x00a4, B:36:0x00a8, B:38:0x00ae, B:40:0x00c0, B:49:0x010d, B:51:0x0113, B:52:0x011b, B:55:0x0128, B:57:0x0138, B:59:0x013f, B:62:0x014f, B:67:0x0153, B:74:0x007d, B:76:0x0086, B:78:0x008a, B:79:0x008d, B:81:0x0094, B:83:0x0098, B:84:0x009b), top: B:12:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0094 A[Catch: all -> 0x005b, TryCatch #1 {all -> 0x005b, blocks: (B:13:0x0049, B:16:0x0057, B:17:0x005f, B:19:0x0063, B:23:0x006b, B:25:0x006f, B:34:0x00a4, B:36:0x00a8, B:38:0x00ae, B:40:0x00c0, B:49:0x010d, B:51:0x0113, B:52:0x011b, B:55:0x0128, B:57:0x0138, B:59:0x013f, B:62:0x014f, B:67:0x0153, B:74:0x007d, B:76:0x0086, B:78:0x008a, B:79:0x008d, B:81:0x0094, B:83:0x0098, B:84:0x009b), top: B:12:0x0049 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r24, int r25, android.content.Context r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.a(java.lang.String, int, android.content.Context, boolean):void");
    }

    public final void b() {
        l lVar = this.f27444f;
        if (lVar == null) {
            return;
        }
        this.f27444f = null;
        if (lVar.a()) {
            d(lVar);
        } else {
            lVar.d();
        }
    }

    public final void c(qe.j jVar) {
        while (jVar.f24021w > this.f27448k) {
            ((l) jVar.removeFirst()).d();
        }
        long j10 = 0;
        while (jVar.iterator().hasNext()) {
            j10 += ((l) r0.next()).c();
        }
        while (j10 > this.f27449l) {
            Iterator it = jVar.iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    if (((l) it.next()).c() > 0) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                j10 -= r0.c();
                ((l) jVar.b(i)).d();
            } else {
                return;
            }
        }
    }

    public final void d(l lVar) {
        if (!lVar.a()) {
            return;
        }
        pe.j jVar = new pe.j(lVar.f27450a, Integer.valueOf(lVar.f27451b));
        HashMap hashMap = this.f27441b;
        Object obj = hashMap.get(jVar);
        if (obj == null) {
            obj = new qe.j();
            hashMap.put(jVar, obj);
        }
        qe.j jVar2 = (qe.j) obj;
        jVar2.addLast(lVar);
        c(jVar2);
        this.f27443d.put(jVar, Integer.valueOf(jVar2.f24021w));
        qe.j jVar3 = (qe.j) this.f27442c.remove(jVar);
        if (jVar3 != null) {
            Iterator it = jVar3.iterator();
            while (it.hasNext()) {
                ((l) it.next()).d();
            }
        }
        this.e.put(jVar, 0);
    }

    public final void e(Context context, String str, int i) {
        context.getClass();
        if (!this.i && !this.f27447j) {
            l lVar = this.f27444f;
            if (lVar != null && (!lVar.f27450a.equals(str) || lVar.f27451b != i)) {
                b();
            }
            l lVar2 = this.f27444f;
            u.c cVar = this.f27440a;
            if (lVar2 != null) {
                if (lVar2.f27457j == null && lVar2.f27458k == null) {
                    cVar.d(str, i, lVar2, context);
                    return;
                }
                return;
            }
            l lVar3 = new l(str, i);
            cVar.d(str, i, lVar3, context);
            d(lVar3);
        }
    }

    public final void f(String str, int i, int i10, int i11, int i12, int i13, int i14, Context context) {
        context.getClass();
        if (!this.i && !this.f27447j && i13 > i11 && i14 > i12) {
            l lVar = this.f27444f;
            if (lVar != null && (!lVar.f27450a.equals(str) || lVar.f27451b != i)) {
                b();
            }
            l lVar2 = this.f27444f;
            u.c cVar = this.f27440a;
            if (lVar2 != null) {
                cVar.e(str, i, i10, i11, i12, i13, i14, lVar2, context);
                return;
            }
            l lVar3 = new l(str, i);
            cVar.e(str, i, i10, i11, i12, i13, i14, lVar3, context);
            d(lVar3);
        }
    }

    public final void g(int i, String str, boolean z3) {
        if (!this.i && !this.f27447j) {
            l lVar = this.f27444f;
            if (lVar != null && (!lVar.f27450a.equals(str) || lVar.f27451b != i)) {
                b();
            }
            l lVar2 = this.f27444f;
            u.c cVar = this.f27440a;
            if (lVar2 != null) {
                if (!lVar2.b()) {
                    cVar.f(str, i, lVar2);
                    return;
                }
                return;
            }
            l lVar3 = new l(str, i);
            cVar.f(str, i, lVar3);
            if (z3) {
                d(lVar3);
            } else {
                this.f27444f = lVar3;
                this.f27445g = false;
            }
        }
    }
}
