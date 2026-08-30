package u7;
import c.f;
import b8.y6;
import f7.c;
import o7.b;
import u7.e2;
import x7.f0;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e2 extends ve.i implements df.p {
    public final /* synthetic */ b A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26121u;

    /* renamed from: v, reason: collision with root package name */
    public int f26122v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ArrayList f26123w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f26124x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m3 f26125y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f26126z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2(ArrayList arrayList, Context context, m3 m3Var, int i, b bVar, te.c cVar, int i10) {
        super(2, cVar);
        this.f26121u = i10;
        this.f26123w = arrayList;
        this.f26124x = context;
        this.f26125y = m3Var;
        this.f26126z = i;
        this.A = bVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f26121u) {
            case 0:
                return new e2(this.f26123w, this.f26124x, this.f26125y, this.f26126z, this.A, cVar, 0);
            default:
                return new e2(this.f26123w, this.f26124x, this.f26125y, this.f26126z, this.A, cVar, 1);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f26121u) {
            case 0:
                return ((e2) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((e2) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:48|(1:49)|(1:(1:(1:(2:54|55)(2:56|57))(3:58|59|(2:65|66)(2:63|64)))(1:67))(3:81|82|(3:84|74|75))|68|69|70|71|(3:73|74|75)|59|(1:61)|65|66) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:3|(1:4)|(1:(1:(1:(2:9|10)(2:12|13))(9:14|15|(2:18|16)|19|20|21|(1:23)(1:34)|24|33))(1:35))(3:42|43|(3:45|30|31))|36|37|38|39|(3:41|30|31)|15|(1:16)|19|20|21|(0)(0)|24|33) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c0, code lost:
    
        r0.printStackTrace();
        c.f("export", r0.getClass().getSimpleName());
        f0.d();
        r0 = pf.l0.f22767a;
        r0 = uf.n.f27235a;
        r2 = new y6(8, r1, null);
        r19.f26122v = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e2, code lost:
    
        if (pf.b0.J(r0, r2, r19) != r10) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0176, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0193, code lost:
    
        r0.printStackTrace();
        c.f("export", r0.getClass().getSimpleName());
        f0.d();
        r0 = pf.l0.f22767a;
        r0 = uf.n.f27235a;
        r2 = new y6(7, r1, null);
        r19.f26122v = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b4, code lost:
    
        if (pf.b0.J(r0, r2, r19) != r10) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077 A[Catch: all -> 0x0085, LOOP:0: B:16:0x0071->B:18:0x0077, LOOP_END, TryCatch #0 {all -> 0x0085, blocks: (B:15:0x0064, B:16:0x0071, B:18:0x0077, B:20:0x0087, B:23:0x008f, B:24:0x00af, B:34:0x00a2, B:39:0x0051), top: B:38:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f A[Catch: all -> 0x0085, TRY_ENTER, TryCatch #0 {all -> 0x0085, blocks: (B:15:0x0064, B:16:0x0071, B:18:0x0077, B:20:0x0087, B:23:0x008f, B:24:0x00af, B:34:0x00a2, B:39:0x0051), top: B:38:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:15:0x0064, B:16:0x0071, B:18:0x0077, B:20:0x0087, B:23:0x008f, B:24:0x00af, B:34:0x00a2, B:39:0x0051), top: B:38:0x0051 }] */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.e2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
