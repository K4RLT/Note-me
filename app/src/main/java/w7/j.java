package w7;
import d.c;
import r2.g;
import w7.j;

import android.view.View;

/* loaded from: classes.dex */
public final class j extends ve.i implements df.p {
    public final /* synthetic */ q.d A;
    public final /* synthetic */ androidx.lifecycle.w B;

    /* renamed from: u, reason: collision with root package name */
    public long f28475u;

    /* renamed from: v, reason: collision with root package name */
    public int f28476v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f28477w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ View f28478x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q.d f28479y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ float f28480z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(d dVar, View view, q.d dVar2, float f10, q.d dVar3, androidx.lifecycle.w wVar, te.c cVar) {
        super(2, cVar);
        this.f28477w = dVar;
        this.f28478x = view;
        this.f28479y = dVar2;
        this.f28480z = f10;
        this.A = dVar3;
        this.B = wVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new j(this.f28477w, this.f28478x, this.f28479y, this.f28480z, this.A, this.B, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008e, code lost:
    
        if (pf.b0.j(250, r13) == r12) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x010f, code lost:
    
        if (pf.b0.i(r1, r13) == r12) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00fe, code lost:
    
        if (pf.b0.j(60, r13) != r12) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f2, code lost:
    
        if (r4.g(r14, r13) == r12) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x015b, code lost:
    
        if (q.c(r2, r14, r0, r13) == r12) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0144, code lost:
    
        if (r4.g(r14, r13) == r12) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007d, code lost:
    
        if (g(r14, r13) == r12) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c5, code lost:
    
        if (g(r14, r13) == r12) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0136, code lost:
    
        if (g(r14, r13) == r12) goto L64;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0016. Please report as an issue. */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x008e -> B:8:0x0092). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
