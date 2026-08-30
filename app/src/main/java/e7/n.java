package e7;
import r.d;

import android.app.Activity;
import kotlin.jvm.internal.v;
import pf.z;
import r0.a1;
import t.x1;
import t.z1;

/* loaded from: classes.dex */
public final class n extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15969u;

    /* renamed from: v, reason: collision with root package name */
    public int f15970v;

    /* renamed from: w, reason: collision with root package name */
    public long f15971w;

    /* renamed from: x, reason: collision with root package name */
    public Object f15972x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f15973y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f15974z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Activity activity, String str, df.l lVar, te.c cVar) {
        super(2, cVar);
        this.f15969u = 0;
        this.f15972x = activity;
        this.f15973y = str;
        this.f15974z = lVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f15969u) {
            case 0:
                return new n((Activity) this.f15972x, (String) this.f15973y, (df.l) this.f15974z, cVar);
            case 1:
                return new n((a1) this.f15973y, this.f15971w, (v.i) this.f15974z, cVar, 1);
            case 2:
                return new n((d) this.f15973y, this.f15971w, (v.i) this.f15974z, cVar, 2);
            default:
                n nVar = new n((z1) this.f15973y, this.f15971w, (v) this.f15974z, cVar, 3);
                nVar.f15972x = obj;
                return nVar;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15969u) {
            case 0:
                return ((n) create((z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((n) create((z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((n) create((z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            default:
                return ((n) create((x1) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x01c7, code lost:
    
        if (r0.a(r8, r17) == r7) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0167, code lost:
    
        if (pf.b0.j(r7, r17) == r6) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015f  */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r2v27, types: [kotlin.jvm.internal.u, java.lang.Object] */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, long j10, Object obj2, te.c cVar, int i) {
        super(2, cVar);
        this.f15969u = i;
        this.f15973y = obj;
        this.f15971w = j10;
        this.f15974z = obj2;
    }
}
