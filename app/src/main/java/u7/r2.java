package u7;
import b8.p2;
import l.a;
import q.x;
import u7.m3;
import u7.r2;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public final class r2 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26780u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f26781v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m3 f26782w;

    /* renamed from: x, reason: collision with root package name */
    public int f26783x;

    /* renamed from: y, reason: collision with root package name */
    public int f26784y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f26785z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(m3 m3Var, int i, int i10, Context context, te.c cVar) {
        super(2, cVar);
        this.f26782w = m3Var;
        this.f26783x = i;
        this.f26784y = i10;
        this.f26785z = context;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f26780u) {
            case 0:
                return new r2((List) this.f26785z, this.f26782w, cVar);
            default:
                return new r2(this.f26782w, this.f26783x, this.f26784y, (Context) this.f26785z, cVar);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f26780u) {
            case 0:
                return ((r2) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((r2) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0036, code lost:
    
        if (m3.g(r10, r1, r16) == r6) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00d1 -> B:31:0x00d5). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = r0.f26780u
            pe.z r2 = pe.z.f22715a
            java.lang.Object r3 = r0.f26785z
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            ue.a r6 = ue.a.f27192u
            r7 = 1
            switch(r1) {
                case 0: goto La4;
                default: goto L11;
            }
        L11:
            int r1 = r0.f26783x
            int r8 = r0.f26781v
            m3 r10 = r0.f26782w
            r9 = 2
            if (r8 == 0) goto L2d
            if (r8 == r7) goto L29
            if (r8 != r9) goto L23
            pe.a.e(r17)
            goto La3
        L23:
            x.o(r5)
            r2 = r4
            goto La3
        L29:
            pe.a.e(r17)
            goto L39
        L2d:
            pe.a.e(r17)
            r0.f26781v = r7
            java.lang.Object r4 = m3.g(r10, r1, r0)
            if (r4 != r6) goto L39
            goto La2
        L39:
            nd.o r4 = r10.f26539m
            java.lang.String r1 = r10.y(r1)
            r4.getClass()
            java.lang.Object r5 = r4.f21272v
            java.util.concurrent.ConcurrentHashMap r5 = (java.util.concurrent.ConcurrentHashMap) r5
            java.util.Set r7 = r5.keySet()
            r7.getClass()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.List r7 = qe.l.P(r7)
            java.util.Iterator r7 = r7.iterator()
        L57:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L87
            java.lang.Object r8 = r7.next()
            r8.getClass()
            pe.o r8 = (pe.o) r8
            java.lang.Object r11 = r8.f22703u
            boolean r11 = kotlin.jvm.internal.a(r11, r1)
            if (r11 != 0) goto L57
            java.lang.Object r11 = r4.f21274x
            java.util.concurrent.ConcurrentHashMap$KeySetView r11 = (java.util.concurrent.ConcurrentHashMap.KeySetView) r11
            boolean r11 = r11.contains(r8)
            if (r11 != 0) goto L57
            java.lang.Object r11 = r4.f21273w
            java.util.concurrent.ConcurrentHashMap r11 = (java.util.concurrent.ConcurrentHashMap) r11
            boolean r11 = r11.containsKey(r8)
            if (r11 == 0) goto L83
            goto L57
        L83:
            r5.remove(r8)
            goto L57
        L87:
            wf.e r1 = pf.l0.f22767a
            wf.d r1 = wf.d.f29913w
            r4 = r9
            p2 r9 = new p2
            int r11 = r0.f26783x
            int r12 = r0.f26784y
            r13 = r3
            android.content.Context r13 = (android.content.Context) r13
            r14 = 0
            r15 = 1
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0.f26781v = r4
            java.lang.Object r1 = pf.b0.J(r1, r9, r0)
            if (r1 != r6) goto La3
        La2:
            r2 = r6
        La3:
            return r2
        La4:
            int r1 = r0.f26784y
            if (r1 == 0) goto Lb7
            if (r1 != r7) goto Lb2
            int r1 = r0.f26783x
            int r3 = r0.f26781v
            pe.a.e(r17)
            goto Ld5
        Lb2:
            x.o(r5)
            r2 = r4
            goto Ld7
        Lb7:
            pe.a.e(r17)
            java.util.List r3 = (java.util.List) r3
            java.util.Collection r3 = (java.util.Collection) r3
            int r1 = r3.size()
            r3 = 0
        Lc3:
            if (r3 >= r1) goto Ld7
            r0.f26781v = r3
            r0.f26783x = r1
            r0.f26784y = r7
            m3 r4 = r0.f26782w
            java.lang.Object r4 = m3.f(r4, r3, r0)
            if (r4 != r6) goto Ld5
            r2 = r6
            goto Ld7
        Ld5:
            int r3 = r3 + r7
            goto Lc3
        Ld7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.r2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(List list, m3 m3Var, te.c cVar) {
        super(2, cVar);
        this.f26785z = list;
        this.f26782w = m3Var;
    }
}
