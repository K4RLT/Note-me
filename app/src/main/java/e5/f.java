package e5;
import b.a;
import f.c;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final TopicsManager f15921a;

    public f(TopicsManager topicsManager) {
        topicsManager.getClass();
        this.f15921a = topicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b A[LOOP:0: B:11:0x0075->B:13:0x007b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(e5.f r6, e5.a r7, te.c r8) {
        /*
            boolean r0 = r8 instanceof e5.e
            if (r0 == 0) goto L13
            r0 = r8
            e5.e r0 = (e5.e) r0
            int r1 = r0.f15920x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15920x = r1
            goto L18
        L13:
            e5.e r0 = new e5.e
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f15918v
            int r1 = r0.f15920x
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            e5.f r6 = r0.f15917u
            pe.a.e(r8)
            goto L5e
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r6)
            r6 = 0
            return r6
        L2e:
            pe.a.e(r8)
            android.adservices.topics.GetTopicsRequest r7 = r6.a(r7)
            r0.f15917u = r6
            r0.f15920x = r2
            pf.l r8 = new pf.l
            te.c r0 = ya.rc.b(r0)
            r8.<init>(r2, r0)
            r8.s()
            android.adservices.topics.TopicsManager r0 = r6.f15921a
            d5.c r1 = new d5.c
            r2 = 0
            r1.<init>(r2)
            l3.b r2 = new l3.b
            r2.<init>(r8)
            d5.b.r(r0, r7, r1, r2)
            java.lang.Object r8 = r8.r()
            ue.a r7 = ue.a.f27192u
            if (r8 != r7) goto L5e
            return r7
        L5e:
            android.adservices.topics.GetTopicsResponse r7 = d5.b.i(r8)
            r6.getClass()
            r7.getClass()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r7 = d5.b.p(r7)
            java.util.Iterator r7 = r7.iterator()
        L75:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L98
            java.lang.Object r8 = r7.next()
            android.adservices.topics.Topic r8 = d5.b.j(r8)
            e5.c r0 = new e5.c
            long r1 = d5.b.d(r8)
            long r4 = d5.b.A(r8)
            int r3 = d5.a(r8)
            r0.<init>(r1, r3, r4)
            r6.add(r0)
            goto L75
        L98:
            e5.b r7 = new e5.b
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.c(e5.f, e5.a, te.c):java.lang.Object");
    }

    public GetTopicsRequest a(a aVar) {
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest build;
        aVar.getClass();
        adsSdkName = d5.b.e().setAdsSdkName("com.google.android.gms.ads");
        build = adsSdkName.build();
        build.getClass();
        return build;
    }

    public Object b(a aVar, te.c cVar) {
        return c(this, aVar, cVar);
    }
}
